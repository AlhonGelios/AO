package org.apache.xmlbeans.impl.store;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.CDataBookmark;
import org.apache.xmlbeans.QNameCache;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlDocumentProperties;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlLineNumber;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlRuntimeException;
import org.apache.xmlbeans.XmlSaxHandler;
import org.apache.xmlbeans.XmlTokenSource;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.ResolverUtil;
import org.apache.xmlbeans.impl.common.SystemCache;
import org.apache.xmlbeans.impl.common.XMLNameHelper;
import org.apache.xmlbeans.impl.common.XmlLocale;
import org.apache.xmlbeans.impl.piccolo.io.FileFormatException;
import org.apache.xmlbeans.impl.piccolo.xml.Piccolo;
import org.apache.xmlbeans.impl.store.CharUtil;
import org.apache.xmlbeans.impl.store.Cur;
import org.apache.xmlbeans.impl.store.Cursor;
import org.apache.xmlbeans.impl.store.DomImpl;
import org.apache.xmlbeans.impl.store.Jsr173;
import org.apache.xmlbeans.impl.store.QNameFactory;
import org.apache.xmlbeans.impl.store.Saaj;
import org.apache.xmlbeans.impl.store.Xobj;
import org.apache.xmlbeans.xml.stream.Attribute;
import org.apache.xmlbeans.xml.stream.AttributeIterator;
import org.apache.xmlbeans.xml.stream.CharacterData;
import org.apache.xmlbeans.xml.stream.Comment;
import org.apache.xmlbeans.xml.stream.Location;
import org.apache.xmlbeans.xml.stream.ProcessingInstruction;
import org.apache.xmlbeans.xml.stream.Space;
import org.apache.xmlbeans.xml.stream.StartDocument;
import org.apache.xmlbeans.xml.stream.StartElement;
import org.apache.xmlbeans.xml.stream.XMLEvent;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLName;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.LexicalHandler;

public final class Locale implements DOMImplementation, Saaj.SaajCallback, XmlLocale {

   static final int ROOT = 1;
   static final int ELEM = 2;
   static final int ATTR = 3;
   static final int COMMENT = 4;
   static final int PROCINST = 5;
   static final int TEXT = 0;
   static final int WS_UNSPECIFIED = 0;
   static final int WS_PRESERVE = 1;
   static final int WS_REPLACE = 2;
   static final int WS_COLLAPSE = 3;
   static final String _xsi = "http://www.w3.org/2001/XMLSchema-instance";
   static final String _schema = "http://www.w3.org/2001/XMLSchema";
   static final String _openFragUri = "http://www.openuri.org/fragment";
   static final String _xml1998Uri = "http://www.w3.org/XML/1998/namespace";
   static final String _xmlnsUri = "http://www.w3.org/2000/xmlns/";
   static final QName _xsiNil = new QName("http://www.w3.org/2001/XMLSchema-instance", "nil", "xsi");
   static final QName _xsiType = new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi");
   static final QName _xsiLoc = new QName("http://www.w3.org/2001/XMLSchema-instance", "schemaLocation", "xsi");
   static final QName _xsiNoLoc = new QName("http://www.w3.org/2001/XMLSchema-instance", "noNamespaceSchemaLocation", "xsi");
   static final QName _openuriFragment = new QName("http://www.openuri.org/fragment", "fragment", "frag");
   static final QName _xmlFragment = new QName("xml-fragment");
   public static final String USE_SAME_LOCALE = "USE_SAME_LOCALE";
   public static final String COPY_USE_NEW_LOCALE = "COPY_USE_NEW_LOCALE";
   private static ThreadLocal tl_scrubBuffer = new ThreadLocal() {
      protected Object initialValue() {
         return new SoftReference(new Locale.ScrubBuffer());
      }
   };
   boolean _noSync;
   SchemaTypeLoader _schemaTypeLoader;
   private ReferenceQueue _refQueue;
   private int _entryCount;
   int _numTempFramesLeft;
   Cur[] _tempFrames;
   Cur _curPool;
   int _curPoolCount;
   Cur _registered;
   Locale.ChangeListener _changeListeners;
   long _versionAll;
   long _versionSansText;
   Cur.Locations _locations;
   private CharUtil _charUtil;
   int _offSrc;
   int _cchSrc;
   Saaj _saaj;
   DomImpl.Dom _ownerDoc;
   QNameFactory _qnameFactory;
   boolean _validateOnSet;
   int _posTemp;
   Locale.nthCache _nthCache_A = new Locale.nthCache();
   Locale.nthCache _nthCache_B = new Locale.nthCache();
   Locale.domNthCache _domNthCache_A = new Locale.domNthCache();
   Locale.domNthCache _domNthCache_B = new Locale.domNthCache();


   private Locale(SchemaTypeLoader stl, XmlOptions options) {
      options = XmlOptions.maskNull(options);
      this._noSync = options.hasOption("UNSYNCHRONIZED");
      this._tempFrames = new Cur[this._numTempFramesLeft = 8];
      this._qnameFactory = new Locale.DefaultQNameFactory(null);
      this._locations = new Cur.Locations(this);
      this._schemaTypeLoader = stl;
      this._validateOnSet = options.hasOption("VALIDATE_ON_SET");
      Object saajObj = options.get("SAAJ_IMPL");
      if(saajObj != null) {
         if(!(saajObj instanceof Saaj)) {
            throw new IllegalStateException("Saaj impl not correct type: " + saajObj);
         }

         this._saaj = (Saaj)saajObj;
         this._saaj.setCallback(this);
      }

   }

   static Locale getLocale(SchemaTypeLoader stl, XmlOptions options) {
      if(stl == null) {
         stl = XmlBeans.getContextTypeLoader();
      }

      options = XmlOptions.maskNull(options);
      Locale l = null;
      if(options.hasOption("USE_SAME_LOCALE")) {
         Object source = options.get("USE_SAME_LOCALE");
         if(source instanceof Locale) {
            l = (Locale)source;
         } else {
            if(!(source instanceof XmlTokenSource)) {
               throw new IllegalArgumentException("Source locale not understood: " + source);
            }

            l = (Locale)((XmlTokenSource)source).monitor();
         }

         if(l._schemaTypeLoader != stl) {
            throw new IllegalArgumentException("Source locale does not support same schema type loader");
         }

         if(l._saaj != null && l._saaj != options.get("SAAJ_IMPL")) {
            throw new IllegalArgumentException("Source locale does not support same saaj");
         }

         if(l._validateOnSet && !options.hasOption("VALIDATE_ON_SET")) {
            throw new IllegalArgumentException("Source locale does not support same validate on set");
         }
      } else {
         l = new Locale(stl, options);
      }

      return l;
   }

   static void associateSourceName(Cur c, XmlOptions options) {
      String sourceName = (String)XmlOptions.safeGet(options, "DOCUMENT_SOURCE_NAME");
      if(sourceName != null) {
         getDocProps(c, true).setSourceName(sourceName);
      }

   }

   static void autoTypeDocument(Cur c, SchemaType requestedType, XmlOptions options) throws XmlException {
      assert c.isRoot();

      options = XmlOptions.maskNull(options);
      SchemaType optionType = (SchemaType)options.get("DOCUMENT_TYPE");
      if(optionType != null) {
         c.setType(optionType);
      } else {
         SchemaType type = null;
         QName docElemName;
         if(requestedType == null || requestedType.getName() != null) {
            docElemName = c.getXsiTypeName();
            SchemaType requesteddocElemNameName = docElemName == null?null:c._locale._schemaTypeLoader.findType(docElemName);
            if(requestedType == null || requestedType.isAssignableFrom(requesteddocElemNameName)) {
               type = requesteddocElemNameName;
            }
         }

         if(type == null && (requestedType == null || requestedType.isDocumentType())) {
            assert c.isRoot();

            c.push();
            docElemName = !c.hasAttrs() && toFirstChildElement(c) && !toNextSiblingElement(c)?c.getName():null;
            c.pop();
            if(docElemName != null) {
               type = c._locale._schemaTypeLoader.findDocumentType(docElemName);
               if(type != null && requestedType != null) {
                  QName requesteddocElemNameName1 = requestedType.getDocumentElementName();
                  if(!requesteddocElemNameName1.equals(docElemName) && !requestedType.isValidSubstitution(docElemName)) {
                     throw new XmlException("Element " + QNameHelper.pretty(docElemName) + " is not a valid " + QNameHelper.pretty(requesteddocElemNameName1) + " document or a valid substitution.");
                  }
               }
            }
         }

         if(type == null && requestedType == null) {
            c.push();
            type = toFirstNormalAttr(c) && !toNextNormalAttr(c)?c._locale._schemaTypeLoader.findAttributeType(c.getName()):null;
            c.pop();
         }

         if(type == null) {
            type = requestedType;
         }

         if(type == null) {
            type = XmlBeans.NO_TYPE;
         }

         c.setType(type);
         if(requestedType != null) {
            if(type.isDocumentType()) {
               verifyDocumentType(c, type.getDocumentElementName());
            } else if(type.isAttributeType()) {
               verifyAttributeType(c, type.getAttributeTypeAttributeName());
            }
         }

      }
   }

   private static boolean namespacesSame(QName n1, QName n2) {
      return n1 == n2?true:(n1 != null && n2 != null?(n1.getNamespaceURI() == n2.getNamespaceURI()?true:(n1.getNamespaceURI() != null && n2.getNamespaceURI() != null?n1.getNamespaceURI().equals(n2.getNamespaceURI()):false)):false);
   }

   private static void addNamespace(StringBuffer sb, QName name) {
      if(name.getNamespaceURI() == null) {
         sb.append("<no namespace>");
      } else {
         sb.append("\"");
         sb.append(name.getNamespaceURI());
         sb.append("\"");
      }

   }

