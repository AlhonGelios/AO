package org.apache.poi.xdgf.usermodel.section.geometry;

import com.microsoft.schemas.office.visio.x2012.main.RowType;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.usermodel.section.geometry.ArcTo;
import org.apache.poi.xdgf.usermodel.section.geometry.Ellipse;
import org.apache.poi.xdgf.usermodel.section.geometry.EllipticalArcTo;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;
import org.apache.poi.xdgf.usermodel.section.geometry.InfiniteLine;
import org.apache.poi.xdgf.usermodel.section.geometry.LineTo;
import org.apache.poi.xdgf.usermodel.section.geometry.MoveTo;
import org.apache.poi.xdgf.usermodel.section.geometry.NURBSTo;
import org.apache.poi.xdgf.usermodel.section.geometry.PolyLineTo;
import org.apache.poi.xdgf.usermodel.section.geometry.RelCubBezTo;
import org.apache.poi.xdgf.usermodel.section.geometry.RelEllipticalArcTo;
import org.apache.poi.xdgf.usermodel.section.geometry.RelLineTo;
import org.apache.poi.xdgf.usermodel.section.geometry.RelMoveTo;
import org.apache.poi.xdgf.usermodel.section.geometry.RelQuadBezTo;
import org.apache.poi.xdgf.usermodel.section.geometry.SplineKnot;
import org.apache.poi.xdgf.usermodel.section.geometry.SplineStart;
import org.apache.poi.xdgf.util.ObjectFactory;

public class GeometryRowFactory {

   static final ObjectFactory _rowTypes = new ObjectFactory();


   public static GeometryRow load(RowType row) {
      return (GeometryRow)_rowTypes.load(row.getT(), new Object[]{row});
   }

   static {
      try {
         _rowTypes.put("ArcTo", ArcTo.class, new Class[]{RowType.class});
         _rowTypes.put("Ellipse", Ellipse.class, new Class[]{RowType.class});
         _rowTypes.put("EllipticalArcTo", EllipticalArcTo.class, new Class[]{RowType.class});
         _rowTypes.put("InfiniteLine", InfiniteLine.class, new Class[]{RowType.class});
         _rowTypes.put("LineTo", LineTo.class, new Class[]{RowType.class});
         _rowTypes.put("MoveTo", MoveTo.class, new Class[]{RowType.class});
         _rowTypes.put("NURBSTo", NURBSTo.class, new Class[]{RowType.class});
         _rowTypes.put("PolyLineTo", PolyLineTo.class, new Class[]{RowType.class});
         _rowTypes.put("RelCubBezTo", RelCubBezTo.class, new Class[]{RowType.class});
         _rowTypes.put("RelEllipticalArcTo", RelEllipticalArcTo.class, new Class[]{RowType.class});
         _rowTypes.put("RelLineTo", RelLineTo.class, new Class[]{RowType.class});
         _rowTypes.put("RelMoveTo", RelMoveTo.class, new Class[]{RowType.class});
         _rowTypes.put("RelQuadBezTo", RelQuadBezTo.class, new Class[]{RowType.class});
         _rowTypes.put("SplineKnot", SplineKnot.class, new Class[]{RowType.class});
         _rowTypes.put("SplineStart", SplineStart.class, new Class[]{RowType.class});
      } catch (NoSuchMethodException var1) {
         throw new POIXMLException("Internal error", var1);
      } catch (SecurityException var2) {
         throw new POIXMLException("Internal error", var2);
      }
   }
}
