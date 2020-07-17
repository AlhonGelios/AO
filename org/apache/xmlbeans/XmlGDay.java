package org.apache.xmlbeans;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.GDate;
import org.apache.xmlbeans.GDateSpecification;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface XmlGDay extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_gDay");


   Calendar getCalendarValue();

   void setCalendarValue(Calendar var1);

   GDate getGDateValue();

   void setGDateValue(GDate var1);

   int getIntValue();

   void setIntValue(int var1);

   Calendar calendarValue();

   void set(Calendar var1);

   GDate gDateValue();

   void set(GDateSpecification var1);

   int intValue();

   void set(int var1);


   public static final class Factory {

      public static XmlGDay newInstance() {
         return (XmlGDay)XmlBeans.getContextTypeLoader().newInstance(XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay newInstance(XmlOptions options) {
         return (XmlGDay)XmlBeans.getContextTypeLoader().newInstance(XmlGDay.type, options);
      }

      public static XmlGDay newValue(Object obj) {
         return (XmlGDay)XmlGDay.type.newValue(obj);
      }

      public static XmlGDay parse(String s) throws XmlException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(s, XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay parse(String s, XmlOptions options) throws XmlException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(s, XmlGDay.type, options);
      }

      public static XmlGDay parse(File f) throws XmlException, IOException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(f, XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(f, XmlGDay.type, options);
      }

      public static XmlGDay parse(URL u) throws XmlException, IOException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(u, XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(u, XmlGDay.type, options);
      }

      public static XmlGDay parse(InputStream is) throws XmlException, IOException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(is, XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(is, XmlGDay.type, options);
      }

      public static XmlGDay parse(Reader r) throws XmlException, IOException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(r, XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(r, XmlGDay.type, options);
      }

      public static XmlGDay parse(Node node) throws XmlException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(node, XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay parse(Node node, XmlOptions options) throws XmlException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(node, XmlGDay.type, options);
      }

      public static XmlGDay parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(xis, XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(xis, XmlGDay.type, options);
      }

      public static XmlGDay parse(XMLStreamReader xsr) throws XmlException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(xsr, XmlGDay.type, (XmlOptions)null);
      }

      public static XmlGDay parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlGDay)XmlBeans.getContextTypeLoader().parse(xsr, XmlGDay.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlGDay.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlGDay.type, options);
      }

   }
}
