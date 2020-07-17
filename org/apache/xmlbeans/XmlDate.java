package org.apache.xmlbeans;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
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

public interface XmlDate extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_date");


   Calendar calendarValue();

   void set(Calendar var1);

   GDate gDateValue();

   void set(GDateSpecification var1);

   Date dateValue();

   void set(Date var1);

   Calendar getCalendarValue();

   void setCalendarValue(Calendar var1);

   GDate getGDateValue();

   void setGDateValue(GDate var1);

   Date getDateValue();

   void setDateValue(Date var1);


   public static final class Factory {

      public static XmlDate newInstance() {
         return (XmlDate)XmlBeans.getContextTypeLoader().newInstance(XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate newInstance(XmlOptions options) {
         return (XmlDate)XmlBeans.getContextTypeLoader().newInstance(XmlDate.type, options);
      }

      public static XmlDate newValue(Object obj) {
         return (XmlDate)XmlDate.type.newValue(obj);
      }

      public static XmlDate parse(String s) throws XmlException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(s, XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate parse(String s, XmlOptions options) throws XmlException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(s, XmlDate.type, options);
      }

      public static XmlDate parse(File f) throws XmlException, IOException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(f, XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(f, XmlDate.type, options);
      }

      public static XmlDate parse(URL u) throws XmlException, IOException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(u, XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(u, XmlDate.type, options);
      }

      public static XmlDate parse(InputStream is) throws XmlException, IOException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(is, XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(is, XmlDate.type, options);
      }

      public static XmlDate parse(Reader r) throws XmlException, IOException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(r, XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(r, XmlDate.type, options);
      }

      public static XmlDate parse(Node node) throws XmlException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(node, XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate parse(Node node, XmlOptions options) throws XmlException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(node, XmlDate.type, options);
      }

      public static XmlDate parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(xis, XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(xis, XmlDate.type, options);
      }

      public static XmlDate parse(XMLStreamReader xsr) throws XmlException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(xsr, XmlDate.type, (XmlOptions)null);
      }

      public static XmlDate parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlDate)XmlBeans.getContextTypeLoader().parse(xsr, XmlDate.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlDate.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlDate.type, options);
      }

   }
}
