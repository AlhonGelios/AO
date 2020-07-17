package org.apache.xmlbeans.impl.schema;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.BindingConfig;
import org.apache.xmlbeans.SchemaAttributeGroup;
import org.apache.xmlbeans.SchemaComponent;
import org.apache.xmlbeans.SchemaGlobalAttribute;
import org.apache.xmlbeans.SchemaGlobalElement;
import org.apache.xmlbeans.SchemaIdentityConstraint;
import org.apache.xmlbeans.SchemaModelGroup;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.SystemProperties;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.ResolverUtil;
import org.apache.xmlbeans.impl.schema.SchemaAnnotationImpl;
import org.apache.xmlbeans.impl.schema.SchemaAttributeGroupImpl;
import org.apache.xmlbeans.impl.schema.SchemaContainer;
import org.apache.xmlbeans.impl.schema.SchemaDependencies;
import org.apache.xmlbeans.impl.schema.SchemaGlobalAttributeImpl;
import org.apache.xmlbeans.impl.schema.SchemaGlobalElementImpl;
import org.apache.xmlbeans.impl.schema.SchemaIdentityConstraintImpl;
import org.apache.xmlbeans.impl.schema.SchemaModelGroupImpl;
import org.apache.xmlbeans.impl.schema.SchemaTypeImpl;
import org.apache.xmlbeans.impl.schema.SchemaTypeSystemImpl;
import org.apache.xmlbeans.impl.schema.XmlValueRef;
import org.apache.xmlbeans.impl.util.HexBin;
import org.apache.xmlbeans.impl.values.XmlStringImpl;
import org.apache.xmlbeans.impl.values.XmlValueOutOfRangeException;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;
import org.xml.sax.EntityResolver;

public class StscState {

   private String _givenStsName;
   private Collection _errorListener;
   private SchemaTypeSystemImpl _target;
   private BindingConfig _config;
   private Map _compatMap;
   private boolean _doingDownloads;
   private byte[] _digest;
   private boolean _noDigest;
   private boolean _allowPartial;
   private int _recoveredErrors;
   private SchemaTypeLoader _importingLoader;
   private Map _containers;
   private SchemaDependencies _dependencies;
   private Map _redefinedGlobalTypes;
   private Map _redefinedModelGroups;
   private Map _redefinedAttributeGroups;
   private Map _globalTypes;
   private Map _globalElements;
   private Map _globalAttributes;
   private Map _modelGroups;
   private Map _attributeGroups;
   private Map _documentTypes;
   private Map _attributeTypes;
   private Map _typesByClassname;
   private Map _misspelledNames;
   private Set _processingGroups;
   private Map _idConstraints;
   private Set _namespaces;
   private List _annotations;
   private boolean _noUpa;
   private boolean _noPvr;
   private boolean _noAnn;
   private boolean _mdefAll;
   private Set _mdefNamespaces;
   private EntityResolver _entityResolver;
   private File _schemasDir;
   public static final Object CHAMELEON_INCLUDE_URI = new Object();
   private static ThreadLocal tl_stscStack = new ThreadLocal();
   private static final XmlValueRef XMLSTR_PRESERVE = buildString("preserve");
   private static final XmlValueRef XMLSTR_REPLACE = buildString("preserve");
   private static final XmlValueRef XMLSTR_COLLAPSE = buildString("preserve");
   static final SchemaType[] EMPTY_ST_ARRAY = new SchemaType[0];
   static final SchemaType.Ref[] EMPTY_STREF_ARRAY = new SchemaType.Ref[0];
   private static final XmlValueRef[] FACETS_NONE = new XmlValueRef[]{null, null, null, null, null, null, null, null, null, null, null, null};
   private static final boolean[] FIXED_FACETS_NONE = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
   private static final XmlValueRef[] FACETS_WS_COLLAPSE = new XmlValueRef[]{null, null, null, null, null, null, null, null, null, build_wsstring(3), null, null};
   private static final boolean[] FIXED_FACETS_WS = new boolean[]{false, false, false, false, false, false, false, false, false, true, false, false};
   static final XmlValueRef[] FACETS_UNION = FACETS_NONE;
   static final boolean[] FIXED_FACETS_UNION = FIXED_FACETS_NONE;
   static final XmlValueRef[] FACETS_LIST = FACETS_WS_COLLAPSE;
   static final boolean[] FIXED_FACETS_LIST = FIXED_FACETS_WS;
   private static final String PROJECT_URL_PREFIX = "project://local";
   Map _sourceForUri;
   URI _baseURI;
   SchemaTypeLoader _s4sloader;


   private static Set buildDefaultMdefNamespaces() {
      return new HashSet(Arrays.asList(new String[]{"http://www.openuri.org/2002/04/soap/conversation/"}));
   }

   private StscState() {
      this._digest = null;
      this._noDigest = false;
      this._allowPartial = false;
      this._recoveredErrors = 0;
      this._containers = new LinkedHashMap();
      this._redefinedGlobalTypes = new LinkedHashMap();
      this._redefinedModelGroups = new LinkedHashMap();
      this._redefinedAttributeGroups = new LinkedHashMap();
      this._globalTypes = new LinkedHashMap();
      this._globalElements = new LinkedHashMap();
      this._globalAttributes = new LinkedHashMap();
      this._modelGroups = new LinkedHashMap();
      this._attributeGroups = new LinkedHashMap();
      this._documentTypes = new LinkedHashMap();
      this._attributeTypes = new LinkedHashMap();
      this._typesByClassname = new LinkedHashMap();
      this._misspelledNames = new HashMap();
      this._processingGroups = new LinkedHashSet();
      this._idConstraints = new LinkedHashMap();
      this._namespaces = new HashSet();
      this._annotations = new ArrayList();
      this._mdefNamespaces = buildDefaultMdefNamespaces();
      this._sourceForUri = new HashMap();
      this._baseURI = URI.create("project://local/");
      this._s4sloader = XmlBeans.typeLoaderForClassLoader(SchemaDocument.class.getClassLoader());
   }

