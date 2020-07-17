package org.openxmlformats.schemas.drawingml.x2006.main.impl;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.XmlUnionImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.STAdjCoordinate;
import org.openxmlformats.schemas.drawingml.x2006.main.STCoordinate;
import org.openxmlformats.schemas.drawingml.x2006.main.STGeomGuideName;

public class STAdjCoordinateImpl extends XmlUnionImpl implements STAdjCoordinate, STCoordinate, STGeomGuideName {

   public STAdjCoordinateImpl(SchemaType var1) {
      super(var1, false);
   }

   protected STAdjCoordinateImpl(SchemaType var1, boolean var2) {
      super(var1, var2);
   }
}
