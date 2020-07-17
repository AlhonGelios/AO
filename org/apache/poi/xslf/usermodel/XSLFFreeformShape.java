package org.apache.poi.xslf.usermodel;

import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Path2D.Double;
import org.apache.poi.sl.usermodel.FreeformShape;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.XSLFAutoShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAdjPoint2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCustomGeometry2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGeomRect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DClose;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DCubicBezierTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DLineTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DMoveTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPath2DQuadBezierTo;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShapeNonVisual;

public class XSLFFreeformShape extends XSLFAutoShape implements FreeformShape {

   XSLFFreeformShape(CTShape shape, XSLFSheet sheet) {
      super(shape, sheet);
   }

   public int setPath(Double path) {
      CTPath2D ctPath = CTPath2D.Factory.newInstance();
      Rectangle2D bounds = path.getBounds2D();
      int x0 = Units.toEMU(bounds.getX());
      int y0 = Units.toEMU(bounds.getY());
      PathIterator it = path.getPathIterator(new AffineTransform());
      int numPoints = 0;
      ctPath.setH((long)Units.toEMU(bounds.getHeight()));
      ctPath.setW((long)Units.toEMU(bounds.getWidth()));

      for(; !it.isDone(); it.next()) {
         double[] xo = new double[6];
         int type = it.currentSegment(xo);
         switch(type) {
         case 0:
            CTAdjPoint2D mv = ctPath.addNewMoveTo().addNewPt();
            mv.setX(Integer.valueOf(Units.toEMU(xo[0]) - x0));
            mv.setY(Integer.valueOf(Units.toEMU(xo[1]) - y0));
            ++numPoints;
            break;
         case 1:
            CTAdjPoint2D ln = ctPath.addNewLnTo().addNewPt();
            ln.setX(Integer.valueOf(Units.toEMU(xo[0]) - x0));
            ln.setY(Integer.valueOf(Units.toEMU(xo[1]) - y0));
            ++numPoints;
            break;
         case 2:
            CTPath2DQuadBezierTo qbez = ctPath.addNewQuadBezTo();
            CTAdjPoint2D qp1 = qbez.addNewPt();
            qp1.setX(Integer.valueOf(Units.toEMU(xo[0]) - x0));
            qp1.setY(Integer.valueOf(Units.toEMU(xo[1]) - y0));
            CTAdjPoint2D qp2 = qbez.addNewPt();
            qp2.setX(Integer.valueOf(Units.toEMU(xo[2]) - x0));
            qp2.setY(Integer.valueOf(Units.toEMU(xo[3]) - y0));
            numPoints += 2;
            break;
         case 3:
            CTPath2DCubicBezierTo bez = ctPath.addNewCubicBezTo();
            CTAdjPoint2D p1 = bez.addNewPt();
            p1.setX(Integer.valueOf(Units.toEMU(xo[0]) - x0));
            p1.setY(Integer.valueOf(Units.toEMU(xo[1]) - y0));
            CTAdjPoint2D p2 = bez.addNewPt();
            p2.setX(Integer.valueOf(Units.toEMU(xo[2]) - x0));
            p2.setY(Integer.valueOf(Units.toEMU(xo[3]) - y0));
            CTAdjPoint2D p3 = bez.addNewPt();
            p3.setX(Integer.valueOf(Units.toEMU(xo[4]) - x0));
            p3.setY(Integer.valueOf(Units.toEMU(xo[5]) - y0));
            numPoints += 3;
            break;
         case 4:
            ++numPoints;
            ctPath.addNewClose();
            break;
         default:
            throw new IllegalStateException("Unrecognized path segment type: " + type);
         }
      }

      XmlObject var19 = this.getShapeProperties();
      if(!(var19 instanceof CTShapeProperties)) {
         return -1;
      } else {
         ((CTShapeProperties)var19).getCustGeom().getPathLst().setPathArray(new CTPath2D[]{ctPath});
         this.setAnchor(bounds);
         return numPoints;
      }
   }

