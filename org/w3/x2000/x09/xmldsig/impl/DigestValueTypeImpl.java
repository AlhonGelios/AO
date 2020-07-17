package org.w3.x2000.x09.xmldsig.impl;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.JavaBase64HolderEx;
import org.w3.x2000.x09.xmldsig.DigestValueType;

public class DigestValueTypeImpl extends JavaBase64HolderEx implements DigestValueType {

   public DigestValueTypeImpl(SchemaType var1) {
      super(var1, false);
   }

   protected DigestValueTypeImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }
}
