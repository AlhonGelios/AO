package org.apache.poi.util;

import java.util.Comparator;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;

public final class XmlSort {

   public static void sort(XmlObject element, Comparator comp) {
      XmlCursor headCursor = element.newCursor();
      if(!headCursor.isStart()) {
         throw new IllegalStateException("The element parameter must point to a STARTDOC");
      } else {
         boolean moved = headCursor.toFirstChild();
         if(moved) {
            XmlCursor listCursor = headCursor.newCursor();
            boolean moreElements = listCursor.toNextSibling();

            while(moreElements) {
               moved = false;

               while(true) {
                  if(headCursor.comparePosition(listCursor) < 0) {
                     if(comp.compare(headCursor, listCursor) <= 0) {
                        headCursor.toNextSibling();
                        continue;
                     }

                     listCursor.moveXml(headCursor);

                     while(!listCursor.isStart() && !listCursor.isEnd()) {
                        listCursor.moveXml(headCursor);
                     }

                     moreElements = listCursor.isStart();
                     moved = true;
                  }

                  if(!moved) {
                     moreElements = listCursor.toNextSibling();
                  }

                  headCursor.toParent();
                  headCursor.toFirstChild();
                  break;
               }
            }

         }
      }
   }
}
