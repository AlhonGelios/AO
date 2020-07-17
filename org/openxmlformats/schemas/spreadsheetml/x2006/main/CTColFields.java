package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTField;
import org.w3c.dom.Node;

public interface CTColFields extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTColFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcolfields9ab8type");


   List getFieldList();

   CTField[] getFieldArray();

   CTField getFieldArray(int var1);

   int sizeOfFieldArray();

   void setFieldArray(CTField[] var1);

   void setFieldArray(int var1, CTField var2);

   CTField insertNewField(int var1);

   CTField addNewField();

   void removeField(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTColFields newInstance() {
         return (CTColFields)POIXMLTypeLoader.newInstance(CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields newInstance(XmlOptions var0) {
         return (CTColFields)POIXMLTypeLoader.newInstance(CTColFields.type, var0);
      }

      public static CTColFields parse(String var0) throws XmlException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields parse(String var0, XmlOptions var1) throws XmlException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, var1);
      }

      public static CTColFields parse(File var0) throws XmlException, IOException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, var1);
      }

      public static CTColFields parse(URL var0) throws XmlException, IOException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, var1);
      }

      public static CTColFields parse(InputStream var0) throws XmlException, IOException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, var1);
      }

      public static CTColFields parse(Reader var0) throws XmlException, IOException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, var1);
      }

      public static CTColFields parse(XMLStreamReader var0) throws XmlException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, var1);
      }

      public static CTColFields parse(Node var0) throws XmlException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, var1);
      }

      public static CTColFields parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, (XmlOptions)null);
      }

      public static CTColFields parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTColFields)POIXMLTypeLoader.parse(var0, CTColFields.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColFields.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTColFields.type, var1);
      }

   }
}
