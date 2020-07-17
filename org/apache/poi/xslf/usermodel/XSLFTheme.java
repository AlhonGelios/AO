package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.Internal;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBaseStyles;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColor;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorMapping;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorScheme;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeStyleSheet;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;

public class XSLFTheme extends POIXMLDocumentPart {

   private CTOfficeStyleSheet _theme;
   private Map _schemeColors;


   XSLFTheme() {
      this._theme = CTOfficeStyleSheet.Factory.newInstance();
   }

   public XSLFTheme(PackagePart part) throws IOException, XmlException {
      super(part);
      ThemeDocument doc = ThemeDocument.Factory.parse(this.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this._theme = doc.getTheme();
      this.initialize();
   }

   @Deprecated
   public XSLFTheme(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   public void importTheme(XSLFTheme theme) {
      this._theme = theme.getXmlObject();
      this._schemeColors = theme._schemeColors;
   }

   private void initialize() {
      CTBaseStyles elems = this._theme.getThemeElements();
      CTColorScheme scheme = elems.getClrScheme();
      this._schemeColors = new HashMap(12);
      XmlObject[] arr$ = scheme.selectPath("*");
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         XmlObject o = arr$[i$];
         CTColor c = (CTColor)o;
         String name = c.getDomNode().getLocalName();
         this._schemeColors.put(name, c);
      }

   }

   void initColorMap(CTColorMapping cmap) {
      this._schemeColors.put("bg1", this._schemeColors.get(cmap.getBg1().toString()));
      this._schemeColors.put("bg2", this._schemeColors.get(cmap.getBg2().toString()));
      this._schemeColors.put("tx1", this._schemeColors.get(cmap.getTx1().toString()));
      this._schemeColors.put("tx2", this._schemeColors.get(cmap.getTx2().toString()));
   }

   public String getName() {
      return this._theme.getName();
   }

   public void setName(String name) {
      this._theme.setName(name);
   }

   CTColor getCTColor(String name) {
      return (CTColor)this._schemeColors.get(name);
   }

   @Internal
   public CTOfficeStyleSheet getXmlObject() {
      return this._theme;
   }

   protected final void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "theme"));
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.getXmlObject().save(out, xmlOptions);
      out.close();
   }

   public String getMajorFont() {
      return this._theme.getThemeElements().getFontScheme().getMajorFont().getLatin().getTypeface();
   }

   public String getMinorFont() {
      return this._theme.getThemeElements().getFontScheme().getMinorFont().getLatin().getTypeface();
   }

   CTTextParagraphProperties getDefaultParagraphStyle() {
      XmlObject[] o = this._theme.selectPath("declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' declare namespace a=\'http://schemas.openxmlformats.org/drawingml/2006/main\' .//a:objectDefaults/a:spDef/a:lstStyle/a:defPPr");
      return o.length == 1?(CTTextParagraphProperties)o[0]:null;
   }
}
