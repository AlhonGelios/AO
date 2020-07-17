package org.apache.xmlbeans.impl.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SchemaDependencies {

   private Map _dependencies = new HashMap();
   private Map _contributions = new HashMap();


   void registerDependency(String source, String target) {
      Object depSet = (Set)this._dependencies.get(target);
      if(depSet == null) {
         depSet = new HashSet();
         this._dependencies.put(target, depSet);
      }

      ((Set)depSet).add(source);
   }

   Set computeTransitiveClosure(List modifiedNamespaces) {
      ArrayList nsList = new ArrayList(modifiedNamespaces);
      HashSet result = new HashSet(modifiedNamespaces);

      for(int i = 0; i < nsList.size(); ++i) {
         Set deps = (Set)this._dependencies.get(nsList.get(i));
         if(deps != null) {
            Iterator it = deps.iterator();

            while(it.hasNext()) {
               String ns = (String)it.next();
               if(!result.contains(ns)) {
                  nsList.add(ns);
                  result.add(ns);
               }
            }
         }
      }

      return result;
   }

   SchemaDependencies() {}

   SchemaDependencies(SchemaDependencies base, Set updatedNs) {
      Iterator it = base._dependencies.keySet().iterator();

      String ns;
      Iterator it2;
      while(it.hasNext()) {
         ns = (String)it.next();
         if(!updatedNs.contains(ns)) {
            HashSet fileList = new HashSet();
            this._dependencies.put(ns, fileList);
            Set baseFileList = (Set)base._dependencies.get(ns);
            it2 = baseFileList.iterator();

            while(it2.hasNext()) {
               String source = (String)it2.next();
               if(!updatedNs.contains(source)) {
                  fileList.add(source);
               }
            }
         }
      }

      it = base._contributions.keySet().iterator();

      while(it.hasNext()) {
         ns = (String)it.next();
         if(!updatedNs.contains(ns)) {
            ArrayList fileList1 = new ArrayList();
            this._contributions.put(ns, fileList1);
            List baseFileList1 = (List)base._contributions.get(ns);
            it2 = baseFileList1.iterator();

            while(it2.hasNext()) {
               fileList1.add(it2.next());
            }
         }
      }

   }

   void registerContribution(String ns, String fileURL) {
      Object fileList = (List)this._contributions.get(ns);
      if(fileList == null) {
         fileList = new ArrayList();
         this._contributions.put(ns, fileList);
      }

      ((List)fileList).add(fileURL);
   }

   boolean isFileRepresented(String fileURL) {
      Iterator it = this._contributions.values().iterator();

      List fileList;
      do {
         if(!it.hasNext()) {
            return false;
         }

         fileList = (List)it.next();
      } while(!fileList.contains(fileURL));

      return true;
   }

   List getFilesTouched(Set updatedNs) {
      ArrayList result = new ArrayList();
      Iterator it = updatedNs.iterator();

      while(it.hasNext()) {
         result.addAll((List)this._contributions.get(it.next()));
      }

      return result;
   }

   List getNamespacesTouched(Set modifiedFiles) {
      ArrayList result = new ArrayList();
      Iterator it = this._contributions.keySet().iterator();

      while(it.hasNext()) {
         String ns = (String)it.next();
         List files = (List)this._contributions.get(ns);

         for(int i = 0; i < files.size(); ++i) {
            if(modifiedFiles.contains(files.get(i))) {
               result.add(ns);
            }
         }
      }

      return result;
   }
}
