package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.MasterShortcutType;
import com.microsoft.schemas.office.visio.x2012.main.MasterType;
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
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface MastersType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(MastersType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("masterstypeaebatype");


   List getMasterList();

   MasterType[] getMasterArray();

   MasterType getMasterArray(int var1);

   int sizeOfMasterArray();

   void setMasterArray(MasterType[] var1);

   void setMasterArray(int var1, MasterType var2);

   MasterType insertNewMaster(int var1);

   MasterType addNewMaster();

   void removeMaster(int var1);

   List getMasterShortcutList();

   MasterShortcutType[] getMasterShortcutArray();

   MasterShortcutType getMasterShortcutArray(int var1);

   int sizeOfMasterShortcutArray();

   void setMasterShortcutArray(MasterShortcutType[] var1);

   void setMasterShortcutArray(int var1, MasterShortcutType var2);

   MasterShortcutType insertNewMasterShortcut(int var1);

   MasterShortcutType addNewMasterShortcut();

   void removeMasterShortcut(int var1);


   public static final class Factory {

      public static MastersType newInstance() {
         return (MastersType)POIXMLTypeLoader.newInstance(MastersType.type, (XmlOptions)null);
      }

      public static MastersType newInstance(XmlOptions var0) {
         return (MastersType)POIXMLTypeLoader.newInstance(MastersType.type, var0);
      }

      public static MastersType parse(String var0) throws XmlException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, (XmlOptions)null);
      }

      public static MastersType parse(String var0, XmlOptions var1) throws XmlException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, var1);
      }

      public static MastersType parse(File var0) throws XmlException, IOException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, (XmlOptions)null);
      }

      public static MastersType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, var1);
      }

      public static MastersType parse(URL var0) throws XmlException, IOException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, (XmlOptions)null);
      }

      public static MastersType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, var1);
      }

      public static MastersType parse(InputStream var0) throws XmlException, IOException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, (XmlOptions)null);
      }

      public static MastersType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, var1);
      }

      public static MastersType parse(Reader var0) throws XmlException, IOException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, (XmlOptions)null);
      }

      public static MastersType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, var1);
      }

      public static MastersType parse(XMLStreamReader var0) throws XmlException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, (XmlOptions)null);
      }

      public static MastersType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, var1);
      }

      public static MastersType parse(Node var0) throws XmlException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, (XmlOptions)null);
      }

      public static MastersType parse(Node var0, XmlOptions var1) throws XmlException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, var1);
      }

      public static MastersType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, (XmlOptions)null);
      }

      public static MastersType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (MastersType)POIXMLTypeLoader.parse(var0, MastersType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MastersType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, MastersType.type, var1);
      }

   }
}
