package com.microsoft.schemas.office.office;

import com.microsoft.schemas.office.office.STTrueFalse;
import com.microsoft.schemas.office.office.STTrueFalse$Enum;
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

public interface CTLock extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTLock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctlock6b8etype");


   STExt.Enum getExt();

   STExt xgetExt();

   boolean isSetExt();

   void setExt(STExt.Enum var1);

   void xsetExt(STExt var1);

   void unsetExt();

   STTrueFalse$Enum getPosition();

   STTrueFalse xgetPosition();

   boolean isSetPosition();

   void setPosition(STTrueFalse$Enum var1);

   void xsetPosition(STTrueFalse var1);

   void unsetPosition();

   STTrueFalse$Enum getSelection();

   STTrueFalse xgetSelection();

   boolean isSetSelection();

   void setSelection(STTrueFalse$Enum var1);

   void xsetSelection(STTrueFalse var1);

   void unsetSelection();

   STTrueFalse$Enum getGrouping();

   STTrueFalse xgetGrouping();

   boolean isSetGrouping();

   void setGrouping(STTrueFalse$Enum var1);

   void xsetGrouping(STTrueFalse var1);

   void unsetGrouping();

   STTrueFalse$Enum getUngrouping();

   STTrueFalse xgetUngrouping();

   boolean isSetUngrouping();

   void setUngrouping(STTrueFalse$Enum var1);

   void xsetUngrouping(STTrueFalse var1);

   void unsetUngrouping();

   STTrueFalse$Enum getRotation();

   STTrueFalse xgetRotation();

   boolean isSetRotation();

   void setRotation(STTrueFalse$Enum var1);

   void xsetRotation(STTrueFalse var1);

   void unsetRotation();

   STTrueFalse$Enum getCropping();

   STTrueFalse xgetCropping();

   boolean isSetCropping();

   void setCropping(STTrueFalse$Enum var1);

   void xsetCropping(STTrueFalse var1);

   void unsetCropping();

   STTrueFalse$Enum getVerticies();

   STTrueFalse xgetVerticies();

   boolean isSetVerticies();

   void setVerticies(STTrueFalse$Enum var1);

   void xsetVerticies(STTrueFalse var1);

   void unsetVerticies();

   STTrueFalse$Enum getAdjusthandles();

   STTrueFalse xgetAdjusthandles();

   boolean isSetAdjusthandles();

   void setAdjusthandles(STTrueFalse$Enum var1);

   void xsetAdjusthandles(STTrueFalse var1);

   void unsetAdjusthandles();

   STTrueFalse$Enum getText();

   STTrueFalse xgetText();

   boolean isSetText();

   void setText(STTrueFalse$Enum var1);

   void xsetText(STTrueFalse var1);

   void unsetText();

   STTrueFalse$Enum getAspectratio();

   STTrueFalse xgetAspectratio();

   boolean isSetAspectratio();

   void setAspectratio(STTrueFalse$Enum var1);

   void xsetAspectratio(STTrueFalse var1);

   void unsetAspectratio();

   STTrueFalse$Enum getShapetype();

   STTrueFalse xgetShapetype();

   boolean isSetShapetype();

   void setShapetype(STTrueFalse$Enum var1);

   void xsetShapetype(STTrueFalse var1);

   void unsetShapetype();


   public static final class Factory {

      public static CTLock newInstance() {
         return (CTLock)POIXMLTypeLoader.newInstance(CTLock.type, (XmlOptions)null);
      }

      public static CTLock newInstance(XmlOptions var0) {
         return (CTLock)POIXMLTypeLoader.newInstance(CTLock.type, var0);
      }

      public static CTLock parse(String var0) throws XmlException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, (XmlOptions)null);
      }

      public static CTLock parse(String var0, XmlOptions var1) throws XmlException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, var1);
      }

      public static CTLock parse(File var0) throws XmlException, IOException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, (XmlOptions)null);
      }

      public static CTLock parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, var1);
      }

      public static CTLock parse(URL var0) throws XmlException, IOException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, (XmlOptions)null);
      }

      public static CTLock parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, var1);
      }

      public static CTLock parse(InputStream var0) throws XmlException, IOException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, (XmlOptions)null);
      }

      public static CTLock parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, var1);
      }

      public static CTLock parse(Reader var0) throws XmlException, IOException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, (XmlOptions)null);
      }

      public static CTLock parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, var1);
      }

      public static CTLock parse(XMLStreamReader var0) throws XmlException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, (XmlOptions)null);
      }

      public static CTLock parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, var1);
      }

      public static CTLock parse(Node var0) throws XmlException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, (XmlOptions)null);
      }

      public static CTLock parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, var1);
      }

      public static CTLock parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, (XmlOptions)null);
      }

      public static CTLock parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTLock)POIXMLTypeLoader.parse(var0, CTLock.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLock.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTLock.type, var1);
      }

   }
}
