package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.IconType;
import com.microsoft.schemas.office.visio.x2012.main.PageSheetType;
import com.microsoft.schemas.office.visio.x2012.main.RelType;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.XmlUnsignedShort;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface MasterType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(MasterType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("mastertype2d97type");


   PageSheetType getPageSheet();

   boolean isSetPageSheet();

   void setPageSheet(PageSheetType var1);

   PageSheetType addNewPageSheet();

   void unsetPageSheet();

   RelType getRel();

   void setRel(RelType var1);

   RelType addNewRel();

   IconType getIcon();

   boolean isSetIcon();

   void setIcon(IconType var1);

   IconType addNewIcon();

   void unsetIcon();

   long getID();

   XmlUnsignedInt xgetID();

   void setID(long var1);

   void xsetID(XmlUnsignedInt var1);

   String getBaseID();

   XmlString xgetBaseID();

   boolean isSetBaseID();

   void setBaseID(String var1);

   void xsetBaseID(XmlString var1);

   void unsetBaseID();

   String getUniqueID();

   XmlString xgetUniqueID();

   boolean isSetUniqueID();

   void setUniqueID(String var1);

   void xsetUniqueID(XmlString var1);

   void unsetUniqueID();

   boolean getMatchByName();

   XmlBoolean xgetMatchByName();

   boolean isSetMatchByName();

   void setMatchByName(boolean var1);

   void xsetMatchByName(XmlBoolean var1);

   void unsetMatchByName();

   String getName();

   XmlString xgetName();

   boolean isSetName();

   void setName(String var1);

   void xsetName(XmlString var1);

   void unsetName();

   String getNameU();

   XmlString xgetNameU();

   boolean isSetNameU();

   void setNameU(String var1);

   void xsetNameU(XmlString var1);

   void unsetNameU();

   boolean getIsCustomName();

   XmlBoolean xgetIsCustomName();

   boolean isSetIsCustomName();

   void setIsCustomName(boolean var1);

   void xsetIsCustomName(XmlBoolean var1);

   void unsetIsCustomName();

   boolean getIsCustomNameU();

   XmlBoolean xgetIsCustomNameU();

   boolean isSetIsCustomNameU();

   void setIsCustomNameU(boolean var1);

   void xsetIsCustomNameU(XmlBoolean var1);

   void unsetIsCustomNameU();

   int getIconSize();

   XmlUnsignedShort xgetIconSize();

   boolean isSetIconSize();

   void setIconSize(int var1);

   void xsetIconSize(XmlUnsignedShort var1);

   void unsetIconSize();

   int getPatternFlags();

   XmlUnsignedShort xgetPatternFlags();

   boolean isSetPatternFlags();

   void setPatternFlags(int var1);

   void xsetPatternFlags(XmlUnsignedShort var1);

   void unsetPatternFlags();

   String getPrompt();

   XmlString xgetPrompt();

   boolean isSetPrompt();

   void setPrompt(String var1);

   void xsetPrompt(XmlString var1);

   void unsetPrompt();

   boolean getHidden();

   XmlBoolean xgetHidden();

   boolean isSetHidden();

   void setHidden(boolean var1);

   void xsetHidden(XmlBoolean var1);

   void unsetHidden();

   boolean getIconUpdate();

   XmlBoolean xgetIconUpdate();

   boolean isSetIconUpdate();

   void setIconUpdate(boolean var1);

   void xsetIconUpdate(XmlBoolean var1);

   void unsetIconUpdate();

   int getAlignName();

   XmlUnsignedShort xgetAlignName();

   boolean isSetAlignName();

   void setAlignName(int var1);

   void xsetAlignName(XmlUnsignedShort var1);

   void unsetAlignName();

   int getMasterType();

   XmlUnsignedShort xgetMasterType();

   boolean isSetMasterType();

   void setMasterType(int var1);

   void xsetMasterType(XmlUnsignedShort var1);

   void unsetMasterType();


   public static final class Factory {

      public static MasterType newInstance() {
         return (MasterType)POIXMLTypeLoader.newInstance(MasterType.type, (XmlOptions)null);
      }

      public static MasterType newInstance(XmlOptions var0) {
         return (MasterType)POIXMLTypeLoader.newInstance(MasterType.type, var0);
      }

      public static MasterType parse(String var0) throws XmlException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, (XmlOptions)null);
      }

      public static MasterType parse(String var0, XmlOptions var1) throws XmlException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, var1);
      }

      public static MasterType parse(File var0) throws XmlException, IOException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, (XmlOptions)null);
      }

      public static MasterType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, var1);
      }

      public static MasterType parse(URL var0) throws XmlException, IOException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, (XmlOptions)null);
      }

      public static MasterType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, var1);
      }

      public static MasterType parse(InputStream var0) throws XmlException, IOException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, (XmlOptions)null);
      }

      public static MasterType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, var1);
      }

      public static MasterType parse(Reader var0) throws XmlException, IOException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, (XmlOptions)null);
      }

      public static MasterType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, var1);
      }

      public static MasterType parse(XMLStreamReader var0) throws XmlException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, (XmlOptions)null);
      }

      public static MasterType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, var1);
      }

      public static MasterType parse(Node var0) throws XmlException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, (XmlOptions)null);
      }

      public static MasterType parse(Node var0, XmlOptions var1) throws XmlException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, var1);
      }

      public static MasterType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, (XmlOptions)null);
      }

      public static MasterType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (MasterType)POIXMLTypeLoader.parse(var0, MasterType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MasterType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MasterType.type, var1);
      }

   }
}
