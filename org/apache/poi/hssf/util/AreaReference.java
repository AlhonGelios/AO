package org.apache.poi.hssf.util;

import org.apache.poi.hssf.util.CellReference;

@Deprecated
public final class AreaReference extends org.apache.poi.ss.util.AreaReference {

   public AreaReference(String reference) {
      super(reference);
   }

   public AreaReference(CellReference topLeft, CellReference botRight) {
      super((org.apache.poi.ss.util.CellReference)topLeft, (org.apache.poi.ss.util.CellReference)botRight);
   }
}
