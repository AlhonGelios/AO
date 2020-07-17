package org.apache.xmlbeans.impl.config;

import org.apache.xmlbeans.InterfaceExtension;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.config.BindingConfigImpl;
import org.apache.xmlbeans.impl.config.NameSet;
import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JMethod;
import org.apache.xmlbeans.impl.jam.JParameter;
import org.apache.xmlbeans.impl.jam.JamClassLoader;
import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;

public class InterfaceExtensionImpl implements InterfaceExtension {

   private NameSet _xbeanSet;
   private String _interfaceClassName;
   private String _delegateToClassName;
   private InterfaceExtensionImpl.MethodSignatureImpl[] _methods;


   static InterfaceExtensionImpl newInstance(JamClassLoader loader, NameSet xbeanSet, Extensionconfig.Interface intfXO) {
      InterfaceExtensionImpl result = new InterfaceExtensionImpl();
      result._xbeanSet = xbeanSet;
      JClass interfaceJClass = validateInterface(loader, intfXO.getName(), intfXO);
      if(interfaceJClass == null) {
         BindingConfigImpl.error("Interface \'" + intfXO.getStaticHandler() + "\' not found.", intfXO);
         return null;
      } else {
         result._interfaceClassName = interfaceJClass.getQualifiedName();
         result._delegateToClassName = intfXO.getStaticHandler();
         JClass delegateJClass = validateClass(loader, result._delegateToClassName, intfXO);
         if(delegateJClass == null) {
            BindingConfigImpl.warning("Handler class \'" + intfXO.getStaticHandler() + "\' not found on classpath, skip validation.", intfXO);
            return result;
         } else {
            return !result.validateMethods(interfaceJClass, delegateJClass, intfXO)?null:result;
         }
      }
   }

   private static JClass validateInterface(JamClassLoader loader, String intfStr, XmlObject loc) {
      return validateJava(loader, intfStr, true, loc);
   }

   static JClass validateClass(JamClassLoader loader, String clsStr, XmlObject loc) {
      return validateJava(loader, clsStr, false, loc);
   }

   static JClass validateJava(JamClassLoader loader, String clsStr, boolean isInterface, XmlObject loc) {
      if(loader == null) {
         return null;
      } else {
         String ent = isInterface?"Interface":"Class";
         JClass cls = loader.loadClass(clsStr);
         if(cls != null && !cls.isUnresolvedType()) {
            if(isInterface && !cls.isInterface() || !isInterface && cls.isInterface()) {
               BindingConfigImpl.error("\'" + clsStr + "\' must be " + (isInterface?"an interface":"a class") + ".", loc);
            }

            if(!cls.isPublic()) {
               BindingConfigImpl.error(ent + " \'" + clsStr + "\' is not public.", loc);
            }

            return cls;
         } else {
            BindingConfigImpl.error(ent + " \'" + clsStr + "\' not found.", loc);
            return null;
         }
      }
   }

   private boolean validateMethods(JClass interfaceJClass, JClass delegateJClass, XmlObject loc) {
      boolean valid = true;
      JMethod[] interfaceMethods = interfaceJClass.getMethods();
      this._methods = new InterfaceExtensionImpl.MethodSignatureImpl[interfaceMethods.length];

      for(int i = 0; i < interfaceMethods.length; ++i) {
         JMethod method = this.validateMethod(interfaceJClass, delegateJClass, interfaceMethods[i], loc);
         if(method != null) {
            this._methods[i] = new InterfaceExtensionImpl.MethodSignatureImpl(this.getStaticHandler(), method);
         } else {
            valid = false;
         }
      }

      return valid;
   }

