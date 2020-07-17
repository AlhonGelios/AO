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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDataValidation;
import org.w3c.dom.Node;

public interface CTDataValidations extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTDataValidations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctdatavalidationse46ftype");


   List getDataValidationList();

   CTDataValidation[] getDataValidationArray();

   CTDataValidation getDataValidationArray(int var1);

   int sizeOfDataValidationArray();

   void setDataValidationArray(CTDataValidation[] var1);

   void setDataValidationArray(int var1, CTDataValidation var2);

   CTDataValidation insertNewDataValidation(int var1);

   CTDataValidation addNewDataValidation();

   void removeDataValidation(int var1);

   boolean getDisablePrompts();

   XmlBoolean xgetDisablePrompts();

   boolean isSetDisablePrompts();

   void setDisablePrompts(boolean var1);

   void xsetDisablePrompts(XmlBoolean var1);

   void unsetDisablePrompts();

   long getXWindow();

   XmlUnsignedInt xgetXWindow();

   boolean isSetXWindow();

   void setXWindow(long var1);

   void xsetXWindow(XmlUnsignedInt var1);

   void unsetXWindow();

   long getYWindow();

   XmlUnsignedInt xgetYWindow();

   boolean isSetYWindow();

   void setYWindow(long var1);

   void xsetYWindow(XmlUnsignedInt var1);

   void unsetYWindow();

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();


   public static final class Factory {

      public static CTDataValidations newInstance() {
         return (CTDataValidations)POIXMLTypeLoader.newInstance(CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations newInstance(XmlOptions var0) {
         return (CTDataValidations)POIXMLTypeLoader.newInstance(CTDataValidations.type, var0);
      }

      public static CTDataValidations parse(String var0) throws XmlException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations parse(String var0, XmlOptions var1) throws XmlException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, var1);
      }

      public static CTDataValidations parse(File var0) throws XmlException, IOException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, var1);
      }

      public static CTDataValidations parse(URL var0) throws XmlException, IOException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, var1);
      }

      public static CTDataValidations parse(InputStream var0) throws XmlException, IOException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, var1);
      }

      public static CTDataValidations parse(Reader var0) throws XmlException, IOException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, var1);
      }

      public static CTDataValidations parse(XMLStreamReader var0) throws XmlException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, var1);
      }

      public static CTDataValidations parse(Node var0) throws XmlException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, var1);
      }

      public static CTDataValidations parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static CTDataValidations parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTDataValidations)POIXMLTypeLoader.parse(var0, CTDataValidations.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataValidations.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTDataValidations.type, var1);
      }

   }
}
