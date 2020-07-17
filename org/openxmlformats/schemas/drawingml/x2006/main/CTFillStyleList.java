package org.openxmlformats.schemas.drawingml.x2006.main;

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
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlipFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGradientFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGroupFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTNoFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPatternFillProperties;
import org.openxmlformats.schemas.drawingml.x2006.main.CTSolidColorFillProperties;
import org.w3c.dom.Node;

public interface CTFillStyleList extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTFillStyleList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctfillstylelist959dtype");


   List getNoFillList();

   CTNoFillProperties[] getNoFillArray();

   CTNoFillProperties getNoFillArray(int var1);

   int sizeOfNoFillArray();

   void setNoFillArray(CTNoFillProperties[] var1);

   void setNoFillArray(int var1, CTNoFillProperties var2);

   CTNoFillProperties insertNewNoFill(int var1);

   CTNoFillProperties addNewNoFill();

   void removeNoFill(int var1);

   List getSolidFillList();

   CTSolidColorFillProperties[] getSolidFillArray();

   CTSolidColorFillProperties getSolidFillArray(int var1);

   int sizeOfSolidFillArray();

   void setSolidFillArray(CTSolidColorFillProperties[] var1);

   void setSolidFillArray(int var1, CTSolidColorFillProperties var2);

   CTSolidColorFillProperties insertNewSolidFill(int var1);

   CTSolidColorFillProperties addNewSolidFill();

   void removeSolidFill(int var1);

   List getGradFillList();

   CTGradientFillProperties[] getGradFillArray();

   CTGradientFillProperties getGradFillArray(int var1);

   int sizeOfGradFillArray();

   void setGradFillArray(CTGradientFillProperties[] var1);

   void setGradFillArray(int var1, CTGradientFillProperties var2);

   CTGradientFillProperties insertNewGradFill(int var1);

   CTGradientFillProperties addNewGradFill();

   void removeGradFill(int var1);

   List getBlipFillList();

   CTBlipFillProperties[] getBlipFillArray();

   CTBlipFillProperties getBlipFillArray(int var1);

   int sizeOfBlipFillArray();

   void setBlipFillArray(CTBlipFillProperties[] var1);

   void setBlipFillArray(int var1, CTBlipFillProperties var2);

   CTBlipFillProperties insertNewBlipFill(int var1);

   CTBlipFillProperties addNewBlipFill();

   void removeBlipFill(int var1);

   List getPattFillList();

   CTPatternFillProperties[] getPattFillArray();

   CTPatternFillProperties getPattFillArray(int var1);

   int sizeOfPattFillArray();

   void setPattFillArray(CTPatternFillProperties[] var1);

   void setPattFillArray(int var1, CTPatternFillProperties var2);

   CTPatternFillProperties insertNewPattFill(int var1);

   CTPatternFillProperties addNewPattFill();

   void removePattFill(int var1);

   List getGrpFillList();

   CTGroupFillProperties[] getGrpFillArray();

   CTGroupFillProperties getGrpFillArray(int var1);

   int sizeOfGrpFillArray();

   void setGrpFillArray(CTGroupFillProperties[] var1);

   void setGrpFillArray(int var1, CTGroupFillProperties var2);

   CTGroupFillProperties insertNewGrpFill(int var1);

   CTGroupFillProperties addNewGrpFill();

   void removeGrpFill(int var1);


   public static final class Factory {

      public static CTFillStyleList newInstance() {
         return (CTFillStyleList)POIXMLTypeLoader.newInstance(CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList newInstance(XmlOptions var0) {
         return (CTFillStyleList)POIXMLTypeLoader.newInstance(CTFillStyleList.type, var0);
      }

      public static CTFillStyleList parse(String var0) throws XmlException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList parse(String var0, XmlOptions var1) throws XmlException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, var1);
      }

      public static CTFillStyleList parse(File var0) throws XmlException, IOException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, var1);
      }

      public static CTFillStyleList parse(URL var0) throws XmlException, IOException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, var1);
      }

      public static CTFillStyleList parse(InputStream var0) throws XmlException, IOException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, var1);
      }

      public static CTFillStyleList parse(Reader var0) throws XmlException, IOException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, var1);
      }

      public static CTFillStyleList parse(XMLStreamReader var0) throws XmlException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, var1);
      }

      public static CTFillStyleList parse(Node var0) throws XmlException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, var1);
      }

      public static CTFillStyleList parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static CTFillStyleList parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTFillStyleList)POIXMLTypeLoader.parse(var0, CTFillStyleList.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFillStyleList.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTFillStyleList.type, var1);
      }

   }
}
