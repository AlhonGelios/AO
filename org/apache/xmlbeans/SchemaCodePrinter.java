package org.apache.xmlbeans;

import java.io.IOException;
import java.io.Writer;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeSystem;

public interface SchemaCodePrinter {

   void printTypeImpl(Writer var1, SchemaType var2) throws IOException;

   void printType(Writer var1, SchemaType var2) throws IOException;

   void printLoader(Writer var1, SchemaTypeSystem var2) throws IOException;
}
