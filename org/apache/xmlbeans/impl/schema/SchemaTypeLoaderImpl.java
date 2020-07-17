package org.apache.xmlbeans.impl.schema;

import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.ResourceLoader;
import org.apache.xmlbeans.SchemaAttributeGroup;
import org.apache.xmlbeans.SchemaGlobalAttribute;
import org.apache.xmlbeans.SchemaGlobalElement;
import org.apache.xmlbeans.SchemaIdentityConstraint;
import org.apache.xmlbeans.SchemaModelGroup;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.SchemaTypeSystem;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.SystemCache;
import org.apache.xmlbeans.impl.common.XBeanDebug;
import org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;
import org.apache.xmlbeans.impl.schema.SchemaTypeLoaderBase;
import org.apache.xmlbeans.impl.schema.SchemaTypeSystemImpl;

public class SchemaTypeLoaderImpl extends SchemaTypeLoaderBase {

   private ResourceLoader _resourceLoader;
   private ClassLoader _classLoader;
   private SchemaTypeLoader[] _searchPath;
   private Map _classpathTypeSystems;
   private Map _classLoaderTypeSystems;
   private Map _elementCache;
   private Map _attributeCache;
   private Map _modelGroupCache;
   private Map _attributeGroupCache;
   private Map _idConstraintCache;
   private Map _typeCache;
   private Map _documentCache;
   private Map _attributeTypeCache;
   private Map _classnameCache;
   public static String METADATA_PACKAGE_LOAD = SchemaTypeSystemImpl.METADATA_PACKAGE_GEN;
   private static final Object CACHED_NOT_FOUND = new Object();
   private static final SchemaTypeLoader[] EMPTY_SCHEMATYPELOADER_ARRAY = new SchemaTypeLoader[0];


   public static SchemaTypeLoaderImpl getContextTypeLoader() {
      ClassLoader cl = Thread.currentThread().getContextClassLoader();
      SchemaTypeLoaderImpl result = (SchemaTypeLoaderImpl)SystemCache.get().getFromTypeLoaderCache(cl);
      if(result == null) {
         result = new SchemaTypeLoaderImpl(new SchemaTypeLoader[]{BuiltinSchemaTypeSystem.get()}, (ResourceLoader)null, cl);
         SystemCache.get().addToTypeLoaderCache(result, cl);
      }

      return result;
   }

   public static SchemaTypeLoader build(SchemaTypeLoader[] searchPath, ResourceLoader resourceLoader, ClassLoader classLoader) {
      if(searchPath == null) {
         searchPath = EMPTY_SCHEMATYPELOADER_ARRAY;
      } else {
         SchemaTypeLoaderImpl.SubLoaderList list = new SchemaTypeLoaderImpl.SubLoaderList((SchemaTypeLoaderImpl.NamelessClass596728041)null);

         for(int i = 0; i < searchPath.length; ++i) {
            if(searchPath[i] == null) {
               throw new IllegalArgumentException("searchPath[" + i + "] is null");
            }

            if(!(searchPath[i] instanceof SchemaTypeLoaderImpl)) {
               list.add(searchPath[i]);
            } else {
               SchemaTypeLoaderImpl sub = (SchemaTypeLoaderImpl)searchPath[i];
               if(sub._classLoader == null && sub._resourceLoader == null) {
                  for(int j = 0; j < sub._searchPath.length; ++j) {
                     list.add(sub._searchPath[j]);
                  }
               } else {
                  list.add(sub);
               }
            }
         }

         searchPath = list.toArray();
      }

      return (SchemaTypeLoader)(searchPath.length == 1 && resourceLoader == null && classLoader == null?searchPath[0]:new SchemaTypeLoaderImpl(searchPath, resourceLoader, classLoader));
   }

   private SchemaTypeLoaderImpl(SchemaTypeLoader[] searchPath, ResourceLoader resourceLoader, ClassLoader classLoader) {
      if(searchPath == null) {
         this._searchPath = EMPTY_SCHEMATYPELOADER_ARRAY;
      } else {
         this._searchPath = searchPath;
      }

      this._resourceLoader = resourceLoader;
      this._classLoader = classLoader;
      this.initCaches();
   }

