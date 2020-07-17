package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.STDirection;
import org.openxmlformats.schemas.presentationml.x2006.main.STDirection$Enum;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderSize$Enum;
import org.openxmlformats.schemas.presentationml.x2006.main.STPlaceholderType;
import org.w3c.dom.Node;

public interface CTPlaceholder extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTPlaceholder.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctplaceholder9efctype");


   CTExtensionListModify getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionListModify var1);

   CTExtensionListModify addNewExtLst();

   void unsetExtLst();

   STPlaceholderType.Enum getType();

   STPlaceholderType xgetType();

   boolean isSetType();

   void setType(STPlaceholderType.Enum var1);

   void xsetType(STPlaceholderType var1);

   void unsetType();

   STDirection$Enum getOrient();

   STDirection xgetOrient();

   boolean isSetOrient();

   void setOrient(STDirection$Enum var1);

   void xsetOrient(STDirection var1);

   void unsetOrient();

   STPlaceholderSize$Enum getSz();

   STPlaceholderSize xgetSz();

   boolean isSetSz();

   void setSz(STPlaceholderSize$Enum var1);

   void xsetSz(STPlaceholderSize var1);

   void unsetSz();

   long getIdx();

   XmlUnsignedInt xgetIdx();

   boolean isSetIdx();

   void setIdx(long var1);

   void xsetIdx(XmlUnsignedInt var1);

   void unsetIdx();

   boolean getHasCustomPrompt();

   XmlBoolean xgetHasCustomPrompt();

   boolean isSetHasCustomPrompt();

   void setHasCustomPrompt(boolean var1);

   void xsetHasCustomPrompt(XmlBoolean var1);

   void unsetHasCustomPrompt();


   public static final class Factory {

      public static CTPlaceholder newInstance() {
         return (CTPlaceholder)POIXMLTypeLoader.newInstance(CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder newInstance(XmlOptions var0) {
         return (CTPlaceholder)POIXMLTypeLoader.newInstance(CTPlaceholder.type, var0);
      }

      public static CTPlaceholder parse(String var0) throws XmlException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder parse(String var0, XmlOptions var1) throws XmlException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, var1);
      }

      public static CTPlaceholder parse(File var0) throws XmlException, IOException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, var1);
      }

      public static CTPlaceholder parse(URL var0) throws XmlException, IOException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, var1);
      }

      public static CTPlaceholder parse(InputStream var0) throws XmlException, IOException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, var1);
      }

      public static CTPlaceholder parse(Reader var0) throws XmlException, IOException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, var1);
      }

      public static CTPlaceholder parse(XMLStreamReader var0) throws XmlException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, var1);
      }

      public static CTPlaceholder parse(Node var0) throws XmlException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, var1);
      }

      public static CTPlaceholder parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static CTPlaceholder parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTPlaceholder)POIXMLTypeLoader.parse(var0, CTPlaceholder.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPlaceholder.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTPlaceholder.type, var1);
      }

   }
}
