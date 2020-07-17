package org.apache.xmlbeans.impl.schema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaAttributeGroup;
import org.apache.xmlbeans.SchemaField;
import org.apache.xmlbeans.SchemaGlobalAttribute;
import org.apache.xmlbeans.SchemaGlobalElement;
import org.apache.xmlbeans.SchemaModelGroup;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlFactoryHook;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlSaxHandler;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.store.Locale;
import org.apache.xmlbeans.impl.validator.ValidatingXMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Node;

public abstract class SchemaTypeLoaderBase implements SchemaTypeLoader {

   private static final String USER_AGENT = "XMLBeans/" + XmlBeans.getVersion() + " (" + XmlBeans.getTitle() + ")";
   private static final Method _pathCompiler = getMethod("org.apache.xmlbeans.impl.store.Path", "compilePath", new Class[]{String.class, XmlOptions.class});
   private static final Method _queryCompiler = getMethod("org.apache.xmlbeans.impl.store.Query", "compileQuery", new Class[]{String.class, XmlOptions.class});


   private static Method getMethod(String className, String methodName, Class[] args) {
      try {
         return Class.forName(className).getDeclaredMethod(methodName, args);
      } catch (Exception var4) {
         throw new IllegalStateException("Cannot find " + className + "." + methodName + ".  verify that xmlstore " + "(from xbean.jar) is on classpath");
      }
   }

   private static Object invokeMethod(Method method, Object[] args) {
      try {
         return method.invoke(method, args);
      } catch (InvocationTargetException var5) {
         Throwable ise2 = var5.getCause();
         IllegalStateException ise1 = new IllegalStateException(ise2.getMessage());
         ise1.initCause(ise2);
         throw ise1;
      } catch (Exception var6) {
         IllegalStateException ise = new IllegalStateException(var6.getMessage());
         ise.initCause(var6);
         throw ise;
      }
   }

   private static String doCompilePath(String pathExpr, XmlOptions options) {
      return (String)invokeMethod(_pathCompiler, new Object[]{pathExpr, options});
   }

   private static String doCompileQuery(String queryExpr, XmlOptions options) {
      return (String)invokeMethod(_queryCompiler, new Object[]{queryExpr, options});
   }

   public SchemaType findType(QName name) {
      SchemaType.Ref ref = this.findTypeRef(name);
      if(ref == null) {
         return null;
      } else {
         SchemaType result = ref.get();

         assert result != null;

         return result;
      }
   }

   public SchemaType findDocumentType(QName name) {
      SchemaType.Ref ref = this.findDocumentTypeRef(name);
      if(ref == null) {
         return null;
      } else {
         SchemaType result = ref.get();

         assert result != null;

         return result;
      }
   }

   public SchemaType findAttributeType(QName name) {
      SchemaType.Ref ref = this.findAttributeTypeRef(name);
      if(ref == null) {
         return null;
      } else {
         SchemaType result = ref.get();

         assert result != null;

         return result;
      }
   }

   public SchemaModelGroup findModelGroup(QName name) {
      SchemaModelGroup.Ref ref = this.findModelGroupRef(name);
      if(ref == null) {
         return null;
      } else {
         SchemaModelGroup result = ref.get();

         assert result != null;

         return result;
      }
   }

   public SchemaAttributeGroup findAttributeGroup(QName name) {
      SchemaAttributeGroup.Ref ref = this.findAttributeGroupRef(name);
      if(ref == null) {
         return null;
      } else {
         SchemaAttributeGroup result = ref.get();

         assert result != null;

         return result;
      }
   }

   public SchemaGlobalElement findElement(QName name) {
      SchemaGlobalElement.Ref ref = this.findElementRef(name);
      if(ref == null) {
         return null;
      } else {
         SchemaGlobalElement result = ref.get();

         assert result != null;

         return result;
      }
   }

   public SchemaGlobalAttribute findAttribute(QName name) {
      SchemaGlobalAttribute.Ref ref = this.findAttributeRef(name);
      if(ref == null) {
         return null;
      } else {
         SchemaGlobalAttribute result = ref.get();

         assert result != null;

         return result;
      }
   }

   public XmlObject newInstance(SchemaType type, XmlOptions options) {
      XmlFactoryHook hook = XmlFactoryHook.ThreadContext.getHook();
      return hook != null?hook.newInstance(this, type, options):Locale.newInstance(this, type, options);
   }

   public XmlObject parse(String xmlText, SchemaType type, XmlOptions options) throws XmlException {
      XmlFactoryHook hook = XmlFactoryHook.ThreadContext.getHook();
      return hook != null?hook.parse(this, xmlText, type, options):Locale.parseToXmlObject(this, xmlText, type, options);
   }

   public XmlObject parse(XMLInputStream xis, SchemaType type, XmlOptions options) throws XmlException, XMLStreamException {
      XmlFactoryHook hook = XmlFactoryHook.ThreadContext.getHook();
      return hook != null?hook.parse(this, xis, type, options):Locale.parseToXmlObject(this, xis, type, options);
   }