   public void initFromTypeSystem(SchemaTypeSystemImpl system, Set newNamespaces) {
      SchemaContainer[] containers = system.containers();

      for(int i = 0; i < containers.length; ++i) {
         if(!newNamespaces.contains(containers[i].getNamespace())) {
            this.addContainer(containers[i]);
         }
      }

   }

   void addNewContainer(String namespace) {
      if(!this._containers.containsKey(namespace)) {
         SchemaContainer container = new SchemaContainer(namespace);
         container.setTypeSystem(this.sts());
         this.addNamespace(namespace);
         this._containers.put(namespace, container);
      }
   }

   private void addContainer(SchemaContainer container) {
      this._containers.put(container.getNamespace(), container);
      List redefModelGroups = container.redefinedModelGroups();

      for(int redefAttrGroups = 0; redefAttrGroups < redefModelGroups.size(); ++redefAttrGroups) {
         QName redefTypes = ((SchemaModelGroup)redefModelGroups.get(redefAttrGroups)).getName();
         this._redefinedModelGroups.put(redefTypes, redefModelGroups.get(redefAttrGroups));
      }

      List var15 = container.redefinedAttributeGroups();

      for(int var16 = 0; var16 < var15.size(); ++var16) {
         QName globalElems = ((SchemaAttributeGroup)var15.get(var16)).getName();
         this._redefinedAttributeGroups.put(globalElems, var15.get(var16));
      }

      List var17 = container.redefinedGlobalTypes();

      for(int var18 = 0; var18 < var17.size(); ++var18) {
         QName globalAtts = ((SchemaType)var17.get(var18)).getName();
         this._redefinedGlobalTypes.put(globalAtts, var17.get(var18));
      }

      List var19 = container.globalElements();

      for(int var20 = 0; var20 < var19.size(); ++var20) {
         QName modelGroups = ((SchemaGlobalElement)var19.get(var20)).getName();
         this._globalElements.put(modelGroups, var19.get(var20));
      }

      List var21 = container.globalAttributes();

      for(int var22 = 0; var22 < var21.size(); ++var22) {
         QName attrGroups = ((SchemaGlobalAttribute)var21.get(var22)).getName();
         this._globalAttributes.put(attrGroups, var21.get(var22));
      }

      List var23 = container.modelGroups();

      for(int var24 = 0; var24 < var23.size(); ++var24) {
         QName globalTypes = ((SchemaModelGroup)var23.get(var24)).getName();
         this._modelGroups.put(globalTypes, var23.get(var24));
      }

      List var25 = container.attributeGroups();

      for(int var26 = 0; var26 < var25.size(); ++var26) {
         QName documentTypes = ((SchemaAttributeGroup)var25.get(var26)).getName();
         this._attributeGroups.put(documentTypes, var25.get(var26));
      }

      List var27 = container.globalTypes();

      for(int var28 = 0; var28 < var27.size(); ++var28) {
         SchemaType attributeTypes = (SchemaType)var27.get(var28);
         QName identityConstraints = attributeTypes.getName();
         this._globalTypes.put(identityConstraints, attributeTypes);
         if(attributeTypes.getFullJavaName() != null) {
            this.addClassname(attributeTypes.getFullJavaName(), attributeTypes);
         }
      }

      List var29 = container.documentTypes();

      for(int var30 = 0; var30 < var29.size(); ++var30) {
         SchemaType var32 = (SchemaType)var29.get(var30);
         QName i = var32.getProperties()[0].getName();
         this._documentTypes.put(i, var32);
         if(var32.getFullJavaName() != null) {
            this.addClassname(var32.getFullJavaName(), var32);
         }
      }

      List var31 = container.attributeTypes();

      QName name;
      for(int var33 = 0; var33 < var31.size(); ++var33) {
         SchemaType var35 = (SchemaType)var31.get(var33);
         name = var35.getProperties()[0].getName();
         this._attributeTypes.put(name, var35);
         if(var35.getFullJavaName() != null) {
            this.addClassname(var35.getFullJavaName(), var35);
         }
      }

      List var34 = container.identityConstraints();

      for(int var36 = 0; var36 < var34.size(); ++var36) {
         name = ((SchemaIdentityConstraint)var34.get(var36)).getName();
         this._idConstraints.put(name, var34.get(var36));
      }

      this._annotations.addAll(container.annotations());
      this._namespaces.add(container.getNamespace());
      container.unsetImmutable();
   }

   SchemaContainer getContainer(String namespace) {
      return (SchemaContainer)this._containers.get(namespace);
   }

   Map getContainerMap() {
      return Collections.unmodifiableMap(this._containers);
   }

   void registerDependency(String sourceNs, String targetNs) {
      this._dependencies.registerDependency(sourceNs, targetNs);
   }

   void registerContribution(String ns, String fileUrl) {
      this._dependencies.registerContribution(ns, fileUrl);
   }

   SchemaDependencies getDependencies() {
      return this._dependencies;
   }

   void setDependencies(SchemaDependencies deps) {
      this._dependencies = deps;
   }

   boolean isFileProcessed(String url) {
      return this._dependencies.isFileRepresented(url);
   }

   public void setImportingTypeLoader(SchemaTypeLoader loader) {
      this._importingLoader = loader;
   }

