package org.apache.xmlbeans;

import org.apache.xmlbeans.SchemaComponent;
import org.apache.xmlbeans.SchemaLocalAttribute;
import org.apache.xmlbeans.SchemaTypeSystem;

public interface SchemaGlobalAttribute extends SchemaLocalAttribute, SchemaComponent {

   SchemaGlobalAttribute.Ref getRef();

   public static final class Ref extends SchemaComponent.Ref {

      public Ref(SchemaGlobalAttribute element) {
         super(element);
      }

      public Ref(SchemaTypeSystem system, String handle) {
         super(system, handle);
      }

      public final int getComponentType() {
         return 3;
      }

      public final SchemaGlobalAttribute get() {
         return (SchemaGlobalAttribute)this.getComponent();
      }
   }
}
