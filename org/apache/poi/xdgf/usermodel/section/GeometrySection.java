package org.apache.poi.xdgf.usermodel.section;

import com.microsoft.schemas.office.visio.x2012.main.RowType;
import com.microsoft.schemas.office.visio.x2012.main.SectionType;
import java.awt.geom.Path2D.Double;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.geom.SplineCollector;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.XDGFSheet;
import org.apache.poi.xdgf.usermodel.section.CombinedIterable;
import org.apache.poi.xdgf.usermodel.section.XDGFSection;
import org.apache.poi.xdgf.usermodel.section.geometry.Ellipse;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRowFactory;
import org.apache.poi.xdgf.usermodel.section.geometry.InfiniteLine;
import org.apache.poi.xdgf.usermodel.section.geometry.SplineKnot;
import org.apache.poi.xdgf.usermodel.section.geometry.SplineStart;

public class GeometrySection extends XDGFSection {

   GeometrySection _master = null;
   SortedMap _rows = new TreeMap();


   public GeometrySection(SectionType section, XDGFSheet containingSheet) {
      super(section, containingSheet);
      RowType[] arr$ = section.getRowArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         RowType row = arr$[i$];
         if(this._rows.containsKey(Long.valueOf(row.getIX()))) {
            throw new POIXMLException("Index element \'" + row.getIX() + "\' already exists");
         }

         this._rows.put(Long.valueOf(row.getIX()), GeometryRowFactory.load(row));
      }

   }

   public void setupMaster(XDGFSection master) {
      this._master = (GeometrySection)master;
      Iterator i$ = this._rows.entrySet().iterator();

      while(i$.hasNext()) {
         Entry entry = (Entry)i$.next();
         GeometryRow masterRow = (GeometryRow)this._master._rows.get(entry.getKey());
         if(masterRow != null) {
            try {
               ((GeometryRow)entry.getValue()).setupMaster(masterRow);
            } catch (ClassCastException var6) {
               ;
            }
         }
      }

   }

   public Boolean getNoShow() {
      Boolean noShow = XDGFCell.maybeGetBoolean(this._cells, "NoShow");
      return noShow == null?(this._master != null?this._master.getNoShow():Boolean.valueOf(false)):noShow;
   }

   public Iterable getCombinedRows() {
      return new CombinedIterable(this._rows, this._master == null?null:this._master._rows);
   }

   public Double getPath(XDGFShape parent) {
      Iterator rows = this.getCombinedRows().iterator();
      GeometryRow first = (GeometryRow)rows.next();
      if(first instanceof Ellipse) {
         return ((Ellipse)first).getPath();
      } else if(first instanceof InfiniteLine) {
         return ((InfiniteLine)first).getPath();
      } else if(first instanceof SplineStart) {
         throw new POIXMLException("SplineStart must be preceded by another type");
      } else {
         Double path = new Double();
         SplineCollector renderer = null;

         while(true) {
            GeometryRow row;
            if(first != null) {
               row = first;
               first = null;
            } else {
               if(!rows.hasNext()) {
                  if(renderer != null) {
                     renderer.addToPath(path, parent);
                  }

                  return path;
               }

               row = (GeometryRow)rows.next();
            }

            if(row instanceof SplineStart) {
               if(renderer != null) {
                  throw new POIXMLException("SplineStart found multiple times!");
               }

               renderer = new SplineCollector((SplineStart)row);
            } else if(row instanceof SplineKnot) {
               if(renderer == null) {
                  throw new POIXMLException("SplineKnot found without SplineStart!");
               }

               renderer.addKnot((SplineKnot)row);
            } else {
               if(renderer != null) {
                  renderer.addToPath(path, parent);
                  renderer = null;
               }

               row.addToPath(path, parent);
            }
         }
      }
   }
}
