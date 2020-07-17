package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlUnionImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLangCode;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;

public class STLangImpl extends XmlUnionImpl implements STLang, STLangCode, STString {

   public STLangImpl(SchemaType var1) {
      super(var1, false);
   }

   protected STLangImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }
}
