package org.apache.poi.xssf.usermodel;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFShapeGroup;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPresetLineDashProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSRgbColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShapeProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.STPresetLineDashVal;

public abstract class XSSFShape {

   public static final int EMU_PER_PIXEL = 9525;
   public static final int EMU_PER_POINT = 12700;
   public static final int POINT_DPI = 72;
   public static final int PIXEL_DPI = 96;
   protected XSSFDrawing drawing;
   protected XSSFShapeGroup parent;
   protected XSSFAnchor anchor;


   public XSSFDrawing getDrawing() {
      return this.drawing;
   }

   public XSSFShapeGroup getParent() {
      return this.parent;
   }

   public XSSFAnchor getAnchor() {
      return this.anchor;
   }

   protected abstract CTShapeProperties getShapeProperties();

   public boolean isNoFill() {
      return this.getShapeProperties().isSetNoFill();
   }

   public void setNoFill(boolean noFill) {
      CTShapeProperties props = this.getShapeProperties();
      if(props.isSetPattFill()) {
         props.unsetPattFill();
      }

      if(props.isSetSolidFill()) {
         props.unsetSolidFill();
      }

      props.setNoFill(CTNoFillProperties.Factory.newInstance());
   }

   public void setFillColor(int red, int green, int blue) {
      CTShapeProperties props = this.getShapeProperties();
      CTSolidColorFillProperties fill = props.isSetSolidFill()?props.getSolidFill():props.addNewSolidFill();
      CTSRgbColor rgb = CTSRgbColor.Factory.newInstance();
      rgb.setVal(new byte[]{(byte)red, (byte)green, (byte)blue});
      fill.setSrgbClr(rgb);
   }

   public void setLineStyleColor(int red, int green, int blue) {
      CTShapeProperties props = this.getShapeProperties();
      CTLineProperties ln = props.isSetLn()?props.getLn():props.addNewLn();
      CTSolidColorFillProperties fill = ln.isSetSolidFill()?ln.getSolidFill():ln.addNewSolidFill();
      CTSRgbColor rgb = CTSRgbColor.Factory.newInstance();
      rgb.setVal(new byte[]{(byte)red, (byte)green, (byte)blue});
      fill.setSrgbClr(rgb);
   }

   public void setLineWidth(double lineWidth) {
      CTShapeProperties props = this.getShapeProperties();
      CTLineProperties ln = props.isSetLn()?props.getLn():props.addNewLn();
      ln.setW((int)(lineWidth * 12700.0D));
   }

   public void setLineStyle(int lineStyle) {
      CTShapeProperties props = this.getShapeProperties();
      CTLineProperties ln = props.isSetLn()?props.getLn():props.addNewLn();
      CTPresetLineDashProperties dashStyle = CTPresetLineDashProperties.Factory.newInstance();
      dashStyle.setVal(STPresetLineDashVal.Enum.forInt(lineStyle + 1));
      ln.setPrstDash(dashStyle);
   }
}