   public void setErrorListener(Collection errorListener) {
      this._errorListener = errorListener;
   }

   public void error(String message, int code, XmlObject loc) {
      addError(this._errorListener, message, code, loc);
   }

   public void error(String code, Object[] args, XmlObject loc) {
      addError(this._errorListener, code, args, loc);
   }

   public void recover(String code, Object[] args, XmlObject loc) {
      addError(this._errorListener, code, args, loc);
      ++this._recoveredErrors;
   }

   public void warning(String message, int code, XmlObject loc) {
      addWarning(this._errorListener, message, code, loc);
   }

   public void warning(String code, Object[] args, XmlObject loc) {
      if(code != "reserved-type-name" || loc.documentProperties().getSourceName() == null || loc.documentProperties().getSourceName().indexOf("XMLSchema.xsd") <= 0) {
         addWarning(this._errorListener, code, args, loc);
      }
   }

   public void info(String message) {
      addInfo(this._errorListener, message);
   }

   public void info(String code, Object[] args) {
      addInfo(this._errorListener, code, args);
   }

   public static void addError(Collection errorListener, String message, int code, XmlObject location) {
      XmlError err = XmlError.forObject(message, 0, location);
      errorListener.add(err);
   }

   public static void addError(Collection errorListener, String code, Object[] args, XmlObject location) {
      XmlError err = XmlError.forObject(code, args, 0, location);
      errorListener.add(err);
   }

   public static void addError(Collection errorListener, String code, Object[] args, File location) {
      XmlError err = XmlError.forLocation(code, args, 0, location.toURI().toString(), 0, 0, 0);
      errorListener.add(err);
   }

   public static void addError(Collection errorListener, String code, Object[] args, URL location) {
      XmlError err = XmlError.forLocation(code, args, 0, location.toString(), 0, 0, 0);
      errorListener.add(err);
   }

   public static void addWarning(Collection errorListener, String message, int code, XmlObject location) {
      XmlError err = XmlError.forObject(message, 1, location);
      errorListener.add(err);
   }

   public static void addWarning(Collection errorListener, String code, Object[] args, XmlObject location) {
      XmlError err = XmlError.forObject(code, args, 1, location);
      errorListener.add(err);
   }

   public static void addInfo(Collection errorListener, String message) {
      XmlError err = XmlError.forMessage(message, 2);
      errorListener.add(err);
   }

   public static void addInfo(Collection errorListener, String code, Object[] args) {
      XmlError err = XmlError.forMessage(code, args, 2);
      errorListener.add(err);
   }

   public void setGivenTypeSystemName(String name) {
      this._givenStsName = name;
   }

   public void setTargetSchemaTypeSystem(SchemaTypeSystemImpl target) {
      this._target = target;
   }

   public void addSchemaDigest(byte[] digest) {
      if(!this._noDigest) {
         if(digest == null) {
            this._noDigest = true;
            this._digest = null;
         } else {
            if(this._digest == null) {
               this._digest = new byte[16];
            }

            int len = this._digest.length;
            if(digest.length < len) {
               len = digest.length;
            }

            for(int i = 0; i < len; ++i) {
               this._digest[i] ^= digest[i];
            }

         }
      }
   }

   public SchemaTypeSystemImpl sts() {
      if(this._target != null) {
         return this._target;
      } else {
         String name = this._givenStsName;
         if(name == null && this._digest != null) {
            name = "s" + new String(HexBin.encode(this._digest));
         }

         this._target = new SchemaTypeSystemImpl(name);
         return this._target;
      }
   }

   public boolean shouldDownloadURI(String uriString) {
      if(this._doingDownloads) {
         return true;
      } else if(uriString == null) {
         return false;
      } else {
         try {
            URI e = new URI(uriString);
            if(!e.getScheme().equalsIgnoreCase("jar") && !e.getScheme().equalsIgnoreCase("zip")) {
               return e.getScheme().equalsIgnoreCase("file");
            } else {
               String s = e.getSchemeSpecificPart();
               int i = s.lastIndexOf(33);
               return this.shouldDownloadURI(i > 0?s.substring(0, i):s);
            }
         } catch (Exception var5) {
            return false;
         }
      }
   }

   public void setOptions(XmlOptions options) {
      if(options != null) {
         this._allowPartial = options.hasOption("COMPILE_PARTIAL_TYPESYSTEM");
         this._compatMap = (Map)options.get("COMPILE_SUBSTITUTE_NAMES");
         this._noUpa = options.hasOption("COMPILE_NO_UPA_RULE")?true:!"true".equals(SystemProperties.getProperty("xmlbean.uniqueparticleattribution", "true"));
         this._noPvr = options.hasOption("COMPILE_NO_PVR_RULE")?true:!"true".equals(SystemProperties.getProperty("xmlbean.particlerestriction", "true"));
         this._noAnn = options.hasOption("COMPILE_NO_ANNOTATIONS")?true:!"true".equals(SystemProperties.getProperty("xmlbean.schemaannotations", "true"));
         this._doingDownloads = options.hasOption("COMPILE_DOWNLOAD_URLS")?true:"true".equals(SystemProperties.getProperty("xmlbean.downloadurls", "false"));
         this._entityResolver = (EntityResolver)options.get("ENTITY_RESOLVER");
         if(this._entityResolver == null) {
            this._entityResolver = ResolverUtil.getGlobalEntityResolver();
         }

         if(this._entityResolver != null) {
            this._doingDownloads = true;
         }

         if(options.hasOption("COMPILE_MDEF_NAMESPACES")) {
            this._mdefNamespaces.addAll((Collection)options.get("COMPILE_MDEF_NAMESPACES"));
            String local = "##local";
            String any = "##any";
            if(this._mdefNamespaces.contains(local)) {
               this._mdefNamespaces.remove(local);
               this._mdefNamespaces.add("");
            }

            if(this._mdefNamespaces.contains(any)) {
               this._mdefNamespaces.remove(any);
               this._mdefAll = true;
            }
         }

      }
   }