   private static void verifyDocumentType(Cur c, QName docElemName) throws XmlException {
      assert c.isRoot();

      c.push();

      try {
         StringBuffer sb = null;
         if(toFirstChildElement(c) && !toNextSiblingElement(c)) {
            QName err = c.getName();
            if(!err.equals(docElemName)) {
               sb = new StringBuffer();
               sb.append("The document is not a ");
               sb.append(QNameHelper.pretty(docElemName));
               if(docElemName.getLocalPart().equals(err.getLocalPart())) {
                  sb.append(": document element namespace mismatch ");
                  sb.append("expected ");
                  addNamespace(sb, docElemName);
                  sb.append(" got ");
                  addNamespace(sb, err);
               } else if(namespacesSame(docElemName, err)) {
                  sb.append(": document element local name mismatch ");
                  sb.append("expected " + docElemName.getLocalPart());
                  sb.append(" got " + err.getLocalPart());
               } else {
                  sb.append(": document element mismatch ");
                  sb.append("got ");
                  sb.append(QNameHelper.pretty(err));
               }
            }
         } else {
            sb = new StringBuffer();
            sb.append("The document is not a ");
            sb.append(QNameHelper.pretty(docElemName));
            sb.append(c.isRoot()?": no document element":": multiple document elements");
         }

         if(sb != null) {
            XmlError err1 = XmlError.forCursor(sb.toString(), new Cursor(c));
            throw new XmlException(err1.toString(), (Throwable)null, err1);
         }
      } finally {
         c.pop();
      }

   }

   private static void verifyAttributeType(Cur c, QName attrName) throws XmlException {
      assert c.isRoot();

      c.push();

      try {
         StringBuffer sb = null;
         if(toFirstNormalAttr(c) && !toNextNormalAttr(c)) {
            QName err = c.getName();
            if(!err.equals(attrName)) {
               sb = new StringBuffer();
               sb.append("The document is not a ");
               sb.append(QNameHelper.pretty(attrName));
               if(attrName.getLocalPart().equals(err.getLocalPart())) {
                  sb.append(": attribute namespace mismatch ");
                  sb.append("expected ");
                  addNamespace(sb, attrName);
                  sb.append(" got ");
                  addNamespace(sb, err);
               } else if(namespacesSame(attrName, err)) {
                  sb.append(": attribute local name mismatch ");
                  sb.append("expected " + attrName.getLocalPart());
                  sb.append(" got " + err.getLocalPart());
               } else {
                  sb.append(": attribute element mismatch ");
                  sb.append("got ");
                  sb.append(QNameHelper.pretty(err));
               }
            }
         } else {
            sb = new StringBuffer();
            sb.append("The document is not a ");
            sb.append(QNameHelper.pretty(attrName));
            sb.append(c.isRoot()?": no attributes":": multiple attributes");
         }

         if(sb != null) {
            XmlError err1 = XmlError.forCursor(sb.toString(), new Cursor(c));
            throw new XmlException(err1.toString(), (Throwable)null, err1);
         }
      } finally {
         c.pop();
      }

   }

   static boolean isFragmentQName(QName name) {
      return name.equals(_openuriFragment) || name.equals(_xmlFragment);
   }

   static boolean isFragment(Cur start, Cur end) {
      assert !end.isAttr();

      start.push();
      end.push();
      int numDocElems = 0;

      boolean isFrag;
      for(isFrag = false; !start.isSamePos(end); start.next()) {
         int k = start.kind();
         if(k == 3) {
            break;
         }

         if(k == 0 && !isWhiteSpace(start.getCharsAsString(-1))) {
            isFrag = true;
            break;
         }

         if(k == 2) {
            ++numDocElems;
            if(numDocElems > 1) {
               isFrag = true;
               break;
            }
         }

         assert k != 3;

         if(k != 0) {
            start.toEnd();
         }
      }

      start.pop();
      end.pop();
      return isFrag || numDocElems != 1;
   }

   public static XmlObject newInstance(SchemaTypeLoader stl, SchemaType type, XmlOptions options) {
      Locale l = getLocale(stl, options);
      if(l.noSync()) {
         l.enter();

         XmlObject var4;
         try {
            var4 = l.newInstance(type, options);
         } finally {
            l.exit();
         }

         return var4;
      } else {
         synchronized(l) {
            l.enter();

            XmlObject var5;
            try {
               var5 = l.newInstance(type, options);
            } finally {
               l.exit();
            }

            return var5;
         }
      }
   }

   private XmlObject newInstance(SchemaType type, XmlOptions options) {
      options = XmlOptions.maskNull(options);
      Cur c = this.tempCur();
      SchemaType sType = (SchemaType)options.get("DOCUMENT_TYPE");
      if(sType == null) {
         sType = type == null?XmlObject.type:type;
      }

      if(sType.isDocumentType()) {
         c.createDomDocumentRoot();
      } else {
         c.createRoot();
      }

      c.setType(sType);
      XmlObject x = (XmlObject)c.getUser();
      c.release();
      return x;
   }

   public static DOMImplementation newDomImplementation(SchemaTypeLoader stl, XmlOptions options) {
      return getLocale(stl, options);
   }

   public static XmlObject parseToXmlObject(SchemaTypeLoader stl, String xmlText, SchemaType type, XmlOptions options) throws XmlException {
      Locale l = getLocale(stl, options);
      if(l.noSync()) {
         l.enter();

         XmlObject var5;
         try {
            var5 = l.parseToXmlObject(xmlText, type, options);
         } finally {
            l.exit();
         }

         return var5;
      } else {
         synchronized(l) {
            l.enter();

            XmlObject var6;
            try {
               var6 = l.parseToXmlObject(xmlText, type, options);
            } finally {
               l.exit();
            }

            return var6;
         }
      }
   }

   private XmlObject parseToXmlObject(String xmlText, SchemaType type, XmlOptions options) throws XmlException {
      Cur c = this.parse(xmlText, type, options);
      XmlObject x = (XmlObject)c.getUser();
      c.release();
      return x;
   }

   Cur parse(String s, SchemaType type, XmlOptions options) throws XmlException {
      StringReader r = new StringReader(s);

      Cur var6;
      try {
         Cur e = getSaxLoader(options).load(this, new InputSource(r), options);
         autoTypeDocument(e, type, options);
         var6 = e;
      } catch (IOException var15) {
         assert false : "StringReader should not throw IOException";

         throw new XmlException(var15.getMessage(), var15);
      } finally {
         try {
            r.close();
         } catch (IOException var14) {
            ;
         }

      }

      return var6;
   }

   public static XmlObject parseToXmlObject(SchemaTypeLoader stl, XMLInputStream xis, SchemaType type, XmlOptions options) throws XmlException, XMLStreamException {
      Locale l = getLocale(stl, options);
      if(l.noSync()) {
         l.enter();

         XmlObject var5;
         try {
            var5 = l.parseToXmlObject(xis, type, options);
         } finally {
            l.exit();
         }

         return var5;
      } else {
         synchronized(l) {
            l.enter();

            XmlObject var6;
            try {
               var6 = l.parseToXmlObject(xis, type, options);
            } finally {
               l.exit();
            }

            return var6;
         }
      }
   }

   public XmlObject parseToXmlObject(XMLInputStream xis, SchemaType type, XmlOptions options) throws XmlException, XMLStreamException {
      Cur c;
      try {
         c = this.loadXMLInputStream(xis, options);
      } catch (XMLStreamException var6) {
         throw new XmlException(var6.getMessage(), var6);
      }

      autoTypeDocument(c, type, options);
      XmlObject x = (XmlObject)c.getUser();
      c.release();
      return x;
   }

   public static XmlObject parseToXmlObject(SchemaTypeLoader stl, XMLStreamReader xsr, SchemaType type, XmlOptions options) throws XmlException {
      Locale l = getLocale(stl, options);
      if(l.noSync()) {
         l.enter();

         XmlObject var5;
         try {
            var5 = l.parseToXmlObject(xsr, type, options);
         } finally {
            l.exit();
         }

         return var5;
      } else {
         synchronized(l) {
            l.enter();

            XmlObject var6;
            try {
               var6 = l.parseToXmlObject(xsr, type, options);
            } finally {
               l.exit();
            }

            return var6;
         }
      }
   }

   public XmlObject parseToXmlObject(XMLStreamReader xsr, SchemaType type, XmlOptions options) throws XmlException {
      Cur c;
      try {
         c = this.loadXMLStreamReader(xsr, options);
      } catch (javax.xml.stream.XMLStreamException var6) {
         throw new XmlException(var6.getMessage(), var6);
      }

      autoTypeDocument(c, type, options);
      XmlObject x = (XmlObject)c.getUser();
      c.release();
      return x;
   }

   private static void lineNumber(XMLEvent xe, Locale.LoadContext context) {
      Location loc = xe.getLocation();
      if(loc != null) {
         context.lineNumber(loc.getLineNumber(), loc.getColumnNumber(), -1);
      }

   }

   private static void lineNumber(XMLStreamReader xsr, Locale.LoadContext context) {
      javax.xml.stream.Location loc = xsr.getLocation();
      if(loc != null) {
         context.lineNumber(loc.getLineNumber(), loc.getColumnNumber(), loc.getCharacterOffset());
      }

   }

   private void doAttributes(XMLStreamReader xsr, Locale.LoadContext context) {
      int n = xsr.getAttributeCount();

      for(int a = 0; a < n; ++a) {
         context.attr(xsr.getAttributeLocalName(a), xsr.getAttributeNamespace(a), xsr.getAttributePrefix(a), xsr.getAttributeValue(a));
      }

   }

