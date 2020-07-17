package org.apache.xmlbeans;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaTypeSystem;

public interface SchemaComponent {

   int TYPE = 0;
   int ELEMENT = 1;
   int ATTRIBUTE = 3;
   int ATTRIBUTE_GROUP = 4;
   int IDENTITY_CONSTRAINT = 5;
   int MODEL_GROUP = 6;
   int NOTATION = 7;
   int ANNOTATION = 8;


   int getComponentType();

   SchemaTypeSystem getTypeSystem();

   QName getName();

   String getSourceName();

   SchemaComponent.Ref getComponentRef();

   static class NamelessClass1592966255 {
   }

   public abstract static class Ref {

      private volatile SchemaComponent _schemaComponent;
      private SchemaTypeSystem _schemaTypeSystem;
      public String _handle;
      static final boolean $assertionsDisabled = !SchemaComponent.class.desiredAssertionStatus();


      protected Ref(SchemaComponent schemaComponent) {
         this._schemaComponent = schemaComponent;
      }

      protected Ref(SchemaTypeSystem schemaTypeSystem, String handle) {
         if(!$assertionsDisabled && handle == null) {
            throw new AssertionError();
         } else {
            this._schemaTypeSystem = schemaTypeSystem;
            this._handle = handle;
         }
      }

      public abstract int getComponentType();

      public final SchemaTypeSystem getTypeSystem() {
         return this._schemaTypeSystem;
      }

      public final SchemaComponent getComponent() {
         if(this._schemaComponent == null && this._handle != null) {
            synchronized(this) {
               if(this._schemaComponent == null && this._handle != null) {
                  this._schemaComponent = this._schemaTypeSystem.resolveHandle(this._handle);
                  this._schemaTypeSystem = null;
               }
            }
         }

         return this._schemaComponent;
      }

   }
}