   public EntityResolver getEntityResolver() {
      return this._entityResolver;
   }

   public boolean noUpa() {
      return this._noUpa;
   }

   public boolean noPvr() {
      return this._noPvr;
   }

   public boolean noAnn() {
      return this._noAnn;
   }

   public boolean allowPartial() {
      return this._allowPartial;
   }

   public int getRecovered() {
      return this._recoveredErrors;
   }

   private QName compatName(QName name, String chameleonNamespace) {
      if(name.getNamespaceURI().length() == 0 && chameleonNamespace != null && chameleonNamespace.length() > 0) {
         name = new QName(chameleonNamespace, name.getLocalPart());
      }

      if(this._compatMap == null) {
         return name;
      } else {
         QName subst = (QName)this._compatMap.get(name);
         return subst == null?name:subst;
      }
   }

   public void setBindingConfig(BindingConfig config) throws IllegalArgumentException {
      this._config = config;
   }

   public BindingConfig getBindingConfig() throws IllegalArgumentException {
      return this._config;
   }

   public String getPackageOverride(String namespace) {
      return this._config == null?null:this._config.lookupPackageForNamespace(namespace);
   }

   public String getJavaPrefix(String namespace) {
      return this._config == null?null:this._config.lookupPrefixForNamespace(namespace);
   }

   public String getJavaSuffix(String namespace) {
      return this._config == null?null:this._config.lookupSuffixForNamespace(namespace);
   }

   public String getJavaname(QName qname, int kind) {
      return this._config == null?null:this._config.lookupJavanameForQName(qname, kind);
   }

   private static String crunchName(QName name) {
      return name.getLocalPart().toLowerCase();
   }

   void addSpelling(QName name, SchemaComponent comp) {
      this._misspelledNames.put(crunchName(name), comp);
   }

   SchemaComponent findSpelling(QName name) {
      return (SchemaComponent)this._misspelledNames.get(crunchName(name));
   }

   void addNamespace(String targetNamespace) {
      this._namespaces.add(targetNamespace);
   }

   String[] getNamespaces() {
      return (String[])((String[])this._namespaces.toArray(new String[this._namespaces.size()]));
   }

   boolean linkerDefinesNamespace(String namespace) {
      return this._importingLoader.isNamespaceDefined(namespace);
   }

   SchemaTypeImpl findGlobalType(QName name, String chameleonNamespace, String sourceNamespace) {
      name = this.compatName(name, chameleonNamespace);
      SchemaTypeImpl result = (SchemaTypeImpl)this._globalTypes.get(name);
      boolean foundOnLoader = false;
      if(result == null) {
         result = (SchemaTypeImpl)this._importingLoader.findType(name);
         foundOnLoader = result != null;
      }

      if(!foundOnLoader && sourceNamespace != null) {
         this.registerDependency(sourceNamespace, name.getNamespaceURI());
      }

      return result;
   }

   SchemaTypeImpl findRedefinedGlobalType(QName name, String chameleonNamespace, SchemaTypeImpl redefinedBy) {
      QName redefinedName = redefinedBy.getName();
      name = this.compatName(name, chameleonNamespace);
      if(name.equals(redefinedName)) {
         return (SchemaTypeImpl)this._redefinedGlobalTypes.get(redefinedBy);
      } else {
         SchemaTypeImpl result = (SchemaTypeImpl)this._globalTypes.get(name);
         if(result == null) {
            result = (SchemaTypeImpl)this._importingLoader.findType(name);
         }

         return result;
      }
   }

   void addGlobalType(SchemaTypeImpl type, SchemaTypeImpl redefined) {
      if(type != null) {
         QName name = type.getName();
         SchemaContainer container = this.getContainer(name.getNamespaceURI());

         assert container != null && container == type.getContainer();

         if(redefined != null) {
            if(this._redefinedGlobalTypes.containsKey(redefined)) {
               if(!this.ignoreMdef(name)) {
                  if(this._mdefAll) {
                     this.warning("sch-props-correct.2", new Object[]{"global type", QNameHelper.pretty(name), ((SchemaType)this._redefinedGlobalTypes.get(redefined)).getSourceName()}, type.getParseObject());
                  } else {
                     this.error("sch-props-correct.2", new Object[]{"global type", QNameHelper.pretty(name), ((SchemaType)this._redefinedGlobalTypes.get(redefined)).getSourceName()}, type.getParseObject());
                  }
               }
            } else {
               this._redefinedGlobalTypes.put(redefined, type);
               container.addRedefinedType(type.getRef());
            }
         } else if(this._globalTypes.containsKey(name)) {
            if(!this.ignoreMdef(name)) {
               if(this._mdefAll) {
                  this.warning("sch-props-correct.2", new Object[]{"global type", QNameHelper.pretty(name), ((SchemaType)this._globalTypes.get(name)).getSourceName()}, type.getParseObject());
               } else {
                  this.error("sch-props-correct.2", new Object[]{"global type", QNameHelper.pretty(name), ((SchemaType)this._globalTypes.get(name)).getSourceName()}, type.getParseObject());
               }
            }
         } else {
            this._globalTypes.put(name, type);
            container.addGlobalType(type.getRef());
            this.addSpelling(name, type);
         }
      }

   }

   private boolean ignoreMdef(QName name) {
      return this._mdefNamespaces.contains(name.getNamespaceURI());
   }