   private void doNamespaces(XMLStreamReader xsr, Locale.LoadContext context) {
      int n = xsr.getNamespaceCount();

      for(int a = 0; a < n; ++a) {
         String prefix = xsr.getNamespacePrefix(a);
         if(prefix != null && prefix.length() != 0) {
            context.attr(prefix, "http://www.w3.org/2000/xmlns/", "xmlns", xsr.getNamespaceURI(a));
         } else {
            context.attr("xmlns", "http://www.w3.org/2000/xmlns/", (String)null, xsr.getNamespaceURI(a));
         }
      }

   }

   private Cur loadXMLInputStream(XMLInputStream xis, XmlOptions options) throws XMLStreamException {
      options = XmlOptions.maskNull(options);
      boolean lineNums = options.hasOption("LOAD_LINE_NUMBERS");
      XMLEvent x = xis.peek();
      if(x != null && x.getType() == 2) {
         Map systemId = ((StartElement)x).getNamespaceMap();
         if(systemId != null && systemId.size() > 0) {
            HashMap encoding = new HashMap();
            encoding.putAll(systemId);
            options = new XmlOptions(options);
            options.put("LOAD_ADDITIONAL_NAMESPACES", encoding);
         }
      }

      String systemId1 = null;
      String encoding1 = null;
      String version = null;
      boolean standAlone = true;
      Cur.CurLoadContext context = new Cur.CurLoadContext(this, options);
      XMLEvent c = xis.next();

      while(true) {
         if(c != null) {
            label96: {
               label81:
               switch(c.getType()) {
               case 1:
               case 1024:
               case 2048:
               case 4096:
               case 8192:
                  break;
               case 2:
                  context.startElement(XMLNameHelper.getQName(c.getName()));
                  if(lineNums) {
                     lineNumber(c, context);
                  }

                  AttributeIterator cd1 = ((StartElement)c).getAttributes();

                  Attribute comment1;
                  while(cd1.hasNext()) {
                     comment1 = cd1.next();
                     context.attr(XMLNameHelper.getQName(comment1.getName()), comment1.getValue());
                  }

                  cd1 = ((StartElement)c).getNamespaces();

                  while(true) {
                     if(!cd1.hasNext()) {
                        break label81;
                     }

                     comment1 = cd1.next();
                     XMLName procInstr1 = comment1.getName();
                     String local = procInstr1.getLocalName();
                     if(procInstr1.getPrefix() == null && local.equals("xmlns")) {
                        local = "";
                     }

                     context.xmlns(local, comment1.getValue());
                  }
               case 4:
                  context.endElement();
                  if(lineNums) {
                     lineNumber(c, context);
                  }
                  break;
               case 8:
                  ProcessingInstruction procInstr = (ProcessingInstruction)c;
                  context.procInst(procInstr.getTarget(), procInstr.getData());
                  if(lineNums) {
                     lineNumber(c, context);
                  }
                  break;
               case 32:
                  Comment comment = (Comment)c;
                  if(comment.hasContent()) {
                     context.comment(comment.getContent());
                     if(lineNums) {
                        lineNumber(c, context);
                     }
                  }
                  break;
               case 64:
                  if(((Space)c).ignorable()) {
                     break;
                  }
               case 16:
                  CharacterData cd = (CharacterData)c;
                  if(cd.hasContent()) {
                     context.text(cd.getContent());
                     if(lineNums) {
                        lineNumber(c, context);
                     }
                  }
                  break;
               case 128:
                  if(!xis.hasNext()) {
                     break label96;
                  }
                  break;
               case 256:
                  StartDocument props = (StartDocument)c;
                  systemId1 = props.getSystemId();
                  encoding1 = props.getCharacterEncodingScheme();
                  version = props.getVersion();
                  standAlone = props.isStandalone();
                  standAlone = props.isStandalone();
                  if(lineNums) {
                     lineNumber(c, context);
                  }
                  break;
               case 512:
                  if(lineNums) {
                     lineNumber(c, context);
                  }
                  break label96;
               default:
                  throw new RuntimeException("Unhandled xml event type: " + c.getTypeAsString());
               }

               c = xis.next();
               continue;
            }
         }

         Cur c1 = context.finish();
         associateSourceName(c1, options);
         XmlDocumentProperties props1 = getDocProps(c1, true);
         props1.setDoctypeSystemId(systemId1);
         props1.setEncoding(encoding1);
         props1.setVersion(version);
         props1.setStandalone(standAlone);
         return c1;
      }
   }

   private Cur loadXMLStreamReader(XMLStreamReader xsr, XmlOptions options) throws javax.xml.stream.XMLStreamException {
      options = XmlOptions.maskNull(options);
      boolean lineNums = options.hasOption("LOAD_LINE_NUMBERS");
      String encoding = null;
      String version = null;
      boolean standAlone = false;
      Cur.CurLoadContext context = new Cur.CurLoadContext(this, options);
      int depth = 0;
      int c = xsr.getEventType();

      label50:
      while(true) {
         switch(c) {
         case 1:
            ++depth;
            context.startElement(xsr.getName());
            if(lineNums) {
               lineNumber(xsr, context);
            }

            this.doAttributes(xsr, context);
            this.doNamespaces(xsr, context);
            break;
         case 2:
            --depth;
            context.endElement();
            if(lineNums) {
               lineNumber(xsr, context);
            }
            break;
         case 3:
            context.procInst(xsr.getPITarget(), xsr.getPIData());
            if(lineNums) {
               lineNumber(xsr, context);
            }
            break;
         case 4:
         case 12:
            context.text(xsr.getTextCharacters(), xsr.getTextStart(), xsr.getTextLength());
            if(lineNums) {
               lineNumber(xsr, context);
            }
            break;
         case 5:
            String props = xsr.getText();
            context.comment(props);
            if(lineNums) {
               lineNumber(xsr, context);
            }
         case 6:
         case 11:
            break;
         case 7:
            ++depth;
            encoding = xsr.getCharacterEncodingScheme();
            version = xsr.getVersion();
            standAlone = xsr.isStandalone();
            if(lineNums) {
               lineNumber(xsr, context);
            }
            break;
         case 8:
            --depth;
            if(lineNums) {
               lineNumber(xsr, context);
            }
            break label50;
         case 9:
            context.text(xsr.getText());
            break;
         case 10:
            this.doAttributes(xsr, context);
            break;
         case 13:
            this.doNamespaces(xsr, context);
            break;
         default:
            throw new RuntimeException("Unhandled xml event type: " + c);
         }

         if(!xsr.hasNext() || depth <= 0) {
            break;
         }

         c = xsr.next();
      }

      Cur var11 = context.finish();
      associateSourceName(var11, options);
      XmlDocumentProperties var12 = getDocProps(var11, true);
      var12.setEncoding(encoding);
      var12.setVersion(version);
      var12.setStandalone(standAlone);
      return var11;
   }

   public static XmlObject parseToXmlObject(SchemaTypeLoader stl, InputStream is, SchemaType type, XmlOptions options) throws XmlException, IOException {
      Locale l = getLocale(stl, options);
      if(l.noSync()) {
         l.enter();

         XmlObject var5;
         try {
            var5 = l.parseToXmlObject(is, type, options);
         } finally {
            l.exit();
         }

         return var5;
      } else {
         synchronized(l) {
            l.enter();

            XmlObject var6;
            try {
               var6 = l.parseToXmlObject(is, type, options);
            } finally {
               l.exit();
            }

            return var6;
         }
      }
   }

   private XmlObject parseToXmlObject(InputStream is, SchemaType type, XmlOptions options) throws XmlException, IOException {
      Cur c = getSaxLoader(options).load(this, new InputSource(is), options);
      autoTypeDocument(c, type, options);
      XmlObject x = (XmlObject)c.getUser();
      c.release();
      return x;
   }

   public static XmlObject parseToXmlObject(SchemaTypeLoader stl, Reader reader, SchemaType type, XmlOptions options) throws XmlException, IOException {
      Locale l = getLocale(stl, options);
      if(l.noSync()) {
         l.enter();

         XmlObject var5;
         try {
            var5 = l.parseToXmlObject(reader, type, options);
         } finally {
            l.exit();
         }

         return var5;
      } else {
         synchronized(l) {
            l.enter();

            XmlObject var6;
            try {
               var6 = l.parseToXmlObject(reader, type, options);
            } finally {
               l.exit();
            }

            return var6;
         }
      }
   }

   private XmlObject parseToXmlObject(Reader reader, SchemaType type, XmlOptions options) throws XmlException, IOException {
      Cur c = getSaxLoader(options).load(this, new InputSource(reader), options);
      autoTypeDocument(c, type, options);
      XmlObject x = (XmlObject)c.getUser();
      c.release();
      return x;
   }

   public static XmlObject parseToXmlObject(SchemaTypeLoader stl, Node node, SchemaType type, XmlOptions options) throws XmlException {
      Locale l = getLocale(stl, options);
      if(l.noSync()) {
         l.enter();

         XmlObject var5;
         try {
            var5 = l.parseToXmlObject(node, type, options);
         } finally {
            l.exit();
         }

         return var5;
      } else {
         synchronized(l) {
            l.enter();

            XmlObject var6;
            try {
               var6 = l.parseToXmlObject(node, type, options);
            } finally {
               l.exit();
            }

            return var6;
         }
      }
   }

   public XmlObject parseToXmlObject(Node node, SchemaType type, XmlOptions options) throws XmlException {
      Cur.CurLoadContext context = new Cur.CurLoadContext(this, options);
      this.loadNode(node, context);
      Cur c = context.finish();
      associateSourceName(c, options);
      autoTypeDocument(c, type, options);
      XmlObject x = (XmlObject)c.getUser();
      c.release();
      return x;
   }

   private void loadNodeChildren(Node n, Locale.LoadContext context) {
      for(Node c = n.getFirstChild(); c != null; c = c.getNextSibling()) {
         this.loadNode(c, context);
      }

   }

