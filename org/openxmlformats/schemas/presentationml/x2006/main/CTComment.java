package org.openxmlformats.schemas.presentationml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPoint2D;
import org.openxmlformats.schemas.presentationml.x2006.main.CTExtensionListModify;
import org.openxmlformats.schemas.presentationml.x2006.main.STIndex;
import org.w3c.dom.Node;

public interface CTComment extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTComment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctcomment2d10type");


   CTPoint2D getPos();

   void setPos(CTPoint2D var1);

   CTPoint2D addNewPos();

   String getText();

   XmlString xgetText();

   void setText(String var1);

   void xsetText(XmlString var1);

   CTExtensionListModify getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTExtensionListModify var1);

   CTExtensionListModify addNewExtLst();

   void unsetExtLst();

   long getAuthorId();

   XmlUnsignedInt xgetAuthorId();

   void setAuthorId(long var1);

   void xsetAuthorId(XmlUnsignedInt var1);

   Calendar getDt();

   XmlDateTime xgetDt();

   boolean isSetDt();

   void setDt(Calendar var1);

   void xsetDt(XmlDateTime var1);

   void unsetDt();

   long getIdx();

   STIndex xgetIdx();

   void setIdx(long var1);

   void xsetIdx(STIndex var1);


   public static final class Factory {

      public static CTComment newInstance() {
         return (CTComment)POIXMLTypeLoader.newInstance(CTComment.type, (XmlOptions)null);
      }

      public static CTComment newInstance(XmlOptions var0) {
         return (CTComment)POIXMLTypeLoader.newInstance(CTComment.type, var0);
      }

      public static CTComment parse(String var0) throws XmlException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, (XmlOptions)null);
      }

      public static CTComment parse(String var0, XmlOptions var1) throws XmlException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, var1);
      }

      public static CTComment parse(File var0) throws XmlException, IOException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, (XmlOptions)null);
      }

      public static CTComment parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, var1);
      }

      public static CTComment parse(URL var0) throws XmlException, IOException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, (XmlOptions)null);
      }

      public static CTComment parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, var1);
      }

      public static CTComment parse(InputStream var0) throws XmlException, IOException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, (XmlOptions)null);
      }

      public static CTComment parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, var1);
      }

      public static CTComment parse(Reader var0) throws XmlException, IOException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, (XmlOptions)null);
      }

      public static CTComment parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, var1);
      }

      public static CTComment parse(XMLStreamReader var0) throws XmlException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, (XmlOptions)null);
      }

      public static CTComment parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, var1);
      }

      public static CTComment parse(Node var0) throws XmlException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, (XmlOptions)null);
      }

      public static CTComment parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, var1);
      }

      public static CTComment parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, (XmlOptions)null);
      }

      public static CTComment parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTComment)POIXMLTypeLoader.parse(var0, CTComment.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTComment.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTComment.type, var1);
      }

   }
}