   SchemaType[] globalTypes() {
      return (SchemaType[])((SchemaType[])this._globalTypes.values().toArray(new SchemaType[this._globalTypes.size()]));
   }

   SchemaType[] redefinedGlobalTypes() {
      return (SchemaType[])((SchemaType[])this._redefinedGlobalTypes.values().toArray(new SchemaType[this._redefinedGlobalTypes.size()]));
   }

   SchemaTypeImpl findDocumentType(QName name, String chameleonNamespace, String sourceNamespace) {
      name = this.compatName(name, chameleonNamespace);
      SchemaTypeImpl result = (SchemaTypeImpl)this._documentTypes.get(name);
      boolean foundOnLoader = false;
      if(result == null) {
         result = (SchemaTypeImpl)this._importingLoader.findDocumentType(name);
         foundOnLoader = result != null;
      }

      if(!foundOnLoader && sourceNamespace != null) {
         this.registerDependency(sourceNamespace, name.getNamespaceURI());
      }

      return result;
   }

   void addDocumentType(SchemaTypeImpl type, QName name) {
      if(this._documentTypes.containsKey(name)) {
         if(!this.ignoreMdef(name)) {
            if(this._mdefAll) {
               this.warning("sch-props-correct.2", new Object[]{"global element", QNameHelper.pretty(name), ((SchemaComponent)this._documentTypes.get(name)).getSourceName()}, type.getParseObject());
            } else {
               this.error("sch-props-correct.2", new Object[]{"global element", QNameHelper.pretty(name), ((SchemaComponent)this._documentTypes.get(name)).getSourceName()}, type.getParseObject());
            }
         }
      } else {
         this._documentTypes.put(name, type);
         SchemaContainer container = this.getContainer(name.getNamespaceURI());

         assert container != null && container == type.getContainer();

         container.addDocumentType(type.getRef());
      }

   }

   SchemaType[] documentTypes() {
      return (SchemaType[])((SchemaType[])this._documentTypes.values().toArray(new SchemaType[this._documentTypes.size()]));
   }

   SchemaTypeImpl findAttributeType(QName name, String chameleonNamespace, String sourceNamespace) {
      name = this.compatName(name, chameleonNamespace);
      SchemaTypeImpl result = (SchemaTypeImpl)this._attributeTypes.get(name);
      boolean foundOnLoader = false;
      if(result == null) {
         result = (SchemaTypeImpl)this._importingLoader.findAttributeType(name);
         foundOnLoader = result != null;
      }

      if(!foundOnLoader && sourceNamespace != null) {
         this.registerDependency(sourceNamespace, name.getNamespaceURI());
      }

      return result;
   }

   void addAttributeType(SchemaTypeImpl type, QName name) {
      if(this._attributeTypes.containsKey(name)) {
         if(!this.ignoreMdef(name)) {
            if(this._mdefAll) {
               this.warning("sch-props-correct.2", new Object[]{"global attribute", QNameHelper.pretty(name), ((SchemaComponent)this._attributeTypes.get(name)).getSourceName()}, type.getParseObject());
            } else {
               this.error("sch-props-correct.2", new Object[]{"global attribute", QNameHelper.pretty(name), ((SchemaComponent)this._attributeTypes.get(name)).getSourceName()}, type.getParseObject());
            }
         }
      } else {
         this._attributeTypes.put(name, type);
         SchemaContainer container = this.getContainer(name.getNamespaceURI());

         assert container != null && container == type.getContainer();

         container.addAttributeType(type.getRef());
      }

   }

   SchemaType[] attributeTypes() {
      return (SchemaType[])((SchemaType[])this._attributeTypes.values().toArray(new SchemaType[this._attributeTypes.size()]));
   }

   SchemaGlobalAttributeImpl findGlobalAttribute(QName name, String chameleonNamespace, String sourceNamespace) {
      name = this.compatName(name, chameleonNamespace);
      SchemaGlobalAttributeImpl result = (SchemaGlobalAttributeImpl)this._globalAttributes.get(name);
      boolean foundOnLoader = false;
      if(result == null) {
         result = (SchemaGlobalAttributeImpl)this._importingLoader.findAttribute(name);
         foundOnLoader = result != null;
      }

      if(!foundOnLoader && sourceNamespace != null) {
         this.registerDependency(sourceNamespace, name.getNamespaceURI());
      }

      return result;
   }

   void addGlobalAttribute(SchemaGlobalAttributeImpl attribute) {
      if(attribute != null) {
         QName name = attribute.getName();
         this._globalAttributes.put(name, attribute);
         this.addSpelling(name, attribute);
         SchemaContainer container = this.getContainer(name.getNamespaceURI());

         assert container != null && container == attribute.getContainer();

         container.addGlobalAttribute(attribute.getRef());
      }

   }

   SchemaGlobalAttribute[] globalAttributes() {
      return (SchemaGlobalAttribute[])((SchemaGlobalAttribute[])this._globalAttributes.values().toArray(new SchemaGlobalAttribute[this._globalAttributes.size()]));
   }

   SchemaGlobalElementImpl findGlobalElement(QName name, String chameleonNamespace, String sourceNamespace) {
      name = this.compatName(name, chameleonNamespace);
      SchemaGlobalElementImpl result = (SchemaGlobalElementImpl)this._globalElements.get(name);
      boolean foundOnLoader = false;
      if(result == null) {
         result = (SchemaGlobalElementImpl)this._importingLoader.findElement(name);
         foundOnLoader = result != null;
      }

      if(!foundOnLoader && sourceNamespace != null) {
         this.registerDependency(sourceNamespace, name.getNamespaceURI());
      }

      return result;
   }

