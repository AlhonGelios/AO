package org.apache.xmlbeans.impl.jam.internal.elements;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
import org.apache.xmlbeans.impl.jam.JAnnotation;
import org.apache.xmlbeans.impl.jam.JAnnotationValue;
import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JComment;
import org.apache.xmlbeans.impl.jam.JConstructor;
import org.apache.xmlbeans.impl.jam.JField;
import org.apache.xmlbeans.impl.jam.JMethod;
import org.apache.xmlbeans.impl.jam.JPackage;
import org.apache.xmlbeans.impl.jam.JProperty;
import org.apache.xmlbeans.impl.jam.JSourcePosition;
import org.apache.xmlbeans.impl.jam.internal.JamClassLoaderImpl;
import org.apache.xmlbeans.impl.jam.internal.classrefs.JClassRef;
import org.apache.xmlbeans.impl.jam.internal.classrefs.JClassRefContext;
import org.apache.xmlbeans.impl.jam.internal.classrefs.QualifiedJClassRef;
import org.apache.xmlbeans.impl.jam.internal.classrefs.UnqualifiedJClassRef;
import org.apache.xmlbeans.impl.jam.internal.elements.ConstructorImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.ElementContext;
import org.apache.xmlbeans.impl.jam.internal.elements.ElementImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.FieldImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.MemberImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.MethodImpl;
import org.apache.xmlbeans.impl.jam.internal.elements.PropertyImpl;
import org.apache.xmlbeans.impl.jam.mutable.MClass;
import org.apache.xmlbeans.impl.jam.mutable.MConstructor;
import org.apache.xmlbeans.impl.jam.mutable.MField;
import org.apache.xmlbeans.impl.jam.mutable.MMethod;
import org.apache.xmlbeans.impl.jam.provider.JamClassPopulator;
import org.apache.xmlbeans.impl.jam.visitor.JVisitor;
import org.apache.xmlbeans.impl.jam.visitor.MVisitor;

public class ClassImpl extends MemberImpl implements MClass, JClassRef, JClassRefContext {

   public static final int NEW = 1;
   public static final int UNPOPULATED = 2;
   public static final int POPULATING = 3;
   public static final int UNINITIALIZED = 4;
   public static final int INITIALIZING = 5;
   public static final int LOADED = 6;
   private int mState = 1;
   private boolean mIsAnnotationType = false;
   private boolean mIsInterface = false;
   private boolean mIsEnum = false;
   private String mPackageName = null;
   private JClassRef mSuperClassRef = null;
   private ArrayList mInterfaceRefs = null;
   private ArrayList mFields = null;
   private ArrayList mMethods = null;
   private ArrayList mConstructors = null;
   private ArrayList mProperties = null;
   private ArrayList mDeclaredProperties = null;
   private ArrayList mInnerClasses = null;
   private String[] mImports = null;
   private JamClassPopulator mPopulator;


   public ClassImpl(String packageName, String simpleName, ElementContext ctx, String[] importSpecs, JamClassPopulator populator) {
      super(ctx);
      super.setSimpleName(simpleName);
      this.mPackageName = packageName.trim();
      this.mImports = importSpecs;
      this.mPopulator = populator;
      this.setState(2);
   }

   public ClassImpl(String packageName, String simpleName, ElementContext ctx, String[] importSpecs) {
      super(ctx);
      super.setSimpleName(simpleName);
      this.mPackageName = packageName.trim();
      this.mImports = importSpecs;
      this.mPopulator = null;
      this.setState(4);
   }

   private ClassImpl(String packageName, String simpleName, String[] importSpecs, ClassImpl parent) {
      super((ElementImpl)parent);
      super.setSimpleName(simpleName);
      this.mPackageName = packageName.trim();
      this.mImports = importSpecs;
      this.mPopulator = null;
      this.setState(4);
   }

   public JPackage getContainingPackage() {
      return this.getClassLoader().getPackage(this.mPackageName);
   }

   public JClass getSuperclass() {
      this.ensureLoaded();
      return this.mSuperClassRef == null?null:this.mSuperClassRef.getRefClass();
   }

