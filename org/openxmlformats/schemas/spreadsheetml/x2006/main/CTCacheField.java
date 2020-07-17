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
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFieldGroup;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTSharedItems;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTX;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STNumFmtId;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STXstring;
import org.w3c.dom.Node;

public interface CTCacheField extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTCacheField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcachefieldae21type");


   CTSharedItems getSharedItems();

   boolean isSetSharedItems();

   void setSharedItems(CTSharedItems var1);

   CTSharedItems addNewSharedItems();

   void unsetSharedItems();

   CTFieldGroup getFieldGroup();

   boolean isSetFieldGroup();

   void setFieldGroup(CTFieldGroup var1);

   CTFieldGroup addNewFieldGroup();

   void unsetFieldGroup();

   List getMpMapList();

   CTX[] getMpMapArray();

   CTX getMpMapArray(int var1);

   int sizeOfMpMapArray();

   void setMpMapArray(CTX[] var1);

   void setMpMapArray(int var1, CTX var2);

   CTX insertNewMpMap(int var1);

   CTX addNewMpMap();

   void removeMpMap(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   String getName();

   STXstring xgetName();

   void setName(String var1);

   void xsetName(STXstring var1);

   String getCaption();

   STXstring xgetCaption();

   boolean isSetCaption();

   void setCaption(String var1);

   void xsetCaption(STXstring var1);

   void unsetCaption();

   String getPropertyName();

   STXstring xgetPropertyName();

   boolean isSetPropertyName();

   void setPropertyName(String var1);

   void xsetPropertyName(STXstring var1);

   void unsetPropertyName();

   boolean getServerField();

   XmlBoolean xgetServerField();

   boolean isSetServerField();

   void setServerField(boolean var1);

   void xsetServerField(XmlBoolean var1);

   void unsetServerField();

   boolean getUniqueList();

   XmlBoolean xgetUniqueList();

   boolean isSetUniqueList();

   void setUniqueList(boolean var1);

   void xsetUniqueList(XmlBoolean var1);

   void unsetUniqueList();

   long getNumFmtId();

   STNumFmtId xgetNumFmtId();

   boolean isSetNumFmtId();

   void setNumFmtId(long var1);

   void xsetNumFmtId(STNumFmtId var1);

   void unsetNumFmtId();

   String getFormula();

   STXstring xgetFormula();

   boolean isSetFormula();

   void setFormula(String var1);

   void xsetFormula(STXstring var1);

   void unsetFormula();

   int getSqlType();

   XmlInt xgetSqlType();

   boolean isSetSqlType();

   void setSqlType(int var1);

   void xsetSqlType(XmlInt var1);

   void unsetSqlType();

   int getHierarchy();

   XmlInt xgetHierarchy();

   boolean isSetHierarchy();

   void setHierarchy(int var1);

   void xsetHierarchy(XmlInt var1);

   void unsetHierarchy();

   long getLevel();

   XmlUnsignedInt xgetLevel();

   boolean isSetLevel();

   void setLevel(long var1);

   void xsetLevel(XmlUnsignedInt var1);

   void unsetLevel();

   boolean getDatabaseField();

   XmlBoolean xgetDatabaseField();

   boolean isSetDatabaseField();

   void setDatabaseField(boolean var1);

   void xsetDatabaseField(XmlBoolean var1);

   void unsetDatabaseField();

   long getMappingCount();

   XmlUnsignedInt xgetMappingCount();

   boolean isSetMappingCount();

   void setMappingCount(long var1);

   void xsetMappingCount(XmlUnsignedInt var1);

   void unsetMappingCount();

   boolean getMemberPropertyField();

   XmlBoolean xgetMemberPropertyField();

   boolean isSetMemberPropertyField();

   void setMemberPropertyField(boolean var1);

   void xsetMemberPropertyField(XmlBoolean var1);

   void unsetMemberPropertyField();


   public static final class Factory {

      public static CTCacheField newInstance() {
         return (CTCacheField)POIXMLTypeLoader.newInstance(CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField newInstance(XmlOptions var0) {
         return (CTCacheField)POIXMLTypeLoader.newInstance(CTCacheField.type, var0);
      }

      public static CTCacheField parse(String var0) throws XmlException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField parse(String var0, XmlOptions var1) throws XmlException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, var1);
      }

      public static CTCacheField parse(File var0) throws XmlException, IOException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, var1);
      }

      public static CTCacheField parse(URL var0) throws XmlException, IOException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, var1);
      }

      public static CTCacheField parse(InputStream var0) throws XmlException, IOException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, var1);
      }

      public static CTCacheField parse(Reader var0) throws XmlException, IOException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, var1);
      }

      public static CTCacheField parse(XMLStreamReader var0) throws XmlException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, var1);
      }

      public static CTCacheField parse(Node var0) throws XmlException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, var1);
      }

      public static CTCacheField parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static CTCacheField parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTCacheField)POIXMLTypeLoader.parse(var0, CTCacheField.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCacheField.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTCacheField.type, var1);
      }

   }
}
