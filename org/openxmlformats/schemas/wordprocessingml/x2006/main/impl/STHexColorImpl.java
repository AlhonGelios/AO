package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlUnionImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColor;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColorAuto;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STHexColorRGB;

public class STHexColorImpl extends XmlUnionImpl implements STHexColor, STHexColorAuto, STHexColorRGB {

   public STHexColorImpl(SchemaType var1) {
      super(var1, false);
   }

   protected STHexColorImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }
}
