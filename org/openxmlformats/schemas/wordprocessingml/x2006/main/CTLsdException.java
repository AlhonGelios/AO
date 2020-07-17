package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;
import org.w3c.dom.Node;

public interface CTLsdException extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLsdException.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlsdexceptiona296type");


   String getName();

   STString xgetName();

   void setName(String var1);

   void xsetName(STString var1);

   STOnOff.Enum getLocked();

   STOnOff xgetLocked();

   boolean isSetLocked();

   void setLocked(STOnOff.Enum var1);

   void xsetLocked(STOnOff var1);

   void unsetLocked();

   BigInteger getUiPriority();

   STDecimalNumber xgetUiPriority();

   boolean isSetUiPriority();

   void setUiPriority(BigInteger var1);

   void xsetUiPriority(STDecimalNumber var1);

   void unsetUiPriority();

   STOnOff.Enum getSemiHidden();

   STOnOff xgetSemiHidden();

   boolean isSetSemiHidden();

   void setSemiHidden(STOnOff.Enum var1);

   void xsetSemiHidden(STOnOff var1);

   void unsetSemiHidden();

   STOnOff.Enum getUnhideWhenUsed();

   STOnOff xgetUnhideWhenUsed();

   boolean isSetUnhideWhenUsed();

   void setUnhideWhenUsed(STOnOff.Enum var1);

   void xsetUnhideWhenUsed(STOnOff var1);

   void unsetUnhideWhenUsed();

   STOnOff.Enum getQFormat();

   STOnOff xgetQFormat();

   boolean isSetQFormat();

   void setQFormat(STOnOff.Enum var1);

   void xsetQFormat(STOnOff var1);

   void unsetQFormat();


   public static final class Factory {

      public static CTLsdException newInstance() {
         return (CTLsdException)POIXMLTypeLoader.newInstance(CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException newInstance(XmlOptions var0) {
         return (CTLsdException)POIXMLTypeLoader.newInstance(CTLsdException.type, var0);
      }

      public static CTLsdException parse(String var0) throws XmlException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, var1);
      }

      public static CTLsdException parse(File var0) throws XmlException, IOException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, var1);
      }

      public static CTLsdException parse(URL var0) throws XmlException, IOException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, var1);
      }

      public static CTLsdException parse(InputStream var0) throws XmlException, IOException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, var1);
      }

      public static CTLsdException parse(Reader var0) throws XmlException, IOException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, var1);
      }

      public static CTLsdException parse(XMLStreamReader var0) throws XmlException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, var1);
      }

      public static CTLsdException parse(Node var0) throws XmlException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, var1);
      }

      public static CTLsdException parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static CTLsdException parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLsdException)POIXMLTypeLoader.parse(var0, CTLsdException.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLsdException.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLsdException.type, var1);
      }

   }
}
