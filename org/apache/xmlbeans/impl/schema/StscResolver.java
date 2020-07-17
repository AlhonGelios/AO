package org.apache.xmlbeans.impl.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.QNameSet;
import org.apache.xmlbeans.SchemaAttributeModel;
import org.apache.xmlbeans.SchemaParticle;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;
import org.apache.xmlbeans.impl.schema.SchemaAttributeModelImpl;
import org.apache.xmlbeans.impl.schema.SchemaGlobalAttributeImpl;
import org.apache.xmlbeans.impl.schema.SchemaGlobalElementImpl;
import org.apache.xmlbeans.impl.schema.SchemaIdentityConstraintImpl;
import org.apache.xmlbeans.impl.schema.SchemaLocalAttributeImpl;
import org.apache.xmlbeans.impl.schema.SchemaLocalElementImpl;
import org.apache.xmlbeans.impl.schema.SchemaTypeImpl;
import org.apache.xmlbeans.impl.schema.StscComplexTypeResolver;
import org.apache.xmlbeans.impl.schema.StscSimpleTypeResolver;
import org.apache.xmlbeans.impl.schema.StscState;
import org.apache.xmlbeans.impl.schema.StscTranslator;
import org.apache.xmlbeans.impl.xb.xsdschema.Attribute;
import org.apache.xmlbeans.impl.xb.xsdschema.Element;
import org.apache.xmlbeans.impl.xb.xsdschema.KeyrefDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.TopLevelElement;

public class StscResolver {

   public static void resolveAll() {
      StscState state = StscState.get();
      SchemaType[] documentTypes = state.documentTypes();

      for(int allSeenTypes = 0; allSeenTypes < documentTypes.length; ++allSeenTypes) {
         resolveSubstitutionGroup((SchemaTypeImpl)documentTypes[allSeenTypes]);
      }

      ArrayList var5 = new ArrayList();
      var5.addAll(Arrays.asList(state.documentTypes()));
      var5.addAll(Arrays.asList(state.attributeTypes()));
      var5.addAll(Arrays.asList(state.redefinedGlobalTypes()));
      var5.addAll(Arrays.asList(state.globalTypes()));

      for(int i = 0; i < var5.size(); ++i) {
         SchemaType gType = (SchemaType)var5.get(i);
         resolveType((SchemaTypeImpl)gType);
         var5.addAll(Arrays.asList(gType.getAnonymousTypes()));
      }

      resolveIdentityConstraints();
   }

   public static boolean resolveType(SchemaTypeImpl sImpl) {
      if(sImpl.isResolved()) {
         return true;
      } else if(sImpl.isResolving()) {
         StscState.get().error("Cyclic dependency error", 13, sImpl.getParseObject());
         return false;
      } else {
         sImpl.startResolving();
         if(sImpl.isDocumentType()) {
            resolveDocumentType(sImpl);
         } else if(sImpl.isAttributeType()) {
            resolveAttributeType(sImpl);
         } else if(sImpl.isSimpleType()) {
            StscSimpleTypeResolver.resolveSimpleType(sImpl);
         } else {
            StscComplexTypeResolver.resolveComplexType(sImpl);
         }

         sImpl.finishResolving();
         return true;
      }
   }

   public static boolean resolveSubstitutionGroup(SchemaTypeImpl sImpl) {
      assert sImpl.isDocumentType();

      if(sImpl.isSGResolved()) {
         return true;
      } else if(sImpl.isSGResolving()) {
         StscState.get().error("Cyclic dependency error", 13, sImpl.getParseObject());
         return false;
      } else {
         sImpl.startResolvingSGs();
         TopLevelElement elt = (TopLevelElement)sImpl.getParseObject();
         SchemaTypeImpl substitutionGroup = null;
         QName eltName = new QName(sImpl.getTargetNamespace(), elt.getName());
         if(elt.isSetSubstitutionGroup()) {
            substitutionGroup = StscState.get().findDocumentType(elt.getSubstitutionGroup(), sImpl.getChameleonNamespace(), sImpl.getTargetNamespace());
            if(substitutionGroup == null) {
               StscState.get().notFoundError(elt.getSubstitutionGroup(), 1, elt.xgetSubstitutionGroup(), true);
            } else if(!resolveSubstitutionGroup(substitutionGroup)) {
               substitutionGroup = null;
            } else {
               sImpl.setSubstitutionGroup(elt.getSubstitutionGroup());
            }
         }

         while(substitutionGroup != null) {
            substitutionGroup.addSubstitutionGroupMember(eltName);
            if(substitutionGroup.getSubstitutionGroup() == null) {
               break;
            }

            substitutionGroup = StscState.get().findDocumentType(substitutionGroup.getSubstitutionGroup(), substitutionGroup.getChameleonNamespace(), (String)null);

            assert substitutionGroup != null : "Could not find document type for: " + substitutionGroup.getSubstitutionGroup();

            if(!resolveSubstitutionGroup(substitutionGroup)) {
               substitutionGroup = null;
            }
         }

         sImpl.finishResolvingSGs();
         return true;
      }
   }