   void loadNode(Node n, Locale.LoadContext context) {
      switch(n.getNodeType()) {
      case 1:
         context.startElement(this.makeQualifiedQName(n.getNamespaceURI(), n.getNodeName()));
         NamedNodeMap attrs = n.getAttributes();

         for(int i = 0; i < attrs.getLength(); ++i) {
            Node a = attrs.item(i);
            String attrName = a.getNodeName();
            String attrValue = a.getNodeValue();
            if(attrName.toLowerCase().startsWith("xmlns")) {
               if(attrName.length() == 5) {
                  context.xmlns((String)null, attrValue);
               } else {
                  context.xmlns(attrName.substring(6), attrValue);
               }
            } else {
               context.attr(this.makeQualifiedQName(a.getNamespaceURI(), attrName), attrValue);
            }
         }

         this.loadNodeChildren(n, context);
         context.endElement();
         break;
      case 2:
      case 6:
      case 10:
      case 12:
         throw new RuntimeException("Unexpected node");
      case 3:
      case 4:
         context.text(n.getNodeValue());
         break;
      case 5:
      case 9:
      case 11:
         this.loadNodeChildren(n, context);
         break;
      case 7:
         context.procInst(n.getNodeName(), n.getNodeValue());
         break;
      case 8:
         context.comment(n.getNodeValue());
      }

   }

   public static XmlSaxHandler newSaxHandler(SchemaTypeLoader stl, SchemaType type, XmlOptions options) {
      Locale l = getLocale(stl, options);
      if(l.noSync()) {
         l.enter();

         XmlSaxHandler var4;
         try {
            var4 = l.newSaxHandler(type, options);
         } finally {
            l.exit();
         }

         return var4;
      } else {
         synchronized(l) {
            l.enter();

            XmlSaxHandler var5;
            try {
               var5 = l.newSaxHandler(type, options);
            } finally {
               l.exit();
            }

            return var5;
         }
      }
   }

   public XmlSaxHandler newSaxHandler(SchemaType type, XmlOptions options) {
      return new Locale.XmlSaxHandlerImpl(this, type, options);
   }

   QName makeQName(String uri, String localPart) {
      assert localPart != null && localPart.length() > 0;

      return this._qnameFactory.getQName(uri, localPart);
   }

   QName makeQNameNoCheck(String uri, String localPart) {
      return this._qnameFactory.getQName(uri, localPart);
   }

   QName makeQName(String uri, String local, String prefix) {
      return this._qnameFactory.getQName(uri, local, prefix == null?"":prefix);
   }

   QName makeQualifiedQName(String uri, String qname) {
      if(qname == null) {
         qname = "";
      }

      int i = qname.indexOf(58);
      return i < 0?this._qnameFactory.getQName(uri, qname):this._qnameFactory.getQName(uri, qname.substring(i + 1), qname.substring(0, i));
   }

   static XmlDocumentProperties getDocProps(Cur c, boolean ensure) {
      c.push();

      while(c.toParent()) {
         ;
      }

      Locale.DocProps props = (Locale.DocProps)c.getBookmark(Locale.DocProps.class);
      if(props == null && ensure) {
         c.setBookmark(Locale.DocProps.class, props = new Locale.DocProps(null));
      }

      c.pop();
      return props;
   }

   void registerForChange(Locale.ChangeListener listener) {
      if(listener.getNextChangeListener() == null) {
         if(this._changeListeners == null) {
            listener.setNextChangeListener(listener);
         } else {
            listener.setNextChangeListener(this._changeListeners);
         }

         this._changeListeners = listener;
      }

   }

   void notifyChange() {
      while(this._changeListeners != null) {
         this._changeListeners.notifyChange();
         if(this._changeListeners.getNextChangeListener() == this._changeListeners) {
            this._changeListeners.setNextChangeListener((Locale.ChangeListener)null);
         }

         Locale.ChangeListener next = this._changeListeners.getNextChangeListener();
         this._changeListeners.setNextChangeListener((Locale.ChangeListener)null);
         this._changeListeners = next;
      }

      this._locations.notifyChange();
   }

   static String getTextValue(Cur c) {
      assert c.isNode();

      if(!c.hasChildren()) {
         return c.getValueAsString();
      } else {
         StringBuffer sb = new StringBuffer();
         c.push();
         c.next();

         for(; !c.isAtEndOfLastPush(); c.next()) {
            if(c.isText() && (!c._xobj.isComment() && !c._xobj.isProcinst() || c._pos >= c._xobj._cchValue)) {
               CharUtil.getString(sb, c.getChars(-1), c._offSrc, c._cchSrc);
            }
         }

         c.pop();
         return sb.toString();
      }
   }

   static int getTextValue(Cur c, int wsr, char[] chars, int off, int maxCch) {
      assert c.isNode();

      String s = c._xobj.getValueAsString(wsr);
      int n = s.length();
      if(n > maxCch) {
         n = maxCch;
      }

      if(n <= 0) {
         return 0;
      } else {
         s.getChars(0, n, chars, off);
         return n;
      }
   }

   static String applyWhiteSpaceRule(String s, int wsr) {
      int l = s == null?0:s.length();
      if(l != 0 && wsr != 1) {
         if(wsr == 2) {
            for(int lastWasWhite = 0; lastWasWhite < l; ++lastWasWhite) {
               char ch;
               if((ch = s.charAt(lastWasWhite)) == 10 || ch == 13 || ch == 9) {
                  return processWhiteSpaceRule(s, wsr);
               }
            }
         } else if(wsr == 3) {
            if(CharUtil.isWhiteSpace(s.charAt(0)) || CharUtil.isWhiteSpace(s.charAt(l - 1))) {
               return processWhiteSpaceRule(s, wsr);
            }

            boolean var7 = false;

            for(int i = 1; i < l; ++i) {
               boolean isWhite = CharUtil.isWhiteSpace(s.charAt(i));
               if(isWhite && var7) {
                  return processWhiteSpaceRule(s, wsr);
               }

               var7 = isWhite;
            }
         }

         return s;
      } else {
         return s;
      }
   }

   static String processWhiteSpaceRule(String s, int wsr) {
      Locale.ScrubBuffer sb = getScrubBuffer(wsr);
      sb.scrub(s, 0, s.length());
      return sb.getResultAsString();
   }

   static Locale.ScrubBuffer getScrubBuffer(int wsr) {
      SoftReference softRef = (SoftReference)tl_scrubBuffer.get();
      Locale.ScrubBuffer scrubBuffer = (Locale.ScrubBuffer)softRef.get();
      if(scrubBuffer == null) {
         scrubBuffer = new Locale.ScrubBuffer();
         tl_scrubBuffer.set(new SoftReference(scrubBuffer));
      }

      scrubBuffer.init(wsr);
      return scrubBuffer;
   }

   static boolean pushToContainer(Cur c) {
      c.push();

      while(true) {
         switch(c.kind()) {
         case -2:
         case -1:
            c.pop();
            return false;
         case 0:
         case 3:
         default:
            c.nextWithAttrs();
            break;
         case 1:
         case 2:
            return true;
         case 4:
         case 5:
            c.skip();
         }
      }
   }

   static boolean toFirstNormalAttr(Cur c) {
      c.push();
      if(c.toFirstAttr()) {
         do {
            if(!c.isXmlns()) {
               c.popButStay();
               return true;
            }
         } while(c.toNextAttr());
      }

      c.pop();
      return false;
   }

   static boolean toPrevNormalAttr(Cur c) {
      if(c.isAttr()) {
         c.push();

         while(true) {
            assert c.isAttr();

            if(!c.prev()) {
               c.pop();
               break;
            }

            c.prev();
            if(!c.isAttr()) {
               c.prev();
            }

            if(c.isNormalAttr()) {
               c.popButStay();
               return true;
            }
         }
      }

      return false;
   }

   static boolean toNextNormalAttr(Cur c) {
      c.push();

      do {
         if(!c.toNextAttr()) {
            c.pop();
            return false;
         }
      } while(c.isXmlns());

      c.popButStay();
      return true;
   }

   Xobj findNthChildElem(Xobj parent, QName name, QNameSet set, int n) {
      assert name == null || set == null;

      assert n >= 0;

      if(parent == null) {
         return null;
      } else {
         int da = this._nthCache_A.distance(parent, name, set, n);
         int db = this._nthCache_B.distance(parent, name, set, n);
         Xobj x = da <= db?this._nthCache_A.fetch(parent, name, set, n):this._nthCache_B.fetch(parent, name, set, n);
         if(da == db) {
            Locale.nthCache temp = this._nthCache_A;
            this._nthCache_A = this._nthCache_B;
            this._nthCache_B = temp;
         }

         return x;
      }
   }

   int count(Xobj parent, QName name, QNameSet set) {
      int n = 0;

      for(Xobj x = this.findNthChildElem(parent, name, set, 0); x != null; x = x._nextSibling) {
         if(x.isElem()) {
            if(set == null) {
               if(x._name.equals(name)) {
                  ++n;
               }
            } else if(set.contains(x._name)) {
               ++n;
            }
         }
      }

      return n;
   }

   static boolean toChild(Cur c, QName name, int n) {
      if(n >= 0 && pushToContainer(c)) {
         Xobj x = c._locale.findNthChildElem(c._xobj, name, (QNameSet)null, n);
         c.pop();
         if(x != null) {
            c.moveTo(x);
            return true;
         }
      }

      return false;
   }

   static boolean toFirstChildElement(Cur c) {
      Xobj originalXobj = c._xobj;
      int originalPos = c._pos;

      while(true) {
         switch(c.kind()) {
         case -2:
         case -1:
            c.moveTo(originalXobj, originalPos);
            return false;
         case 0:
         case 3:
         default:
            c.nextWithAttrs();
            break;
         case 1:
         case 2:
            if(c.toFirstChild() && (c.isElem() || toNextSiblingElement(c))) {
               return true;
            }

            c.moveTo(originalXobj, originalPos);
            return false;
         case 4:
         case 5:
            c.skip();
         }
      }
   }

