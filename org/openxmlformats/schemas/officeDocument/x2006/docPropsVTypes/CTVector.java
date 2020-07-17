package org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlByte;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlFloat;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlLong;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlShort;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.XmlUnsignedLong;
import org.apache.xmlbeans.XmlUnsignedShort;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVariant;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STVectorBaseType$Enum;
import org.w3c.dom.Node;

public interface CTVector extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTVector.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctvectorc3e2type");


   List getVariantList();

   CTVariant[] getVariantArray();

   CTVariant getVariantArray(int var1);

   int sizeOfVariantArray();

   void setVariantArray(CTVariant[] var1);

   void setVariantArray(int var1, CTVariant var2);

   CTVariant insertNewVariant(int var1);

   CTVariant addNewVariant();

   void removeVariant(int var1);

   List getI1List();

   byte[] getI1Array();

   byte getI1Array(int var1);

   List xgetI1List();

   XmlByte[] xgetI1Array();

   XmlByte xgetI1Array(int var1);

   int sizeOfI1Array();

   void setI1Array(byte[] var1);

   void setI1Array(int var1, byte var2);

   void xsetI1Array(XmlByte[] var1);

   void xsetI1Array(int var1, XmlByte var2);

   void insertI1(int var1, byte var2);

   void addI1(byte var1);

   XmlByte insertNewI1(int var1);

   XmlByte addNewI1();

   void removeI1(int var1);

   List getI2List();

   short[] getI2Array();

   short getI2Array(int var1);

   List xgetI2List();

   XmlShort[] xgetI2Array();

   XmlShort xgetI2Array(int var1);

   int sizeOfI2Array();

   void setI2Array(short[] var1);

   void setI2Array(int var1, short var2);

   void xsetI2Array(XmlShort[] var1);

   void xsetI2Array(int var1, XmlShort var2);

   void insertI2(int var1, short var2);

   void addI2(short var1);

   XmlShort insertNewI2(int var1);

   XmlShort addNewI2();

   void removeI2(int var1);

   List getI4List();

   int[] getI4Array();

   int getI4Array(int var1);

   List xgetI4List();

   XmlInt[] xgetI4Array();

   XmlInt xgetI4Array(int var1);

   int sizeOfI4Array();

   void setI4Array(int[] var1);

   void setI4Array(int var1, int var2);

   void xsetI4Array(XmlInt[] var1);

   void xsetI4Array(int var1, XmlInt var2);

   void insertI4(int var1, int var2);

   void addI4(int var1);

   XmlInt insertNewI4(int var1);

   XmlInt addNewI4();

   void removeI4(int var1);

   List getI8List();

   long[] getI8Array();

   long getI8Array(int var1);

   List xgetI8List();

   XmlLong[] xgetI8Array();

   XmlLong xgetI8Array(int var1);

   int sizeOfI8Array();

   void setI8Array(long[] var1);

   void setI8Array(int var1, long var2);

   void xsetI8Array(XmlLong[] var1);

   void xsetI8Array(int var1, XmlLong var2);

   void insertI8(int var1, long var2);

   void addI8(long var1);

   XmlLong insertNewI8(int var1);

   XmlLong addNewI8();

   void removeI8(int var1);

   List getUi1List();

   short[] getUi1Array();

   short getUi1Array(int var1);

   List xgetUi1List();

   XmlUnsignedByte[] xgetUi1Array();

   XmlUnsignedByte xgetUi1Array(int var1);

   int sizeOfUi1Array();

   void setUi1Array(short[] var1);

   void setUi1Array(int var1, short var2);

   void xsetUi1Array(XmlUnsignedByte[] var1);

   void xsetUi1Array(int var1, XmlUnsignedByte var2);

   void insertUi1(int var1, short var2);

   void addUi1(short var1);

   XmlUnsignedByte insertNewUi1(int var1);

   XmlUnsignedByte addNewUi1();

   void removeUi1(int var1);

   List getUi2List();

   int[] getUi2Array();

   int getUi2Array(int var1);

   List xgetUi2List();

   XmlUnsignedShort[] xgetUi2Array();

   XmlUnsignedShort xgetUi2Array(int var1);

   int sizeOfUi2Array();

   void setUi2Array(int[] var1);

   void setUi2Array(int var1, int var2);

   void xsetUi2Array(XmlUnsignedShort[] var1);

   void xsetUi2Array(int var1, XmlUnsignedShort var2);

   void insertUi2(int var1, int var2);

   void addUi2(int var1);

   XmlUnsignedShort insertNewUi2(int var1);

   XmlUnsignedShort addNewUi2();

   void removeUi2(int var1);

   List getUi4List();

   long[] getUi4Array();

   long getUi4Array(int var1);

   List xgetUi4List();

   XmlUnsignedInt[] xgetUi4Array();

   XmlUnsignedInt xgetUi4Array(int var1);

   int sizeOfUi4Array();

   void setUi4Array(long[] var1);

   void setUi4Array(int var1, long var2);

   void xsetUi4Array(XmlUnsignedInt[] var1);

   void xsetUi4Array(int var1, XmlUnsignedInt var2);

   void insertUi4(int var1, long var2);

   void addUi4(long var1);

   XmlUnsignedInt insertNewUi4(int var1);

   XmlUnsignedInt addNewUi4();

   void removeUi4(int var1);

   List getUi8List();

   BigInteger[] getUi8Array();

   BigInteger getUi8Array(int var1);

   List xgetUi8List();

   XmlUnsignedLong[] xgetUi8Array();

   XmlUnsignedLong xgetUi8Array(int var1);

   int sizeOfUi8Array();

   void setUi8Array(BigInteger[] var1);

   void setUi8Array(int var1, BigInteger var2);

   void xsetUi8Array(XmlUnsignedLong[] var1);

   void xsetUi8Array(int var1, XmlUnsignedLong var2);

   void insertUi8(int var1, BigInteger var2);

   void addUi8(BigInteger var1);

   XmlUnsignedLong insertNewUi8(int var1);

   XmlUnsignedLong addNewUi8();

   void removeUi8(int var1);

   List getR4List();

   float[] getR4Array();

   float getR4Array(int var1);

   List xgetR4List();

   XmlFloat[] xgetR4Array();

   XmlFloat xgetR4Array(int var1);

   int sizeOfR4Array();

   void setR4Array(float[] var1);

   void setR4Array(int var1, float var2);

   void xsetR4Array(XmlFloat[] var1);

   void xsetR4Array(int var1, XmlFloat var2);

   void insertR4(int var1, float var2);

   void addR4(float var1);

   XmlFloat insertNewR4(int var1);

   XmlFloat addNewR4();

   void removeR4(int var1);

   List getR8List();

   double[] getR8Array();

   double getR8Array(int var1);

   List xgetR8List();

   XmlDouble[] xgetR8Array();

   XmlDouble xgetR8Array(int var1);

   int sizeOfR8Array();

   void setR8Array(double[] var1);

   void setR8Array(int var1, double var2);

   void xsetR8Array(XmlDouble[] var1);

   void xsetR8Array(int var1, XmlDouble var2);

   void insertR8(int var1, double var2);

   void addR8(double var1);

   XmlDouble insertNewR8(int var1);

   XmlDouble addNewR8();

   void removeR8(int var1);

   List getLpstrList();

   String[] getLpstrArray();

   String getLpstrArray(int var1);

   List xgetLpstrList();

   XmlString[] xgetLpstrArray();

   XmlString xgetLpstrArray(int var1);

   int sizeOfLpstrArray();

   void setLpstrArray(String[] var1);

   void setLpstrArray(int var1, String var2);

   void xsetLpstrArray(XmlString[] var1);

   void xsetLpstrArray(int var1, XmlString var2);

   void insertLpstr(int var1, String var2);

   void addLpstr(String var1);

   XmlString insertNewLpstr(int var1);

   XmlString addNewLpstr();

   void removeLpstr(int var1);

   List getLpwstrList();

   String[] getLpwstrArray();

   String getLpwstrArray(int var1);

   List xgetLpwstrList();

   XmlString[] xgetLpwstrArray();

   XmlString xgetLpwstrArray(int var1);

   int sizeOfLpwstrArray();

   void setLpwstrArray(String[] var1);

   void setLpwstrArray(int var1, String var2);

   void xsetLpwstrArray(XmlString[] var1);

   void xsetLpwstrArray(int var1, XmlString var2);

   void insertLpwstr(int var1, String var2);

   void addLpwstr(String var1);

   XmlString insertNewLpwstr(int var1);

   XmlString addNewLpwstr();

   void removeLpwstr(int var1);

   List getBstrList();

   String[] getBstrArray();

   String getBstrArray(int var1);

   List xgetBstrList();

   XmlString[] xgetBstrArray();

   XmlString xgetBstrArray(int var1);

   int sizeOfBstrArray();

   void setBstrArray(String[] var1);

   void setBstrArray(int var1, String var2);

   void xsetBstrArray(XmlString[] var1);

   void xsetBstrArray(int var1, XmlString var2);

   void insertBstr(int var1, String var2);

   void addBstr(String var1);

   XmlString insertNewBstr(int var1);

   XmlString addNewBstr();

   void removeBstr(int var1);

   List getDateList();

   Calendar[] getDateArray();

   Calendar getDateArray(int var1);

   List xgetDateList();

   XmlDateTime[] xgetDateArray();

   XmlDateTime xgetDateArray(int var1);

   int sizeOfDateArray();

   void setDateArray(Calendar[] var1);

   void setDateArray(int var1, Calendar var2);

   void xsetDateArray(XmlDateTime[] var1);

   void xsetDateArray(int var1, XmlDateTime var2);

   void insertDate(int var1, Calendar var2);

   void addDate(Calendar var1);

   XmlDateTime insertNewDate(int var1);

   XmlDateTime addNewDate();

   void removeDate(int var1);

   List getFiletimeList();

   Calendar[] getFiletimeArray();

   Calendar getFiletimeArray(int var1);

   List xgetFiletimeList();

   XmlDateTime[] xgetFiletimeArray();

   XmlDateTime xgetFiletimeArray(int var1);

   int sizeOfFiletimeArray();

   void setFiletimeArray(Calendar[] var1);

   void setFiletimeArray(int var1, Calendar var2);

   void xsetFiletimeArray(XmlDateTime[] var1);

   void xsetFiletimeArray(int var1, XmlDateTime var2);

   void insertFiletime(int var1, Calendar var2);

   void addFiletime(Calendar var1);

   XmlDateTime insertNewFiletime(int var1);

   XmlDateTime addNewFiletime();

   void removeFiletime(int var1);

   List getBoolList();

   boolean[] getBoolArray();

   boolean getBoolArray(int var1);

   List xgetBoolList();

   XmlBoolean[] xgetBoolArray();

   XmlBoolean xgetBoolArray(int var1);

   int sizeOfBoolArray();

   void setBoolArray(boolean[] var1);

   void setBoolArray(int var1, boolean var2);

   void xsetBoolArray(XmlBoolean[] var1);

   void xsetBoolArray(int var1, XmlBoolean var2);

   void insertBool(int var1, boolean var2);

   void addBool(boolean var1);

   XmlBoolean insertNewBool(int var1);

   XmlBoolean addNewBool();

   void removeBool(int var1);

   List getCyList();

   String[] getCyArray();

   String getCyArray(int var1);

   List xgetCyList();

   STCy[] xgetCyArray();

   STCy xgetCyArray(int var1);

   int sizeOfCyArray();

   void setCyArray(String[] var1);

   void setCyArray(int var1, String var2);

   void xsetCyArray(STCy[] var1);

   void xsetCyArray(int var1, STCy var2);

   void insertCy(int var1, String var2);

   void addCy(String var1);

   STCy insertNewCy(int var1);

   STCy addNewCy();

   void removeCy(int var1);

   List getErrorList();

   String[] getErrorArray();

   String getErrorArray(int var1);

   List xgetErrorList();

   STError[] xgetErrorArray();

   STError xgetErrorArray(int var1);

   int sizeOfErrorArray();

   void setErrorArray(String[] var1);

   void setErrorArray(int var1, String var2);

   void xsetErrorArray(STError[] var1);

   void xsetErrorArray(int var1, STError var2);

   void insertError(int var1, String var2);

   void addError(String var1);

   STError insertNewError(int var1);

   STError addNewError();

   void removeError(int var1);

   List getClsidList();

   String[] getClsidArray();

   String getClsidArray(int var1);

   List xgetClsidList();

   STClsid[] xgetClsidArray();

   STClsid xgetClsidArray(int var1);

   int sizeOfClsidArray();

   void setClsidArray(String[] var1);

   void setClsidArray(int var1, String var2);

   void xsetClsidArray(STClsid[] var1);

   void xsetClsidArray(int var1, STClsid var2);

   void insertClsid(int var1, String var2);

   void addClsid(String var1);

   STClsid insertNewClsid(int var1);

   STClsid addNewClsid();

   void removeClsid(int var1);

   List getCfList();

   CTCf[] getCfArray();

   CTCf getCfArray(int var1);

   int sizeOfCfArray();

   void setCfArray(CTCf[] var1);

   void setCfArray(int var1, CTCf var2);

   CTCf insertNewCf(int var1);

   CTCf addNewCf();

   void removeCf(int var1);

   STVectorBaseType$Enum getBaseType();

   STVectorBaseType xgetBaseType();

   void setBaseType(STVectorBaseType$Enum var1);

   void xsetBaseType(STVectorBaseType var1);

   long getSize();

   XmlUnsignedInt xgetSize();

   void setSize(long var1);

   void xsetSize(XmlUnsignedInt var1);


   public static final class Factory {

      public static CTVector newInstance() {
         return (CTVector)POIXMLTypeLoader.newInstance(CTVector.type, (XmlOptions)null);
      }

      public static CTVector newInstance(XmlOptions var0) {
         return (CTVector)POIXMLTypeLoader.newInstance(CTVector.type, var0);
      }

      public static CTVector parse(String var0) throws XmlException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, (XmlOptions)null);
      }

      public static CTVector parse(String var0, XmlOptions var1) throws XmlException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, var1);
      }

      public static CTVector parse(File var0) throws XmlException, IOException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, (XmlOptions)null);
      }

      public static CTVector parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, var1);
      }

      public static CTVector parse(URL var0) throws XmlException, IOException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, (XmlOptions)null);
      }

      public static CTVector parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, var1);
      }

      public static CTVector parse(InputStream var0) throws XmlException, IOException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, (XmlOptions)null);
      }

      public static CTVector parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, var1);
      }

      public static CTVector parse(Reader var0) throws XmlException, IOException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, (XmlOptions)null);
      }

      public static CTVector parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, var1);
      }

      public static CTVector parse(XMLStreamReader var0) throws XmlException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, (XmlOptions)null);
      }

      public static CTVector parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, var1);
      }

      public static CTVector parse(Node var0) throws XmlException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, (XmlOptions)null);
      }

      public static CTVector parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, var1);
      }

      public static CTVector parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, (XmlOptions)null);
      }

      public static CTVector parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTVector)POIXMLTypeLoader.parse(var0, CTVector.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVector.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTVector.type, var1);
      }

   }
}
