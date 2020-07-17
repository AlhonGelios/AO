package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType;
import com.microsoft.schemas.office.visio.x2012.main.StyleSheetType;
import com.microsoft.schemas.office.visio.x2012.main.VisioDocumentType;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.POIXMLException;
import org.apache.poi.util.Internal;
import org.apache.poi.xdgf.usermodel.XDGFStyleSheet;

public class XDGFDocument {

   protected VisioDocumentType _document;
   Map _styleSheets = new HashMap();
   long _defaultFillStyle = 0L;
   long _defaultGuideStyle = 0L;
   long _defaultLineStyle = 0L;
   long _defaultTextStyle = 0L;


   public XDGFDocument(VisioDocumentType document) {
      this._document = document;
      if(!this._document.isSetDocumentSettings()) {
         throw new POIXMLException("Document settings not found");
      } else {
         DocumentSettingsType docSettings = this._document.getDocumentSettings();
         if(docSettings.isSetDefaultFillStyle()) {
            this._defaultFillStyle = docSettings.getDefaultFillStyle();
         }

         if(docSettings.isSetDefaultGuideStyle()) {
            this._defaultGuideStyle = docSettings.getDefaultGuideStyle();
         }

         if(docSettings.isSetDefaultLineStyle()) {
            this._defaultLineStyle = docSettings.getDefaultLineStyle();
         }

         if(docSettings.isSetDefaultTextStyle()) {
            this._defaultTextStyle = docSettings.getDefaultTextStyle();
         }

         if(this._document.isSetStyleSheets()) {
            StyleSheetType[] arr$ = this._document.getStyleSheets().getStyleSheetArray();
            int len$ = arr$.length;

            for(int i$ = 0; i$ < len$; ++i$) {
               StyleSheetType styleSheet = arr$[i$];
               this._styleSheets.put(Long.valueOf(styleSheet.getID()), new XDGFStyleSheet(styleSheet, this));
            }
         }

      }
   }

   @Internal
   public VisioDocumentType getXmlObject() {
      return this._document;
   }

   public XDGFStyleSheet getStyleById(long id) {
      return (XDGFStyleSheet)this._styleSheets.get(Long.valueOf(id));
   }

   public XDGFStyleSheet getDefaultFillStyle() {
      XDGFStyleSheet style = this.getStyleById(this._defaultFillStyle);
      if(style == null) {
         throw new POIXMLException("No default fill style found!");
      } else {
         return style;
      }
   }

   public XDGFStyleSheet getDefaultGuideStyle() {
      XDGFStyleSheet style = this.getStyleById(this._defaultGuideStyle);
      if(style == null) {
         throw new POIXMLException("No default guide style found!");
      } else {
         return style;
      }
   }

   public XDGFStyleSheet getDefaultLineStyle() {
      XDGFStyleSheet style = this.getStyleById(this._defaultLineStyle);
      if(style == null) {
         throw new POIXMLException("No default line style found!");
      } else {
         return style;
      }
   }

   public XDGFStyleSheet getDefaultTextStyle() {
      XDGFStyleSheet style = this.getStyleById(this._defaultTextStyle);
      if(style == null) {
         throw new POIXMLException("No default text style found!");
      } else {
         return style;
      }
   }
}
