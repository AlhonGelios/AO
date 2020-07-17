package org.apache.xmlbeans;

import java.io.File;
import org.apache.xmlbeans.Filer;
import org.apache.xmlbeans.SchemaAnnotation;
import org.apache.xmlbeans.SchemaAttributeGroup;
import org.apache.xmlbeans.SchemaComponent;
import org.apache.xmlbeans.SchemaGlobalAttribute;
import org.apache.xmlbeans.SchemaGlobalElement;
import org.apache.xmlbeans.SchemaModelGroup;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;

public interface SchemaTypeSystem extends SchemaTypeLoader {

   String getName();

   SchemaType[] globalTypes();

   SchemaType[] documentTypes();

   SchemaType[] attributeTypes();

   SchemaGlobalElement[] globalElements();

   SchemaGlobalAttribute[] globalAttributes();

   SchemaModelGroup[] modelGroups();

   SchemaAttributeGroup[] attributeGroups();

   SchemaAnnotation[] annotations();

   void resolve();

   SchemaComponent resolveHandle(String var1);

   SchemaType typeForHandle(String var1);

   ClassLoader getClassLoader();

   void saveToDirectory(File var1);

   void save(Filer var1);
}
