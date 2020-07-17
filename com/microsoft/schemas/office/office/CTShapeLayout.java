package com.microsoft.schemas.office.office;

import com.microsoft.schemas.office.office.CTIdMap;
import com.microsoft.schemas.office.office.CTRegroupTable;
import com.microsoft.schemas.office.office.CTRules;
import com.microsoft.schemas.vml.STExt;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
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
import org.w3c.dom.Node;

public interface CTShapeLayout extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTShapeLayout.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctshapelayoutbda4type");


   CTIdMap getIdmap();

   boolean isSetIdmap();

   void setIdmap(CTIdMap var1);

   CTIdMap addNewIdmap();

   void unsetIdmap();

   CTRegroupTable getRegrouptable();

   boolean isSetRegrouptable();

   void setRegrouptable(CTRegroupTable var1);

   CTRegroupTable addNewRegrouptable();

   void unsetRegrouptable();

   CTRules getRules();

   boolean isSetRules();

   void setRules(CTRules var1);

   CTRules addNewRules();

   void unsetRules();

   STExt.Enum getExt();

   STExt xgetExt();

   boolean isSetExt();

   void setExt(STExt.Enum var1);

   void xsetExt(STExt var1);

   void unsetExt();


   public static final class Factory {

      public static CTShapeLayout newInstance() {
         return (CTShapeLayout)POIXMLTypeLoader.newInstance(CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout newInstance(XmlOptions var0) {
         return (CTShapeLayout)POIXMLTypeLoader.newInstance(CTShapeLayout.type, var0);
      }

      public static CTShapeLayout parse(String var0) throws XmlException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout parse(String var0, XmlOptions var1) throws XmlException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, var1);
      }

      public static CTShapeLayout parse(File var0) throws XmlException, IOException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, var1);
      }

      public static CTShapeLayout parse(URL var0) throws XmlException, IOException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, var1);
      }

      public static CTShapeLayout parse(InputStream var0) throws XmlException, IOException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, var1);
      }

      public static CTShapeLayout parse(Reader var0) throws XmlException, IOException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, var1);
      }

      public static CTShapeLayout parse(XMLStreamReader var0) throws XmlException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, var1);
      }

      public static CTShapeLayout parse(Node var0) throws XmlException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, var1);
      }

      public static CTShapeLayout parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static CTShapeLayout parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTShapeLayout)POIXMLTypeLoader.parse(var0, CTShapeLayout.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShapeLayout.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTShapeLayout.type, var1);
      }

   }
}