   public XmlObject parse(XMLStreamReader xsr, SchemaType type, XmlOptions options) throws XmlException {
      XmlFactoryHook hook = XmlFactoryHook.ThreadContext.getHook();
      return hook != null?hook.parse(this, xsr, type, options):Locale.parseToXmlObject(this, xsr, type, options);
   }

   public XmlObject parse(File file, SchemaType type, XmlOptions options) throws XmlException, IOException {
      if(options == null) {
         options = new XmlOptions();
         options.put("DOCUMENT_SOURCE_NAME", file.toURI().normalize().toString());
      } else if(!options.hasOption("DOCUMENT_SOURCE_NAME")) {
         options = new XmlOptions(options);
         options.put("DOCUMENT_SOURCE_NAME", file.toURI().normalize().toString());
      }

      FileInputStream fis = new FileInputStream(file);

      XmlObject var5;
      try {
         var5 = this.parse((InputStream)fis, type, options);
      } finally {
         fis.close();
      }

      return var5;
   }

   public XmlObject parse(URL url, SchemaType type, XmlOptions options) throws XmlException, IOException {
      if(options == null) {
         options = new XmlOptions();
         options.put("DOCUMENT_SOURCE_NAME", url.toString());
      } else if(!options.hasOption("DOCUMENT_SOURCE_NAME")) {
         options = new XmlOptions(options);
         options.put("DOCUMENT_SOURCE_NAME", url.toString());
      }

      URLConnection conn = null;
      InputStream stream = null;

      try {
         boolean redirected = false;
         int count = 0;

         do {
            conn = url.openConnection();
            conn.addRequestProperty("User-Agent", USER_AGENT);
            conn.addRequestProperty("Accept", "application/xml, text/xml, */*");
            if(conn instanceof HttpURLConnection) {
               HttpURLConnection httpcon = (HttpURLConnection)conn;
               int code = httpcon.getResponseCode();
               redirected = code == 301 || code == 302;
               if(redirected && count > 5) {
                  redirected = false;
               }

               if(redirected) {
                  String newLocation = httpcon.getHeaderField("Location");
                  if(newLocation == null) {
                     redirected = false;
                  } else {
                     url = new URL(newLocation);
                     ++count;
                  }
               }
            }
         } while(redirected);

         stream = conn.getInputStream();
         XmlObject var14 = this.parse(stream, type, options);
         return var14;
      } finally {
         if(stream != null) {
            stream.close();
         }

      }
   }

   public XmlObject parse(InputStream jiois, SchemaType type, XmlOptions options) throws XmlException, IOException {
      XmlFactoryHook hook = XmlFactoryHook.ThreadContext.getHook();
      DigestInputStream digestStream = null;
      if(options != null && options.hasOption("LOAD_MESSAGE_DIGEST")) {
         label23: {
            MessageDigest result;
            try {
               result = MessageDigest.getInstance("SHA");
            } catch (NoSuchAlgorithmException var8) {
               break label23;
            }

            digestStream = new DigestInputStream((InputStream)jiois, result);
            jiois = digestStream;
         }
      }

      if(hook != null) {
         return hook.parse(this, (InputStream)jiois, type, options);
      } else {
         XmlObject result1 = Locale.parseToXmlObject(this, (InputStream)jiois, type, options);
         if(digestStream != null) {
            result1.documentProperties().setMessageDigest(digestStream.getMessageDigest().digest());
         }

         return result1;
      }
   }

   public XmlObject parse(Reader jior, SchemaType type, XmlOptions options) throws XmlException, IOException {
      XmlFactoryHook hook = XmlFactoryHook.ThreadContext.getHook();
      return hook != null?hook.parse(this, jior, type, options):Locale.parseToXmlObject(this, jior, type, options);
   }

   public XmlObject parse(Node node, SchemaType type, XmlOptions options) throws XmlException {
      XmlFactoryHook hook = XmlFactoryHook.ThreadContext.getHook();
      return hook != null?hook.parse(this, node, type, options):Locale.parseToXmlObject(this, node, type, options);
   }

   public XmlSaxHandler newXmlSaxHandler(SchemaType type, XmlOptions options) {
      XmlFactoryHook hook = XmlFactoryHook.ThreadContext.getHook();
      return hook != null?hook.newXmlSaxHandler(this, type, options):Locale.newSaxHandler(this, type, options);
   }

   public DOMImplementation newDomImplementation(XmlOptions options) {
      return Locale.newDomImplementation(this, options);
   }

