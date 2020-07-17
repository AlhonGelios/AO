package org.apache.commons.collections4.comparators;

import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FixedOrderComparator implements Comparator, Serializable {

   private static final long serialVersionUID = 82794675842863201L;
   private final Map map = new HashMap();
   private int counter = 0;
   private boolean isLocked = false;
   private FixedOrderComparator.UnknownObjectBehavior unknownObjectBehavior;


   public FixedOrderComparator() {
      this.unknownObjectBehavior = FixedOrderComparator.UnknownObjectBehavior.EXCEPTION;
   }

   public FixedOrderComparator(Object ... items) {
      this.unknownObjectBehavior = FixedOrderComparator.UnknownObjectBehavior.EXCEPTION;
      if(items == null) {
         throw new NullPointerException("The list of items must not be null");
      } else {
         Object[] arr$ = items;
         int len$ = items.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            Object item = arr$[i$];
            this.add(item);
         }

      }
   }

   public FixedOrderComparator(List items) {
      this.unknownObjectBehavior = FixedOrderComparator.UnknownObjectBehavior.EXCEPTION;
      if(items == null) {
         throw new NullPointerException("The list of items must not be null");
      } else {
         Iterator i$ = items.iterator();

         while(i$.hasNext()) {
            Object t = i$.next();
            this.add(t);
         }

      }
   }

   public boolean isLocked() {
      return this.isLocked;
   }

   protected void checkLocked() {
      if(this.isLocked()) {
         throw new UnsupportedOperationException("Cannot modify a FixedOrderComparator after a comparison");
      }
   }

   public FixedOrderComparator.UnknownObjectBehavior getUnknownObjectBehavior() {
      return this.unknownObjectBehavior;
   }

   public void setUnknownObjectBehavior(FixedOrderComparator.UnknownObjectBehavior unknownObjectBehavior) {
      this.checkLocked();
      if(unknownObjectBehavior == null) {
         throw new NullPointerException("Unknown object behavior must not be null");
      } else {
         this.unknownObjectBehavior = unknownObjectBehavior;
      }
   }

   public boolean add(Object obj) {
      this.checkLocked();
      Integer position = (Integer)this.map.put(obj, Integer.valueOf(this.counter++));
      return position == null;
   }

   public boolean addAsEqual(Object existingObj, Object newObj) {
      this.checkLocked();
      Integer position = (Integer)this.map.get(existingObj);
      if(position == null) {
         throw new IllegalArgumentException(existingObj + " not known to " + this);
      } else {
         Integer result = (Integer)this.map.put(newObj, position);
         return result == null;
      }
   }

   public int compare(Object obj1, Object obj2) {
      this.isLocked = true;
      Integer position1 = (Integer)this.map.get(obj1);
      Integer position2 = (Integer)this.map.get(obj2);
      if(position1 != null && position2 != null) {
         return position1.compareTo(position2);
      } else {
         switch(FixedOrderComparator.NamelessClass566521121.$SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior[this.unknownObjectBehavior.ordinal()]) {
         case 1:
            return position1 == null?(position2 == null?0:-1):1;
         case 2:
            return position1 == null?(position2 == null?0:1):-1;
         case 3:
            Object unknownObj = position1 == null?obj1:obj2;
            throw new IllegalArgumentException("Attempting to compare unknown object " + unknownObj);
         default:
            throw new UnsupportedOperationException("Unknown unknownObjectBehavior: " + this.unknownObjectBehavior);
         }
      }
   }

   public int hashCode() {
      byte total = 17;
      int total1 = total * 37 + (this.map == null?0:this.map.hashCode());
      total1 = total1 * 37 + (this.unknownObjectBehavior == null?0:this.unknownObjectBehavior.hashCode());
      total1 = total1 * 37 + this.counter;
      total1 = total1 * 37 + (this.isLocked?0:1);
      return total1;
   }

   public boolean equals(Object object) {
      if(this == object) {
         return true;
      } else if(null == object) {
         return false;
      } else if(!object.getClass().equals(this.getClass())) {
         return false;
      } else {
         boolean var10000;
         label59: {
            FixedOrderComparator comp = (FixedOrderComparator)object;
            if(null == this.map) {
               if(null != comp.map) {
                  break label59;
               }
            } else if(!this.map.equals(comp.map)) {
               break label59;
            }

            if(null == this.unknownObjectBehavior) {
               if(null != comp.unknownObjectBehavior) {
                  break label59;
               }
            } else if(this.unknownObjectBehavior != comp.unknownObjectBehavior || this.counter != comp.counter || this.isLocked != comp.isLocked || this.unknownObjectBehavior != comp.unknownObjectBehavior) {
               break label59;
            }

            var10000 = true;
            return var10000;
         }

         var10000 = false;
         return var10000;
      }
   }

   public static enum UnknownObjectBehavior {

      BEFORE("BEFORE", 0),
      AFTER("AFTER", 1),
      EXCEPTION("EXCEPTION", 2);
      // $FF: synthetic field
      private static final FixedOrderComparator.UnknownObjectBehavior[] $VALUES = new FixedOrderComparator.UnknownObjectBehavior[]{BEFORE, AFTER, EXCEPTION};


      private UnknownObjectBehavior(String var1, int var2) {}

   }

   // $FF: synthetic class
   static class NamelessClass566521121 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior = new int[FixedOrderComparator.UnknownObjectBehavior.values().length];


      static {
         try {
            $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior[FixedOrderComparator.UnknownObjectBehavior.BEFORE.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior[FixedOrderComparator.UnknownObjectBehavior.AFTER.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$commons$collections4$comparators$FixedOrderComparator$UnknownObjectBehavior[FixedOrderComparator.UnknownObjectBehavior.EXCEPTION.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