   void addGlobalElement(SchemaGlobalElementImpl element) {
      if(element != null) {
         QName name = element.getName();
         this._globalElements.put(name, element);
         SchemaContainer container = this.getContainer(name.getNamespaceURI());

         assert container != null && container == element.getContainer();

         container.addGlobalElement(element.getRef());
         this.addSpelling(name, element);
      }

   }

   SchemaGlobalElement[] globalElements() {
      return (SchemaGlobalElement[])((SchemaGlobalElement[])this._globalElements.values().toArray(new SchemaGlobalElement[this._globalElements.size()]));
   }

   SchemaAttributeGroupImpl findAttributeGroup(QName name, String chameleonNamespace, String sourceNamespace) {
      name = this.compatName(name, chameleonNamespace);
      SchemaAttributeGroupImpl result = (SchemaAttributeGroupImpl)this._attributeGroups.get(name);
      boolean foundOnLoader = false;
      if(result == null) {
         result = (SchemaAttributeGroupImpl)this._importingLoader.findAttributeGroup(name);
         foundOnLoader = result != null;
      }

      if(!foundOnLoader && sourceNamespace != null) {
         this.registerDependency(sourceNamespace, name.getNamespaceURI());
      }

      return result;
   }

   SchemaAttributeGroupImpl findRedefinedAttributeGroup(QName name, String chameleonNamespace, SchemaAttributeGroupImpl redefinedBy) {
      QName redefinitionFor = redefinedBy.getName();
      name = this.compatName(name, chameleonNamespace);
      if(name.equals(redefinitionFor)) {
         return (SchemaAttributeGroupImpl)this._redefinedAttributeGroups.get(redefinedBy);
      } else {
         SchemaAttributeGroupImpl result = (SchemaAttributeGroupImpl)this._attributeGroups.get(name);
         if(result == null) {
            result = (SchemaAttributeGroupImpl)this._importingLoader.findAttributeGroup(name);
         }

         return result;
      }
   }

   void addAttributeGroup(SchemaAttributeGroupImpl attributeGroup, SchemaAttributeGroupImpl redefined) {
      if(attributeGroup != null) {
         QName name = attributeGroup.getName();
         SchemaContainer container = this.getContainer(name.getNamespaceURI());

         assert container != null && container == attributeGroup.getContainer();

         if(redefined != null) {
            if(this._redefinedAttributeGroups.containsKey(redefined)) {
               if(!this.ignoreMdef(name)) {
                  if(this._mdefAll) {
                     this.warning("sch-props-correct.2", new Object[]{"attribute group", QNameHelper.pretty(name), ((SchemaComponent)this._redefinedAttributeGroups.get(redefined)).getSourceName()}, attributeGroup.getParseObject());
                  } else {
                     this.error("sch-props-correct.2", new Object[]{"attribute group", QNameHelper.pretty(name), ((SchemaComponent)this._redefinedAttributeGroups.get(redefined)).getSourceName()}, attributeGroup.getParseObject());
                  }
               }
            } else {
               this._redefinedAttributeGroups.put(redefined, attributeGroup);
               container.addRedefinedAttributeGroup(attributeGroup.getRef());
            }
         } else if(this._attributeGroups.containsKey(name)) {
            if(!this.ignoreMdef(name)) {
               if(this._mdefAll) {
                  this.warning("sch-props-correct.2", new Object[]{"attribute group", QNameHelper.pretty(name), ((SchemaComponent)this._attributeGroups.get(name)).getSourceName()}, attributeGroup.getParseObject());
               } else {
                  this.error("sch-props-correct.2", new Object[]{"attribute group", QNameHelper.pretty(name), ((SchemaComponent)this._attributeGroups.get(name)).getSourceName()}, attributeGroup.getParseObject());
               }
            }
         } else {
            this._attributeGroups.put(attributeGroup.getName(), attributeGroup);
            this.addSpelling(attributeGroup.getName(), attributeGroup);
            container.addAttributeGroup(attributeGroup.getRef());
         }
      }

   }

   SchemaAttributeGroup[] attributeGroups() {
      return (SchemaAttributeGroup[])((SchemaAttributeGroup[])this._attributeGroups.values().toArray(new SchemaAttributeGroup[this._attributeGroups.size()]));
   }

   SchemaAttributeGroup[] redefinedAttributeGroups() {
      return (SchemaAttributeGroup[])((SchemaAttributeGroup[])this._redefinedAttributeGroups.values().toArray(new SchemaAttributeGroup[this._redefinedAttributeGroups.size()]));
   }

   SchemaModelGroupImpl findModelGroup(QName name, String chameleonNamespace, String sourceNamespace) {
      name = this.compatName(name, chameleonNamespace);
      SchemaModelGroupImpl result = (SchemaModelGroupImpl)this._modelGroups.get(name);
      boolean foundOnLoader = false;
      if(result == null) {
         result = (SchemaModelGroupImpl)this._importingLoader.findModelGroup(name);
         foundOnLoader = result != null;
      }

      if(!foundOnLoader && sourceNamespace != null) {
         this.registerDependency(sourceNamespace, name.getNamespaceURI());
      }

      return result;
   }

   SchemaModelGroupImpl findRedefinedModelGroup(QName name, String chameleonNamespace, SchemaModelGroupImpl redefinedBy) {
      QName redefinitionFor = redefinedBy.getName();
      name = this.compatName(name, chameleonNamespace);
      if(name.equals(redefinitionFor)) {
         return (SchemaModelGroupImpl)this._redefinedModelGroups.get(redefinedBy);
      } else {
         SchemaModelGroupImpl result = (SchemaModelGroupImpl)this._modelGroups.get(name);
         if(result == null) {
            result = (SchemaModelGroupImpl)this._importingLoader.findModelGroup(name);
         }

         return result;
      }
   }

