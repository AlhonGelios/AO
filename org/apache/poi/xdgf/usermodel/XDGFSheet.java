package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.SectionType;
import com.microsoft.schemas.office.visio.x2012.main.SheetType;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.poi.POIXMLException;
import org.apache.poi.xdgf.exceptions.XDGFException;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFStyleSheet;
import org.apache.poi.xdgf.usermodel.section.CharacterSection;
import org.apache.poi.xdgf.usermodel.section.GeometrySection;
import org.apache.poi.xdgf.usermodel.section.XDGFSection;

public abstract class XDGFSheet {

   protected XDGFDocument _document;
   protected SheetType _sheet;
   protected Map _cells = new HashMap();
   protected Map _sections = new HashMap();
   protected SortedMap _geometry = new TreeMap();
   protected CharacterSection _character = null;


   public XDGFSheet(SheetType sheet, XDGFDocument document) {
      try {
         this._sheet = sheet;
         this._document = document;
         CellType[] e = sheet.getCellArray();
         int len$ = e.length;

         int i$;
         for(i$ = 0; i$ < len$; ++i$) {
            CellType section = e[i$];
            if(this._cells.containsKey(section.getN())) {
               throw new POIXMLException("Unexpected duplicate cell " + section.getN());
            }

            this._cells.put(section.getN(), new XDGFCell(section));
         }

         SectionType[] var9 = sheet.getSectionArray();
         len$ = var9.length;

         for(i$ = 0; i$ < len$; ++i$) {
            SectionType var10 = var9[i$];
            String name = var10.getN();
            if(name.equals("Geometry")) {
               this._geometry.put(Long.valueOf(var10.getIX()), new GeometrySection(var10, this));
            } else if(name.equals("Character")) {
               this._character = new CharacterSection(var10, this);
            } else {
               this._sections.put(name, XDGFSection.load(var10, this));
            }
         }

      } catch (POIXMLException var8) {
         throw XDGFException.wrap(this.toString(), var8);
      }
   }

   abstract SheetType getXmlObject();

   public XDGFDocument getDocument() {
      return this._document;
   }

   public XDGFCell getCell(String cellName) {
      return (XDGFCell)this._cells.get(cellName);
   }

   public XDGFSection getSection(String sectionName) {
      return (XDGFSection)this._sections.get(sectionName);
   }

   public XDGFStyleSheet getLineStyle() {
      return !this._sheet.isSetLineStyle()?null:this._document.getStyleById(this._sheet.getLineStyle());
   }

   public XDGFStyleSheet getFillStyle() {
      return !this._sheet.isSetFillStyle()?null:this._document.getStyleById(this._sheet.getFillStyle());
   }

   public XDGFStyleSheet getTextStyle() {
      return !this._sheet.isSetTextStyle()?null:this._document.getStyleById(this._sheet.getTextStyle());
   }

   public Color getFontColor() {
      Color fontColor = null;
      if(this._character != null) {
         fontColor = this._character.getFontColor();
         if(fontColor != null) {
            return fontColor;
         }
      }

      XDGFStyleSheet style = this.getTextStyle();
      return style != null?style.getFontColor():null;
   }

   public Double getFontSize() {
      Double fontSize = null;
      if(this._character != null) {
         fontSize = this._character.getFontSize();
         if(fontSize != null) {
            return fontSize;
         }
      }

      XDGFStyleSheet style = this.getTextStyle();
      return style != null?style.getFontSize():null;
   }

   public Integer getLineCap() {
      Integer lineCap = XDGFCell.maybeGetInteger(this._cells, "LineCap");
      if(lineCap != null) {
         return lineCap;
      } else {
         XDGFStyleSheet style = this.getLineStyle();
         return style != null?style.getLineCap():null;
      }
   }

   public Color getLineColor() {
      String lineColor = XDGFCell.maybeGetString(this._cells, "LineColor");
      if(lineColor != null) {
         return Color.decode(lineColor);
      } else {
         XDGFStyleSheet style = this.getLineStyle();
         return style != null?style.getLineColor():null;
      }
   }

   public Integer getLinePattern() {
      Integer linePattern = XDGFCell.maybeGetInteger(this._cells, "LinePattern");
      if(linePattern != null) {
         return linePattern;
      } else {
         XDGFStyleSheet style = this.getLineStyle();
         return style != null?style.getLinePattern():null;
      }
   }

   public Double getLineWeight() {
      Double lineWeight = XDGFCell.maybeGetDouble(this._cells, "LineWeight");
      if(lineWeight != null) {
         return lineWeight;
      } else {
         XDGFStyleSheet style = this.getLineStyle();
         return style != null?style.getLineWeight():null;
      }
   }
}
