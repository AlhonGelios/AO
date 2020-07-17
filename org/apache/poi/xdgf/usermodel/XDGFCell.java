package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import java.util.Map;
import org.apache.poi.POIXMLException;
import org.apache.poi.util.Internal;

public class XDGFCell {

   CellType _cell;


   public static Boolean maybeGetBoolean(Map cells, String name) {
      XDGFCell cell = (XDGFCell)cells.get(name);
      if(cell == null) {
         return null;
      } else if(cell.getValue().equals("0")) {
         return Boolean.valueOf(false);
      } else if(cell.getValue().equals("1")) {
         return Boolean.valueOf(true);
      } else {
         throw new POIXMLException("Invalid boolean value for \'" + cell.getName() + "\'");
      }
   }

   public static Double maybeGetDouble(Map cells, String name) {
      XDGFCell cell = (XDGFCell)cells.get(name);
      return cell != null?parseDoubleValue(cell._cell):null;
   }

   public static Integer maybeGetInteger(Map cells, String name) {
      XDGFCell cell = (XDGFCell)cells.get(name);
      return cell != null?parseIntegerValue(cell._cell):null;
   }

   public static String maybeGetString(Map cells, String name) {
      XDGFCell cell = (XDGFCell)cells.get(name);
      if(cell != null) {
         String v = cell._cell.getV();
         return v.equals("Themed")?null:v;
      } else {
         return null;
      }
   }

   public static Double parseDoubleValue(CellType cell) {
      try {
         return Double.valueOf(Double.parseDouble(cell.getV()));
      } catch (NumberFormatException var2) {
         if(cell.getV().equals("Themed")) {
            return null;
         } else {
            throw new POIXMLException("Invalid float value for \'" + cell.getN() + "\': " + var2);
         }
      }
   }

   public static Integer parseIntegerValue(CellType cell) {
      try {
         return Integer.valueOf(Integer.parseInt(cell.getV()));
      } catch (NumberFormatException var2) {
         if(cell.getV().equals("Themed")) {
            return null;
         } else {
            throw new POIXMLException("Invalid integer value for \'" + cell.getN() + "\': " + var2);
         }
      }
   }

   public static Double parseVLength(CellType cell) {
      try {
         return Double.valueOf(Double.parseDouble(cell.getV()));
      } catch (NumberFormatException var2) {
         if(cell.getV().equals("Themed")) {
            return null;
         } else {
            throw new POIXMLException("Invalid float value for \'" + cell.getN() + "\': " + var2);
         }
      }
   }

   public XDGFCell(CellType cell) {
      this._cell = cell;
   }

   @Internal
   protected CellType getXmlObject() {
      return this._cell;
   }

   public String getName() {
      return this._cell.getN();
   }

   public String getValue() {
      return this._cell.getV();
   }

   public String getFormula() {
      return this._cell.getF();
   }

   public String getError() {
      return this._cell.getE();
   }
}