   void addModelGroup(SchemaModelGroupImpl modelGroup, SchemaModelGroupImpl redefined) {
      if(modelGroup != null) {
         QName name = modelGroup.getName();
         SchemaContainer container = this.getContainer(name.getNamespaceURI());

         assert container != null && container == modelGroup.getContainer();

         if(redefined != null) {
            if(this._redefinedModelGroups.containsKey(redefined)) {
               if(!this.ignoreMdef(name)) {
                  if(this._mdefAll) {
                     this.warning("sch-props-correct.2", new Object[]{"model group", QNameHelper.pretty(name), ((SchemaComponent)this._redefinedModelGroups.get(redefined)).getSourceName()}, modelGroup.getParseObject());
                  } else {
                     this.error("sch-props-correct.2", new Object[]{"model group", QNameHelper.pretty(name), ((SchemaComponent)this._redefinedModelGroups.get(redefined)).getSourceName()}, modelGroup.getParseObject());
                  }
               }
            } else {
               this._redefinedModelGroups.put(redefined, modelGroup);
               container.addRedefinedModelGroup(modelGroup.getRef());
            }
         } else if(this._modelGroups.containsKey(name)) {
            if(!this.ignoreMdef(name)) {
               if(this._mdefAll) {
                  this.warning("sch-props-correct.2", new Object[]{"model group", QNameHelper.pretty(name), ((SchemaComponent)this._modelGroups.get(name)).getSourceName()}, modelGroup.getParseObject());
               } else {
                  this.error("sch-props-correct.2", new Object[]{"model group", QNameHelper.pretty(name), ((SchemaComponent)this._modelGroups.get(name)).getSourceName()}, modelGroup.getParseObject());
               }
            }
         } else {
            this._modelGroups.put(modelGroup.getName(), modelGroup);
            this.addSpelling(modelGroup.getName(), modelGroup);
            container.addModelGroup(modelGroup.getRef());
         }
      }

   }

   SchemaModelGroup[] modelGroups() {
      return (SchemaModelGroup[])((SchemaModelGroup[])this._modelGroups.values().toArray(new SchemaModelGroup[this._modelGroups.size()]));
   }

   SchemaModelGroup[] redefinedModelGroups() {
      return (SchemaModelGroup[])((SchemaModelGroup[])this._redefinedModelGroups.values().toArray(new SchemaModelGroup[this._redefinedModelGroups.size()]));
   }

   SchemaIdentityConstraintImpl findIdConstraint(QName name, String chameleonNamespace, String sourceNamespace) {
      name = this.compatName(name, chameleonNamespace);
      if(sourceNamespace != null) {
         this.registerDependency(sourceNamespace, name.getNamespaceURI());
      }

      return (SchemaIdentityConstraintImpl)this._idConstraints.get(name);
   }

   void addIdConstraint(SchemaIdentityConstraintImpl idc) {
      if(idc != null) {
         QName name = idc.getName();
         SchemaContainer container = this.getContainer(name.getNamespaceURI());

         assert container != null && container == idc.getContainer();

         if(this._idConstraints.containsKey(name)) {
            if(!this.ignoreMdef(name)) {
               this.warning("sch-props-correct.2", new Object[]{"identity constraint", QNameHelper.pretty(name), ((SchemaComponent)this._idConstraints.get(name)).getSourceName()}, idc.getParseObject());
            }
         } else {
            this._idConstraints.put(name, idc);
            this.addSpelling(idc.getName(), idc);
            container.addIdentityConstraint(idc.getRef());
         }
      }

   }

   SchemaIdentityConstraintImpl[] idConstraints() {
      return (SchemaIdentityConstraintImpl[])((SchemaIdentityConstraintImpl[])this._idConstraints.values().toArray(new SchemaIdentityConstraintImpl[this._idConstraints.size()]));
   }

   void addAnnotation(SchemaAnnotationImpl ann, String targetNamespace) {
      if(ann != null) {
         SchemaContainer container = this.getContainer(targetNamespace);

         assert container != null && container == ann.getContainer();

         this._annotations.add(ann);
         container.addAnnotation(ann);
      }

   }

   List annotations() {
      return this._annotations;
   }

   boolean isProcessing(Object obj) {
      return this._processingGroups.contains(obj);
   }

   void startProcessing(Object obj) {
      assert !this._processingGroups.contains(obj);

      this._processingGroups.add(obj);
   }

   void finishProcessing(Object obj) {
      assert this._processingGroups.contains(obj);

      this._processingGroups.remove(obj);
   }

   Object[] getCurrentProcessing() {
      return this._processingGroups.toArray();
   }

   Map typesByClassname() {
      return Collections.unmodifiableMap(this._typesByClassname);
   }

   void addClassname(String classname, SchemaType type) {
      this._typesByClassname.put(classname, type);
   }

   public static StscState start() {
      StscState.StscStack stscStack = (StscState.StscStack)tl_stscStack.get();
      if(stscStack == null) {
         stscStack = new StscState.StscStack((StscState.NamelessClass103572404)null);
         tl_stscStack.set(stscStack);
      }

      return stscStack.push();
   }

   public static StscState get() {
      return ((StscState.StscStack)tl_stscStack.get()).current;
   }

   public static void end() {
      StscState.StscStack stscStack = (StscState.StscStack)tl_stscStack.get();
      stscStack.pop();
      if(stscStack.stack.size() == 0) {
         tl_stscStack.set((Object)null);
      }

   }

