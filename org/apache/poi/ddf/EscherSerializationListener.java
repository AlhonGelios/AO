package org.apache.poi.ddf;

import org.apache.poi.ddf.EscherRecord;

public interface EscherSerializationListener {

   void beforeRecordSerialize(int var1, short var2, EscherRecord var3);

   void afterRecordSerialize(int var1, short var2, int var3, EscherRecord var4);
}
