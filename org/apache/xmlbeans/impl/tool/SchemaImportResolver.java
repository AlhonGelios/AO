package org.apache.xmlbeans.impl.tool;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import org.apache.xmlbeans.impl.xb.xsdschema.ImportDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.IncludeDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;

public abstract class SchemaImportResolver {

   public abstract SchemaImportResolver.SchemaResource lookupResource(String var1, String var2);

   public abstract void reportActualNamespace(SchemaImportResolver.SchemaResource var1, String var2);

   protected final void resolveImports(SchemaImportResolver.SchemaResource[] resources) {
      LinkedList queueOfResources = new LinkedList(Arrays.asList(resources));
      LinkedList queueOfLocators = new LinkedList();
      HashSet seenResources = new HashSet();

      while(true) {
         SchemaImportResolver.SchemaResource nextResource;
         do {
            if(!queueOfResources.isEmpty()) {
               nextResource = (SchemaImportResolver.SchemaResource)queueOfResources.removeFirst();
               break;
            }

            if(queueOfLocators.isEmpty()) {
               return;
            }

            SchemaImportResolver.SchemaLocator schema = (SchemaImportResolver.SchemaLocator)queueOfLocators.removeFirst();
            nextResource = this.lookupResource(schema.namespace, schema.schemaLocation);
         } while(nextResource == null);

         if(!seenResources.contains(nextResource)) {
            seenResources.add(nextResource);
            SchemaDocument.Schema var13 = nextResource.getSchema();
            if(var13 != null) {
               String actualTargetNamespace = var13.getTargetNamespace();
               if(actualTargetNamespace == null) {
                  actualTargetNamespace = "";
               }

               String expectedTargetNamespace = nextResource.getNamespace();
               if(expectedTargetNamespace == null || !actualTargetNamespace.equals(expectedTargetNamespace)) {
                  this.reportActualNamespace(nextResource, actualTargetNamespace);
               }

               ImportDocument.Import[] schemaImports = var13.getImportArray();

               for(int schemaIncludes = 0; schemaIncludes < schemaImports.length; ++schemaIncludes) {
                  queueOfLocators.add(new SchemaImportResolver.SchemaLocator(schemaImports[schemaIncludes].getNamespace() == null?"":schemaImports[schemaIncludes].getNamespace(), schemaImports[schemaIncludes].getSchemaLocation()));
               }

               IncludeDocument.Include[] var12 = var13.getIncludeArray();

               for(int i = 0; i < var12.length; ++i) {
                  queueOfLocators.add(new SchemaImportResolver.SchemaLocator((String)null, var12[i].getSchemaLocation()));
               }
            }
         }
      }
   }

   public interface SchemaResource {

      SchemaDocument.Schema getSchema();

      String getNamespace();

      String getSchemaLocation();
   }

   private static class SchemaLocator {

      public final String namespace;
      public final String schemaLocation;


      public SchemaLocator(String namespace, String schemaLocation) {
         this.namespace = namespace;
         this.schemaLocation = schemaLocation;
      }
   }
}
