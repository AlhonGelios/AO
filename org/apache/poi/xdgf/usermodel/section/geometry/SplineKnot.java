package org.apache.poi.xdgf.usermodel.section.geometry;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;

public class SplineKnot implements GeometryRow {

   SplineKnot _master = null;
   Double x = null;
   Double y = null;
   Double a = null;
   Boolean deleted = null;


   public SplineKnot(RowType row) {
      if(row.isSetDel()) {
         this.deleted = Boolean.valueOf(row.getDel());
      }

      CellType[] arr$ = row.getCellArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CellType cell = arr$[i$];
         String cellName = cell.getN();
         if(cellName.equals("X")) {
            this.x = XDGFCell.parseDoubleValue(cell);
         } else if(cellName.equals("Y")) {
            this.y = XDGFCell.parseDoubleValue(cell);
         } else {
            if(!cellName.equals("A")) {
               throw new POIXMLException("Invalid cell \'" + cellName + "\' in SplineKnot row");
            }

            this.a = XDGFCell.parseDoubleValue(cell);
         }
      }

   }

   public boolean getDel() {
      return this.deleted != null?this.deleted.booleanValue():(this._master != null?this._master.getDel():false);
   }

   public Double getX() {
      return this.x == null?this._master.x:this.x;
   }

   public Double getY() {
      return this.y == null?this._master.y:this.y;
   }

   public Double getA() {
      return this.a == null?this._master.a:this.a;
   }

   public void setupMaster(GeometryRow row) {
      this._master = (SplineKnot)row;
   }

   public void addToPath(java.awt.geom.Path2D.Double path, XDGFShape parent) {
      throw new POIXMLException("Error: Use SplineRenderer!");
   }

   public String toString() {
      return "{SplineKnot x=" + this.getX() + " y=" + this.getY() + " a=" + this.getA() + "}";
   }
}
