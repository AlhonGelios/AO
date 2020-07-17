package org.apache.xmlbeans;


public interface InterfaceExtension {

   String getInterface();

   String getStaticHandler();

   InterfaceExtension.MethodSignature[] getMethods();

   public interface MethodSignature {

      String getName();

      String getReturnType();

      String[] getParameterTypes();

      String[] getExceptionTypes();
   }
}
