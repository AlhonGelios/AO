package org.apache.commons.collections4.list;

import java.util.List;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.list.AbstractSerializableListDecorator;

public class LazyList extends AbstractSerializableListDecorator {

   private static final long serialVersionUID = -1708388017160694542L;
   private final Factory factory;


   public static LazyList lazyList(List list, Factory factory) {
      return new LazyList(list, factory);
   }

   protected LazyList(List list, Factory factory) {
      super(list);
      if(factory == null) {
         throw new IllegalArgumentException("Factory must not be null");
      } else {
         this.factory = factory;
      }
   }

   public Object get(int index) {
      int size = this.decorated().size();
      Object var4;
      if(index < size) {
         var4 = this.decorated().get(index);
         if(var4 == null) {
            var4 = this.factory.create();
            this.decorated().set(index, var4);
            return var4;
         } else {
            return var4;
         }
      } else {
         for(int object = size; object < index; ++object) {
            this.decorated().add((Object)null);
         }

         var4 = this.factory.create();
         this.decorated().add(var4);
         return var4;
      }
   }

   public List subList(int fromIndex, int toIndex) {
      List sub = this.decorated().subList(fromIndex, toIndex);
      return new LazyList(sub, this.factory);
   }
}