   static boolean toLastChildElement(Cur c) {
      if(!pushToContainer(c)) {
         return false;
      } else if(c.toLastChild() && (c.isElem() || toPrevSiblingElement(c))) {
         c.popButStay();
         return true;
      } else {
         c.pop();
         return false;
      }
   }

   static boolean toPrevSiblingElement(Cur cur) {
      if(!cur.hasParent()) {
         return false;
      } else {
         Cur c = cur.tempCur();
         boolean moved = false;
         int k = c.kind();
         if(k != 3) {
            while(c.prev()) {
               k = c.kind();
               if(k == 1 || k == 2) {
                  break;
               }

               if(c.kind() == -2) {
                  c.toParent();
                  cur.moveToCur(c);
                  moved = true;
                  break;
               }
            }
         }

         c.release();
         return moved;
      }
   }

   static boolean toNextSiblingElement(Cur c) {
      if(!c.hasParent()) {
         return false;
      } else {
         c.push();
         int k = c.kind();
         if(k == 3) {
            c.toParent();
            c.next();
         } else if(k == 2) {
            c.skip();
         }

         for(; (k = c.kind()) >= 0; c.next()) {
            if(k == 2) {
               c.popButStay();
               return true;
            }

            if(k > 0) {
               c.toEnd();
            }
         }

         c.pop();
         return false;
      }
   }

   static boolean toNextSiblingElement(Cur c, Xobj parent) {
      Xobj originalXobj = c._xobj;
      int originalPos = c._pos;
      int k = c.kind();
      if(k == 3) {
         c.moveTo(parent);
         c.next();
      } else if(k == 2) {
         c.skip();
      }

      for(; (k = c.kind()) >= 0; c.next()) {
         if(k == 2) {
            return true;
         }

         if(k > 0) {
            c.toEnd();
         }
      }

      c.moveTo(originalXobj, originalPos);
      return false;
   }

   static void applyNamespaces(Cur c, Map namespaces) {
      assert c.isContainer();

      Iterator i = namespaces.keySet().iterator();

      while(i.hasNext()) {
         String prefix = (String)i.next();
         if(!prefix.toLowerCase().startsWith("xml") && c.namespaceForPrefix(prefix, false) == null) {
            c.push();
            c.next();
            c.createAttr(c._locale.createXmlns(prefix));
            c.next();
            c.insertString((String)namespaces.get(prefix));
            c.pop();
         }
      }

   }

   static Map getAllNamespaces(Cur c, Map filleMe) {
      assert c.isNode();

      c.push();
      if(!c.isContainer()) {
         c.toParent();
      }

      assert c.isContainer();

      do {
         QName cName = c.getName();

         while(c.toNextAttr()) {
            if(c.isXmlns()) {
               String prefix = c.getXmlnsPrefix();
               String uri = c.getXmlnsUri();
               if(prefix.length() != 0 || uri.length() <= 0 || cName == null || cName.getNamespaceURI().length() <= 0) {
                  if(filleMe == null) {
                     filleMe = new HashMap();
                  }

                  if(!((Map)filleMe).containsKey(prefix)) {
                     ((Map)filleMe).put(prefix, uri);
                  }
               }
            }
         }

         if(!c.isContainer()) {
            c.toParentRaw();
         }
      } while(c.toParentRaw());

      c.pop();
      return (Map)filleMe;
   }

   DomImpl.Dom findDomNthChild(DomImpl.Dom parent, int n) {
      assert n >= 0;

      if(parent == null) {
         return null;
      } else {
         int da = this._domNthCache_A.distance(parent, n);
         int db = this._domNthCache_B.distance(parent, n);
         DomImpl.Dom x = null;
         boolean bInvalidate = db - this._domNthCache_B._len / 2 > 0 && db - this._domNthCache_B._len / 2 - 40 > 0;
         boolean aInvalidate = da - this._domNthCache_A._len / 2 > 0 && da - this._domNthCache_A._len / 2 - 40 > 0;
         if(da <= db) {
            if(!aInvalidate) {
               x = this._domNthCache_A.fetch(parent, n);
            } else {
               this._domNthCache_B._version = -1L;
               x = this._domNthCache_B.fetch(parent, n);
            }
         } else if(!bInvalidate) {
            x = this._domNthCache_B.fetch(parent, n);
         } else {
            this._domNthCache_A._version = -1L;
            x = this._domNthCache_A.fetch(parent, n);
         }

         if(da == db) {
            Locale.domNthCache temp = this._domNthCache_A;
            this._domNthCache_A = this._domNthCache_B;
            this._domNthCache_B = temp;
         }

         return x;
      }
   }

   int domLength(DomImpl.Dom parent) {
      if(parent == null) {
         return 0;
      } else {
         int da = this._domNthCache_A.distance(parent, 0);
         int db = this._domNthCache_B.distance(parent, 0);
         int len = da <= db?this._domNthCache_A.length(parent):this._domNthCache_B.length(parent);
         if(da == db) {
            Locale.domNthCache temp = this._domNthCache_A;
            this._domNthCache_A = this._domNthCache_B;
            this._domNthCache_B = temp;
         }

         return len;
      }
   }

   void invalidateDomCaches(DomImpl.Dom d) {
      if(this._domNthCache_A._parent == d) {
         this._domNthCache_A._version = -1L;
      }

      if(this._domNthCache_B._parent == d) {
         this._domNthCache_B._version = -1L;
      }

   }

   boolean isDomCached(DomImpl.Dom d) {
      return this._domNthCache_A._parent == d || this._domNthCache_B._parent == d;
   }

   CharUtil getCharUtil() {
      if(this._charUtil == null) {
         this._charUtil = new CharUtil(1024);
      }

      return this._charUtil;
   }

   long version() {
      return this._versionAll;
   }

   Cur weakCur(Object o) {
      assert o != null && !(o instanceof Locale.Ref);

      Cur c = this.getCur();

      assert c._tempFrame == -1;

      assert c._ref == null;

      c._ref = new Locale.Ref(c, o);
      return c;
   }

   final ReferenceQueue refQueue() {
      if(this._refQueue == null) {
         this._refQueue = new ReferenceQueue();
      }

      return this._refQueue;
   }

   Cur tempCur() {
      return this.tempCur((String)null);
   }

   Cur tempCur(String id) {
      Cur c = this.getCur();

      assert c._tempFrame == -1;

      assert this._numTempFramesLeft < this._tempFrames.length : "Temp frame not pushed";

      int frame = this._tempFrames.length - this._numTempFramesLeft - 1;

      assert frame >= 0 && frame < this._tempFrames.length;

      Cur next = this._tempFrames[frame];
      c._nextTemp = next;

      assert c._prevTemp == null;

      if(next != null) {
         assert next._prevTemp == null;

         next._prevTemp = c;
      }

      this._tempFrames[frame] = c;
      c._tempFrame = frame;
      c._id = id;
      return c;
   }

   Cur getCur() {
      assert this._curPool == null || this._curPoolCount > 0;

      Cur c;
      if(this._curPool == null) {
         c = new Cur(this);
      } else {
         c = this._curPool;
         this._curPool = this._curPool.listRemove(this._curPool);
         --this._curPoolCount;
      }

      assert c._state == 0;

      assert c._prev == null && c._next == null;

      assert c._xobj == null && c._pos == -2;

      assert c._ref == null;

      this._registered = c.listInsert(this._registered);
      c._state = 1;
      return c;
   }

   void embedCurs() {
      while(true) {
         Cur c = this._registered;
         if(this._registered == null) {
            return;
         }

         assert c._xobj != null;

         this._registered = c.listRemove(this._registered);
         c._xobj._embedded = c.listInsert(c._xobj._embedded);
         c._state = 2;
      }
   }

   DomImpl.TextNode createTextNode() {
      return (DomImpl.TextNode)(this._saaj == null?new DomImpl.TextNode(this):new DomImpl.SaajTextNode(this));
   }

   DomImpl.CdataNode createCdataNode() {
      return (DomImpl.CdataNode)(this._saaj == null?new DomImpl.CdataNode(this):new DomImpl.SaajCdataNode(this));
   }

   boolean entered() {
      return this._tempFrames.length - this._numTempFramesLeft > 0;
   }

   public void enter(Locale otherLocale) {
      this.enter();
      if(otherLocale != this) {
         otherLocale.enter();
      }

   }

   public void enter() {
      assert this._numTempFramesLeft >= 0;

      if(--this._numTempFramesLeft <= 0) {
         Cur[] newTempFrames = new Cur[(this._numTempFramesLeft = this._tempFrames.length) * 2];
         System.arraycopy(this._tempFrames, 0, newTempFrames, 0, this._tempFrames.length);
         this._tempFrames = newTempFrames;
      }

      if(++this._entryCount > 1000) {
         this.pollQueue();
         this._entryCount = 0;
      }

   }

   private void pollQueue() {
      if(this._refQueue != null) {
         while(true) {
            Locale.Ref ref = (Locale.Ref)this._refQueue.poll();
            if(ref == null) {
               break;
            }

            if(ref._cur != null) {
               ref._cur.release();
            }
         }
      }

   }

   public void exit(Locale otherLocale) {
      this.exit();
      if(otherLocale != this) {
         otherLocale.exit();
      }

   }

   public void exit() {
      assert this._numTempFramesLeft >= 0 && this._numTempFramesLeft <= this._tempFrames.length - 1 : " Temp frames mismanaged. Impossible stack frame. Unsynchronized: " + this.noSync();

      int frame = this._tempFrames.length - ++this._numTempFramesLeft;

      while(this._tempFrames[frame] != null) {
         this._tempFrames[frame].release();
      }

   }

