package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.StringEnumAbstractBase;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlToken;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface STSystemColorVal extends XmlToken {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(STSystemColorVal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("stsystemcolorvalf938type");
   STSystemColorVal.Enum SCROLL_BAR = STSystemColorVal.Enum.forString("scrollBar");
   STSystemColorVal.Enum BACKGROUND = STSystemColorVal.Enum.forString("background");
   STSystemColorVal.Enum ACTIVE_CAPTION = STSystemColorVal.Enum.forString("activeCaption");
   STSystemColorVal.Enum INACTIVE_CAPTION = STSystemColorVal.Enum.forString("inactiveCaption");
   STSystemColorVal.Enum MENU = STSystemColorVal.Enum.forString("menu");
   STSystemColorVal.Enum WINDOW = STSystemColorVal.Enum.forString("window");
   STSystemColorVal.Enum WINDOW_FRAME = STSystemColorVal.Enum.forString("windowFrame");
   STSystemColorVal.Enum MENU_TEXT = STSystemColorVal.Enum.forString("menuText");
   STSystemColorVal.Enum WINDOW_TEXT = STSystemColorVal.Enum.forString("windowText");
   STSystemColorVal.Enum CAPTION_TEXT = STSystemColorVal.Enum.forString("captionText");
   STSystemColorVal.Enum ACTIVE_BORDER = STSystemColorVal.Enum.forString("activeBorder");
   STSystemColorVal.Enum INACTIVE_BORDER = STSystemColorVal.Enum.forString("inactiveBorder");
   STSystemColorVal.Enum APP_WORKSPACE = STSystemColorVal.Enum.forString("appWorkspace");
   STSystemColorVal.Enum HIGHLIGHT = STSystemColorVal.Enum.forString("highlight");
   STSystemColorVal.Enum HIGHLIGHT_TEXT = STSystemColorVal.Enum.forString("highlightText");
   STSystemColorVal.Enum BTN_FACE = STSystemColorVal.Enum.forString("btnFace");
   STSystemColorVal.Enum BTN_SHADOW = STSystemColorVal.Enum.forString("btnShadow");
   STSystemColorVal.Enum GRAY_TEXT = STSystemColorVal.Enum.forString("grayText");
   STSystemColorVal.Enum BTN_TEXT = STSystemColorVal.Enum.forString("btnText");
   STSystemColorVal.Enum INACTIVE_CAPTION_TEXT = STSystemColorVal.Enum.forString("inactiveCaptionText");
   STSystemColorVal.Enum BTN_HIGHLIGHT = STSystemColorVal.Enum.forString("btnHighlight");
   STSystemColorVal.Enum X_3_D_DK_SHADOW = STSystemColorVal.Enum.forString("3dDkShadow");
   STSystemColorVal.Enum X_3_D_LIGHT = STSystemColorVal.Enum.forString("3dLight");
   STSystemColorVal.Enum INFO_TEXT = STSystemColorVal.Enum.forString("infoText");
   STSystemColorVal.Enum INFO_BK = STSystemColorVal.Enum.forString("infoBk");
   STSystemColorVal.Enum HOT_LIGHT = STSystemColorVal.Enum.forString("hotLight");
   STSystemColorVal.Enum GRADIENT_ACTIVE_CAPTION = STSystemColorVal.Enum.forString("gradientActiveCaption");
   STSystemColorVal.Enum GRADIENT_INACTIVE_CAPTION = STSystemColorVal.Enum.forString("gradientInactiveCaption");
   STSystemColorVal.Enum MENU_HIGHLIGHT = STSystemColorVal.Enum.forString("menuHighlight");
   STSystemColorVal.Enum MENU_BAR = STSystemColorVal.Enum.forString("menuBar");
   int INT_SCROLL_BAR = 1;
   int INT_BACKGROUND = 2;
   int INT_ACTIVE_CAPTION = 3;
   int INT_INACTIVE_CAPTION = 4;
   int INT_MENU = 5;
   int INT_WINDOW = 6;
   int INT_WINDOW_FRAME = 7;
   int INT_MENU_TEXT = 8;
   int INT_WINDOW_TEXT = 9;
   int INT_CAPTION_TEXT = 10;
   int INT_ACTIVE_BORDER = 11;
   int INT_INACTIVE_BORDER = 12;
   int INT_APP_WORKSPACE = 13;
   int INT_HIGHLIGHT = 14;
   int INT_HIGHLIGHT_TEXT = 15;
   int INT_BTN_FACE = 16;
   int INT_BTN_SHADOW = 17;
   int INT_GRAY_TEXT = 18;
   int INT_BTN_TEXT = 19;
   int INT_INACTIVE_CAPTION_TEXT = 20;
   int INT_BTN_HIGHLIGHT = 21;
   int INT_X_3_D_DK_SHADOW = 22;
   int INT_X_3_D_LIGHT = 23;
   int INT_INFO_TEXT = 24;
   int INT_INFO_BK = 25;
   int INT_HOT_LIGHT = 26;
   int INT_GRADIENT_ACTIVE_CAPTION = 27;
   int INT_GRADIENT_INACTIVE_CAPTION = 28;
   int INT_MENU_HIGHLIGHT = 29;
   int INT_MENU_BAR = 30;


   StringEnumAbstractBase enumValue();

   void set(StringEnumAbstractBase var1);


   public static final class Enum extends StringEnumAbstractBase {

      static final int INT_SCROLL_BAR = 1;
      static final int INT_BACKGROUND = 2;
      static final int INT_ACTIVE_CAPTION = 3;
      static final int INT_INACTIVE_CAPTION = 4;
      static final int INT_MENU = 5;
      static final int INT_WINDOW = 6;
      static final int INT_WINDOW_FRAME = 7;
      static final int INT_MENU_TEXT = 8;
      static final int INT_WINDOW_TEXT = 9;
      static final int INT_CAPTION_TEXT = 10;
      static final int INT_ACTIVE_BORDER = 11;
      static final int INT_INACTIVE_BORDER = 12;
      static final int INT_APP_WORKSPACE = 13;
      static final int INT_HIGHLIGHT = 14;
      static final int INT_HIGHLIGHT_TEXT = 15;
      static final int INT_BTN_FACE = 16;
      static final int INT_BTN_SHADOW = 17;
      static final int INT_GRAY_TEXT = 18;
      static final int INT_BTN_TEXT = 19;
      static final int INT_INACTIVE_CAPTION_TEXT = 20;
      static final int INT_BTN_HIGHLIGHT = 21;
      static final int INT_X_3_D_DK_SHADOW = 22;
      static final int INT_X_3_D_LIGHT = 23;
      static final int INT_INFO_TEXT = 24;
      static final int INT_INFO_BK = 25;
      static final int INT_HOT_LIGHT = 26;
      static final int INT_GRADIENT_ACTIVE_CAPTION = 27;
      static final int INT_GRADIENT_INACTIVE_CAPTION = 28;
      static final int INT_MENU_HIGHLIGHT = 29;
      static final int INT_MENU_BAR = 30;
      public static final StringEnumAbstractBase.Table table = new StringEnumAbstractBase.Table(new STSystemColorVal.Enum[]{new STSystemColorVal.Enum("scrollBar", 1), new STSystemColorVal.Enum("background", 2), new STSystemColorVal.Enum("activeCaption", 3), new STSystemColorVal.Enum("inactiveCaption", 4), new STSystemColorVal.Enum("menu", 5), new STSystemColorVal.Enum("window", 6), new STSystemColorVal.Enum("windowFrame", 7), new STSystemColorVal.Enum("menuText", 8), new STSystemColorVal.Enum("windowText", 9), new STSystemColorVal.Enum("captionText", 10), new STSystemColorVal.Enum("activeBorder", 11), new STSystemColorVal.Enum("inactiveBorder", 12), new STSystemColorVal.Enum("appWorkspace", 13), new STSystemColorVal.Enum("highlight", 14), new STSystemColorVal.Enum("highlightText", 15), new STSystemColorVal.Enum("btnFace", 16), new STSystemColorVal.Enum("btnShadow", 17), new STSystemColorVal.Enum("grayText", 18), new STSystemColorVal.Enum("btnText", 19), new STSystemColorVal.Enum("inactiveCaptionText", 20), new STSystemColorVal.Enum("btnHighlight", 21), new STSystemColorVal.Enum("3dDkShadow", 22), new STSystemColorVal.Enum("3dLight", 23), new STSystemColorVal.Enum("infoText", 24), new STSystemColorVal.Enum("infoBk", 25), new STSystemColorVal.Enum("hotLight", 26), new STSystemColorVal.Enum("gradientActiveCaption", 27), new STSystemColorVal.Enum("gradientInactiveCaption", 28), new STSystemColorVal.Enum("menuHighlight", 29), new STSystemColorVal.Enum("menuBar", 30)});
      private static final long serialVersionUID = 1L;


      public static STSystemColorVal.Enum forString(String var0) {
         return (STSystemColorVal.Enum)table.forString(var0);
      }

      public static STSystemColorVal.Enum forInt(int var0) {
         return (STSystemColorVal.Enum)table.forInt(var0);
      }

      private Enum(String var1, int var2) {
         super(var1, var2);
      }

      private Object readResolve() {
         return forInt(this.intValue());
      }

   }

   public static final class Factory {

      public static STSystemColorVal newValue(Object var0) {
         return (STSystemColorVal)STSystemColorVal.type.newValue(var0);
      }

      public static STSystemColorVal newInstance() {
         return (STSystemColorVal)POIXMLTypeLoader.newInstance(STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal newInstance(XmlOptions var0) {
         return (STSystemColorVal)POIXMLTypeLoader.newInstance(STSystemColorVal.type, var0);
      }

      public static STSystemColorVal parse(String var0) throws XmlException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal parse(String var0, XmlOptions var1) throws XmlException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, var1);
      }

      public static STSystemColorVal parse(File var0) throws XmlException, IOException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, var1);
      }

      public static STSystemColorVal parse(URL var0) throws XmlException, IOException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, var1);
      }

      public static STSystemColorVal parse(InputStream var0) throws XmlException, IOException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, var1);
      }

      public static STSystemColorVal parse(Reader var0) throws XmlException, IOException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, var1);
      }

      public static STSystemColorVal parse(XMLStreamReader var0) throws XmlException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, var1);
      }

      public static STSystemColorVal parse(Node var0) throws XmlException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal parse(Node var0, XmlOptions var1) throws XmlException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, var1);
      }

      public static STSystemColorVal parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static STSystemColorVal parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (STSystemColorVal)POIXMLTypeLoader.parse(var0, STSystemColorVal.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSystemColorVal.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, STSystemColorVal.type, var1);
      }

   }
}
