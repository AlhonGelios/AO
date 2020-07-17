package org.apache.poi.ddf;

import org.apache.poi.ddf.AbstractEscherOptRecord;

public class EscherTertiaryOptRecord extends AbstractEscherOptRecord {

   public static final short RECORD_ID = -3806;


   public String getRecordName() {
      return "TertiaryOpt";
   }
}