   public boolean noSync() {
      return this._noSync;
   }

   public boolean sync() {
      return !this._noSync;
   }

   static final boolean isWhiteSpace(String s) {
      int l = s.length();

      do {
         if(l-- <= 0) {
            return true;
         }
      } while(CharUtil.isWhiteSpace(s.charAt(l)));

      return false;
   }

   static final boolean isWhiteSpace(StringBuffer sb) {
      int l = sb.length();

      do {
         if(l-- <= 0) {
            return true;
         }
      } while(CharUtil.isWhiteSpace(sb.charAt(l)));

      return false;
   }

   static boolean beginsWithXml(String name) {
      char ch;
      return name.length() < 3?false:((ch = name.charAt(0)) == 120 || ch == 88) && ((ch = name.charAt(1)) == 109 || ch == 77) && ((ch = name.charAt(2)) == 108 || ch == 76);
   }

   static boolean isXmlns(QName name) {
      String prefix = name.getPrefix();
      return prefix.equals("xmlns")?true:prefix.length() == 0 && name.getLocalPart().equals("xmlns");
   }

   QName createXmlns(String prefix) {
      if(prefix == null) {
         prefix = "";
      }

      return prefix.length() == 0?this.makeQName("http://www.w3.org/2000/xmlns/", "xmlns", ""):this.makeQName("http://www.w3.org/2000/xmlns/", prefix, "xmlns");
   }

   static String xmlnsPrefix(QName name) {
      return name.getPrefix().equals("xmlns")?name.getLocalPart():"";
   }

   private static Locale.SaxLoader getPiccoloSaxLoader() {
      Object piccoloLoader = (Locale.SaxLoader)SystemCache.get().getSaxLoader();
      if(piccoloLoader == null) {
         piccoloLoader = Locale.PiccoloSaxLoader.newInstance();
         SystemCache.get().setSaxLoader(piccoloLoader);
      }

      return (Locale.SaxLoader)piccoloLoader;
   }

   private static Locale.SaxLoader getSaxLoader(XmlOptions options) {
      options = XmlOptions.maskNull(options);
      Object er = null;
      if(!options.hasOption("LOAD_USE_DEFAULT_RESOLVER")) {
         er = (EntityResolver)options.get("ENTITY_RESOLVER");
         if(er == null) {
            er = ResolverUtil.getGlobalEntityResolver();
         }

         if(er == null) {
            er = new Locale.DefaultEntityResolver(null);
         }
      }

      Object sl;
      if(options.hasOption("LOAD_USE_XMLREADER")) {
         XMLReader xr = (XMLReader)options.get("LOAD_USE_XMLREADER");
         if(xr == null) {
            throw new IllegalArgumentException("XMLReader is null");
         }

         sl = new Locale.XmlReaderSaxLoader(xr);
         if(er != null) {
            xr.setEntityResolver((EntityResolver)er);
         }
      } else {
         sl = getPiccoloSaxLoader();
         ((Locale.SaxLoader)sl).setEntityResolver((EntityResolver)er);
      }

      return (Locale.SaxLoader)sl;
   }

   private DomImpl.Dom load(InputSource is, XmlOptions options) throws XmlException, IOException {
      return getSaxLoader(options).load(this, is, options).getDom();
   }

   public DomImpl.Dom load(Reader r) throws XmlException, IOException {
      return this.load(r, (XmlOptions)null);
   }

   public DomImpl.Dom load(Reader r, XmlOptions options) throws XmlException, IOException {
      return this.load(new InputSource(r), options);
   }

   public DomImpl.Dom load(InputStream in) throws XmlException, IOException {
      return this.load(in, (XmlOptions)null);
   }

   public DomImpl.Dom load(InputStream in, XmlOptions options) throws XmlException, IOException {
      return this.load(new InputSource(in), options);
   }

   public DomImpl.Dom load(String s) throws XmlException {
      return this.load(s, (XmlOptions)null);
   }

   public DomImpl.Dom load(String s, XmlOptions options) throws XmlException {
      StringReader r = new StringReader(s);

      DomImpl.Dom e;
      try {
         e = this.load((Reader)r, options);
      } catch (IOException var13) {
         assert false : "StringReader should not throw IOException";

         throw new XmlException(var13.getMessage(), var13);
      } finally {
         try {
            r.close();
         } catch (IOException var12) {
            ;
         }

      }

      return e;
   }

   public Document createDocument(String uri, String qname, DocumentType doctype) {
      return DomImpl._domImplementation_createDocument(this, uri, qname, doctype);
   }

   public DocumentType createDocumentType(String qname, String publicId, String systemId) {
      throw new RuntimeException("Not implemented");
   }

   public boolean hasFeature(String feature, String version) {
      return DomImpl._domImplementation_hasFeature(this, feature, version);
   }

   public Object getFeature(String feature, String version) {
      throw new RuntimeException("DOM Level 3 Not implemented");
   }

   private static DomImpl.Dom checkNode(Node n) {
      if(n == null) {
         throw new IllegalArgumentException("Node is null");
      } else if(!(n instanceof DomImpl.Dom)) {
         throw new IllegalArgumentException("Node is not an XmlBeans node");
      } else {
         return (DomImpl.Dom)n;
      }
   }

   public static XmlCursor nodeToCursor(Node n) {
      return DomImpl._getXmlCursor(checkNode(n));
   }

   public static XmlObject nodeToXmlObject(Node n) {
      return DomImpl._getXmlObject(checkNode(n));
   }

   public static XMLStreamReader nodeToXmlStream(Node n) {
      return DomImpl._getXmlStreamReader(checkNode(n));
   }

   public static Node streamToNode(XMLStreamReader xs) {
      return Jsr173.nodeFromStream(xs);
   }

   public void setSaajData(Node n, Object o) {
      assert n instanceof DomImpl.Dom;

      DomImpl.saajCallback_setSaajData((DomImpl.Dom)n, o);
   }

   public Object getSaajData(Node n) {
      assert n instanceof DomImpl.Dom;

      return DomImpl.saajCallback_getSaajData((DomImpl.Dom)n);
   }

   public Element createSoapElement(QName name, QName parentName) {
      assert this._ownerDoc != null;

      return DomImpl.saajCallback_createSoapElement(this._ownerDoc, name, parentName);
   }

   public Element importSoapElement(Document doc, Element elem, boolean deep, QName parentName) {
      assert doc instanceof DomImpl.Dom;

      return DomImpl.saajCallback_importSoapElement((DomImpl.Dom)doc, elem, deep, parentName);
   }


   private abstract static class SaxLoader extends Locale.SaxHandler implements ErrorHandler {

      private XMLReader _xr;


      SaxLoader(XMLReader xr, Locator startLocator) {
         super(startLocator);
         this._xr = xr;

         try {
            this._xr.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
            this._xr.setFeature("http://xml.org/sax/features/namespaces", true);
            this._xr.setFeature("http://xml.org/sax/features/validation", false);
            this._xr.setProperty("http://xml.org/sax/properties/lexical-handler", this);
            this._xr.setContentHandler(this);
            this._xr.setProperty("http://xml.org/sax/properties/declaration-handler", this);
            this._xr.setDTDHandler(this);
            this._xr.setErrorHandler(this);
         } catch (Throwable var4) {
            throw new RuntimeException(var4.getMessage(), var4);
         }
      }

      void setEntityResolver(EntityResolver er) {
         this._xr.setEntityResolver(er);
      }

      void postLoad(Cur c) {
         this._locale = null;
         this._context = null;
      }

      public Cur load(Locale l, InputSource is, XmlOptions options) throws XmlException, IOException {
         is.setSystemId("file://");
         this.initSaxHandler(l, options);

         XmlError err;
         try {
            this._xr.parse(is);
            Cur e = this._context.finish();
            Locale.associateSourceName(e, options);
            this.postLoad(e);
            return e;
         } catch (FileFormatException var6) {
            this._context.abort();
            throw new XmlException(var6.getMessage(), var6);
         } catch (XmlRuntimeException var7) {
            this._context.abort();
            throw new XmlException(var7);
         } catch (SAXParseException var8) {
            this._context.abort();
            err = XmlError.forLocation(var8.getMessage(), (String)XmlOptions.safeGet(options, "DOCUMENT_SOURCE_NAME"), var8.getLineNumber(), var8.getColumnNumber(), -1);
            throw new XmlException(err.toString(), var8, err);
         } catch (SAXException var9) {
            this._context.abort();
            err = XmlError.forMessage(var9.getMessage());
            throw new XmlException(err.toString(), var9, err);
         } catch (RuntimeException var10) {
            this._context.abort();
            throw var10;
         }
      }

      public void fatalError(SAXParseException e) throws SAXException {
         throw e;
      }

      public void error(SAXParseException e) throws SAXException {
         throw e;
      }

      public void warning(SAXParseException e) throws SAXException {
         throw e;
      }
   }

   private static class PiccoloSaxLoader extends Locale.SaxLoader {

      private Piccolo _piccolo;


      private PiccoloSaxLoader(Piccolo p) {
         super(p, p.getStartLocator());
         this._piccolo = p;
      }

      static Locale.PiccoloSaxLoader newInstance() {
         return new Locale.PiccoloSaxLoader(new Piccolo());
      }

      void postLoad(Cur c) {
         XmlDocumentProperties props = Locale.getDocProps(c, true);
         props.setEncoding(this._piccolo.getEncoding());
         props.setVersion(this._piccolo.getVersion());
         super.postLoad(c);
      }
   }

   private static class XmlReaderSaxLoader extends Locale.SaxLoader {

      XmlReaderSaxLoader(XMLReader xr) {
         super(xr, (Locator)null);
      }
   }

   static final class ScrubBuffer {