   static XmlValueRef build_wsstring(int wsr) {
      switch(wsr) {
      case 1:
         return XMLSTR_PRESERVE;
      case 2:
         return XMLSTR_REPLACE;
      case 3:
         return XMLSTR_COLLAPSE;
      default:
         return null;
      }
   }

   static XmlValueRef buildString(String str) {
      if(str == null) {
         return null;
      } else {
         try {
            XmlStringImpl e = new XmlStringImpl();
            e.set(str);
            e.setImmutable();
            return new XmlValueRef(e);
         } catch (XmlValueOutOfRangeException var2) {
            return null;
         }
      }
   }

   public void notFoundError(QName itemName, int code, XmlObject loc, boolean recovered) {
      String expectedName = QNameHelper.pretty(itemName);
      String found = null;
      String foundName = null;
      String sourceName = null;
      if(recovered) {
         ++this._recoveredErrors;
      }

      String expected;
      switch(code) {
      case 0:
         expected = "type";
         break;
      case 1:
         expected = "element";
         break;
      case 2:
      default:
         assert false;

         expected = "definition";
         break;
      case 3:
         expected = "attribute";
         break;
      case 4:
         expected = "attribute group";
         break;
      case 5:
         expected = "identity constraint";
         break;
      case 6:
         expected = "model group";
      }

      SchemaComponent foundComponent = this.findSpelling(itemName);
      if(foundComponent != null) {
         QName name = foundComponent.getName();
         if(name != null) {
            switch(foundComponent.getComponentType()) {
            case 0:
               found = "type";
               sourceName = ((SchemaType)foundComponent).getSourceName();
               break;
            case 1:
               found = "element";
               sourceName = ((SchemaGlobalElement)foundComponent).getSourceName();
            case 2:
            case 5:
            default:
               break;
            case 3:
               found = "attribute";
               sourceName = ((SchemaGlobalAttribute)foundComponent).getSourceName();
               break;
            case 4:
               found = "attribute group";
               break;
            case 6:
               found = "model group";
            }

            if(sourceName != null) {
               sourceName = sourceName.substring(sourceName.lastIndexOf(47) + 1);
            }

            if(!name.equals(itemName)) {
               foundName = QNameHelper.pretty(name);
            }
         }
      }

      if(found == null) {
         this.error("src-resolve", new Object[]{expected, expectedName}, loc);
      } else {
         this.error("src-resolve.a", new Object[]{expected, expectedName, found, foundName == null?new Integer(0):new Integer(1), foundName, sourceName == null?new Integer(0):new Integer(1), sourceName}, loc);
      }

   }

   public String sourceNameForUri(String uri) {
      return (String)this._sourceForUri.get(uri);
   }

   public Map sourceCopyMap() {
      return Collections.unmodifiableMap(this._sourceForUri);
   }

   public void setBaseUri(URI uri) {
      this._baseURI = uri;
   }

   public String relativize(String uri) {
      return this.relativize(uri, false);
   }

   public String computeSavedFilename(String uri) {
      return this.relativize(uri, true);
   }

   private String relativize(String uri, boolean forSavedFilename) {
      if(uri == null) {
         return null;
      } else {
         int lastslash;
         if(uri.startsWith("/")) {
            uri = "project://local" + uri.replace('\\', '/');
         } else {
            lastslash = uri.indexOf(58);
            if(lastslash <= 1 || !uri.substring(0, lastslash).matches("^\\w+$")) {
               uri = "project://local/" + uri.replace('\\', '/');
            }
         }

         if(this._baseURI != null) {
            try {
               URI lastslash1 = this._baseURI.relativize(new URI(uri));
               if(!lastslash1.isAbsolute()) {
                  return lastslash1.toString();
               }

               uri = lastslash1.toString();
            } catch (URISyntaxException var7) {
               ;
            }
         }

         if(!forSavedFilename) {
            return uri;
         } else {
            lastslash = uri.lastIndexOf(47);
            String dir = QNameHelper.hexsafe(lastslash == -1?"":uri.substring(0, lastslash));
            int question = uri.indexOf(63, lastslash + 1);
            if(question == -1) {
               return dir + "/" + uri.substring(lastslash + 1);
            } else {
               String query = QNameHelper.hexsafe(question == -1?"":uri.substring(question));
               return query.startsWith("URI_SHA_1_")?dir + "/" + uri.substring(lastslash + 1, question):dir + "/" + uri.substring(lastslash + 1, question) + query;
            }
         }
      }
   }

   public void addSourceUri(String uri, String nameToUse) {
      if(uri != null) {
         if(nameToUse == null) {
            nameToUse = this.computeSavedFilename(uri);
         }

         this._sourceForUri.put(uri, nameToUse);
      }
   }

   public Collection getErrorListener() {
      return this._errorListener;
   }

   public SchemaTypeLoader getS4SLoader() {
      return this._s4sloader;
   }

   public File getSchemasDir() {
      return this._schemasDir;
   }

   public void setSchemasDir(File _schemasDir) {
      this._schemasDir = _schemasDir;
   }

   StscState(StscState.NamelessClass103572404 x0) {
      this();
   }


   private static final class StscStack {

      StscState current;
      ArrayList stack;


      private StscStack() {
         this.stack = new ArrayList();
      }

      final StscState push() {
         this.stack.add(this.current);
         this.current = new StscState((StscState.NamelessClass103572404)null);
         return this.current;
      }

      final void pop() {
         this.current = (StscState)this.stack.get(this.stack.size() - 1);
         this.stack.remove(this.stack.size() - 1);
      }

      StscStack(StscState.NamelessClass103572404 x0) {
         this();
      }
   }

   static class NamelessClass103572404 {
   }
}
