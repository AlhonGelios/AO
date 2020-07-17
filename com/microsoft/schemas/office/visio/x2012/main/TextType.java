package com.microsoft.schemas.office.visio.x2012.main;

import com.microsoft.schemas.office.visio.x2012.main.CpType;
import com.microsoft.schemas.office.visio.x2012.main.FldType;
import com.microsoft.schemas.office.visio.x2012.main.PpType;
import com.microsoft.schemas.office.visio.x2012.main.TpType;
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

public interface TextType extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(TextType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("texttyped2ectype");


   List getCpList();

   CpType[] getCpArray();

   CpType getCpArray(int var1);

   int sizeOfCpArray();

   void setCpArray(CpType[] var1);

   void setCpArray(int var1, CpType var2);

   CpType insertNewCp(int var1);

   CpType addNewCp();

   void removeCp(int var1);

   List getPpList();

   PpType[] getPpArray();

   PpType getPpArray(int var1);

   int sizeOfPpArray();

   void setPpArray(PpType[] var1);

   void setPpArray(int var1, PpType var2);

   PpType insertNewPp(int var1);

   PpType addNewPp();

   void removePp(int var1);

   List getTpList();

   TpType[] getTpArray();

   TpType getTpArray(int var1);

   int sizeOfTpArray();

   void setTpArray(TpType[] var1);

   void setTpArray(int var1, TpType var2);

   TpType insertNewTp(int var1);

   TpType addNewTp();

   void removeTp(int var1);

   List getFldList();

   FldType[] getFldArray();

   FldType getFldArray(int var1);

   int sizeOfFldArray();

   void setFldArray(FldType[] var1);

   void setFldArray(int var1, FldType var2);

   FldType insertNewFld(int var1);

   FldType addNewFld();

   void removeFld(int var1);


   public static final class Factory {

      public static TextType newInstance() {
         return (TextType)POIXMLTypeLoader.newInstance(TextType.type, (XmlOptions)null);
      }

      public static TextType newInstance(XmlOptions var0) {
         return (TextType)POIXMLTypeLoader.newInstance(TextType.type, var0);
      }

      public static TextType parse(String var0) throws XmlException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, (XmlOptions)null);
      }

      public static TextType parse(String var0, XmlOptions var1) throws XmlException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, var1);
      }

      public static TextType parse(File var0) throws XmlException, IOException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, (XmlOptions)null);
      }

      public static TextType parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, var1);
      }

      public static TextType parse(URL var0) throws XmlException, IOException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, (XmlOptions)null);
      }

      public static TextType parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, var1);
      }

      public static TextType parse(InputStream var0) throws XmlException, IOException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, (XmlOptions)null);
      }

      public static TextType parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, var1);
      }

      public static TextType parse(Reader var0) throws XmlException, IOException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, (XmlOptions)null);
      }

      public static TextType parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, var1);
      }

      public static TextType parse(XMLStreamReader var0) throws XmlException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, (XmlOptions)null);
      }

      public static TextType parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, var1);
      }

      public static TextType parse(Node var0) throws XmlException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, (XmlOptions)null);
      }

      public static TextType parse(Node var0, XmlOptions var1) throws XmlException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, var1);
      }

      public static TextType parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, (XmlOptions)null);
      }

      public static TextType parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (TextType)POIXMLTypeLoader.parse(var0, TextType.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TextType.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, TextType.type, var1);
      }

   }
}
