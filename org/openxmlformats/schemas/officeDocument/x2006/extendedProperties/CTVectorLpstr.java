package org.openxmlformats.schemas.officeDocument.x2006.extendedProperties;

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
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector;
import org.w3c.dom.Node;

public interface CTVectorLpstr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTVectorLpstr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctvectorlpstr9b1dtype");


   CTVector getVector();

   void setVector(CTVector var1);

   CTVector addNewVector();


   public static final class Factory {

      public static CTVectorLpstr newInstance() {
         return (CTVectorLpstr)POIXMLTypeLoader.newInstance(CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr newInstance(XmlOptions var0) {
         return (CTVectorLpstr)POIXMLTypeLoader.newInstance(CTVectorLpstr.type, var0);
      }

      public static CTVectorLpstr parse(String var0) throws XmlException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, var1);
      }

      public static CTVectorLpstr parse(File var0) throws XmlException, IOException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, var1);
      }

      public static CTVectorLpstr parse(URL var0) throws XmlException, IOException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, var1);
      }

      public static CTVectorLpstr parse(InputStream var0) throws XmlException, IOException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, var1);
      }

      public static CTVectorLpstr parse(Reader var0) throws XmlException, IOException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, var1);
      }

      public static CTVectorLpstr parse(XMLStreamReader var0) throws XmlException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, var1);
      }

      public static CTVectorLpstr parse(Node var0) throws XmlException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, var1);
      }

      public static CTVectorLpstr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static CTVectorLpstr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTVectorLpstr)POIXMLTypeLoader.parse(var0, CTVectorLpstr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVectorLpstr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVectorLpstr.type, var1);
      }

   }
}
