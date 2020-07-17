package org.apache.poi.openxml4j.opc;

import org.apache.poi.openxml4j.util.Nullable;

public interface PackageProperties {

   String NAMESPACE_DCTERMS = "http://purl.org/dc/terms/";
   String NAMESPACE_DC = "http://purl.org/dc/elements/1.1/";


   Nullable getCategoryProperty();

   void setCategoryProperty(String var1);

   Nullable getContentStatusProperty();

   void setContentStatusProperty(String var1);

   Nullable getContentTypeProperty();

   void setContentTypeProperty(String var1);

   Nullable getCreatedProperty();

   void setCreatedProperty(String var1);

   void setCreatedProperty(Nullable var1);

   Nullable getCreatorProperty();

   void setCreatorProperty(String var1);

   Nullable getDescriptionProperty();

   void setDescriptionProperty(String var1);

   Nullable getIdentifierProperty();

   void setIdentifierProperty(String var1);

   Nullable getKeywordsProperty();

   void setKeywordsProperty(String var1);

   Nullable getLanguageProperty();

   void setLanguageProperty(String var1);

   Nullable getLastModifiedByProperty();

   void setLastModifiedByProperty(String var1);

   Nullable getLastPrintedProperty();

   void setLastPrintedProperty(String var1);

   void setLastPrintedProperty(Nullable var1);

   Nullable getModifiedProperty();

   void setModifiedProperty(String var1);

   void setModifiedProperty(Nullable var1);

   Nullable getRevisionProperty();

   void setRevisionProperty(String var1);

   Nullable getSubjectProperty();

   void setSubjectProperty(String var1);

   Nullable getTitleProperty();

   void setTitleProperty(String var1);

   Nullable getVersionProperty();

   void setVersionProperty(String var1);
}
