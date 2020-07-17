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

public interface CTRowFields extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRowFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctrowfields0312type");


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

      public static CTRowFields newInstance() {
         return (CTRowFields)POIXMLTypeLoader.newInstance(CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields newInstance(XmlOptions var0) {
         return (CTRowFields)POIXMLTypeLoader.newInstance(CTRowFields.type, var0);
      }

      public static CTRowFields parse(String var0) throws XmlException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, var1);
      }

      public static CTRowFields parse(File var0) throws XmlException, IOException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, var1);
      }

      public static CTRowFields parse(URL var0) throws XmlException, IOException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, var1);
      }

      public static CTRowFields parse(InputStream var0) throws XmlException, IOException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, var1);
      }

      public static CTRowFields parse(Reader var0) throws XmlException, IOException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, var1);
      }

      public static CTRowFields parse(XMLStreamReader var0) throws XmlException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, var1);
      }

      public static CTRowFields parse(Node var0) throws XmlException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, var1);
      }

      public static CTRowFields parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static CTRowFields parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRowFields)POIXMLTypeLoader.parse(var0, CTRowFields.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRowFields.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRowFields.type, var1);
      }

   }
}