   public JClass[] getInterfaces() {
      this.ensureLoaded();
      if(this.mInterfaceRefs != null && this.mInterfaceRefs.size() != 0) {
         JClass[] out = new JClass[this.mInterfaceRefs.size()];

         for(int i = 0; i < out.length; ++i) {
            out[i] = ((JClassRef)this.mInterfaceRefs.get(i)).getRefClass();
         }

         return out;
      } else {
         return new JClass[0];
      }
   }

   public JField[] getFields() {
      this.ensureLoaded();
      ArrayList list = new ArrayList();
      this.addFieldsRecursively(this, list);
      JField[] out = new JField[list.size()];
      list.toArray(out);
      return out;
   }

   public JField[] getDeclaredFields() {
      this.ensureLoaded();
      return this.getMutableFields();
   }

   public JMethod[] getMethods() {
      this.ensureLoaded();
      ArrayList list = new ArrayList();
      this.addMethodsRecursively(this, list);
      JMethod[] out = new JMethod[list.size()];
      list.toArray(out);
      return out;
   }

   public JProperty[] getProperties() {
      this.ensureLoaded();
      if(this.mProperties == null) {
         return new JProperty[0];
      } else {
         JProperty[] out = new JProperty[this.mProperties.size()];
         this.mProperties.toArray(out);
         return out;
      }
   }

   public JProperty[] getDeclaredProperties() {
      this.ensureLoaded();
      if(this.mDeclaredProperties == null) {
         return new JProperty[0];
      } else {
         JProperty[] out = new JProperty[this.mDeclaredProperties.size()];
         this.mDeclaredProperties.toArray(out);
         return out;
      }
   }

   public JMethod[] getDeclaredMethods() {
      this.ensureLoaded();
      return this.getMutableMethods();
   }

   public JConstructor[] getConstructors() {
      this.ensureLoaded();
      return this.getMutableConstructors();
   }

   public boolean isInterface() {
      this.ensureLoaded();
      return this.mIsInterface;
   }

   public boolean isAnnotationType() {
      this.ensureLoaded();
      return this.mIsAnnotationType;
   }

   public boolean isEnumType() {
      this.ensureLoaded();
      return this.mIsEnum;
   }

   public int getModifiers() {
      this.ensureLoaded();
      return super.getModifiers();
   }

   public boolean isFinal() {
      return Modifier.isFinal(this.getModifiers());
   }

   public boolean isStatic() {
      return Modifier.isStatic(this.getModifiers());
   }

   public boolean isAbstract() {
      return Modifier.isAbstract(this.getModifiers());
   }

   public boolean isAssignableFrom(JClass arg) {
      this.ensureLoaded();
      return !this.isPrimitiveType() && !arg.isPrimitiveType()?this.isAssignableFromRecursively(arg):this.getQualifiedName().equals(arg.getQualifiedName());
   }

   public JClass[] getClasses() {
      this.ensureLoaded();
      if(this.mInnerClasses == null) {
         return new JClass[0];
      } else {
         JClass[] out = new JClass[this.mInnerClasses.size()];
         this.mInnerClasses.toArray(out);
         return out;
      }
   }

   public String getFieldDescriptor() {
      return this.getQualifiedName();
   }

   public JClass forName(String name) {
      return this.getClassLoader().loadClass(name);
   }

   public JPackage[] getImportedPackages() {
      this.ensureLoaded();
      TreeSet set = new TreeSet();
      JClass[] importedClasses = this.getImportedClasses();

      for(int imports = 0; imports < importedClasses.length; ++imports) {
         JPackage array = importedClasses[imports].getContainingPackage();
         if(array != null) {
            set.add(array);
         }
      }

      String[] var5 = this.getImportSpecs();
      if(var5 != null) {
         for(int var6 = 0; var6 < var5.length; ++var6) {
            if(var5[var6].endsWith(".*")) {
               set.add(this.getClassLoader().getPackage(var5[var6].substring(0, var5[var6].length() - 2)));
            }
         }
      }

      JPackage[] var7 = new JPackage[set.size()];
      set.toArray(var7);
      return var7;
   }

