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

public interface XmlGMonthDay extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_gMonthDay");


   Calendar getCalendarValue();

   void setCalendarValue(Calendar var1);

   GDate getGDateValue();

   void setGDateValue(GDate var1);

   Calendar calendarValue();

   void set(Calendar var1);

   GDate gDateValue();

   void set(GDateSpecification var1);


   public static final class Factory {

      public static XmlGMonthDay newInstance() {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().newInstance(XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay newInstance(XmlOptions options) {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().newInstance(XmlGMonthDay.type, options);
      }

      public static XmlGMonthDay newValue(Object obj) {
         return (XmlGMonthDay)XmlGMonthDay.type.newValue(obj);
      }

      public static XmlGMonthDay parse(String s) throws XmlException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(s, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay parse(String s, XmlOptions options) throws XmlException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(s, XmlGMonthDay.type, options);
      }

      public static XmlGMonthDay parse(File f) throws XmlException, IOException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(f, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(f, XmlGMonthDay.type, options);
      }

      public static XmlGMonthDay parse(URL u) throws XmlException, IOException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(u, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(u, XmlGMonthDay.type, options);
      }

      public static XmlGMonthDay parse(InputStream is) throws XmlException, IOException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(is, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(is, XmlGMonthDay.type, options);
      }

      public static XmlGMonthDay parse(Reader r) throws XmlException, IOException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(r, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(r, XmlGMonthDay.type, options);
      }

      public static XmlGMonthDay parse(Node node) throws XmlException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(node, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay parse(Node node, XmlOptions options) throws XmlException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(node, XmlGMonthDay.type, options);
      }

      public static XmlGMonthDay parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(xis, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(xis, XmlGMonthDay.type, options);
      }

      public static XmlGMonthDay parse(XMLStreamReader xsr) throws XmlException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(xsr, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XmlGMonthDay parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlGMonthDay)XmlBeans.getContextTypeLoader().parse(xsr, XmlGMonthDay.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlGMonthDay.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlGMonthDay.type, options);
      }

   }
}
