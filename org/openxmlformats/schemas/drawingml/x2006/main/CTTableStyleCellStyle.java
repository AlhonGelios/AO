package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTCell3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTStyleMatrixReference;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableCellBorderStyle;
import org.w3c.dom.Node;

public interface CTTableStyleCellStyle extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTTableStyleCellStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cttablestylecellstyle1fddtype");


   CTTableCellBorderStyle getTcBdr();

   boolean isSetTcBdr();

   void setTcBdr(CTTableCellBorderStyle var1);

   CTTableCellBorderStyle addNewTcBdr();

   void unsetTcBdr();

   CTFillProperties getFill();

   boolean isSetFill();

   void setFill(CTFillProperties var1);

   CTFillProperties addNewFill();

   void unsetFill();

   CTStyleMatrixReference getFillRef();

   boolean isSetFillRef();

   void setFillRef(CTStyleMatrixReference var1);

   CTStyleMatrixReference addNewFillRef();

   void unsetFillRef();

   CTCell3D getCell3D();

   boolean isSetCell3D();

   void setCell3D(CTCell3D var1);

   CTCell3D addNewCell3D();

   void unsetCell3D();


   public static final class Factory {

      public static CTTableStyleCellStyle newInstance() {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.newInstance(CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle newInstance(XmlOptions var0) {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.newInstance(CTTableStyleCellStyle.type, var0);
      }

      public static CTTableStyleCellStyle parse(String var0) throws XmlException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle parse(String var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, var1);
      }

      public static CTTableStyleCellStyle parse(File var0) throws XmlException, IOException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, var1);
      }

      public static CTTableStyleCellStyle parse(URL var0) throws XmlException, IOException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, var1);
      }

      public static CTTableStyleCellStyle parse(InputStream var0) throws XmlException, IOException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, var1);
      }

      public static CTTableStyleCellStyle parse(Reader var0) throws XmlException, IOException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, var1);
      }

      public static CTTableStyleCellStyle parse(XMLStreamReader var0) throws XmlException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, var1);
      }

      public static CTTableStyleCellStyle parse(Node var0) throws XmlException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, var1);
      }

      public static CTTableStyleCellStyle parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static CTTableStyleCellStyle parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTTableStyleCellStyle)POIXMLTypeLoader.parse(var0, CTTableStyleCellStyle.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyleCellStyle.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTTableStyleCellStyle.type, var1);
      }

   }
}
