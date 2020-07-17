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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataField;
import org.w3c.dom.Node;

public interface CTDataFields extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDataFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdatafields52cctype");


   List getDataFieldList();

   CTDataField[] getDataFieldArray();

   CTDataField getDataFieldArray(int var1);

   int sizeOfDataFieldArray();

   void setDataFieldArray(CTDataField[] var1);

   void setDataFieldArray(int var1, CTDataField var2);

   CTDataField insertNewDataField(int var1);

   CTDataField addNewDataField();

   void removeDataField(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTDataFields newInstance() {
         return (CTDataFields)POIXMLTypeLoader.newInstance(CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields newInstance(XmlOptions var0) {
         return (CTDataFields)POIXMLTypeLoader.newInstance(CTDataFields.type, var0);
      }

      public static CTDataFields parse(String var0) throws XmlException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, var1);
      }

      public static CTDataFields parse(File var0) throws XmlException, IOException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, var1);
      }

      public static CTDataFields parse(URL var0) throws XmlException, IOException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, var1);
      }

      public static CTDataFields parse(InputStream var0) throws XmlException, IOException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, var1);
      }

      public static CTDataFields parse(Reader var0) throws XmlException, IOException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, var1);
      }

      public static CTDataFields parse(XMLStreamReader var0) throws XmlException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, var1);
      }

      public static CTDataFields parse(Node var0) throws XmlException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, var1);
      }

      public static CTDataFields parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static CTDataFields parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDataFields)POIXMLTypeLoader.parse(var0, CTDataFields.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataFields.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataFields.type, var1);
      }

   }
}
