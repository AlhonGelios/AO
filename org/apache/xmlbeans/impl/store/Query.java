package org.apache.xmlbeans.impl.store;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBoolean;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlDate;
import org.apache.xmlbeans.XmlDecimal;
import org.apache.xmlbeans.XmlDouble;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlFloat;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlLong;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlRuntimeException;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.common.XPath;
import org.apache.xmlbeans.impl.store.Cur;
import org.apache.xmlbeans.impl.store.Cursor;
import org.apache.xmlbeans.impl.store.Locale;
import org.apache.xmlbeans.impl.store.Path;
import org.apache.xmlbeans.impl.store.QueryDelegate;
import org.w3c.dom.Node;

public abstract class Query {

   public static final String QUERY_DELEGATE_INTERFACE = "QUERY_DELEGATE_INTERFACE";
   public static String _useDelegateForXQuery = "use delegate for xquery";
   public static String _useXdkForXQuery = "use xdk for xquery";
   private static String _delIntfName;
   private static HashMap _xdkQueryCache = new HashMap();
   private static Method _xdkCompileQuery;
   private static boolean _xdkAvailable = true;
   private static HashMap _xqrlQueryCache = new HashMap();
   private static Method _xqrlCompileQuery;
   private static boolean _xqrlAvailable = true;
   private static HashMap _xqrl2002QueryCache = new HashMap();
   private static Method _xqrl2002CompileQuery;
   private static boolean _xqrl2002Available = true;


   abstract XmlObject[] objectExecute(Cur var1, XmlOptions var2);

   abstract XmlCursor cursorExecute(Cur var1, XmlOptions var2);

   static XmlObject[] objectExecQuery(Cur c, String queryExpr, XmlOptions options) {
      return getCompiledQuery(queryExpr, options).objectExecute(c, options);
   }

   static XmlCursor cursorExecQuery(Cur c, String queryExpr, XmlOptions options) {
      return getCompiledQuery(queryExpr, options).cursorExecute(c, options);
   }

   public static synchronized Query getCompiledQuery(String queryExpr, XmlOptions options) {
      return getCompiledQuery(queryExpr, Path.getCurrentNodeVar(options), options);
   }

   static synchronized Query getCompiledQuery(String queryExpr, String currentVar, XmlOptions options) {
      assert queryExpr != null;

      options = XmlOptions.maskNull(options);
      Query query;
      if(options.hasOption(Path._forceXqrl2002ForXpathXQuery)) {
         query = (Query)_xqrl2002QueryCache.get(queryExpr);
         if(query != null) {
            return query;
         } else {
            query = getXqrl2002CompiledQuery(queryExpr, currentVar);
            if(query != null) {
               _xqrl2002QueryCache.put(queryExpr, query);
               return query;
            } else {
               throw new RuntimeException("No 2002 query engine found.");
            }
         }
      } else {
         HashMap boundary = new HashMap();
         boolean boundaryVal = false;

         int boundaryVal1;
         try {
            XPath.compileXPath(queryExpr, currentVar, boundary);
         } catch (XPath.XPathCompileException var10) {
            ;
         } finally {
            boundaryVal1 = boundary.get("$xmlbeans!ns_boundary") == null?0:((Integer)boundary.get("$xmlbeans!ns_boundary")).intValue();
         }

         if(options.hasOption(_useXdkForXQuery)) {
            query = (Query)_xdkQueryCache.get(queryExpr);
            if(query != null) {
               return query;
            }

            query = createXdkCompiledQuery(queryExpr, currentVar);
            if(query != null) {
               _xdkQueryCache.put(queryExpr, query);
               return query;
            }
         }

         if(!options.hasOption(_useDelegateForXQuery)) {
            query = (Query)_xqrlQueryCache.get(queryExpr);
            if(query != null) {
               return query;
            }

            query = createXqrlCompiledQuery(queryExpr, currentVar);
            if(query != null) {
               _xqrlQueryCache.put(queryExpr, query);
               return query;
            }
         }

         String delIntfName = options.hasOption("QUERY_DELEGATE_INTERFACE")?(String)options.get("QUERY_DELEGATE_INTERFACE"):_delIntfName;
         query = Query.DelegateQueryImpl.createDelegateCompiledQuery(delIntfName, queryExpr, currentVar, boundaryVal1);
         if(query != null) {
            return query;
         } else {
            throw new RuntimeException("No query engine found");
         }
      }
   }

   public static synchronized String compileQuery(String queryExpr, XmlOptions options) {
      getCompiledQuery(queryExpr, options);
      return queryExpr;
   }