   public JClass[] getImportedClasses() {
      this.ensureLoaded();
      String[] imports = this.getImportSpecs();
      if(imports == null) {
         return new JClass[0];
      } else {
         ArrayList list = new ArrayList();

         for(int out = 0; out < imports.length; ++out) {
            if(!imports[out].endsWith("*")) {
               list.add(this.getClassLoader().loadClass(imports[out]));
            }
         }

         JClass[] var4 = new JClass[list.size()];
         list.toArray(var4);
         return var4;
      }
   }

   public void accept(MVisitor visitor) {
      visitor.visit((MClass)this);
   }

   public void accept(JVisitor visitor) {
      visitor.visit((JClass)this);
   }

   public void setSimpleName(String name) {
      throw new UnsupportedOperationException("Class names cannot be changed");
   }

   public Class getPrimitiveClass() {
      return null;
   }

   public boolean isPrimitiveType() {
      return false;
   }

   public boolean isBuiltinType() {
      return false;
   }

   public boolean isVoidType() {
      return false;
   }

   public boolean isUnresolvedType() {
      return false;
   }

   public boolean isObjectType() {
      return this.getQualifiedName().equals("java.lang.Object");
   }

   public boolean isArrayType() {
      return false;
   }

   public JClass getArrayComponentType() {
      return null;
   }

   public int getArrayDimensions() {
      return 0;
   }

   public JAnnotation[] getAnnotations() {
      this.ensureLoaded();
      return super.getAnnotations();
   }

   public JAnnotation getAnnotation(Class proxyClass) {
      this.ensureLoaded();
      return super.getAnnotation(proxyClass);
   }

   public JAnnotation getAnnotation(String named) {
      this.ensureLoaded();
      return super.getAnnotation(named);
   }

   public JAnnotationValue getAnnotationValue(String valueId) {
      this.ensureLoaded();
      return super.getAnnotationValue(valueId);
   }

   public Object getAnnotationProxy(Class proxyClass) {
      this.ensureLoaded();
      return super.getAnnotationProxy(proxyClass);
   }

   public JComment getComment() {
      this.ensureLoaded();
      return super.getComment();
   }

   public JAnnotation[] getAllJavadocTags() {
      this.ensureLoaded();
      return super.getAllJavadocTags();
   }

   public JSourcePosition getSourcePosition() {
      this.ensureLoaded();
      return super.getSourcePosition();
   }

   public void setSuperclass(String qualifiedClassName) {
      if(qualifiedClassName == null) {
         this.mSuperClassRef = null;
      } else {
         if(qualifiedClassName.equals(this.getQualifiedName())) {
            throw new IllegalArgumentException("A class cannot be it\'s own superclass: \'" + qualifiedClassName + "\'");
         }

         this.mSuperClassRef = QualifiedJClassRef.create(qualifiedClassName, (JClassRefContext)this);
      }

   }

   public void setSuperclassUnqualified(String unqualifiedClassName) {
      this.mSuperClassRef = UnqualifiedJClassRef.create(unqualifiedClassName, this);
   }

   public void setSuperclass(JClass clazz) {
      if(clazz == null) {
         this.mSuperClassRef = null;
      } else {
         this.setSuperclass(clazz.getQualifiedName());
      }

   }

   public void addInterface(JClass interf) {
      if(interf == null) {
         throw new IllegalArgumentException("null interf");
      } else {
         this.addInterface(interf.getQualifiedName());
      }
   }

   public void addInterface(String qcName) {
      if(this.mInterfaceRefs == null) {
         this.mInterfaceRefs = new ArrayList();
      }

      if(qcName.equals(this.getQualifiedName())) {
         throw new IllegalArgumentException("A class cannot implement itself: \'" + qcName + "\'");
      } else {
         this.mInterfaceRefs.add(QualifiedJClassRef.create(qcName, (JClassRefContext)this));
      }
   }

   public void addInterfaceUnqualified(String ucname) {
      if(this.mInterfaceRefs == null) {
         this.mInterfaceRefs = new ArrayList();
      }

      this.mInterfaceRefs.add(UnqualifiedJClassRef.create(ucname, this));
   }

