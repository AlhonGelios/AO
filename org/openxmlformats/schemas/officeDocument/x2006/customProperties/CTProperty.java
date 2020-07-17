package org.openxmlformats.schemas.officeDocument.x2006.customProperties;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlByte;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDecimal;
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
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTArray;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTCf;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTEmpty;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTNull;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVector;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.CTVstream;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STClsid;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STCy;
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.STError;
import org.w3c.dom.Node;

public interface CTProperty extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctproperty5ffatype");


   CTVector getVector();

   boolean isSetVector();

   void setVector(CTVector var1);

   CTVector addNewVector();

   void unsetVector();

   CTArray getArray();

   boolean isSetArray();

   void setArray(CTArray var1);

   CTArray addNewArray();

   void unsetArray();

   byte[] getBlob();

   XmlBase64Binary xgetBlob();

   boolean isSetBlob();

   void setBlob(byte[] var1);

   void xsetBlob(XmlBase64Binary var1);

   void unsetBlob();

   byte[] getOblob();

   XmlBase64Binary xgetOblob();

   boolean isSetOblob();

   void setOblob(byte[] var1);

   void xsetOblob(XmlBase64Binary var1);

   void unsetOblob();

   CTEmpty getEmpty();

   boolean isSetEmpty();

   void setEmpty(CTEmpty var1);

   CTEmpty addNewEmpty();

   void unsetEmpty();

   CTNull getNull();

   boolean isSetNull();

   void setNull(CTNull var1);

   CTNull addNewNull();

   void unsetNull();

   byte getI1();

   XmlByte xgetI1();

   boolean isSetI1();

   void setI1(byte var1);

   void xsetI1(XmlByte var1);

   void unsetI1();

   short getI2();

   XmlShort xgetI2();

   boolean isSetI2();

   void setI2(short var1);

   void xsetI2(XmlShort var1);

   void unsetI2();

   int getI4();

   XmlInt xgetI4();

   boolean isSetI4();

   void setI4(int var1);

   void xsetI4(XmlInt var1);

   void unsetI4();

   long getI8();

   XmlLong xgetI8();

   boolean isSetI8();

   void setI8(long var1);

   void xsetI8(XmlLong var1);

   void unsetI8();

   int getInt();

   XmlInt xgetInt();

   boolean isSetInt();

   void setInt(int var1);

   void xsetInt(XmlInt var1);

   void unsetInt();

   short getUi1();

   XmlUnsignedByte xgetUi1();

   boolean isSetUi1();

   void setUi1(short var1);

   void xsetUi1(XmlUnsignedByte var1);

   void unsetUi1();

   int getUi2();

   XmlUnsignedShort xgetUi2();

   boolean isSetUi2();

   void setUi2(int var1);

   void xsetUi2(XmlUnsignedShort var1);

   void unsetUi2();

   long getUi4();

   XmlUnsignedInt xgetUi4();

   boolean isSetUi4();

   void setUi4(long var1);

   void xsetUi4(XmlUnsignedInt var1);

   void unsetUi4();

   BigInteger getUi8();

   XmlUnsignedLong xgetUi8();

   boolean isSetUi8();

   void setUi8(BigInteger var1);

   void xsetUi8(XmlUnsignedLong var1);

   void unsetUi8();

   long getUint();

   XmlUnsignedInt xgetUint();

   boolean isSetUint();

   void setUint(long var1);

   void xsetUint(XmlUnsignedInt var1);

   void unsetUint();

   float getR4();

   XmlFloat xgetR4();

   boolean isSetR4();

   void setR4(float var1);

   void xsetR4(XmlFloat var1);

   void unsetR4();

   double getR8();

   XmlDouble xgetR8();

   boolean isSetR8();

   void setR8(double var1);

   void xsetR8(XmlDouble var1);

   void unsetR8();

   BigDecimal getDecimal();

   XmlDecimal xgetDecimal();

   boolean isSetDecimal();

   void setDecimal(BigDecimal var1);

   void xsetDecimal(XmlDecimal var1);

   void unsetDecimal();

   String getLpstr();

   XmlString xgetLpstr();

   boolean isSetLpstr();

   void setLpstr(String var1);

   void xsetLpstr(XmlString var1);

   void unsetLpstr();

   String getLpwstr();

   XmlString xgetLpwstr();

   boolean isSetLpwstr();

   void setLpwstr(String var1);

   void xsetLpwstr(XmlString var1);

   void unsetLpwstr();

   String getBstr();

   XmlString xgetBstr();

   boolean isSetBstr();

   void setBstr(String var1);

   void xsetBstr(XmlString var1);

   void unsetBstr();

   Calendar getDate();

   XmlDateTime xgetDate();

   boolean isSetDate();

   void setDate(Calendar var1);

   void xsetDate(XmlDateTime var1);

   void unsetDate();

   Calendar getFiletime();

   XmlDateTime xgetFiletime();

   boolean isSetFiletime();

   void setFiletime(Calendar var1);

   void xsetFiletime(XmlDateTime var1);

   void unsetFiletime();

   boolean getBool();

   XmlBoolean xgetBool();

   boolean isSetBool();

   void setBool(boolean var1);

   void xsetBool(XmlBoolean var1);

   void unsetBool();

   String getCy();

   STCy xgetCy();

   boolean isSetCy();

   void setCy(String var1);

   void xsetCy(STCy var1);

   void unsetCy();

   String getError();

   STError xgetError();

   boolean isSetError();

   void setError(String var1);

   void xsetError(STError var1);

   void unsetError();

   byte[] getStream();

   XmlBase64Binary xgetStream();

   boolean isSetStream();

   void setStream(byte[] var1);

   void xsetStream(XmlBase64Binary var1);

   void unsetStream();

   byte[] getOstream();

   XmlBase64Binary xgetOstream();

   boolean isSetOstream();

   void setOstream(byte[] var1);

   void xsetOstream(XmlBase64Binary var1);

   void unsetOstream();

   byte[] getStorage();

   XmlBase64Binary xgetStorage();

   boolean isSetStorage();

   void setStorage(byte[] var1);

   void xsetStorage(XmlBase64Binary var1);

   void unsetStorage();

   byte[] getOstorage();

   XmlBase64Binary xgetOstorage();

   boolean isSetOstorage();

   void setOstorage(byte[] var1);

   void xsetOstorage(XmlBase64Binary var1);

   void unsetOstorage();

   CTVstream getVstream();

   boolean isSetVstream();

   void setVstream(CTVstream var1);

   CTVstream addNewVstream();

   void unsetVstream();

   String getClsid();

   STClsid xgetClsid();

   boolean isSetClsid();

   void setClsid(String var1);

   void xsetClsid(STClsid var1);

   void unsetClsid();

   CTCf getCf();

   boolean isSetCf();

   void setCf(CTCf var1);

   CTCf addNewCf();

   void unsetCf();

   String getFmtid();

   STClsid xgetFmtid();

   void setFmtid(String var1);

   void xsetFmtid(STClsid var1);

   int getPid();

   XmlInt xgetPid();

   void setPid(int var1);

   void xsetPid(XmlInt var1);

   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();

   String getLinkTarget();

   XmlString xgetLinkTarget();

   boolean isSetLinkTarget();

   void setLinkTarget(String var1);

   void xsetLinkTarget(XmlString var1);

   void unsetLinkTarget();


   public static final class Factory {

      public static CTProperty newInstance() {
         return (CTProperty)POIXMLTypeLoader.newInstance(CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty newInstance(XmlOptions var0) {
         return (CTProperty)POIXMLTypeLoader.newInstance(CTProperty.type, var0);
      }

      public static CTProperty parse(String var0) throws XmlException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty parse(String var0, XmlOptions var1) throws XmlException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, var1);
      }

      public static CTProperty parse(File var0) throws XmlException, IOException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, var1);
      }

      public static CTProperty parse(URL var0) throws XmlException, IOException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, var1);
      }

      public static CTProperty parse(InputStream var0) throws XmlException, IOException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, var1);
      }

      public static CTProperty parse(Reader var0) throws XmlException, IOException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, var1);
      }

      public static CTProperty parse(XMLStreamReader var0) throws XmlException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, var1);
      }

      public static CTProperty parse(Node var0) throws XmlException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, var1);
      }

      public static CTProperty parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, (XmlOptions)null);
      }

      public static CTProperty parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTProperty)POIXMLTypeLoader.parse(var0, CTProperty.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTProperty.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTProperty.type, var1);
      }

   }
}