   private JMethod validateMethod(JClass interfaceJClass, JClass delegateJClass, JMethod method, XmlObject loc) {
      String methodName = method.getSimpleName();
      JParameter[] params = method.getParameters();
      JClass returnType = method.getReturnType();
      JClass[] delegateParams = new JClass[params.length + 1];
      delegateParams[0] = returnType.forName("org.apache.xmlbeans.XmlObject");

      for(int handlerMethod = 1; handlerMethod < delegateParams.length; ++handlerMethod) {
         delegateParams[handlerMethod] = params[handlerMethod - 1].getType();
      }

      JMethod var13 = null;
      var13 = getMethod(delegateJClass, methodName, delegateParams);
      if(var13 == null) {
         BindingConfigImpl.error("Handler class \'" + delegateJClass.getQualifiedName() + "\' does not contain method " + methodName + "(" + listTypes(delegateParams) + ")", loc);
         return null;
      } else {
         JClass[] intfExceptions = method.getExceptionTypes();
         JClass[] delegateExceptions = var13.getExceptionTypes();
         if(delegateExceptions.length != intfExceptions.length) {
            BindingConfigImpl.error("Handler method \'" + delegateJClass.getQualifiedName() + "." + methodName + "(" + listTypes(delegateParams) + ")\' must declare the same exceptions as the interface method \'" + interfaceJClass.getQualifiedName() + "." + methodName + "(" + listTypes(params), loc);
            return null;
         } else {
            for(int i = 0; i < delegateExceptions.length; ++i) {
               if(delegateExceptions[i] != intfExceptions[i]) {
                  BindingConfigImpl.error("Handler method \'" + delegateJClass.getQualifiedName() + "." + methodName + "(" + listTypes(delegateParams) + ")\' must declare the same exceptions as the interface method \'" + interfaceJClass.getQualifiedName() + "." + methodName + "(" + listTypes(params), loc);
                  return null;
               }
            }

            if(var13.isPublic() && var13.isStatic()) {
               if(!returnType.equals(var13.getReturnType())) {
                  BindingConfigImpl.error("Return type for method \'" + var13.getReturnType() + " " + delegateJClass.getQualifiedName() + "." + methodName + "(" + listTypes(delegateParams) + ")\' does not match the return type of the interface method :\'" + returnType + "\'.", loc);
                  return null;
               } else {
                  return method;
               }
            } else {
               BindingConfigImpl.error("Method \'" + delegateJClass.getQualifiedName() + "." + methodName + "(" + listTypes(delegateParams) + ")\' must be declared public and static.", loc);
               return null;
            }
         }
      }
   }

   static JMethod getMethod(JClass cls, String name, JClass[] paramTypes) {
      JMethod[] methods = cls.getMethods();

      for(int i = 0; i < methods.length; ++i) {
         JMethod method = methods[i];
         if(name.equals(method.getSimpleName())) {
            JParameter[] mParams = method.getParameters();
            if(mParams.length == paramTypes.length) {
               for(int j = 0; j < mParams.length; ++j) {
                  JParameter mParam = mParams[j];
                  if(!mParam.getType().equals(paramTypes[j])) {
                     ;
                  }
               }

               return method;
            }
         }
      }

      return null;
   }

   private static String listTypes(JClass[] types) {
      StringBuffer result = new StringBuffer();

      for(int i = 0; i < types.length; ++i) {
         JClass type = types[i];
         if(i > 0) {
            result.append(", ");
         }

         result.append(emitType(type));
      }

      return result.toString();
   }

   private static String listTypes(JParameter[] params) {
      StringBuffer result = new StringBuffer();

      for(int i = 0; i < params.length; ++i) {
         JClass type = params[i].getType();
         if(i > 0) {
            result.append(", ");
         }

         result.append(emitType(type));
      }

      return result.toString();
   }

   public static String emitType(JClass cls) {
      return cls.isArrayType()?emitType(cls.getArrayComponentType()) + "[]":cls.getQualifiedName().replace('$', '.');
   }

   public boolean contains(String fullJavaName) {
      return this._xbeanSet.contains(fullJavaName);
   }

   public String getStaticHandler() {
      return this._delegateToClassName;
   }

   public String getInterface() {
      return this._interfaceClassName;
   }