   public Double getPath() {
      Double path = new Double();
      Rectangle2D bounds = this.getAnchor();
      XmlObject xo = this.getShapeProperties();
      if(!(xo instanceof CTShapeProperties)) {
         return null;
      } else {
         CTCustomGeometry2D geom = ((CTShapeProperties)xo).getCustGeom();
         CTPath2D[] at = geom.getPathLst().getPathArray();
         int len$ = at.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTPath2D spPath = at[i$];
            double scaleW = bounds.getWidth() / Units.toPoints(spPath.getW());
            double scaleH = bounds.getHeight() / Units.toPoints(spPath.getH());
            XmlObject[] arr$ = spPath.selectPath("*");
            int len$1 = arr$.length;

            for(int i$1 = 0; i$1 < len$1; ++i$1) {
               XmlObject ch = arr$[i$1];
               CTAdjPoint2D bez;
               if(ch instanceof CTPath2DMoveTo) {
                  bez = ((CTPath2DMoveTo)ch).getPt();
                  path.moveTo((double)((float)(Units.toPoints(((Long)bez.getX()).longValue()) * scaleW)), (double)((float)(Units.toPoints(((Long)bez.getY()).longValue()) * scaleH)));
               } else if(ch instanceof CTPath2DLineTo) {
                  bez = ((CTPath2DLineTo)ch).getPt();
                  path.lineTo((double)((float)Units.toPoints(((Long)bez.getX()).longValue())), (double)((float)Units.toPoints(((Long)bez.getY()).longValue())));
               } else {
                  CTAdjPoint2D pt1;
                  CTAdjPoint2D pt2;
                  if(ch instanceof CTPath2DQuadBezierTo) {
                     CTPath2DQuadBezierTo var22 = (CTPath2DQuadBezierTo)ch;
                     pt1 = var22.getPtArray(0);
                     pt2 = var22.getPtArray(1);
                     path.quadTo((double)((float)(Units.toPoints(((Long)pt1.getX()).longValue()) * scaleW)), (double)((float)(Units.toPoints(((Long)pt1.getY()).longValue()) * scaleH)), (double)((float)(Units.toPoints(((Long)pt2.getX()).longValue()) * scaleW)), (double)((float)(Units.toPoints(((Long)pt2.getY()).longValue()) * scaleH)));
                  } else if(ch instanceof CTPath2DCubicBezierTo) {
                     CTPath2DCubicBezierTo var23 = (CTPath2DCubicBezierTo)ch;
                     pt1 = var23.getPtArray(0);
                     pt2 = var23.getPtArray(1);
                     CTAdjPoint2D pt3 = var23.getPtArray(2);
                     path.curveTo((double)((float)(Units.toPoints(((Long)pt1.getX()).longValue()) * scaleW)), (double)((float)(Units.toPoints(((Long)pt1.getY()).longValue()) * scaleH)), (double)((float)(Units.toPoints(((Long)pt2.getX()).longValue()) * scaleW)), (double)((float)(Units.toPoints(((Long)pt2.getY()).longValue()) * scaleH)), (double)((float)(Units.toPoints(((Long)pt3.getX()).longValue()) * scaleW)), (double)((float)(Units.toPoints(((Long)pt3.getY()).longValue()) * scaleH)));
                  } else if(ch instanceof CTPath2DClose) {
                     path.closePath();
                  }
               }
            }
         }

         AffineTransform var21 = new AffineTransform();
         var21.translate(bounds.getX(), bounds.getY());
         return new Double(var21.createTransformedShape(path));
      }
   }

   static CTShape prototype(int shapeId) {
      CTShape ct = CTShape.Factory.newInstance();
      CTShapeNonVisual nvSpPr = ct.addNewNvSpPr();
      CTNonVisualDrawingProps cnv = nvSpPr.addNewCNvPr();
      cnv.setName("Freeform " + shapeId);
      cnv.setId((long)(shapeId + 1));
      nvSpPr.addNewCNvSpPr();
      nvSpPr.addNewNvPr();
      CTShapeProperties spPr = ct.addNewSpPr();
      CTCustomGeometry2D geom = spPr.addNewCustGeom();
      geom.addNewAvLst();
      geom.addNewGdLst();
      geom.addNewAhLst();
      geom.addNewCxnLst();
      CTGeomRect rect = geom.addNewRect();
      rect.setR("r");
      rect.setB("b");
      rect.setT("t");
      rect.setL("l");
      geom.addNewPathLst();
      return ct;
   }
}