   public XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, SchemaType type, XmlOptions options) throws XmlException, XMLStreamException {
      return new ValidatingXMLInputStream(xis, this, type, options);
   }

   public String compilePath(String pathExpr) {
      return this.compilePath(pathExpr, (XmlOptions)null);
   }

   public String compilePath(String pathExpr, XmlOptions options) {
      return doCompilePath(pathExpr, options);
   }

   public String compileQuery(String queryExpr) {
      return this.compileQuery(queryExpr, (XmlOptions)null);
   }

   public String compileQuery(String queryExpr, XmlOptions options) {
      return doCompileQuery(queryExpr, options);
   }

   public SchemaType typeForSignature(String signature) {
      int end = signature.indexOf(64);
      String uri;
      if(end < 0) {
         uri = "";
         end = signature.length();
      } else {
         uri = signature.substring(end + 1);
      }

      ArrayList parts = new ArrayList();

      int i;
      int offset;
      for(int curType = 0; curType < end; curType = offset + 1) {
         i = signature.indexOf(58, curType);
         int part = signature.indexOf(124, curType);
         offset = i < 0?part:(part < 0?i:(i < part?i:part));
         if(offset < 0 || offset > end) {
            offset = end;
         }

         String index = signature.substring(curType, offset);
         parts.add(index);
      }

      SchemaType var14 = null;

      label176:
      for(i = parts.size() - 1; i >= 0; --i) {
         String var15 = (String)parts.get(i);
         if(var15.length() < 1) {
            throw new IllegalArgumentException();
         }

         offset = var15.length() >= 2 && var15.charAt(1) == 61?2:1;
         int j;
         SchemaField field;
         SchemaType[] var17;
         String var19;
         switch(var15.charAt(0)) {
         case 65:
         case 81:
            if(var14 != null) {
               if(var14.isSimpleType()) {
                  return null;
               }

               var17 = var14.getAnonymousTypes();
               var19 = var15.substring(offset);

               for(j = 0; j < var17.length; ++j) {
                  field = var17[j].getContainerField();
                  if(field != null && field.isAttribute() && field.getName().getLocalPart().equals(var19)) {
                     var14 = var17[j];
                     continue label176;
                  }
               }

               return null;
            } else {
               SchemaGlobalAttribute var20 = this.findAttribute(QNameHelper.forLNS(var15.substring(offset), uri));
               if(var20 == null) {
                  return null;
               }

               var14 = var20.getType();
               break;
            }
         case 66:
            if(var14 == null) {
               throw new IllegalArgumentException();
            }

            if(var14.getSimpleVariety() != 1) {
               return null;
            }

            var17 = var14.getAnonymousTypes();
            if(var17.length != 1) {
               return null;
            }

            var14 = var17[0];
            break;
         case 67:
         case 82:
            if(var14 != null) {
               throw new IllegalArgumentException();
            }

            var14 = this.findAttributeType(QNameHelper.forLNS(var15.substring(offset), uri));
            if(var14 == null) {
               return null;
            }
            break;
         case 68:
            if(var14 != null) {
               throw new IllegalArgumentException();
            }

            var14 = this.findDocumentType(QNameHelper.forLNS(var15.substring(offset), uri));
            if(var14 == null) {
               return null;
            }
            break;
         case 69:
         case 85:
            if(var14 != null) {
               if(var14.getContentType() < 3) {
                  return null;
               }

               var17 = var14.getAnonymousTypes();
               var19 = var15.substring(offset);

               for(j = 0; j < var17.length; ++j) {
                  field = var17[j].getContainerField();
                  if(field != null && !field.isAttribute() && field.getName().getLocalPart().equals(var19)) {
                     var14 = var17[j];
                     continue label176;
                  }
               }

               return null;
            } else {
               SchemaGlobalElement var18 = this.findElement(QNameHelper.forLNS(var15.substring(offset), uri));
               if(var18 == null) {
                  return null;
               }

               var14 = var18.getType();
               break;
            }
         case 70:
         case 71:
         case 72:
         case 74:
         case 75:
         case 76:
         case 78:
         case 79:
         case 80:
         case 83:
         default:
            throw new IllegalArgumentException();
         case 73:
            if(var14 == null) {
               throw new IllegalArgumentException();
            }

            if(var14.getSimpleVariety() != 3) {
               return null;
            }

            var17 = var14.getAnonymousTypes();
            if(var17.length != 1) {
               return null;
            }

            var14 = var17[0];
            break;
         case 77:
            if(var14 == null) {
               throw new IllegalArgumentException();
            }

            int var16;
            try {
               var16 = Integer.parseInt(var15.substring(offset));
            } catch (Exception var13) {
               throw new IllegalArgumentException();
            }

            if(var14.getSimpleVariety() != 2) {
               return null;
            }

            SchemaType[] subTypes = var14.getAnonymousTypes();
            if(subTypes.length <= var16) {
               return null;
            }

            var14 = subTypes[var16];
            break;
         case 84:
            if(var14 != null) {
               throw new IllegalArgumentException();
            }

            var14 = this.findType(QNameHelper.forLNS(var15.substring(offset), uri));
            if(var14 == null) {
               return null;
            }
         }
      }

      return var14;
   }

}
