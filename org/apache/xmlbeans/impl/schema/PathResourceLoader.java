package org.apache.xmlbeans.impl.schema;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.xmlbeans.ResourceLoader;
import org.apache.xmlbeans.impl.schema.FileResourceLoader;

public class PathResourceLoader implements ResourceLoader {

   private ResourceLoader[] _path;


   public PathResourceLoader(ResourceLoader[] loaderpath) throws IOException {
      this._path = new ResourceLoader[loaderpath.length];
      System.arraycopy(loaderpath, 0, this._path, 0, this._path.length);
   }

   public PathResourceLoader(File[] filepath) {
      ArrayList pathlist = new ArrayList();

      for(int i = 0; i < filepath.length; ++i) {
         try {
            FileResourceLoader e = new FileResourceLoader(filepath[i]);
            pathlist.add(e);
         } catch (IOException var5) {
            ;
         }
      }

      this._path = (ResourceLoader[])((ResourceLoader[])pathlist.toArray(new ResourceLoader[pathlist.size()]));
   }

   public InputStream getResourceAsStream(String resourceName) {
      for(int i = 0; i < this._path.length; ++i) {
         InputStream result = this._path[i].getResourceAsStream(resourceName);
         if(result != null) {
            return result;
         }
      }

      return null;
   }

   public void close() {
      for(int i = 0; i < this._path.length; ++i) {
         try {
            this._path[i].close();
         } catch (Exception var3) {
            ;
         }
      }

   }
}
