package org.openxmlformats.schemas.presentationml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupShapeProperties;
import org.openxmlformats.schemas.presentationml.x2006.main.CTConnector;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShapeNonVisual;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPicture;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;
import org.w3c.dom.Node;

public interface CTGroupShape extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGroupShape.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgroupshape5b43type");


   CTGroupShapeNonVisual getNvGrpSpPr();

   void setNvGrpSpPr(CTGroupShapeNonVisual var1);

   CTGroupShapeNonVisual addNewNvGrpSpPr();

   CTGroupShapeProperties getGrpSpPr();

   void setGrpSpPr(CTGroupShapeProperties var1);

   CTGroupShapeProperties addNewGrpSpPr();

   List getSpList();

   CTShape[] getSpArray();

   CTShape getSpArray(int var1);

   int sizeOfSpArray();

   void setSpArray(CTShape[] var1);

   void setSpArray(int var1, CTShape var2);

   CTShape insertNewSp(int var1);

   CTShape addNewSp();

   void removeSp(int var1);

   List getGrpSpList();

   CTGroupShape[] getGrpSpArray();

   CTGroupShape getGrpSpArray(int var1);

   int sizeOfGrpSpArray();

   void setGrpSpArray(CTGroupShape[] var1);

   void setGrpSpArray(int var1, CTGroupShape var2);

   CTGroupShape insertNewGrpSp(int var1);

   CTGroupShape addNewGrpSp();

   void removeGrpSp(int var1);

   List getGraphicFrameList();

   CTGraphicalObjectFrame[] getGraphicFrameArray();

   CTGraphicalObjectFrame getGraphicFrameArray(int var1);

   int sizeOfGraphicFrameArray();

   void setGraphicFrameArray(CTGraphicalObjectFrame[] var1);

   void setGraphicFrameArray(int var1, CTGraphicalObjectFrame var2);

   CTGraphicalObjectFrame insertNewGraphicFrame(int var1);

   CTGraphicalObjectFrame addNewGraphicFrame();

   void removeGraphicFrame(int var1);

   List getCxnSpList();

   CTConnector[] getCxnSpArray();

   CTConnector getCxnSpArray(int var1);

   int sizeOfCxnSpArray();

   void setCxnSpArray(CTConnector[] var1);

   void setCxnSpArray(int var1, CTConnector var2);

   CTConnector insertNewCxnSp(int var1);

   CTConnector addNewCxnSp();

   void removeCxnSp(int var1);

   List getPicList();

   CTPicture[] getPicArray();

   CTPicture getPicArray(int var1);

   int sizeOfPicArray();

   void setPicArray(CTPicture[] var1);

   void setPicArray(int var1, CTPicture var2);

   CTPicture insertNewPic(int var1);

   CTPicture addNewPic();

   void removePic(int var1);

   CTExtensionListModify getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionListModify var1);

   CTExtensionListModify addNewExtLst();

   void unsetExtLst();


   public static final class Factory {

      public static CTGroupShape newInstance() {
         return (CTGroupShape)POIXMLTypeLoader.newInstance(CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape newInstance(XmlOptions var0) {
         return (CTGroupShape)POIXMLTypeLoader.newInstance(CTGroupShape.type, var0);
      }

      public static CTGroupShape parse(String var0) throws XmlException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, var1);
      }

      public static CTGroupShape parse(File var0) throws XmlException, IOException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, var1);
      }

      public static CTGroupShape parse(URL var0) throws XmlException, IOException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, var1);
      }

      public static CTGroupShape parse(InputStream var0) throws XmlException, IOException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, var1);
      }

      public static CTGroupShape parse(Reader var0) throws XmlException, IOException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, var1);
      }

      public static CTGroupShape parse(XMLStreamReader var0) throws XmlException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, var1);
      }

      public static CTGroupShape parse(Node var0) throws XmlException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, var1);
      }

      public static CTGroupShape parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static CTGroupShape parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGroupShape)POIXMLTypeLoader.parse(var0, CTGroupShape.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupShape.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroupShape.type, var1);
      }

   }
}