   private static Query createXdkCompiledQuery(String queryExpr, String currentVar) {
      if(!_xdkAvailable) {
         return null;
      } else {
         if(_xdkCompileQuery == null) {
            try {
               Class args = Class.forName("org.apache.xmlbeans.impl.store.OXQXBXqrlImpl");
               _xdkCompileQuery = args.getDeclaredMethod("compileQuery", new Class[]{String.class, String.class, Boolean.class});
            } catch (ClassNotFoundException var7) {
               _xdkAvailable = false;
               return null;
            } catch (Exception var8) {
               _xdkAvailable = false;
               throw new RuntimeException(var8.getMessage(), var8);
            }
         }

         Object[] args1 = new Object[]{queryExpr, currentVar, new Boolean(true)};

         try {
            return (Query)_xdkCompileQuery.invoke((Object)null, args1);
         } catch (InvocationTargetException var5) {
            Throwable t = var5.getCause();
            throw new RuntimeException(t.getMessage(), t);
         } catch (IllegalAccessException var6) {
            throw new RuntimeException(var6.getMessage(), var6);
         }
      }
   }

   private static Query createXqrlCompiledQuery(String queryExpr, String currentVar) {
      if(!_xqrlAvailable) {
         return null;
      } else {
         if(_xqrlCompileQuery == null) {
            try {
               Class args = Class.forName("org.apache.xmlbeans.impl.store.XqrlImpl");
               _xqrlCompileQuery = args.getDeclaredMethod("compileQuery", new Class[]{String.class, String.class, Boolean.class});
            } catch (ClassNotFoundException var7) {
               _xqrlAvailable = false;
               return null;
            } catch (Exception var8) {
               _xqrlAvailable = false;
               throw new RuntimeException(var8.getMessage(), var8);
            }
         }

         Object[] args1 = new Object[]{queryExpr, currentVar, new Boolean(true)};

         try {
            return (Query)_xqrlCompileQuery.invoke((Object)null, args1);
         } catch (InvocationTargetException var5) {
            Throwable t = var5.getCause();
            throw new RuntimeException(t.getMessage(), t);
         } catch (IllegalAccessException var6) {
            throw new RuntimeException(var6.getMessage(), var6);
         }
      }
   }

   private static Query getXqrl2002CompiledQuery(String queryExpr, String currentVar) {
      if(_xqrl2002Available && _xqrl2002CompileQuery == null) {
         try {
            Class args = Class.forName("org.apache.xmlbeans.impl.store.Xqrl2002Impl");
            _xqrl2002CompileQuery = args.getDeclaredMethod("compileQuery", new Class[]{String.class, String.class, Boolean.class});
         } catch (ClassNotFoundException var7) {
            _xqrl2002Available = false;
            return null;
         } catch (Exception var8) {
            _xqrl2002Available = false;
            throw new RuntimeException(var8.getMessage(), var8);
         }
      }

      Object[] args1 = new Object[]{queryExpr, currentVar, new Boolean(true)};

      try {
         return (Query)_xqrl2002CompileQuery.invoke((Object)null, args1);
      } catch (InvocationTargetException var5) {
         Throwable t = var5.getCause();
         throw new RuntimeException(t.getMessage(), t);
      } catch (IllegalAccessException var6) {
         throw new RuntimeException(var6.getMessage(), var6);
      }
   }

   static {
      ClassLoader cl = Query.class.getClassLoader();
      String id = "META-INF/services/org.apache.xmlbeans.impl.store.QueryDelegate.QueryInterface";
      InputStream in = cl.getResourceAsStream(id);

      try {
         BufferedReader e = new BufferedReader(new InputStreamReader(in));
         _delIntfName = e.readLine().trim();
         e.close();
      } catch (Exception var4) {
         _delIntfName = null;
      }

   }

   private static final class DelegateQueryImpl extends Query {

      private QueryDelegate.QueryInterface _xqueryImpl;
      static final boolean $assertionsDisabled = !Query.class.desiredAssertionStatus();


      private DelegateQueryImpl(QueryDelegate.QueryInterface xqueryImpl) {
         this._xqueryImpl = xqueryImpl;
      }

      public static Query createDelegateCompiledQuery(String delIntfName, String queryExpr, String currentVar, int boundary) {
         if(!$assertionsDisabled && (currentVar.startsWith(".") || currentVar.startsWith(".."))) {
            throw new AssertionError();
         } else {
            QueryDelegate.QueryInterface impl = QueryDelegate.createInstance(delIntfName, queryExpr, currentVar, boundary);
            return impl == null?null:new Query.DelegateQueryImpl(impl);
         }
      }

      XmlObject[] objectExecute(Cur c, XmlOptions options) {
         return (new Query.DelegateQueryImpl.DelegateQueryEngine(this._xqueryImpl, c, options)).objectExecute();
      }

      XmlCursor cursorExecute(Cur c, XmlOptions options) {
         return (new Query.DelegateQueryImpl.DelegateQueryEngine(this._xqueryImpl, c, options)).cursorExecute();
      }


