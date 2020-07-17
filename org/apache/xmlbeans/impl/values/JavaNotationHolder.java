package org.apache.xmlbeans.impl.values;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;
import org.apache.xmlbeans.impl.values.XmlQNameImpl;

public abstract class JavaNotationHolder extends XmlQNameImpl {

   public SchemaType schemaType() {
      return BuiltinSchemaTypeSystem.ST_NOTATION;
   }
}
