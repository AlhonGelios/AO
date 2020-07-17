package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLsdException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.w3c.dom.Node;

public interface CTLatentStyles extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLatentStyles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlatentstyles2e3atype");


   List getLsdExceptionList();

   CTLsdException[] getLsdExceptionArray();

   CTLsdException getLsdExceptionArray(int var1);

   int sizeOfLsdExceptionArray();

   void setLsdExceptionArray(CTLsdException[] var1);

   void setLsdExceptionArray(int var1, CTLsdException var2);

   CTLsdException insertNewLsdException(int var1);

   CTLsdException addNewLsdException();

   void removeLsdException(int var1);

   STOnOff.Enum getDefLockedState();

   STOnOff xgetDefLockedState();

   boolean isSetDefLockedState();

   void setDefLockedState(STOnOff.Enum var1);

   void xsetDefLockedState(STOnOff var1);

   void unsetDefLockedState();

   BigInteger getDefUIPriority();

   STDecimalNumber xgetDefUIPriority();

   boolean isSetDefUIPriority();

   void setDefUIPriority(BigInteger var1);

   void xsetDefUIPriority(STDecimalNumber var1);

   void unsetDefUIPriority();

   STOnOff.Enum getDefSemiHidden();

   STOnOff xgetDefSemiHidden();

   boolean isSetDefSemiHidden();

   void setDefSemiHidden(STOnOff.Enum var1);

   void xsetDefSemiHidden(STOnOff var1);

   void unsetDefSemiHidden();

   STOnOff.Enum getDefUnhideWhenUsed();

   STOnOff xgetDefUnhideWhenUsed();

   boolean isSetDefUnhideWhenUsed();

   void setDefUnhideWhenUsed(STOnOff.Enum var1);

   void xsetDefUnhideWhenUsed(STOnOff var1);

   void unsetDefUnhideWhenUsed();

   STOnOff.Enum getDefQFormat();

   STOnOff xgetDefQFormat();

   boolean isSetDefQFormat();

   void setDefQFormat(STOnOff.Enum var1);

   void xsetDefQFormat(STOnOff var1);

   void unsetDefQFormat();

   BigInteger getCount();

   STDecimalNumber xgetCount();

   boolean isSetCount();

   void setCount(BigInteger var1);

   void xsetCount(STDecimalNumber var1);

   void unsetCount();


   public static final class Factory {

      public static CTLatentStyles newInstance() {
         return (CTLatentStyles)POIXMLTypeLoader.newInstance(CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles newInstance(XmlOptions var0) {
         return (CTLatentStyles)POIXMLTypeLoader.newInstance(CTLatentStyles.type, var0);
      }

      public static CTLatentStyles parse(String var0) throws XmlException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, var1);
      }

      public static CTLatentStyles parse(File var0) throws XmlException, IOException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, var1);
      }

      public static CTLatentStyles parse(URL var0) throws XmlException, IOException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, var1);
      }

      public static CTLatentStyles parse(InputStream var0) throws XmlException, IOException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, var1);
      }

      public static CTLatentStyles parse(Reader var0) throws XmlException, IOException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, var1);
      }

      public static CTLatentStyles parse(XMLStreamReader var0) throws XmlException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, var1);
      }

      public static CTLatentStyles parse(Node var0) throws XmlException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, var1);
      }

      public static CTLatentStyles parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static CTLatentStyles parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLatentStyles)POIXMLTypeLoader.parse(var0, CTLatentStyles.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLatentStyles.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLatentStyles.type, var1);
      }

   }
}