      private static class DelegateQueryEngine {

         private Cur _cur;
         private QueryDelegate.QueryInterface _engine;
         private long _version;
         private XmlOptions _options;
         static final boolean $assertionsDisabled = !Query.class.desiredAssertionStatus();


         public DelegateQueryEngine(QueryDelegate.QueryInterface xqImpl, Cur c, XmlOptions opt) {
            this._engine = xqImpl;
            this._version = c._locale.version();
            this._cur = c.weakCur(this);
            this._options = opt;
         }

         public XmlObject[] objectExecute() {
            if(this._cur != null && this._version != this._cur._locale.version()) {
               ;
            }

            Map bindings = (Map)XmlOptions.maskNull(this._options).get("XQUERY_VARIABLE_MAP");
            List resultsList = this._engine.execQuery(this._cur.getDom(), bindings);
            if(!$assertionsDisabled && resultsList.size() <= -1) {
               throw new AssertionError();
            } else {
               XmlObject[] result = new XmlObject[resultsList.size()];

               for(int i = 0; i < resultsList.size(); ++i) {
                  Locale l = Locale.getLocale(this._cur._locale._schemaTypeLoader, this._options);
                  l.enter();
                  Object node = resultsList.get(i);
                  Cur res = null;

                  try {
                     if(!(node instanceof Node)) {
                        res = l.load("<xml-fragment/>").tempCur();
                        res.setValue(node.toString());
                        SchemaType e = this.getType(node);
                        Locale.autoTypeDocument(res, e, (XmlOptions)null);
                        result[i] = res.getObject();
                     } else {
                        res = this.loadNode(l, (Node)node);
                     }

                     result[i] = res.getObject();
                  } catch (XmlException var12) {
                     throw new RuntimeException(var12);
                  } finally {
                     l.exit();
                  }

                  res.release();
               }

               this.release();
               this._engine = null;
               return result;
            }
         }

         private SchemaType getType(Object node) {
            SchemaType type;
            if(node instanceof Integer) {
               type = XmlInteger.type;
            } else if(node instanceof Double) {
               type = XmlDouble.type;
            } else if(node instanceof Long) {
               type = XmlLong.type;
            } else if(node instanceof Float) {
               type = XmlFloat.type;
            } else if(node instanceof BigDecimal) {
               type = XmlDecimal.type;
            } else if(node instanceof Boolean) {
               type = XmlBoolean.type;
            } else if(node instanceof String) {
               type = XmlString.type;
            } else if(node instanceof Date) {
               type = XmlDate.type;
            } else {
               type = XmlAnySimpleType.type;
            }

            return type;
         }

         public XmlCursor cursorExecute() {
            if(this._cur != null && this._version != this._cur._locale.version()) {
               ;
            }

            Map bindings = (Map)XmlOptions.maskNull(this._options).get("XQUERY_VARIABLE_MAP");
            List resultsList = this._engine.execQuery(this._cur.getDom(), bindings);
            if(!$assertionsDisabled && resultsList.size() <= -1) {
               throw new AssertionError();
            } else {
               this._engine = null;
               Locale locale = Locale.getLocale(this._cur._locale._schemaTypeLoader, this._options);
               locale.enter();
               Cur.CurLoadContext _context = new Cur.CurLoadContext(locale, this._options);
               Cursor resultCur = null;

               try {
                  for(int i = 0; i < resultsList.size(); ++i) {
                     this.loadNodeHelper(locale, (Node)resultsList.get(i), _context);
                  }

                  Cur e = _context.finish();
                  Locale.associateSourceName(e, this._options);
                  Locale.autoTypeDocument(e, (SchemaType)null, this._options);
                  resultCur = new Cursor(e);
               } catch (Exception var11) {
                  ;
               } finally {
                  locale.exit();
               }

               this.release();
               return resultCur;
            }
         }

         public void release() {
            if(this._cur != null) {
               this._cur.release();
               this._cur = null;
            }

         }

         private Cur loadNode(Locale locale, Node node) {
            Cur.CurLoadContext context = new Cur.CurLoadContext(locale, this._options);

            try {
               this.loadNodeHelper(locale, node, context);
               Cur e = context.finish();
               Locale.associateSourceName(e, this._options);
               Locale.autoTypeDocument(e, (SchemaType)null, this._options);
               return e;
            } catch (Exception var5) {
               throw new XmlRuntimeException(var5.getMessage(), var5);
            }
         }

         private void loadNodeHelper(Locale locale, Node node, Locale.LoadContext context) {
            if(node.getNodeType() == 2) {
               QName attName = new QName(node.getNamespaceURI(), node.getLocalName(), node.getPrefix());
               context.attr(attName, node.getNodeValue());
            } else {
               locale.loadNode(node, context);
            }

         }

      }
   }
}