   public void removeInterface(JClass interf) {
      if(interf == null) {
         throw new IllegalArgumentException("null interf");
      } else {
         this.removeInterface(interf.getQualifiedName());
      }
   }

   public void removeInterface(String qcname) {
      if(qcname == null) {
         throw new IllegalArgumentException("null classname");
      } else if(this.mInterfaceRefs != null) {
         for(int i = 0; i < this.mInterfaceRefs.size(); ++i) {
            if(qcname.equals(((JClassRef)this.mInterfaceRefs.get(i)).getQualifiedName())) {
               this.mInterfaceRefs.remove(i);
            }
         }

      }
   }

   public MConstructor addNewConstructor() {
      if(this.mConstructors == null) {
         this.mConstructors = new ArrayList();
      }

      ConstructorImpl out = new ConstructorImpl(this);
      this.mConstructors.add(out);
      return out;
   }

   public void removeConstructor(MConstructor constr) {
      if(this.mConstructors != null) {
         this.mConstructors.remove(constr);
      }
   }

   public MConstructor[] getMutableConstructors() {
      if(this.mConstructors != null && this.mConstructors.size() != 0) {
         MConstructor[] out = new MConstructor[this.mConstructors.size()];
         this.mConstructors.toArray(out);
         return out;
      } else {
         return new MConstructor[0];
      }
   }

   public MField addNewField() {
      if(this.mFields == null) {
         this.mFields = new ArrayList();
      }

      FieldImpl out = new FieldImpl(defaultName(this.mFields.size()), this, "java.lang.Object");
      this.mFields.add(out);
      return out;
   }

   public void removeField(MField field) {
      if(this.mFields != null) {
         this.mFields.remove(field);
      }
   }

   public MField[] getMutableFields() {
      if(this.mFields != null && this.mFields.size() != 0) {
         MField[] out = new MField[this.mFields.size()];
         this.mFields.toArray(out);
         return out;
      } else {
         return new MField[0];
      }
   }

   public MMethod addNewMethod() {
      if(this.mMethods == null) {
         this.mMethods = new ArrayList();
      }

      MethodImpl out = new MethodImpl(defaultName(this.mMethods.size()), this);
      this.mMethods.add(out);
      return out;
   }

   public void removeMethod(MMethod method) {
      if(this.mMethods != null) {
         this.mMethods.remove(method);
      }
   }

   public MMethod[] getMutableMethods() {
      if(this.mMethods != null && this.mMethods.size() != 0) {
         MMethod[] out = new MMethod[this.mMethods.size()];
         this.mMethods.toArray(out);
         return out;
      } else {
         return new MMethod[0];
      }
   }

   public JProperty addNewProperty(String name, JMethod getter, JMethod setter) {
      if(this.mProperties == null) {
         this.mProperties = new ArrayList();
      }

      String typeName = getter != null?getter.getReturnType().getFieldDescriptor():setter.getParameters()[0].getType().getFieldDescriptor();
      PropertyImpl out = new PropertyImpl(name, getter, setter, typeName);
      this.mProperties.add(out);
      return out;
   }

   public void removeProperty(JProperty p) {
      if(this.mProperties != null) {
         this.mProperties.remove(p);
      }

   }

   public JProperty addNewDeclaredProperty(String name, JMethod getter, JMethod setter) {
      if(this.mDeclaredProperties == null) {
         this.mDeclaredProperties = new ArrayList();
      }

      String typeName = getter != null?getter.getReturnType().getFieldDescriptor():setter.getParameters()[0].getType().getFieldDescriptor();
      PropertyImpl out = new PropertyImpl(name, getter, setter, typeName);
      this.mDeclaredProperties.add(out);
      return out;
   }

   public void removeDeclaredProperty(JProperty p) {
      if(this.mDeclaredProperties != null) {
         this.mDeclaredProperties.remove(p);
      }

   }

   public MClass addNewInnerClass(String name) {
      int lastDot = name.lastIndexOf(46);
      if(lastDot == -1) {
         lastDot = name.lastIndexOf(36);
      }

      if(lastDot != -1) {
         name = name.substring(lastDot + 1);
      }

      ClassImpl inner = new ClassImpl(this.mPackageName, this.getSimpleName() + "$" + name, this.getImportSpecs(), this);
      if(this.mInnerClasses == null) {
         this.mInnerClasses = new ArrayList();
      }

      this.mInnerClasses.add(inner);
      inner.setState(6);
      ((JamClassLoaderImpl)this.getClassLoader()).addToCache(inner);
      return inner;
   }

