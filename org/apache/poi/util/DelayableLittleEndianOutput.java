package org.apache.poi.util;

import org.apache.poi.util.LittleEndianOutput;

public interface DelayableLittleEndianOutput extends LittleEndianOutput {

   LittleEndianOutput createDelayedOutput(int var1);
}