      private static final int START_STATE = 0;
      private static final int SPACE_SEEN_STATE = 1;
      private static final int NOSPACE_STATE = 2;
      private int _state;
      private int _wsr;
      private char[] _srcBuf = new char[1024];
      private StringBuffer _sb = new StringBuffer();


      void init(int wsr) {
         this._sb.delete(0, this._sb.length());
         this._wsr = wsr;
         this._state = 0;
      }

      void scrub(Object src, int off, int cch) {
         if(cch != 0) {
            if(this._wsr == 1) {
               CharUtil.getString(this._sb, src, off, cch);
            } else {
               char[] chars;
               if(src instanceof char[]) {
                  chars = (char[])((char[])src);
               } else {
                  if(cch <= this._srcBuf.length) {
                     chars = this._srcBuf;
                  } else if(cch <= 16384) {
                     chars = this._srcBuf = new char[16384];
                  } else {
                     chars = new char[cch];
                  }

                  CharUtil.getChars(chars, 0, src, off, cch);
                  off = 0;
               }

               int start = 0;

               for(int i = 0; i < cch; ++i) {
                  char ch = chars[off + i];
                  if(ch != 32 && ch != 10 && ch != 13 && ch != 9) {
                     if(this._state == 1) {
                        this._sb.append(' ');
                     }

                     this._state = 2;
                  } else {
                     this._sb.append(chars, off + start, i - start);
                     start = i + 1;
                     if(this._wsr == 2) {
                        this._sb.append(' ');
                     } else if(this._state == 2) {
                        this._state = 1;
                     }
                  }
               }

               this._sb.append(chars, off + start, cch - start);
            }
         }
      }

      String getResultAsString() {
         return this._sb.toString();
      }
   }

   private abstract static class SaxHandler implements ContentHandler, LexicalHandler, DeclHandler, DTDHandler {

      protected Locale _locale;
      protected Locale.LoadContext _context;
      private boolean _wantLineNumbers;
      private boolean _wantLineNumbersAtEndElt;
      private boolean _wantCdataBookmarks;
      private Locator _startLocator;
      private boolean _insideCDATA;
      private int _entityBytesLimit;
      private int _entityBytes;
      private int _insideEntity;
      static final boolean $assertionsDisabled = !Locale.class.desiredAssertionStatus();


      SaxHandler(Locator startLocator) {
         this._insideCDATA = false;
         this._entityBytesLimit = 10240;
         this._entityBytes = 0;
         this._insideEntity = 0;
         this._startLocator = startLocator;
      }

      SaxHandler() {
         this((Locator)null);
      }

      void initSaxHandler(Locale l, XmlOptions options) {
         this._locale = l;
         options = XmlOptions.maskNull(options);
         this._context = new Cur.CurLoadContext(this._locale, options);
         this._wantLineNumbers = this._startLocator != null && options.hasOption("LOAD_LINE_NUMBERS");
         this._wantLineNumbersAtEndElt = this._startLocator != null && options.hasOption("LOAD_LINE_NUMBERS_END_ELEMENT");
         this._wantCdataBookmarks = this._startLocator != null && options.hasOption("LOAD_SAVE_CDATA_BOOKMARKS");
         if(options.hasOption("LOAD_ENTITY_BYTES_LIMIT")) {
            this._entityBytesLimit = ((Integer)((Integer)options.get("LOAD_ENTITY_BYTES_LIMIT"))).intValue();
         }

      }

      public void startDocument() throws SAXException {}

      public void endDocument() throws SAXException {}

      public void startElement(String uri, String local, String qName, Attributes atts) throws SAXException {
         if(local.length() == 0) {
            ;
         }

         if(qName.indexOf(58) >= 0 && uri.length() == 0) {
            XmlError var11 = XmlError.forMessage("Use of undefined namespace prefix: " + qName.substring(0, qName.indexOf(58)));
            throw new XmlRuntimeException(var11.toString(), (Throwable)null, var11);
         } else {
            this._context.startElement(this._locale.makeQualifiedQName(uri, qName));
            if(this._wantLineNumbers) {
               this._context.bookmark(new XmlLineNumber(this._startLocator.getLineNumber(), this._startLocator.getColumnNumber() - 1, -1));
            }

            int i = 0;

            for(int len = atts.getLength(); i < len; ++i) {
               String aqn = atts.getQName(i);
               if(aqn.equals("xmlns")) {
                  this._context.xmlns("", atts.getValue(i));
               } else if(aqn.startsWith("xmlns:")) {
                  String colon = aqn.substring(6);
                  if(colon.length() == 0) {
                     XmlError var13 = XmlError.forMessage("Prefix not specified", 0);
                     throw new XmlRuntimeException(var13.toString(), (Throwable)null, var13);
                  }

                  String attrUri = atts.getValue(i);
                  if(attrUri.length() == 0) {
                     XmlError err = XmlError.forMessage("Prefix can\'t be mapped to no namespace: " + colon, 0);
                     throw new XmlRuntimeException(err.toString(), (Throwable)null, err);
                  }

                  this._context.xmlns(colon, attrUri);
               } else {
                  int var12 = aqn.indexOf(58);
                  if(var12 < 0) {
                     this._context.attr(aqn, atts.getURI(i), (String)null, atts.getValue(i));
                  } else {
                     this._context.attr(aqn.substring(var12 + 1), atts.getURI(i), aqn.substring(0, var12), atts.getValue(i));
                  }
               }
            }

         }
      }

      public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
         this._context.endElement();
         if(this._wantLineNumbersAtEndElt) {
            this._context.bookmark(new XmlLineNumber(this._startLocator.getLineNumber(), this._startLocator.getColumnNumber() - 1, -1));
         }

      }

      public void characters(char[] ch, int start, int length) throws SAXException {
         this._context.text(ch, start, length);
         if(this._wantCdataBookmarks && this._insideCDATA) {
            this._context.bookmarkLastNonAttr(CDataBookmark.CDATA_BOOKMARK);
         }

         if(this._insideEntity != 0 && (this._entityBytes += length) > this._entityBytesLimit) {
            XmlError err = XmlError.forMessage("exceeded-entity-bytes", new Integer[]{new Integer(this._entityBytesLimit)});
            throw new SAXException(err.getMessage());
         }
      }

      public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {}

      public void comment(char[] ch, int start, int length) throws SAXException {
         this._context.comment(ch, start, length);
      }

      public void processingInstruction(String target, String data) throws SAXException {
         this._context.procInst(target, data);
      }

      public void startDTD(String name, String publicId, String systemId) throws SAXException {
         this._context.startDTD(name, publicId, systemId);
      }

      public void endDTD() throws SAXException {
         this._context.endDTD();
      }

      public void startPrefixMapping(String prefix, String uri) throws SAXException {
         if(Locale.beginsWithXml(prefix) && (!"xml".equals(prefix) || !"http://www.w3.org/XML/1998/namespace".equals(uri))) {
            XmlError err = XmlError.forMessage("Prefix can\'t begin with XML: " + prefix, 0);
            throw new XmlRuntimeException(err.toString(), (Throwable)null, err);
         }
      }

      public void endPrefixMapping(String prefix) throws SAXException {}

      public void skippedEntity(String name) throws SAXException {}

      public void startCDATA() throws SAXException {
         this._insideCDATA = true;
      }

      public void endCDATA() throws SAXException {
         this._insideCDATA = false;
      }

      public void startEntity(String name) throws SAXException {
         ++this._insideEntity;
      }

      public void endEntity(String name) throws SAXException {
         --this._insideEntity;
         if(!$assertionsDisabled && this._insideEntity < 0) {
            throw new AssertionError();
         } else {
            if(this._insideEntity == 0) {
               this._entityBytes = 0;
            }

         }
      }

      public void setDocumentLocator(Locator locator) {}

      public void attributeDecl(String eName, String aName, String type, String valueDefault, String value) {
         if(type.equals("ID")) {
            this._context.addIdAttr(eName, aName);
         }

      }

      public void elementDecl(String name, String model) {}

      public void externalEntityDecl(String name, String publicId, String systemId) {}

      public void internalEntityDecl(String name, String value) {}

      public void notationDecl(String name, String publicId, String systemId) {}