   public void removeInnerClass(MClass clazz) {
      if(this.mInnerClasses != null) {
         this.mInnerClasses.remove(clazz);
      }
   }

   public void setIsInterface(boolean b) {
      this.mIsInterface = b;
   }

   public void setIsAnnotationType(boolean b) {
      this.mIsAnnotationType = b;
   }

   public void setIsEnumType(boolean b) {
      this.mIsEnum = b;
   }

   public String getQualifiedName() {
      return (this.mPackageName.length() > 0?this.mPackageName + '.':"") + this.mSimpleName;
   }

   public JClass getRefClass() {
      return this;
   }

   public String getPackageName() {
      return this.mPackageName;
   }

   public String[] getImportSpecs() {
      this.ensureLoaded();
      return this.mImports == null?new String[0]:this.mImports;
   }

   public void setState(int state) {
      this.mState = state;
   }

   public static void validateClassName(String className) throws IllegalArgumentException {
      if(className == null) {
         throw new IllegalArgumentException("null class name specified");
      } else if(!Character.isJavaIdentifierStart(className.charAt(0))) {
         throw new IllegalArgumentException("Invalid first character in class name: " + className);
      } else {
         for(int i = 1; i < className.length(); ++i) {
            char c = className.charAt(i);
            if(c == 46) {
               if(className.charAt(i - 1) == 46) {
                  throw new IllegalArgumentException("\'..\' not allowed in class name: " + className);
               }

               if(i == className.length() - 1) {
                  throw new IllegalArgumentException("\'.\' not allowed at end of class name: " + className);
               }
            } else if(!Character.isJavaIdentifierPart(c)) {
               throw new IllegalArgumentException("Illegal character \'" + c + "\' in class name: " + className);
            }
         }

      }
   }

   private boolean isAssignableFromRecursively(JClass arg) {
      if(this.getQualifiedName().equals(arg.getQualifiedName())) {
         return true;
      } else {
         JClass[] interfaces = arg.getInterfaces();
         if(interfaces != null) {
            for(int i = 0; i < interfaces.length; ++i) {
               if(this.isAssignableFromRecursively(interfaces[i])) {
                  return true;
               }
            }
         }

         arg = arg.getSuperclass();
         return arg != null && this.isAssignableFromRecursively(arg);
      }
   }

   private void addFieldsRecursively(JClass clazz, Collection out) {
      JField[] fields = clazz.getDeclaredFields();

      for(int ints = 0; ints < fields.length; ++ints) {
         out.add(fields[ints]);
      }

      JClass[] var6 = clazz.getInterfaces();

      for(int i = 0; i < var6.length; ++i) {
         this.addFieldsRecursively(var6[i], out);
      }

      clazz = clazz.getSuperclass();
      if(clazz != null) {
         this.addFieldsRecursively(clazz, out);
      }

   }

   private void addMethodsRecursively(JClass clazz, Collection out) {
      JMethod[] methods = clazz.getDeclaredMethods();

      for(int ints = 0; ints < methods.length; ++ints) {
         out.add(methods[ints]);
      }

      JClass[] var6 = clazz.getInterfaces();

      for(int i = 0; i < var6.length; ++i) {
         this.addMethodsRecursively(var6[i], out);
      }

      clazz = clazz.getSuperclass();
      if(clazz != null) {
         this.addMethodsRecursively(clazz, out);
      }

   }

   public void ensureLoaded() {
      if(this.mState != 6) {
         if(this.mState == 2) {
            if(this.mPopulator == null) {
               throw new IllegalStateException("null populator");
            }

            this.setState(3);
            this.mPopulator.populate(this);
            this.setState(4);
         }

         if(this.mState == 4) {
            this.setState(5);
            ((JamClassLoaderImpl)this.getClassLoader()).initialize(this);
         }

         this.setState(6);
      }
   }
}
