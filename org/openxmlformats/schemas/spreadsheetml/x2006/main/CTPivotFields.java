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
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTPivotField;
import org.w3c.dom.Node;

public interface CTPivotFields extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPivotFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctpivotfields12batype");


   List getPivotFieldList();

   CTPivotField[] getPivotFieldArray();

   CTPivotField getPivotFieldArray(int var1);

   int sizeOfPivotFieldArray();

   void setPivotFieldArray(CTPivotField[] var1);

   void setPivotFieldArray(int var1, CTPivotField var2);

   CTPivotField insertNewPivotField(int var1);

   CTPivotField addNewPivotField();

   void removePivotField(int var1);

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTPivotFields newInstance() {
         return (CTPivotFields)POIXMLTypeLoader.newInstance(CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields newInstance(XmlOptions var0) {
         return (CTPivotFields)POIXMLTypeLoader.newInstance(CTPivotFields.type, var0);
      }

      public static CTPivotFields parse(String var0) throws XmlException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, var1);
      }

      public static CTPivotFields parse(File var0) throws XmlException, IOException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, var1);
      }

      public static CTPivotFields parse(URL var0) throws XmlException, IOException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, var1);
      }

      public static CTPivotFields parse(InputStream var0) throws XmlException, IOException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, var1);
      }

      public static CTPivotFields parse(Reader var0) throws XmlException, IOException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, var1);
      }

      public static CTPivotFields parse(XMLStreamReader var0) throws XmlException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, var1);
      }

      public static CTPivotFields parse(Node var0) throws XmlException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, var1);
      }

      public static CTPivotFields parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static CTPivotFields parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPivotFields)POIXMLTypeLoader.parse(var0, CTPivotFields.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotFields.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPivotFields.type, var1);
      }

   }
}
