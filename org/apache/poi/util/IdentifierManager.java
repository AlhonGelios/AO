package org.apache.poi.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IdentifierManager {

   public static final long MAX_ID = 9223372036854775806L;
   public static final long MIN_ID = 0L;
   private final long upperbound;
   private final long lowerbound;
   private LinkedList segments;


   public IdentifierManager(long lowerbound, long upperbound) {
      if(lowerbound > upperbound) {
         throw new IllegalArgumentException("lowerbound must not be greater than upperbound, had " + lowerbound + " and " + upperbound);
      } else if(lowerbound < 0L) {
         String message = "lowerbound must be greater than or equal to " + Long.toString(0L);
         throw new IllegalArgumentException(message);
      } else if(upperbound > 9223372036854775806L) {
         throw new IllegalArgumentException("upperbound must be less than or equal to " + Long.toString(9223372036854775806L) + " but had " + upperbound);
      } else {
         this.lowerbound = lowerbound;
         this.upperbound = upperbound;
         this.segments = new LinkedList();
         this.segments.add(new IdentifierManager.Segment(lowerbound, upperbound));
      }
   }

   public long reserve(long id) {
      if(id >= this.lowerbound && id <= this.upperbound) {
         this.verifyIdentifiersLeft();
         IdentifierManager.Segment iter1;
         if(id == this.upperbound) {
            iter1 = (IdentifierManager.Segment)this.segments.getLast();
            if(iter1.end == this.upperbound) {
               iter1.end = this.upperbound - 1L;
               if(iter1.start > iter1.end) {
                  this.segments.removeLast();
               }

               return id;
            } else {
               return this.reserveNew();
            }
         } else if(id == this.lowerbound) {
            iter1 = (IdentifierManager.Segment)this.segments.getFirst();
            if(iter1.start == this.lowerbound) {
               iter1.start = this.lowerbound + 1L;
               if(iter1.end < iter1.start) {
                  this.segments.removeFirst();
               }

               return id;
            } else {
               return this.reserveNew();
            }
         } else {
            ListIterator iter = this.segments.listIterator();

            while(iter.hasNext()) {
               IdentifierManager.Segment segment = (IdentifierManager.Segment)iter.next();
               if(segment.end >= id) {
                  if(segment.start <= id) {
                     if(segment.start == id) {
                        segment.start = id + 1L;
                        if(segment.end < segment.start) {
                           iter.remove();
                        }

                        return id;
                     }

                     if(segment.end == id) {
                        segment.end = id - 1L;
                        if(segment.start > segment.end) {
                           iter.remove();
                        }

                        return id;
                     }

                     iter.add(new IdentifierManager.Segment(id + 1L, segment.end));
                     segment.end = id - 1L;
                     return id;
                  }
                  break;
               }
            }

            return this.reserveNew();
         }
      } else {
         throw new IllegalArgumentException("Value for parameter \'id\' was out of bounds, had " + id + ", but should be within [" + this.lowerbound + ":" + this.upperbound + "]");
      }
   }

   public long reserveNew() {
      this.verifyIdentifiersLeft();
      IdentifierManager.Segment segment = (IdentifierManager.Segment)this.segments.getFirst();
      long result = (long)(segment.start++);
      if(segment.start > segment.end) {
         this.segments.removeFirst();
      }

      return result;
   }

   public boolean release(long id) {
      if(id >= this.lowerbound && id <= this.upperbound) {
         IdentifierManager.Segment higher1;
         if(id == this.upperbound) {
            higher1 = (IdentifierManager.Segment)this.segments.getLast();
            if(higher1.end == this.upperbound - 1L) {
               higher1.end = this.upperbound;
               return true;
            } else if(higher1.end == this.upperbound) {
               return false;
            } else {
               this.segments.add(new IdentifierManager.Segment(this.upperbound, this.upperbound));
               return true;
            }
         } else if(id == this.lowerbound) {
            higher1 = (IdentifierManager.Segment)this.segments.getFirst();
            if(higher1.start == this.lowerbound + 1L) {
               higher1.start = this.lowerbound;
               return true;
            } else if(higher1.start == this.lowerbound) {
               return false;
            } else {
               this.segments.addFirst(new IdentifierManager.Segment(this.lowerbound, this.lowerbound));
               return true;
            }
         } else {
            long higher = id + 1L;
            long lower = id - 1L;
            ListIterator iter = this.segments.listIterator();

            while(iter.hasNext()) {
               IdentifierManager.Segment segment = (IdentifierManager.Segment)iter.next();
               if(segment.end >= lower) {
                  if(segment.start > higher) {
                     iter.previous();
                     iter.add(new IdentifierManager.Segment(id, id));
                     return true;
                  }

                  if(segment.start == higher) {
                     segment.start = id;
                     return true;
                  }

                  if(segment.end == lower) {
                     segment.end = id;
                     if(iter.hasNext()) {
                        IdentifierManager.Segment next = (IdentifierManager.Segment)iter.next();
                        if(next.start == segment.end + 1L) {
                           segment.end = next.end;
                           iter.remove();
                        }
                     }

                     return true;
                  }
                  break;
               }
            }

            return false;
         }
      } else {
         throw new IllegalArgumentException("Value for parameter \'id\' was out of bounds, had " + id + ", but should be within [" + this.lowerbound + ":" + this.upperbound + "]");
      }
   }

   public long getRemainingIdentifiers() {
      long result = 0L;

      IdentifierManager.Segment segment;
      for(Iterator i$ = this.segments.iterator(); i$.hasNext(); result = result + segment.end + 1L) {
         segment = (IdentifierManager.Segment)i$.next();
         result -= segment.start;
      }

      return result;
   }

   private void verifyIdentifiersLeft() {
      if(this.segments.isEmpty()) {
         throw new IllegalStateException("No identifiers left");
      }
   }

   private static class Segment {

      public long start;
      public long end;


      public Segment(long start, long end) {
         this.start = start;
         this.end = end;
      }

      public String toString() {
         return "[" + this.start + "; " + this.end + "]";
      }
   }
}
