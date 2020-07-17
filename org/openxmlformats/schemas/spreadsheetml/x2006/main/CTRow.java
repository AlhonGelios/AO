package org.openxmlformats.schemas.spreadsheetml.x2006.main;

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
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlUnsignedByte;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCell;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTExtensionList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STCellSpans;
import org.w3c.dom.Node;

public interface CTRow extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTRow.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctrowdd39type");


   List getCList();

   CTCell[] getCArray();

   CTCell getCArray(int var1);

   int sizeOfCArray();

   void setCArray(CTCell[] var1);

   void setCArray(int var1, CTCell var2);

   CTCell insertNewC(int var1);

   CTCell addNewC();

   void removeC(int var1);

   CTExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionList var1);

   CTExtensionList addNewExtLst();

   void unsetExtLst();

   long getR();

   XmlUnsignedInt xgetR();

   boolean isSetR();

   void setR(long var1);

   void xsetR(XmlUnsignedInt var1);

   void unsetR();

   List getSpans();

   STCellSpans xgetSpans();

   boolean isSetSpans();

   void setSpans(List var1);

   void xsetSpans(STCellSpans var1);

   void unsetSpans();

   long getS();

   XmlUnsignedInt xgetS();

   boolean isSetS();

   void setS(long var1);

   void xsetS(XmlUnsignedInt var1);

   void unsetS();

   boolean getCustomFormat();

   XmlBoolean xgetCustomFormat();

   boolean isSetCustomFormat();

   void setCustomFormat(boolean var1);

   void xsetCustomFormat(XmlBoolean var1);

   void unsetCustomFormat();

   double getHt();

   XmlDouble xgetHt();

   boolean isSetHt();

   void setHt(double var1);

   void xsetHt(XmlDouble var1);

   void unsetHt();

   boolean getHidden();

   XmlBoolean xgetHidden();

   boolean isSetHidden();

   void setHidden(boolean var1);

   void xsetHidden(XmlBoolean var1);

   void unsetHidden();

   boolean getCustomHeight();

   XmlBoolean xgetCustomHeight();

   boolean isSetCustomHeight();

   void setCustomHeight(boolean var1);

   void xsetCustomHeight(XmlBoolean var1);

   void unsetCustomHeight();

   short getOutlineLevel();

   XmlUnsignedByte xgetOutlineLevel();

   boolean isSetOutlineLevel();

   void setOutlineLevel(short var1);

   void xsetOutlineLevel(XmlUnsignedByte var1);

   void unsetOutlineLevel();

   boolean getCollapsed();

   XmlBoolean xgetCollapsed();

   boolean isSetCollapsed();

   void setCollapsed(boolean var1);

   void xsetCollapsed(XmlBoolean var1);

   void unsetCollapsed();

   boolean getThickTop();

   XmlBoolean xgetThickTop();

   boolean isSetThickTop();

   void setThickTop(boolean var1);

   void xsetThickTop(XmlBoolean var1);

   void unsetThickTop();

   boolean getThickBot();

   XmlBoolean xgetThickBot();

   boolean isSetThickBot();

   void setThickBot(boolean var1);

   void xsetThickBot(XmlBoolean var1);

   void unsetThickBot();

   boolean getPh();

   XmlBoolean xgetPh();

   boolean isSetPh();

   void setPh(boolean var1);

   void xsetPh(XmlBoolean var1);

   void unsetPh();


   public static final class Factory {

      public static CTRow newInstance() {
         return (CTRow)POIXMLTypeLoader.newInstance(CTRow.type, (XmlOptions)null);
      }

      public static CTRow newInstance(XmlOptions var0) {
         return (CTRow)POIXMLTypeLoader.newInstance(CTRow.type, var0);
      }

      public static CTRow parse(String var0) throws XmlException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, (XmlOptions)null);
      }

      public static CTRow parse(String var0, XmlOptions var1) throws XmlException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, var1);
      }

      public static CTRow parse(File var0) throws XmlException, IOException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, (XmlOptions)null);
      }

      public static CTRow parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, var1);
      }

      public static CTRow parse(URL var0) throws XmlException, IOException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, (XmlOptions)null);
      }

      public static CTRow parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, var1);
      }

      public static CTRow parse(InputStream var0) throws XmlException, IOException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, (XmlOptions)null);
      }

      public static CTRow parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, var1);
      }

      public static CTRow parse(Reader var0) throws XmlException, IOException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, (XmlOptions)null);
      }

      public static CTRow parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, var1);
      }

      public static CTRow parse(XMLStreamReader var0) throws XmlException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, (XmlOptions)null);
      }

      public static CTRow parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, var1);
      }

      public static CTRow parse(Node var0) throws XmlException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, (XmlOptions)null);
      }

      public static CTRow parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, var1);
      }

      public static CTRow parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, (XmlOptions)null);
      }

      public static CTRow parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTRow)POIXMLTypeLoader.parse(var0, CTRow.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRow.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTRow.type, var1);
      }

   }
}
