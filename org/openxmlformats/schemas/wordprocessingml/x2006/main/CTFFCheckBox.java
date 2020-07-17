package org.openxmlformats.schemas.wordprocessingml.x2006.main;

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
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.w3c.dom.Node;

public interface CTFFCheckBox extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFFCheckBox.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctffcheckboxf3a5type");


   CTHpsMeasure getSize();

   boolean isSetSize();

   void setSize(CTHpsMeasure var1);

   CTHpsMeasure addNewSize();

   void unsetSize();

   CTOnOff getSizeAuto();

   boolean isSetSizeAuto();

   void setSizeAuto(CTOnOff var1);

   CTOnOff addNewSizeAuto();

   void unsetSizeAuto();

   CTOnOff getDefault();

   boolean isSetDefault();

   void setDefault(CTOnOff var1);

   CTOnOff addNewDefault();

   void unsetDefault();

   CTOnOff getChecked();

   boolean isSetChecked();

   void setChecked(CTOnOff var1);

   CTOnOff addNewChecked();

   void unsetChecked();


   public static final class Factory {

      public static CTFFCheckBox newInstance() {
         return (CTFFCheckBox)POIXMLTypeLoader.newInstance(CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox newInstance(XmlOptions var0) {
         return (CTFFCheckBox)POIXMLTypeLoader.newInstance(CTFFCheckBox.type, var0);
      }

      public static CTFFCheckBox parse(String var0) throws XmlException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, var1);
      }

      public static CTFFCheckBox parse(File var0) throws XmlException, IOException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, var1);
      }

      public static CTFFCheckBox parse(URL var0) throws XmlException, IOException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, var1);
      }

      public static CTFFCheckBox parse(InputStream var0) throws XmlException, IOException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, var1);
      }

      public static CTFFCheckBox parse(Reader var0) throws XmlException, IOException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, var1);
      }

      public static CTFFCheckBox parse(XMLStreamReader var0) throws XmlException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, var1);
      }

      public static CTFFCheckBox parse(Node var0) throws XmlException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, var1);
      }

      public static CTFFCheckBox parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static CTFFCheckBox parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFFCheckBox)POIXMLTypeLoader.parse(var0, CTFFCheckBox.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFFCheckBox.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFFCheckBox.type, var1);
      }

   }
}