   private final void initCaches() {
      this._classpathTypeSystems = Collections.synchronizedMap(new HashMap());
      this._classLoaderTypeSystems = Collections.synchronizedMap(new HashMap());
      this._elementCache = Collections.synchronizedMap(new HashMap());
      this._attributeCache = Collections.synchronizedMap(new HashMap());
      this._modelGroupCache = Collections.synchronizedMap(new HashMap());
      this._attributeGroupCache = Collections.synchronizedMap(new HashMap());
      this._idConstraintCache = Collections.synchronizedMap(new HashMap());
      this._typeCache = Collections.synchronizedMap(new HashMap());
      this._documentCache = Collections.synchronizedMap(new HashMap());
      this._attributeTypeCache = Collections.synchronizedMap(new HashMap());
      this._classnameCache = Collections.synchronizedMap(new HashMap());
   }

   SchemaTypeSystemImpl typeSystemForComponent(String searchdir, QName name) {
      String searchfor = searchdir + QNameHelper.hexsafedir(name) + ".xsb";
      String tsname = null;
      if(this._resourceLoader != null) {
         tsname = crackEntry(this._resourceLoader, searchfor);
      }

      if(this._classLoader != null) {
         tsname = crackEntry(this._classLoader, searchfor);
      }

      return tsname != null?(SchemaTypeSystemImpl)this.typeSystemForName(tsname):null;
   }

   public SchemaTypeSystem typeSystemForName(String name) {
      SchemaTypeSystemImpl result;
      if(this._resourceLoader != null) {
         result = this.getTypeSystemOnClasspath(name);
         if(result != null) {
            return result;
         }
      }

      if(this._classLoader != null) {
         result = this.getTypeSystemOnClassloader(name);
         if(result != null) {
            return result;
         }
      }

      return null;
   }

   SchemaTypeSystemImpl typeSystemForClassname(String searchdir, String name) {
      String searchfor = searchdir + name.replace('.', '/') + ".xsb";
      String tsname;
      if(this._resourceLoader != null) {
         tsname = crackEntry(this._resourceLoader, searchfor);
         if(tsname != null) {
            return this.getTypeSystemOnClasspath(tsname);
         }
      }

      if(this._classLoader != null) {
         tsname = crackEntry(this._classLoader, searchfor);
         if(tsname != null) {
            return this.getTypeSystemOnClassloader(tsname);
         }
      }

      return null;
   }

   SchemaTypeSystemImpl getTypeSystemOnClasspath(String name) {
      SchemaTypeSystemImpl result = (SchemaTypeSystemImpl)this._classpathTypeSystems.get(name);
      if(result == null) {
         result = new SchemaTypeSystemImpl(this._resourceLoader, name, this);
         this._classpathTypeSystems.put(name, result);
      }

      return result;
   }

   SchemaTypeSystemImpl getTypeSystemOnClassloader(String name) {
      XBeanDebug.trace(1, "Finding type system " + name + " on classloader", 0);
      SchemaTypeSystemImpl result = (SchemaTypeSystemImpl)this._classLoaderTypeSystems.get(name);
      if(result == null) {
         XBeanDebug.trace(1, "Type system " + name + " not cached - consulting field", 0);
         result = SchemaTypeSystemImpl.forName(name, this._classLoader);
         this._classLoaderTypeSystems.put(name, result);
      }

      return result;
   }

   static String crackEntry(ResourceLoader loader, String searchfor) {
      InputStream is = loader.getResourceAsStream(searchfor);
      return is == null?null:crackPointer(is);
   }

   static String crackEntry(ClassLoader loader, String searchfor) {
      InputStream stream = loader.getResourceAsStream(searchfor);
      return stream == null?null:crackPointer(stream);
   }

   static String crackPointer(InputStream stream) {
      return SchemaTypeSystemImpl.crackPointer(stream);
   }

   public boolean isNamespaceDefined(String namespace) {
      for(int sts = 0; sts < this._searchPath.length; ++sts) {
         if(this._searchPath[sts].isNamespaceDefined(namespace)) {
            return true;
         }
      }

      SchemaTypeSystemImpl var3 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/namespace/", new QName(namespace, "xmlns"));
      return var3 != null;
   }