   public static void resolveDocumentType(SchemaTypeImpl sImpl) {
      assert sImpl.isResolving();

      assert sImpl.isDocumentType();

      ArrayList anonTypes = new ArrayList();
      SchemaGlobalElementImpl element = (SchemaGlobalElementImpl)StscTranslator.translateElement((Element)sImpl.getParseObject(), sImpl.getTargetNamespace(), sImpl.isChameleon(), (String)null, (String)null, anonTypes, sImpl);
      SchemaLocalElementImpl contentModel = null;
      if(element != null) {
         StscState.get().addGlobalElement(element);
         contentModel = new SchemaLocalElementImpl();
         contentModel.setParticleType(4);
         StscTranslator.copyGlobalElementToLocalElement(element, contentModel);
         contentModel.setMinOccurs(BigInteger.ONE);
         contentModel.setMaxOccurs(BigInteger.ONE);
         contentModel.setTransitionNotes(QNameSet.EMPTY, true);
      }

      Map elementPropertyModel = StscComplexTypeResolver.buildContentPropertyModelByQName(contentModel, sImpl);
      SchemaTypeImpl baseType = sImpl.getSubstitutionGroup() == null?BuiltinSchemaTypeSystem.ST_ANY_TYPE:StscState.get().findDocumentType(sImpl.getSubstitutionGroup(), sImpl.isChameleon()?sImpl.getTargetNamespace():null, (String)null);
      sImpl.setBaseTypeRef(baseType.getRef());
      sImpl.setBaseDepth(baseType.getBaseDepth() + 1);
      sImpl.setDerivationType(1);
      sImpl.setComplexTypeVariety(3);
      sImpl.setContentModel(contentModel, new SchemaAttributeModelImpl(), elementPropertyModel, Collections.EMPTY_MAP, false);
      sImpl.setWildcardSummary(QNameSet.EMPTY, false, QNameSet.EMPTY, false);
      sImpl.setAnonymousTypeRefs(makeRefArray(anonTypes));
   }

   public static void resolveAttributeType(SchemaTypeImpl sImpl) {
      assert sImpl.isResolving();

      assert sImpl.isAttributeType();

      ArrayList anonTypes = new ArrayList();
      SchemaGlobalAttributeImpl attribute = (SchemaGlobalAttributeImpl)StscTranslator.translateAttribute((Attribute)sImpl.getParseObject(), sImpl.getTargetNamespace(), (String)null, sImpl.isChameleon(), anonTypes, sImpl, (SchemaAttributeModel)null, false);
      SchemaAttributeModelImpl attributeModel = new SchemaAttributeModelImpl();
      if(attribute != null) {
         StscState.get().addGlobalAttribute(attribute);
         SchemaLocalAttributeImpl attributePropertyModel = new SchemaLocalAttributeImpl();
         StscTranslator.copyGlobalAttributeToLocalAttribute(attribute, attributePropertyModel);
         attributeModel.addAttribute(attributePropertyModel);
      }

      sImpl.setBaseTypeRef(BuiltinSchemaTypeSystem.ST_ANY_TYPE.getRef());
      sImpl.setBaseDepth(sImpl.getBaseDepth() + 1);
      sImpl.setDerivationType(1);
      sImpl.setComplexTypeVariety(1);
      Map attributePropertyModel1 = StscComplexTypeResolver.buildAttributePropertyModelByQName(attributeModel, sImpl);
      sImpl.setContentModel((SchemaParticle)null, attributeModel, Collections.EMPTY_MAP, attributePropertyModel1, false);
      sImpl.setWildcardSummary(QNameSet.EMPTY, false, QNameSet.EMPTY, false);
      sImpl.setAnonymousTypeRefs(makeRefArray(anonTypes));
   }

   private static SchemaType.Ref[] makeRefArray(Collection typeList) {
      SchemaType.Ref[] result = new SchemaType.Ref[typeList.size()];
      int j = 0;

      for(Iterator i = typeList.iterator(); i.hasNext(); ++j) {
         result[j] = ((SchemaType)i.next()).getRef();
      }

      return result;
   }

   public static void resolveIdentityConstraints() {
      StscState state = StscState.get();
      SchemaIdentityConstraintImpl[] idcs = state.idConstraints();

      for(int i = 0; i < idcs.length; ++i) {
         if(!idcs[i].isResolved()) {
            KeyrefDocument.Keyref xsdkr = (KeyrefDocument.Keyref)idcs[i].getParseObject();
            QName keyName = xsdkr.getRefer();
            SchemaIdentityConstraintImpl key = null;
            key = state.findIdConstraint(keyName, idcs[i].getChameleonNamespace(), idcs[i].getTargetNamespace());
            if(key == null) {
               state.notFoundError(keyName, 5, xsdkr, true);
            } else {
               if(key.getConstraintCategory() == 2) {
                  state.error("c-props-correct.1", (Object[])null, idcs[i].getParseObject());
               }

               if(key.getFields().length != idcs[i].getFields().length) {
                  state.error("c-props-correct.2", (Object[])null, idcs[i].getParseObject());
               }

               idcs[i].setReferencedKey(key.getRef());
            }
         }
      }

   }

}
