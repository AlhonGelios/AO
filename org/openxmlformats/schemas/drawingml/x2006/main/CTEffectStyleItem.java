package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectContainer;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTScene3D;
import org.openxmlformats.schemas.drawingml.x2006.main.CTShape3D;
import org.w3c.dom.Node;

public interface CTEffectStyleItem extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTEffectStyleItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("cteffectstyleitem05c4type");


   CTEffectList getEffectLst();

   boolean isSetEffectLst();

   void setEffectLst(CTEffectList var1);

   CTEffectList addNewEffectLst();

   void unsetEffectLst();

   CTEffectContainer getEffectDag();

   boolean isSetEffectDag();

   void setEffectDag(CTEffectContainer var1);

   CTEffectContainer addNewEffectDag();

   void unsetEffectDag();

   CTScene3D getScene3D();

   boolean isSetScene3D();

   void setScene3D(CTScene3D var1);

   CTScene3D addNewScene3D();

   void unsetScene3D();

   CTShape3D getSp3D();

   boolean isSetSp3D();

   void setSp3D(CTShape3D var1);

   CTShape3D addNewSp3D();

   void unsetSp3D();


   public static final class Factory {

      public static CTEffectStyleItem newInstance() {
         return (CTEffectStyleItem)POIXMLTypeLoader.newInstance(CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem newInstance(XmlOptions var0) {
         return (CTEffectStyleItem)POIXMLTypeLoader.newInstance(CTEffectStyleItem.type, var0);
      }

      public static CTEffectStyleItem parse(String var0) throws XmlException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem parse(String var0, XmlOptions var1) throws XmlException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, var1);
      }

      public static CTEffectStyleItem parse(File var0) throws XmlException, IOException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, var1);
      }

      public static CTEffectStyleItem parse(URL var0) throws XmlException, IOException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, var1);
      }

      public static CTEffectStyleItem parse(InputStream var0) throws XmlException, IOException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, var1);
      }

      public static CTEffectStyleItem parse(Reader var0) throws XmlException, IOException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, var1);
      }

      public static CTEffectStyleItem parse(XMLStreamReader var0) throws XmlException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, var1);
      }

      public static CTEffectStyleItem parse(Node var0) throws XmlException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, var1);
      }

      public static CTEffectStyleItem parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static CTEffectStyleItem parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTEffectStyleItem)POIXMLTypeLoader.parse(var0, CTEffectStyleItem.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEffectStyleItem.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTEffectStyleItem.type, var1);
      }

   }
}