   public SchemaType.Ref findTypeRef(QName name) {
      Object cached = this._typeCache.get(name);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaType.Ref result = (SchemaType.Ref)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].findTypeRef(name)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/type/", name);
               if(var5 != null) {
                  result = var5.findTypeRef(name);

                  assert result != null : "Type system registered type " + QNameHelper.pretty(name) + " but does not return it";
               }
            }

            this._typeCache.put(name, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public SchemaType typeForClassname(String classname) {
      classname = classname.replace('$', '.');
      Object cached = this._classnameCache.get(classname);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaType result = (SchemaType)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].typeForClassname(classname)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForClassname("schema" + METADATA_PACKAGE_LOAD + "/javaname/", classname);
               if(var5 != null) {
                  result = var5.typeForClassname(classname);

                  assert result != null : "Type system registered type " + classname + " but does not return it";
               }
            }

            this._classnameCache.put(classname, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public SchemaType.Ref findDocumentTypeRef(QName name) {
      Object cached = this._documentCache.get(name);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaType.Ref result = (SchemaType.Ref)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].findDocumentTypeRef(name)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/element/", name);
               if(var5 != null) {
                  result = var5.findDocumentTypeRef(name);

                  assert result != null : "Type system registered element " + QNameHelper.pretty(name) + " but does not contain document type";
               }
            }

            this._documentCache.put(name, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public SchemaType.Ref findAttributeTypeRef(QName name) {
      Object cached = this._attributeTypeCache.get(name);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaType.Ref result = (SchemaType.Ref)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].findAttributeTypeRef(name)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/attribute/", name);
               if(var5 != null) {
                  result = var5.findAttributeTypeRef(name);

                  assert result != null : "Type system registered attribute " + QNameHelper.pretty(name) + " but does not contain attribute type";
               }
            }

            this._attributeTypeCache.put(name, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public SchemaGlobalElement.Ref findElementRef(QName name) {
      Object cached = this._elementCache.get(name);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaGlobalElement.Ref result = (SchemaGlobalElement.Ref)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].findElementRef(name)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/element/", name);
               if(var5 != null) {
                  result = var5.findElementRef(name);

                  assert result != null : "Type system registered element " + QNameHelper.pretty(name) + " but does not return it";
               }
            }

            this._elementCache.put(name, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public SchemaGlobalAttribute.Ref findAttributeRef(QName name) {
      Object cached = this._attributeCache.get(name);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaGlobalAttribute.Ref result = (SchemaGlobalAttribute.Ref)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].findAttributeRef(name)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/attribute/", name);
               if(var5 != null) {
                  result = var5.findAttributeRef(name);

                  assert result != null : "Type system registered attribute " + QNameHelper.pretty(name) + " but does not return it";
               }
            }

            this._attributeCache.put(name, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public SchemaModelGroup.Ref findModelGroupRef(QName name) {
      Object cached = this._modelGroupCache.get(name);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaModelGroup.Ref result = (SchemaModelGroup.Ref)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].findModelGroupRef(name)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/modelgroup/", name);
               if(var5 != null) {
                  result = var5.findModelGroupRef(name);

                  assert result != null : "Type system registered model group " + QNameHelper.pretty(name) + " but does not return it";
               }
            }

            this._modelGroupCache.put(name, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public SchemaAttributeGroup.Ref findAttributeGroupRef(QName name) {
      Object cached = this._attributeGroupCache.get(name);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaAttributeGroup.Ref result = (SchemaAttributeGroup.Ref)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].findAttributeGroupRef(name)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/attributegroup/", name);
               if(var5 != null) {
                  result = var5.findAttributeGroupRef(name);

                  assert result != null : "Type system registered attribute group " + QNameHelper.pretty(name) + " but does not return it";
               }
            }

            this._attributeGroupCache.put(name, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public SchemaIdentityConstraint.Ref findIdentityConstraintRef(QName name) {
      Object cached = this._idConstraintCache.get(name);
      if(cached == CACHED_NOT_FOUND) {
         return null;
      } else {
         SchemaIdentityConstraint.Ref result = (SchemaIdentityConstraint.Ref)cached;
         if(result == null) {
            for(int ts = 0; ts < this._searchPath.length && null == (result = this._searchPath[ts].findIdentityConstraintRef(name)); ++ts) {
               ;
            }

            if(result == null) {
               SchemaTypeSystemImpl var5 = this.typeSystemForComponent("schema" + METADATA_PACKAGE_LOAD + "/identityconstraint/", name);
               if(var5 != null) {
                  result = var5.findIdentityConstraintRef(name);

                  assert result != null : "Type system registered identity constraint " + QNameHelper.pretty(name) + " but does not return it";
               }
            }

            this._idConstraintCache.put(name, result == null?CACHED_NOT_FOUND:result);
         }

         return result;
      }
   }

   public InputStream getSourceAsStream(String sourceName) {
      InputStream result = null;
      if(!sourceName.startsWith("/")) {
         sourceName = "/" + sourceName;
      }

      if(this._resourceLoader != null) {
         result = this._resourceLoader.getResourceAsStream("schema" + METADATA_PACKAGE_LOAD + "/src" + sourceName);
      }

      return result == null && this._classLoader != null?this._classLoader.getResourceAsStream("schema" + METADATA_PACKAGE_LOAD + "/src" + sourceName):result;
   }

   static ClassLoader access$000(SchemaTypeLoaderImpl x0) {
      return x0._classLoader;
   }

   static SchemaTypeLoader[] access$400() {
      return EMPTY_SCHEMATYPELOADER_ARRAY;
   }

   static {
      if(SystemCache.get() instanceof SystemCache) {
         SystemCache.set(new SchemaTypeLoaderImpl.SchemaTypeLoaderCache((SchemaTypeLoaderImpl.NamelessClass596728041)null));
      }

   }

   static class NamelessClass596728041 {
   }

   private static class SubLoaderList {

      private List theList;
      private Map seen;


      private SubLoaderList() {
         this.theList = new ArrayList();
         this.seen = new IdentityHashMap();
      }

      private boolean add(SchemaTypeLoader loader) {
         if(this.seen.containsKey(loader)) {
            return false;
         } else {
            this.theList.add(loader);
            this.seen.put(loader, (Object)null);
            return true;
         }
      }

      private SchemaTypeLoader[] toArray() {
         return (SchemaTypeLoader[])((SchemaTypeLoader[])this.theList.toArray(SchemaTypeLoaderImpl.EMPTY_SCHEMATYPELOADER_ARRAY));
      }

      SubLoaderList(SchemaTypeLoaderImpl.NamelessClass596728041 x0) {
         this();
      }

      static boolean access$200(SchemaTypeLoaderImpl.SubLoaderList x0, SchemaTypeLoader x1) {
         return x0.add(x1);
      }

      static SchemaTypeLoader[] access$300(SchemaTypeLoaderImpl.SubLoaderList x0) {
         return x0.toArray();
      }
   }

   private static class SchemaTypeLoaderCache extends SystemCache {

      private ThreadLocal _cachedTypeSystems;
      static final boolean $assertionsDisabled = !SchemaTypeLoaderImpl.class.desiredAssertionStatus();


      private SchemaTypeLoaderCache() {
         this._cachedTypeSystems = new ThreadLocal() {
            protected Object initialValue() {
               return new ArrayList();
            }
         };
      }

      public SchemaTypeLoader getFromTypeLoaderCache(ClassLoader cl) {
         ArrayList a = (ArrayList)this._cachedTypeSystems.get();
         int candidate = -1;
         SchemaTypeLoaderImpl result = null;
         int t = 0;

         while(true) {
            if(t < a.size()) {
               label45: {
                  SchemaTypeLoaderImpl tl = (SchemaTypeLoaderImpl)((SoftReference)a.get(t)).get();
                  if(tl == null) {
                     if(!$assertionsDisabled && t <= candidate) {
                        throw new AssertionError();
                     }

                     a.remove(t--);
                  } else if(tl._classLoader == cl) {
                     if(!$assertionsDisabled && (candidate != -1 || result != null)) {
                        throw new AssertionError();
                     }

                     candidate = t;
                     result = tl;
                     break label45;
                  }

                  ++t;
                  continue;
               }
            }

            if(candidate > 0) {
               Object var7 = a.get(0);
               a.set(0, a.get(candidate));
               a.set(candidate, var7);
            }

            return result;
         }
      }

      public void addToTypeLoaderCache(SchemaTypeLoader stl, ClassLoader cl) {
         if(!$assertionsDisabled && (!(stl instanceof SchemaTypeLoaderImpl) || ((SchemaTypeLoaderImpl)stl)._classLoader != cl)) {
            throw new AssertionError();
         } else {
            ArrayList a = (ArrayList)this._cachedTypeSystems.get();
            if(a.size() > 0) {
               Object t = a.get(0);
               a.set(0, new SoftReference(stl));
               a.add(t);
            } else {
               a.add(new SoftReference(stl));
            }

         }
      }

      SchemaTypeLoaderCache(SchemaTypeLoaderImpl.NamelessClass596728041 x0) {
         this();
      }

   }
}
