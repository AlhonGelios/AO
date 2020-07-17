package org.apache.xmlbeans.impl.config;

import java.util.HashSet;
import java.util.Set;
import org.apache.xmlbeans.impl.config.NameSet;

public class NameSetBuilder {

   private boolean _isFinite = true;
   private Set _finiteSet = new HashSet();


   public void invert() {
      this._isFinite = !this._isFinite;
   }

   public void add(String name) {
      if(this._isFinite) {
         this._finiteSet.add(name);
      } else {
         this._finiteSet.remove(name);
      }

   }

   public NameSet toNameSet() {
      return this._finiteSet.size() == 0?(this._isFinite?NameSet.EMPTY:NameSet.EVERYTHING):NameSet.newInstance(this._isFinite, this._finiteSet);
   }
}