   public InterfaceExtension.MethodSignature[] getMethods() {
      return this._methods;
   }

   public String toString() {
      StringBuffer buf = new StringBuffer();
      buf.append("  static handler: ").append(this._delegateToClassName).append("\n");
      buf.append("  interface: ").append(this._interfaceClassName).append("\n");
      buf.append("  name set: ").append(this._xbeanSet).append("\n");

      for(int i = 0; i < this._methods.length; ++i) {
         buf.append("  method[").append(i).append("]=").append(this._methods[i]).append("\n");
      }

      return buf.toString();
   }

   static class MethodSignatureImpl implements InterfaceExtension.MethodSignature {

      private String _intfName;
      private final int NOTINITIALIZED = -1;
      private int _hashCode = -1;
      private String _signature;
      private String _name;
      private String _return;
      private String[] _params;
      private String[] _exceptions;


      MethodSignatureImpl(String intfName, JMethod method) {
         if(intfName != null && method != null) {
            this._intfName = intfName;
            this._hashCode = -1;
            this._signature = null;
            this._name = method.getSimpleName();
            this._return = method.getReturnType().getQualifiedName().replace('$', '.');
            JParameter[] paramTypes = method.getParameters();
            this._params = new String[paramTypes.length];

            for(int exceptionTypes = 0; exceptionTypes < paramTypes.length; ++exceptionTypes) {
               this._params[exceptionTypes] = paramTypes[exceptionTypes].getType().getQualifiedName().replace('$', '.');
            }

            JClass[] var6 = method.getExceptionTypes();
            this._exceptions = new String[var6.length];

            for(int i = 0; i < var6.length; ++i) {
               this._exceptions[i] = var6[i].getQualifiedName().replace('$', '.');
            }

         } else {
            throw new IllegalArgumentException("Interface: " + intfName + " method: " + method);
         }
      }

      String getInterfaceName() {
         return this._intfName;
      }

      public String getName() {
         return this._name;
      }

      public String getReturnType() {
         return this._return;
      }

      public String[] getParameterTypes() {
         return this._params;
      }

      public String[] getExceptionTypes() {
         return this._exceptions;
      }

      public boolean equals(Object o) {
         if(!(o instanceof InterfaceExtensionImpl.MethodSignatureImpl)) {
            return false;
         } else {
            InterfaceExtensionImpl.MethodSignatureImpl ms = (InterfaceExtensionImpl.MethodSignatureImpl)o;
            if(!ms.getName().equals(this.getName())) {
               return false;
            } else {
               String[] params = this.getParameterTypes();
               String[] msParams = ms.getParameterTypes();
               if(msParams.length != params.length) {
                  return false;
               } else {
                  for(int i = 0; i < params.length; ++i) {
                     if(!msParams[i].equals(params[i])) {
                        return false;
                     }
                  }

                  if(!this._intfName.equals(ms._intfName)) {
                     return false;
                  } else {
                     return true;
                  }
               }
            }
         }
      }

      public int hashCode() {
         if(this._hashCode != -1) {
            return this._hashCode;
         } else {
            int hash = this.getName().hashCode();
            String[] params = this.getParameterTypes();

            for(int i = 0; i < params.length; ++i) {
               hash *= 19;
               hash += params[i].hashCode();
            }

            hash += 21 * this._intfName.hashCode();
            this._hashCode = hash;
            return this._hashCode;
         }
      }

      String getSignature() {
         if(this._signature != null) {
            return this._signature;
         } else {
            StringBuffer sb = new StringBuffer(60);
            sb.append(this._name).append("(");

            for(int i = 0; i < this._params.length; ++i) {
               sb.append(i == 0?"":" ,").append(this._params[i]);
            }

            sb.append(")");
            this._signature = sb.toString();
            return this._signature;
         }
      }

      public String toString() {
         StringBuffer buf = new StringBuffer();
         buf.append(this.getReturnType()).append(" ").append(this.getSignature());
         return buf.toString();
      }
   }
}