      public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) {}

   }

   private static final class LocalDocumentQNameFactory implements QNameFactory {

      private QNameCache _cache = new QNameCache(32);


      public QName getQName(String uri, String local) {
         return this._cache.getName(uri, local, "");
      }

      public QName getQName(String uri, String local, String prefix) {
         return this._cache.getName(uri, local, prefix);
      }

      public QName getQName(char[] uriSrc, int uriPos, int uriCch, char[] localSrc, int localPos, int localCch) {
         return this._cache.getName(new String(uriSrc, uriPos, uriCch), new String(localSrc, localPos, localCch), "");
      }

      public QName getQName(char[] uriSrc, int uriPos, int uriCch, char[] localSrc, int localPos, int localCch, char[] prefixSrc, int prefixPos, int prefixCch) {
         return this._cache.getName(new String(uriSrc, uriPos, uriCch), new String(localSrc, localPos, localCch), new String(prefixSrc, prefixPos, prefixCch));
      }
   }

   static final class Ref extends PhantomReference {

      Cur _cur;


      Ref(Cur c, Object obj) {
         super(obj, c._locale.refQueue());
         this._cur = c;
      }
   }

   interface ChangeListener {

      void notifyChange();

      void setNextChangeListener(Locale.ChangeListener var1);

      Locale.ChangeListener getNextChangeListener();
   }

   class nthCache {

      private long _version;
      private Xobj _parent;
      private QName _name;
      private QNameSet _set;
      private Xobj _child;
      private int _n;
      static final boolean $assertionsDisabled = !Locale.class.desiredAssertionStatus();


      private boolean namesSame(QName pattern, QName name) {
         return pattern == null || pattern.equals(name);
      }

      private boolean setsSame(QNameSet patternSet, QNameSet set) {
         return patternSet != null && patternSet == set;
      }

      private boolean nameHit(QName namePattern, QNameSet setPattern, QName name) {
         return setPattern == null?this.namesSame(namePattern, name):setPattern.contains(name);
      }

      private boolean cacheSame(QName namePattern, QNameSet setPattern) {
         return setPattern == null?this.namesSame(namePattern, this._name):this.setsSame(setPattern, this._set);
      }

      int distance(Xobj parent, QName name, QNameSet set, int n) {
         if(!$assertionsDisabled && n < 0) {
            throw new AssertionError();
         } else {
            return this._version != Locale.this.version()?2147483646:(parent == this._parent && this.cacheSame(name, set)?(n > this._n?n - this._n:this._n - n):Integer.MAX_VALUE);
         }
      }

      Xobj fetch(Xobj parent, QName name, QNameSet set, int n) {
         if(!$assertionsDisabled && n < 0) {
            throw new AssertionError();
         } else {
            Xobj x;
            if(this._version != Locale.this.version() || this._parent != parent || !this.cacheSame(name, set) || n == 0) {
               this._version = Locale.this.version();
               this._parent = parent;
               this._name = name;
               this._child = null;
               this._n = -1;

               for(x = parent._firstChild; x != null; x = x._nextSibling) {
                  if(x.isElem() && this.nameHit(name, set, x._name)) {
                     this._child = x;
                     this._n = 0;
                     break;
                  }
               }
            }

            if(this._n < 0) {
               return null;
            } else {
               if(n > this._n) {
                  label65:
                  while(n > this._n) {
                     for(x = this._child._nextSibling; x != null; x = x._nextSibling) {
                        if(x.isElem() && this.nameHit(name, set, x._name)) {
                           this._child = x;
                           ++this._n;
                           continue label65;
                        }
                     }

                     return null;
                  }
               } else if(n < this._n) {
                  label54:
                  while(n < this._n) {
                     for(x = this._child._prevSibling; x != null; x = x._prevSibling) {
                        if(x.isElem() && this.nameHit(name, set, x._name)) {
                           this._child = x;
                           --this._n;
                           continue label54;
                        }
                     }

                     return null;
                  }
               }

               return this._child;
            }
         }
      }

   }

   private static class DefaultEntityResolver implements EntityResolver {

      private DefaultEntityResolver() {}

      public InputSource resolveEntity(String publicId, String systemId) {
         return new InputSource(new StringReader(""));
      }

      DefaultEntityResolver(Object x0) {
         this();
      }
   }

   private static class DocProps extends XmlDocumentProperties {

      private HashMap _map;


      private DocProps() {
         this._map = new HashMap();
      }

      public Object put(Object key, Object value) {
         return this._map.put(key, value);
      }

      public Object get(Object key) {
         return this._map.get(key);
      }

      public Object remove(Object key) {
         return this._map.remove(key);
      }

      DocProps(Object x0) {
         this();
      }
   }

   private class XmlSaxHandlerImpl extends Locale.SaxHandler implements XmlSaxHandler {

      private SchemaType _type;
      private XmlOptions _options;


      XmlSaxHandlerImpl(Locale l, SchemaType type, XmlOptions options) {
         super((Locator)null);
         this._options = options;
         this._type = type;
         XmlOptions saxHandlerOptions = new XmlOptions(options);
         saxHandlerOptions.put("LOAD_USE_LOCALE_CHAR_UTIL");
         this.initSaxHandler(l, saxHandlerOptions);
      }

      public ContentHandler getContentHandler() {
         return this._context == null?null:this;
      }

      public LexicalHandler getLexicalHandler() {
         return this._context == null?null:this;
      }

      public void bookmarkLastEvent(XmlCursor.XmlBookmark mark) {
         this._context.bookmarkLastNonAttr(mark);
      }

      public void bookmarkLastAttr(QName attrName, XmlCursor.XmlBookmark mark) {
         this._context.bookmarkLastAttr(attrName, mark);
      }

      public XmlObject getObject() throws XmlException {
         if(this._context == null) {
            return null;
         } else {
            this._locale.enter();

            XmlObject var3;
            try {
               Cur c = this._context.finish();
               Locale.autoTypeDocument(c, this._type, this._options);
               XmlObject x = (XmlObject)c.getUser();
               c.release();
               this._context = null;
               var3 = x;
            } finally {
               this._locale.exit();
            }

            return var3;
         }
      }
   }

   class domNthCache {

      public static final int BLITZ_BOUNDARY = 40;
      private long _version;
      private DomImpl.Dom _parent;
      private DomImpl.Dom _child;
      private int _n;
      private int _len;
      static final boolean $assertionsDisabled = !Locale.class.desiredAssertionStatus();


      int distance(DomImpl.Dom parent, int n) {
         if(!$assertionsDisabled && n < 0) {
            throw new AssertionError();
         } else {
            return this._version != Locale.this.version()?2147483646:(parent != this._parent?Integer.MAX_VALUE:(n > this._n?n - this._n:this._n - n));
         }
      }

      int length(DomImpl.Dom parent) {
         if(this._version != Locale.this.version() || this._parent != parent) {
            this._parent = parent;
            this._version = Locale.this.version();
            this._child = null;
            this._n = -1;
            this._len = -1;
         }

         if(this._len == -1) {
            DomImpl.Dom x = null;
            if(this._child != null && this._n != -1) {
               x = this._child;
               this._len = this._n;
            } else {
               x = DomImpl.firstChild(this._parent);
               this._len = 0;
               this._child = x;
               this._n = 0;
            }

            while(x != null) {
               ++this._len;
               x = DomImpl.nextSibling(x);
            }
         }

         return this._len;
      }

      DomImpl.Dom fetch(DomImpl.Dom parent, int n) {
         if(!$assertionsDisabled && n < 0) {
            throw new AssertionError();
         } else {
            DomImpl.Dom x;
            if(this._version == Locale.this.version() && this._parent == parent) {
               if(this._n < 0) {
                  return null;
               } else {
                  if(n > this._n) {
                     while(n > this._n) {
                        x = DomImpl.nextSibling(this._child);
                        if(x == null) {
                           return null;
                        }

                        this._child = x;
                        ++this._n;
                     }
                  } else if(n < this._n) {
                     while(n < this._n) {
                        x = DomImpl.prevSibling(this._child);
                        if(x == null) {
                           return null;
                        }

                        this._child = x;
                        --this._n;
                     }
                  }

                  return this._child;
               }
            } else {
               this._parent = parent;
               this._version = Locale.this.version();
               this._child = null;
               this._n = -1;
               this._len = -1;

               for(x = DomImpl.firstChild(this._parent); x != null; x = DomImpl.nextSibling(x)) {
                  ++this._n;
                  if(this._child == null && n == this._n) {
                     this._child = x;
                     break;
                  }
               }

               return this._child;
            }
         }
      }

   }

   private static final class DefaultQNameFactory implements QNameFactory {

      private QNameCache _cache;


      private DefaultQNameFactory() {
         this._cache = XmlBeans.getQNameCache();
      }

      public QName getQName(String uri, String local) {
         return this._cache.getName(uri, local, "");
      }

      public QName getQName(String uri, String local, String prefix) {
         return this._cache.getName(uri, local, prefix);
      }

      public QName getQName(char[] uriSrc, int uriPos, int uriCch, char[] localSrc, int localPos, int localCch) {
         return this._cache.getName(new String(uriSrc, uriPos, uriCch), new String(localSrc, localPos, localCch), "");
      }

      public QName getQName(char[] uriSrc, int uriPos, int uriCch, char[] localSrc, int localPos, int localCch, char[] prefixSrc, int prefixPos, int prefixCch) {
         return this._cache.getName(new String(uriSrc, uriPos, uriCch), new String(localSrc, localPos, localCch), new String(prefixSrc, prefixPos, prefixCch));
      }

      DefaultQNameFactory(Object x0) {
         this();
      }
   }

   abstract static class LoadContext {

      private Hashtable _idAttrs;


      protected abstract void startDTD(String var1, String var2, String var3);

      protected abstract void endDTD();

      protected abstract void startElement(QName var1);

      protected abstract void endElement();

      protected abstract void attr(QName var1, String var2);

      protected abstract void attr(String var1, String var2, String var3, String var4);

      protected abstract void xmlns(String var1, String var2);

      protected abstract void comment(char[] var1, int var2, int var3);

      protected abstract void comment(String var1);

      protected abstract void procInst(String var1, String var2);

      protected abstract void text(char[] var1, int var2, int var3);

      protected abstract void text(String var1);

      protected abstract Cur finish();

      protected abstract void abort();

      protected abstract void bookmark(XmlCursor.XmlBookmark var1);

      protected abstract void bookmarkLastNonAttr(XmlCursor.XmlBookmark var1);

      protected abstract void bookmarkLastAttr(QName var1, XmlCursor.XmlBookmark var2);

      protected abstract void lineNumber(int var1, int var2, int var3);

      protected void addIdAttr(String eName, String aName) {
         if(this._idAttrs == null) {
            this._idAttrs = new Hashtable();
         }

         this._idAttrs.put(aName, eName);
      }

      protected boolean isAttrOfTypeId(QName aqn, QName eqn) {
         if(this._idAttrs == null) {
            return false;
         } else {
            String pre = aqn.getPrefix();
            String lName = aqn.getLocalPart();
            String urnName = "".equals(pre)?lName:pre + ":" + lName;
            String eName = (String)this._idAttrs.get(urnName);
            if(eName == null) {
               return false;
            } else {
               pre = eqn.getPrefix();
               lName = eqn.getLocalPart();
               lName = eqn.getLocalPart();
               urnName = "".equals(pre)?lName:pre + ":" + lName;
               return eName.equals(urnName);
            }
         }
      }
   }
}
