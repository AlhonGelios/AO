package org.apache.xmlbeans;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaComponent;
import org.apache.xmlbeans.SchemaLocalElement;
import org.apache.xmlbeans.SchemaTypeSystem;

public interface SchemaGlobalElement extends SchemaLocalElement, SchemaComponent {

   QName[] substitutionGroupMembers();

   SchemaGlobalElement substitutionGroup();

   boolean finalExtension();

   boolean finalRestriction();

   SchemaGlobalElement.Ref getRef();

   public static final class Ref extends SchemaComponent.Ref {

      public Ref(SchemaGlobalElement element) {
         super(element);
      }

      public Ref(SchemaTypeSystem system, String handle) {
         super(system, handle);
      }

      public final int getComponentType() {
         return 1;
      }

      public final SchemaGlobalElement get() {
         return (SchemaGlobalElement)this.getComponent();
      }
   }
}
