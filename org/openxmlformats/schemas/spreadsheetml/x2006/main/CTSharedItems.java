package org.openxmlformats.schemas.spreadsheetml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBoolean;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDateTime;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTError;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTMissing;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumber;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTString;
import org.w3c.dom.Node;

public interface CTSharedItems extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSharedItems.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctshareditems677atype");


   List getMList();

   CTMissing[] getMArray();

   CTMissing getMArray(int var1);

   int sizeOfMArray();

   void setMArray(CTMissing[] var1);

   void setMArray(int var1, CTMissing var2);

   CTMissing insertNewM(int var1);

   CTMissing addNewM();

   void removeM(int var1);

   List getNList();

   CTNumber[] getNArray();

   CTNumber getNArray(int var1);

   int sizeOfNArray();

   void setNArray(CTNumber[] var1);

   void setNArray(int var1, CTNumber var2);

   CTNumber insertNewN(int var1);

   CTNumber addNewN();

   void removeN(int var1);

   List getBList();

   CTBoolean[] getBArray();

   CTBoolean getBArray(int var1);

   int sizeOfBArray();

   void setBArray(CTBoolean[] var1);

   void setBArray(int var1, CTBoolean var2);

   CTBoolean insertNewB(int var1);

   CTBoolean addNewB();

   void removeB(int var1);

   List getEList();

   CTError[] getEArray();

   CTError getEArray(int var1);

   int sizeOfEArray();

   void setEArray(CTError[] var1);

   void setEArray(int var1, CTError var2);

   CTError insertNewE(int var1);

   CTError addNewE();

   void removeE(int var1);

   List getSList();

   CTString[] getSArray();

   CTString getSArray(int var1);

   int sizeOfSArray();

   void setSArray(CTString[] var1);

   void setSArray(int var1, CTString var2);

   CTString insertNewS(int var1);

   CTString addNewS();

   void removeS(int var1);

   List getDList();

   CTDateTime[] getDArray();

   CTDateTime getDArray(int var1);

   int sizeOfDArray();

   void setDArray(CTDateTime[] var1);

   void setDArray(int var1, CTDateTime var2);

   CTDateTime insertNewD(int var1);

   CTDateTime addNewD();

   void removeD(int var1);

   boolean getContainsSemiMixedTypes();

   XmlBoolean xgetContainsSemiMixedTypes();

   boolean isSetContainsSemiMixedTypes();

   void setContainsSemiMixedTypes(boolean var1);

   void xsetContainsSemiMixedTypes(XmlBoolean var1);

   void unsetContainsSemiMixedTypes();

   boolean getContainsNonDate();

   XmlBoolean xgetContainsNonDate();

   boolean isSetContainsNonDate();

   void setContainsNonDate(boolean var1);

   void xsetContainsNonDate(XmlBoolean var1);

   void unsetContainsNonDate();

   boolean getContainsDate();

   XmlBoolean xgetContainsDate();

   boolean isSetContainsDate();

   void setContainsDate(boolean var1);

   void xsetContainsDate(XmlBoolean var1);

   void unsetContainsDate();

   boolean getContainsString();

   XmlBoolean xgetContainsString();

   boolean isSetContainsString();

   void setContainsString(boolean var1);

   void xsetContainsString(XmlBoolean var1);

   void unsetContainsString();

   boolean getContainsBlank();

   XmlBoolean xgetContainsBlank();

   boolean isSetContainsBlank();

   void setContainsBlank(boolean var1);

   void xsetContainsBlank(XmlBoolean var1);

   void unsetContainsBlank();

   boolean getContainsMixedTypes();

   XmlBoolean xgetContainsMixedTypes();

   boolean isSetContainsMixedTypes();

   void setContainsMixedTypes(boolean var1);

   void xsetContainsMixedTypes(XmlBoolean var1);

   void unsetContainsMixedTypes();

   boolean getContainsNumber();

   XmlBoolean xgetContainsNumber();

   boolean isSetContainsNumber();

   void setContainsNumber(boolean var1);

   void xsetContainsNumber(XmlBoolean var1);

   void unsetContainsNumber();

   boolean getContainsInteger();

   XmlBoolean xgetContainsInteger();

   boolean isSetContainsInteger();

   void setContainsInteger(boolean var1);

   void xsetContainsInteger(XmlBoolean var1);

   void unsetContainsInteger();

   double getMinValue();

   XmlDouble xgetMinValue();

   boolean isSetMinValue();

   void setMinValue(double var1);

   void xsetMinValue(XmlDouble var1);

   void unsetMinValue();

   double getMaxValue();

   XmlDouble xgetMaxValue();

   boolean isSetMaxValue();

   void setMaxValue(double var1);

   void xsetMaxValue(XmlDouble var1);

   void unsetMaxValue();

   Calendar getMinDate();

   XmlDateTime xgetMinDate();

   boolean isSetMinDate();

   void setMinDate(Calendar var1);

   void xsetMinDate(XmlDateTime var1);

   void unsetMinDate();

   Calendar getMaxDate();

   XmlDateTime xgetMaxDate();

   boolean isSetMaxDate();

   void setMaxDate(Calendar var1);

   void xsetMaxDate(XmlDateTime var1);

   void unsetMaxDate();

   long getCount();

   XmlUnsignedInt xgetCount();

   boolean isSetCount();

   void setCount(long var1);

   void xsetCount(XmlUnsignedInt var1);

   void unsetCount();

   boolean getLongText();

   XmlBoolean xgetLongText();

   boolean isSetLongText();

   void setLongText(boolean var1);

   void xsetLongText(XmlBoolean var1);

   void unsetLongText();


   public static final class Factory {

      public static CTSharedItems newInstance() {
         return (CTSharedItems)POIXMLTypeLoader.newInstance(CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems newInstance(XmlOptions var0) {
         return (CTSharedItems)POIXMLTypeLoader.newInstance(CTSharedItems.type, var0);
      }

      public static CTSharedItems parse(String var0) throws XmlException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, var1);
      }

      public static CTSharedItems parse(File var0) throws XmlException, IOException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, var1);
      }

      public static CTSharedItems parse(URL var0) throws XmlException, IOException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, var1);
      }

      public static CTSharedItems parse(InputStream var0) throws XmlException, IOException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, var1);
      }

      public static CTSharedItems parse(Reader var0) throws XmlException, IOException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, var1);
      }

      public static CTSharedItems parse(XMLStreamReader var0) throws XmlException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, var1);
      }

      public static CTSharedItems parse(Node var0) throws XmlException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, var1);
      }

      public static CTSharedItems parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static CTSharedItems parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSharedItems)POIXMLTypeLoader.parse(var0, CTSharedItems.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSharedItems.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSharedItems.type, var1);
      }

   }
}
