package org.apache.xmlbeans.impl.schema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaAttributeModel;
import org.apache.xmlbeans.SchemaGlobalElement;
import org.apache.xmlbeans.SchemaIdentityConstraint;
import org.apache.xmlbeans.SchemaLocalAttribute;
import org.apache.xmlbeans.SchemaLocalElement;
import org.apache.xmlbeans.SchemaParticle;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlID;
import org.apache.xmlbeans.XmlNOTATION;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.common.QNameHelper;
import org.apache.xmlbeans.impl.common.XBeanDebug;
import org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;
import org.apache.xmlbeans.impl.schema.SchemaGlobalElementImpl;
import org.apache.xmlbeans.impl.schema.SchemaLocalAttributeImpl;
import org.apache.xmlbeans.impl.schema.SchemaLocalElementImpl;
import org.apache.xmlbeans.impl.schema.SchemaParticleImpl;
import org.apache.xmlbeans.impl.schema.SchemaPropertyImpl;
import org.apache.xmlbeans.impl.schema.SchemaTypeImpl;
import org.apache.xmlbeans.impl.schema.StscState;
import org.apache.xmlbeans.impl.schema.XmlValueRef;

public class StscChecker {

   public static void checkAll() {
      StscState state = StscState.get();
      ArrayList allSeenTypes = new ArrayList();
      allSeenTypes.addAll(Arrays.asList(state.documentTypes()));
      allSeenTypes.addAll(Arrays.asList(state.attributeTypes()));
      allSeenTypes.addAll(Arrays.asList(state.redefinedGlobalTypes()));
      allSeenTypes.addAll(Arrays.asList(state.globalTypes()));

      for(int i = 0; i < allSeenTypes.size(); ++i) {
         SchemaType gType = (SchemaType)allSeenTypes.get(i);
         if(!state.noPvr() && !gType.isDocumentType()) {
            checkRestriction((SchemaTypeImpl)gType);
         }

         checkFields((SchemaTypeImpl)gType);
         allSeenTypes.addAll(Arrays.asList(gType.getAnonymousTypes()));
      }

      checkSubstitutionGroups(state.globalElements());
   }

   public static void checkFields(SchemaTypeImpl sType) {
      if(!sType.isSimpleType()) {
         XmlObject location = sType.getParseObject();
         SchemaAttributeModel sAttrModel = sType.getAttributeModel();
         if(sAttrModel != null) {
            SchemaLocalAttribute[] sAttrs = sAttrModel.getAttributes();
            QName idAttr = null;

            for(int i = 0; i < sAttrs.length; ++i) {
               XmlObject attrLocation = ((SchemaLocalAttributeImpl)sAttrs[i])._parseObject;
               if(XmlID.type.isAssignableFrom(sAttrs[i].getType())) {
                  if(idAttr == null) {
                     idAttr = sAttrs[i].getName();
                  } else {
                     StscState.get().error("ag-props-correct.3", new Object[]{QNameHelper.pretty(idAttr), sAttrs[i].getName()}, attrLocation != null?attrLocation:location);
                  }

                  if(sAttrs[i].getDefaultText() != null) {
                     StscState.get().error("a-props-correct.3", (Object[])null, attrLocation != null?attrLocation:location);
                  }
               } else if(XmlNOTATION.type.isAssignableFrom(sAttrs[i].getType())) {
                  if(sAttrs[i].getType().getBuiltinTypeCode() == 8) {
                     StscState.get().recover("enumeration-required-notation-attr", new Object[]{QNameHelper.pretty(sAttrs[i].getName())}, attrLocation != null?attrLocation:location);
                  } else {
                     if(sAttrs[i].getType().getSimpleVariety() == 2) {
                        SchemaType[] valueConstraint = sAttrs[i].getType().getUnionConstituentTypes();

                        for(int e = 0; e < valueConstraint.length; ++e) {
                           if(valueConstraint[e].getBuiltinTypeCode() == 8) {
                              StscState.get().recover("enumeration-required-notation-attr", new Object[]{QNameHelper.pretty(sAttrs[i].getName())}, attrLocation != null?attrLocation:location);
                           }
                        }
                     }

                     boolean var12;
                     if(sType.isAttributeType()) {
                        var12 = sAttrs[i].getName().getNamespaceURI().length() > 0;
                     } else {
                        Object var14;
                        for(var14 = sType; ((SchemaType)var14).getOuterType() != null; var14 = ((SchemaType)var14).getOuterType()) {
                           ;
                        }

                        if(((SchemaType)var14).isDocumentType()) {
                           var12 = ((SchemaType)var14).getDocumentElementName().getNamespaceURI().length() > 0;
                        } else {
                           var12 = ((SchemaType)var14).getName().getNamespaceURI().length() > 0;
                        }
                     }

                     if(var12) {
                        StscState.get().warning("notation-targetns-attr", new Object[]{QNameHelper.pretty(sAttrs[i].getName())}, attrLocation != null?attrLocation:location);
                     }
                  }
               } else {
                  String var13 = sAttrs[i].getDefaultText();
                  if(var13 != null) {
                     try {
                        XmlAnySimpleType var15 = sAttrs[i].getDefaultValue();
                        if(!var15.validate()) {
                           throw new Exception();
                        }

                        SchemaPropertyImpl var16 = (SchemaPropertyImpl)sType.getAttributeProperty(sAttrs[i].getName());
                        if(var16 != null && var16.getDefaultText() != null) {
                           var16.setDefaultValue(new XmlValueRef(var15));
                        }
                     } catch (Exception var11) {
                        String constraintName = sAttrs[i].isFixed()?"fixed":"default";
                        XmlObject constraintLocation = location;
                        if(attrLocation != null) {
                           constraintLocation = attrLocation.selectAttribute("", constraintName);
                           if(constraintLocation == null) {
                              constraintLocation = attrLocation;
                           }
                        }

                        StscState.get().error("a-props-correct.2", new Object[]{QNameHelper.pretty(sAttrs[i].getName()), constraintName, var13, QNameHelper.pretty(sAttrs[i].getType().getName())}, constraintLocation);
                     }
                  }
               }
            }
         }

         checkElementDefaults(sType.getContentModel(), location, sType);
      }
   }

   private static void checkElementDefaults(SchemaParticle model, XmlObject location, SchemaType parentType) {
      if(model != null) {
         switch(model.getParticleType()) {
         case 1:
         case 2:
         case 3:
            SchemaParticle[] children = model.getParticleChildren();

            for(int var9 = 0; var9 < children.length; ++var9) {
               checkElementDefaults(children[var9], location, parentType);
            }

            return;
         case 4:
            String valueConstraint = model.getDefaultText();
            String var10;
            if(valueConstraint != null) {
               if(!model.getType().isSimpleType() && model.getType().getContentType() != 2) {
                  if(model.getType().getContentType() == 4) {
                     if(!model.getType().getContentModel().isSkippable()) {
                        var10 = model.isFixed()?"fixed":"default";
                        XmlObject var14 = location.selectAttribute("", var10);
                        StscState.get().error("cos-valid-default.2.2.2", new Object[]{QNameHelper.pretty(model.getName()), var10, valueConstraint}, var14 == null?location:var14);
                     } else {
                        SchemaPropertyImpl var11 = (SchemaPropertyImpl)parentType.getElementProperty(model.getName());
                        if(var11 != null && var11.getDefaultText() != null) {
                           var11.setDefaultValue(new XmlValueRef(XmlString.type.newValue(valueConstraint)));
                        }
                     }
                  } else {
                     XmlObject var12;
                     if(model.getType().getContentType() == 3) {
                        var12 = location.selectAttribute("", "default");
                        StscState.get().error("cos-valid-default.2.1", new Object[]{QNameHelper.pretty(model.getName()), valueConstraint, "element"}, var12 == null?location:var12);
                     } else if(model.getType().getContentType() == 1) {
                        var12 = location.selectAttribute("", "default");
                        StscState.get().error("cos-valid-default.2.1", new Object[]{QNameHelper.pretty(model.getName()), valueConstraint, "empty"}, var12 == null?location:var12);
                     }
                  }
               } else {
                  try {
                     XmlAnySimpleType warningType = model.getDefaultValue();
                     XmlOptions var13 = new XmlOptions();
                     var13.put("VALIDATE_TEXT_ONLY");
                     if(!warningType.validate(var13)) {
                        throw new Exception();
                     }

                     SchemaPropertyImpl var16 = (SchemaPropertyImpl)parentType.getElementProperty(model.getName());
                     if(var16 != null && var16.getDefaultText() != null) {
                        var16.setDefaultValue(new XmlValueRef(warningType));
                     }
                  } catch (Exception var8) {
                     String hasNS = model.isFixed()?"fixed":"default";
                     XmlObject t = location.selectAttribute("", hasNS);
                     StscState.get().error("e-props-correct.2", new Object[]{QNameHelper.pretty(model.getName()), hasNS, valueConstraint, QNameHelper.pretty(model.getType().getName())}, t == null?location:t);
                  }
               }
            }

            var10 = null;
            if(BuiltinSchemaTypeSystem.ST_ID.isAssignableFrom(model.getType())) {
               var10 = BuiltinSchemaTypeSystem.ST_ID.getName().getLocalPart();
            } else if(BuiltinSchemaTypeSystem.ST_IDREF.isAssignableFrom(model.getType())) {
               var10 = BuiltinSchemaTypeSystem.ST_IDREF.getName().getLocalPart();
            } else if(BuiltinSchemaTypeSystem.ST_IDREFS.isAssignableFrom(model.getType())) {
               var10 = BuiltinSchemaTypeSystem.ST_IDREFS.getName().getLocalPart();
            } else if(BuiltinSchemaTypeSystem.ST_ENTITY.isAssignableFrom(model.getType())) {
               var10 = BuiltinSchemaTypeSystem.ST_ENTITY.getName().getLocalPart();
            } else if(BuiltinSchemaTypeSystem.ST_ENTITIES.isAssignableFrom(model.getType())) {
               var10 = BuiltinSchemaTypeSystem.ST_ENTITIES.getName().getLocalPart();
            } else if(BuiltinSchemaTypeSystem.ST_NOTATION.isAssignableFrom(model.getType())) {
               if(model.getType().getBuiltinTypeCode() == 8) {
                  StscState.get().recover("enumeration-required-notation-elem", new Object[]{QNameHelper.pretty(model.getName())}, ((SchemaLocalElementImpl)model)._parseObject == null?location:((SchemaLocalElementImpl)model)._parseObject.selectAttribute("", "type"));
               } else {
                  if(model.getType().getSimpleVariety() == 2) {
                     SchemaType[] var15 = model.getType().getUnionConstituentTypes();

                     for(int var18 = 0; var18 < var15.length; ++var18) {
                        if(var15[var18].getBuiltinTypeCode() == 8) {
                           StscState.get().recover("enumeration-required-notation-elem", new Object[]{QNameHelper.pretty(model.getName())}, ((SchemaLocalElementImpl)model)._parseObject == null?location:((SchemaLocalElementImpl)model)._parseObject.selectAttribute("", "type"));
                        }
                     }
                  }

                  var10 = BuiltinSchemaTypeSystem.ST_NOTATION.getName().getLocalPart();
               }

               SchemaType var19;
               for(var19 = parentType; var19.getOuterType() != null; var19 = var19.getOuterType()) {
                  ;
               }

               boolean var17;
               if(var19.isDocumentType()) {
                  var17 = var19.getDocumentElementName().getNamespaceURI().length() > 0;
               } else {
                  var17 = var19.getName().getNamespaceURI().length() > 0;
               }

               if(var17) {
                  StscState.get().warning("notation-targetns-elem", new Object[]{QNameHelper.pretty(model.getName())}, ((SchemaLocalElementImpl)model)._parseObject == null?location:((SchemaLocalElementImpl)model)._parseObject);
               }
            }

            if(var10 != null) {
               StscState.get().warning("id-idref-idrefs-entity-entities-notation", new Object[]{QNameHelper.pretty(model.getName()), var10}, ((SchemaLocalElementImpl)model)._parseObject == null?location:((SchemaLocalElementImpl)model)._parseObject.selectAttribute("", "type"));
            }
         }

      }
   }

   public static boolean checkRestriction(SchemaTypeImpl sType) {
      if(sType.getDerivationType() == 1 && !sType.isSimpleType()) {
         StscState state = StscState.get();
         XmlObject location = sType.getParseObject();
         SchemaType baseType = sType.getBaseType();
         if(baseType.isSimpleType()) {
            state.error("src-ct.1", new Object[]{QNameHelper.pretty(baseType.getName())}, location);
            return false;
         }

         switch(sType.getContentType()) {
         case 1:
            switch(baseType.getContentType()) {
            case 1:
               return true;
            case 2:
            default:
               state.error("derivation-ok-restriction.5.2", (Object[])null, location);
               return false;
            case 3:
            case 4:
               if(baseType.getContentModel() != null && !baseType.getContentModel().isSkippable()) {
                  state.error("derivation-ok-restriction.5.2.2", (Object[])null, location);
                  return false;
               }

               return true;
            }
         case 2:
            switch(baseType.getContentType()) {
            case 2:
               SchemaType baseModel1 = sType.getContentBasedOnType();
               if(baseModel1 != baseType) {
                  SchemaType derivedModel1;
                  for(derivedModel1 = baseType; derivedModel1 != null && !derivedModel1.isSimpleType(); derivedModel1 = derivedModel1.getContentBasedOnType()) {
                     ;
                  }

                  if(derivedModel1 != null && !derivedModel1.isAssignableFrom(baseModel1)) {
                     state.error("derivation-ok-restriction.5.2.2.1", (Object[])null, location);
                     return false;
                  }
               }

               return true;
            case 4:
               if(baseType.getContentModel() != null && !baseType.getContentModel().isSkippable()) {
                  state.error("derivation-ok-restriction.5.1.2", (Object[])null, location);
                  return false;
               }

               return true;
            default:
               state.error("derivation-ok-restriction.5.1", (Object[])null, location);
               return false;
            }
         case 4:
            if(baseType.getContentType() != 4) {
               state.error("derivation-ok-restriction.5.3a", (Object[])null, location);
               return false;
            }
         case 3:
            if(baseType.getContentType() == 1) {
               state.error("derivation-ok-restriction.5.3b", (Object[])null, location);
               return false;
            }

            if(baseType.getContentType() == 2) {
               state.error("derivation-ok-restriction.5.3c", (Object[])null, location);
               return false;
            }

            SchemaParticle baseModel = baseType.getContentModel();
            SchemaParticle derivedModel = sType.getContentModel();
            if(derivedModel == null && sType.getDerivationType() == 1) {
               return true;
            }

            if(baseModel == null || derivedModel == null) {
               XBeanDebug.logStackTrace("Null models that weren\'t caught by EMPTY_CONTENT: " + baseType + " (" + baseModel + "), " + sType + " (" + derivedModel + ")");
               state.error("derivation-ok-restriction.5.3", (Object[])null, location);
               return false;
            }

            ArrayList errors = new ArrayList();
            boolean isValid = isParticleValidRestriction(baseModel, derivedModel, errors, location);
            if(!isValid) {
               if(errors.size() == 0) {
                  state.error("derivation-ok-restriction.5.3", (Object[])null, location);
               } else {
                  state.getErrorListener().add(errors.get(errors.size() - 1));
               }

               return false;
            }
         }
      }

      return true;
   }

   public static boolean isParticleValidRestriction(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      boolean restrictionValid = false;
      if(baseModel.equals(derivedModel)) {
         restrictionValid = true;
      } else {
         switch(baseModel.getParticleType()) {
         case 1:
            switch(derivedModel.getParticleType()) {
            case 1:
               restrictionValid = recurse(baseModel, derivedModel, errors, context);
               return restrictionValid;
            case 2:
            case 5:
               errors.add(XmlError.forObject("cos-particle-restrict.2", new Object[]{printParticle(derivedModel), printParticle(baseModel)}, context));
               restrictionValid = false;
               return restrictionValid;
            case 3:
               restrictionValid = recurseUnordered(baseModel, derivedModel, errors, context);
               return restrictionValid;
            case 4:
               restrictionValid = recurseAsIfGroup(baseModel, derivedModel, errors, context);
               return restrictionValid;
            default:
               assert false : XBeanDebug.logStackTrace("Unknown schema type for Derived Type");

               return restrictionValid;
            }
         case 2:
            switch(derivedModel.getParticleType()) {
            case 1:
            case 5:
               errors.add(XmlError.forObject("cos-particle-restrict.2", new Object[]{printParticle(derivedModel), printParticle(baseModel)}, context));
               restrictionValid = false;
               return restrictionValid;
            case 2:
               restrictionValid = recurseLax(baseModel, derivedModel, errors, context);
               return restrictionValid;
            case 3:
               restrictionValid = mapAndSum(baseModel, derivedModel, errors, context);
               return restrictionValid;
            case 4:
               restrictionValid = recurseAsIfGroup(baseModel, derivedModel, errors, context);
               return restrictionValid;
            default:
               assert false : XBeanDebug.logStackTrace("Unknown schema type for Derived Type");

               return restrictionValid;
            }
         case 3:
            switch(derivedModel.getParticleType()) {
            case 1:
            case 2:
            case 5:
               errors.add(XmlError.forObject("cos-particle-restrict.2", new Object[]{printParticle(derivedModel), printParticle(baseModel)}, context));
               restrictionValid = false;
               return restrictionValid;
            case 3:
               restrictionValid = recurse(baseModel, derivedModel, errors, context);
               return restrictionValid;
            case 4:
               restrictionValid = recurseAsIfGroup(baseModel, derivedModel, errors, context);
               return restrictionValid;
            default:
               assert false : XBeanDebug.logStackTrace("Unknown schema type for Derived Type");

               return restrictionValid;
            }
         case 4:
            switch(derivedModel.getParticleType()) {
            case 1:
            case 2:
            case 3:
            case 5:
               errors.add(XmlError.forObject("cos-particle-restrict.2", new Object[]{printParticle(derivedModel), printParticle(baseModel)}, context));
               restrictionValid = false;
               return restrictionValid;
            case 4:
               restrictionValid = nameAndTypeOK((SchemaLocalElement)baseModel, (SchemaLocalElement)derivedModel, errors, context);
               return restrictionValid;
            default:
               assert false : XBeanDebug.logStackTrace("Unknown schema type for Derived Type");

               return restrictionValid;
            }
         case 5:
            switch(derivedModel.getParticleType()) {
            case 1:
               restrictionValid = nsRecurseCheckCardinality(baseModel, derivedModel, errors, context);
               return restrictionValid;
            case 2:
               restrictionValid = nsRecurseCheckCardinality(baseModel, derivedModel, errors, context);
               return restrictionValid;
            case 3:
               restrictionValid = nsRecurseCheckCardinality(baseModel, derivedModel, errors, context);
               return restrictionValid;
            case 4:
               restrictionValid = nsCompat(baseModel, (SchemaLocalElement)derivedModel, errors, context);
               return restrictionValid;
            case 5:
               restrictionValid = nsSubset(baseModel, derivedModel, errors, context);
               return restrictionValid;
            default:
               assert false : XBeanDebug.logStackTrace("Unknown schema type for Derived Type");

               return restrictionValid;
            }
         default:
            assert false : XBeanDebug.logStackTrace("Unknown schema type for Base Type");
         }
      }

      return restrictionValid;
   }

   private static boolean mapAndSum(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      assert baseModel.getParticleType() == 2;

      assert derivedModel.getParticleType() == 3;

      boolean mapAndSumValid = true;
      SchemaParticle[] derivedParticleArray = derivedModel.getParticleChildren();
      SchemaParticle[] baseParticleArray = baseModel.getParticleChildren();
      int derivedRangeMin = 0;

      SchemaParticle derivedRangeMax;
      while(derivedRangeMin < derivedParticleArray.length) {
         derivedRangeMax = derivedParticleArray[derivedRangeMin];
         boolean UNBOUNDED = false;
         int j = 0;

         while(true) {
            if(j < baseParticleArray.length) {
               SchemaParticle baseParticle = baseParticleArray[j];
               if(!isParticleValidRestriction(baseParticle, derivedRangeMax, errors, context)) {
                  ++j;
                  continue;
               }

               UNBOUNDED = true;
            }

            if(!UNBOUNDED) {
               mapAndSumValid = false;
               errors.add(XmlError.forObject("rcase-MapAndSum.1", new Object[]{printParticle(derivedRangeMax)}, context));
               return false;
            }

            ++derivedRangeMin;
            break;
         }
      }

      BigInteger var12 = derivedModel.getMinOccurs().multiply(BigInteger.valueOf((long)derivedModel.getParticleChildren().length));
      derivedRangeMax = null;
      Object var14 = null;
      BigInteger var13;
      if(derivedModel.getMaxOccurs() == var14) {
         var13 = null;
      } else {
         var13 = derivedModel.getMaxOccurs().multiply(BigInteger.valueOf((long)derivedModel.getParticleChildren().length));
      }

      if(var12.compareTo(baseModel.getMinOccurs()) < 0) {
         mapAndSumValid = false;
         errors.add(XmlError.forObject("rcase-MapAndSum.2a", new Object[]{var12.toString(), baseModel.getMinOccurs().toString()}, context));
      } else if(baseModel.getMaxOccurs() != var14 && (var13 == var14 || var13.compareTo(baseModel.getMaxOccurs()) > 0)) {
         mapAndSumValid = false;
         errors.add(XmlError.forObject("rcase-MapAndSum.2b", new Object[]{var13 == var14?"unbounded":var13.toString(), baseModel.getMaxOccurs().toString()}, context));
      }

      return mapAndSumValid;
   }

   private static boolean recurseAsIfGroup(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      assert baseModel.getParticleType() == 1 && derivedModel.getParticleType() == 4 || baseModel.getParticleType() == 2 && derivedModel.getParticleType() == 4 || baseModel.getParticleType() == 3 && derivedModel.getParticleType() == 4;

      SchemaParticleImpl asIfPart = new SchemaParticleImpl();
      asIfPart.setParticleType(baseModel.getParticleType());
      asIfPart.setMinOccurs(BigInteger.ONE);
      asIfPart.setMaxOccurs(BigInteger.ONE);
      asIfPart.setParticleChildren(new SchemaParticle[]{derivedModel});
      return isParticleValidRestriction(baseModel, asIfPart, errors, context);
   }

   private static boolean recurseLax(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      assert baseModel.getParticleType() == 2 && derivedModel.getParticleType() == 2;

      boolean recurseLaxValid = true;
      if(!occurrenceRangeOK(baseModel, derivedModel, errors, context)) {
         return false;
      } else {
         SchemaParticle[] derivedParticleArray = derivedModel.getParticleChildren();
         SchemaParticle[] baseParticleArray = baseModel.getParticleChildren();
         int i = 0;
         int j = 0;

         while(i < derivedParticleArray.length && j < baseParticleArray.length) {
            SchemaParticle derivedParticle = derivedParticleArray[i];
            SchemaParticle baseParticle = baseParticleArray[j];
            if(isParticleValidRestriction(baseParticle, derivedParticle, errors, context)) {
               ++i;
               ++j;
            } else {
               ++j;
            }
         }

         if(i < derivedParticleArray.length) {
            recurseLaxValid = false;
            errors.add(XmlError.forObject("rcase-RecurseLax.2", new Object[]{printParticles(baseParticleArray, i)}, context));
         }

         return recurseLaxValid;
      }
   }

   private static boolean recurseUnordered(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      assert baseModel.getParticleType() == 1 && derivedModel.getParticleType() == 3;

      boolean recurseUnorderedValid = true;
      if(!occurrenceRangeOK(baseModel, derivedModel, errors, context)) {
         return false;
      } else {
         SchemaParticle[] baseParticles = baseModel.getParticleChildren();
         HashMap baseParticleMap = new HashMap(10);
         Object MAPPED = new Object();

         for(int derivedParticles = 0; derivedParticles < baseParticles.length; ++derivedParticles) {
            baseParticleMap.put(baseParticles[derivedParticles].getName(), baseParticles[derivedParticles]);
         }

         SchemaParticle[] var12 = derivedModel.getParticleChildren();

         for(int baseParticleCollection = 0; baseParticleCollection < var12.length; ++baseParticleCollection) {
            Object iterator = baseParticleMap.get(var12[baseParticleCollection].getName());
            if(iterator == null) {
               recurseUnorderedValid = false;
               errors.add(XmlError.forObject("rcase-RecurseUnordered.2", new Object[]{printParticle(var12[baseParticleCollection])}, context));
               break;
            }

            if(iterator == MAPPED) {
               recurseUnorderedValid = false;
               errors.add(XmlError.forObject("rcase-RecurseUnordered.2.1", new Object[]{printParticle(var12[baseParticleCollection])}, context));
               break;
            }

            SchemaParticle baseParticleQName = (SchemaParticle)iterator;
            if(var12[baseParticleCollection].getMaxOccurs() == null || var12[baseParticleCollection].getMaxOccurs().compareTo(BigInteger.ONE) > 0) {
               recurseUnorderedValid = false;
               errors.add(XmlError.forObject("rcase-RecurseUnordered.2.2a", new Object[]{printParticle(var12[baseParticleCollection]), printMaxOccurs(var12[baseParticleCollection].getMinOccurs())}, context));
               break;
            }

            if(!isParticleValidRestriction(baseParticleQName, var12[baseParticleCollection], errors, context)) {
               recurseUnorderedValid = false;
               break;
            }

            baseParticleMap.put(var12[baseParticleCollection].getName(), MAPPED);
         }

         if(recurseUnorderedValid) {
            Set var13 = baseParticleMap.keySet();
            Iterator var14 = var13.iterator();

            while(var14.hasNext()) {
               QName var15 = (QName)var14.next();
               if(baseParticleMap.get(var15) != MAPPED && !((SchemaParticle)baseParticleMap.get(var15)).isSkippable()) {
                  recurseUnorderedValid = false;
                  errors.add(XmlError.forObject("rcase-RecurseUnordered.2.3", new Object[]{printParticle((SchemaParticle)baseParticleMap.get(var15))}, context));
               }
            }
         }

         return recurseUnorderedValid;
      }
   }

   private static boolean recurse(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      boolean recurseValid = true;
      if(!occurrenceRangeOK(baseModel, derivedModel, errors, context)) {
         return false;
      } else {
         SchemaParticle[] derivedParticleArray = derivedModel.getParticleChildren();
         SchemaParticle[] baseParticleArray = baseModel.getParticleChildren();
         int i = 0;
         int j = 0;

         while(i < derivedParticleArray.length && j < baseParticleArray.length) {
            SchemaParticle particles = derivedParticleArray[i];
            SchemaParticle k = baseParticleArray[j];
            if(isParticleValidRestriction(k, particles, errors, context)) {
               ++i;
               ++j;
            } else {
               if(!k.isSkippable()) {
                  recurseValid = false;
                  errors.add(XmlError.forObject("rcase-Recurse.2.1", new Object[]{printParticle(particles), printParticle(derivedModel), printParticle(k), printParticle(baseModel)}, context));
                  break;
               }

               ++j;
            }
         }

         if(i < derivedParticleArray.length) {
            recurseValid = false;
            errors.add(XmlError.forObject("rcase-Recurse.2", new Object[]{printParticle(derivedModel), printParticle(baseModel), printParticles(derivedParticleArray, i)}, context));
         } else if(j < baseParticleArray.length) {
            ArrayList var11 = new ArrayList(baseParticleArray.length);

            for(int var12 = j; var12 < baseParticleArray.length; ++var12) {
               if(!baseParticleArray[var12].isSkippable()) {
                  var11.add(baseParticleArray[var12]);
               }
            }

            if(var11.size() > 0) {
               recurseValid = false;
               errors.add(XmlError.forObject("rcase-Recurse.2.2", new Object[]{printParticle(baseModel), printParticle(derivedModel), printParticles((List)var11)}, context));
            }
         }

         return recurseValid;
      }
   }

   private static boolean nsRecurseCheckCardinality(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      assert baseModel.getParticleType() == 5;

      assert derivedModel.getParticleType() == 1 || derivedModel.getParticleType() == 2 || derivedModel.getParticleType() == 3;

      boolean nsRecurseCheckCardinality = true;
      SchemaParticleImpl asIfPart = new SchemaParticleImpl();
      asIfPart.setParticleType(baseModel.getParticleType());
      asIfPart.setWildcardProcess(baseModel.getWildcardProcess());
      asIfPart.setWildcardSet(baseModel.getWildcardSet());
      asIfPart.setMinOccurs(BigInteger.ZERO);
      asIfPart.setMaxOccurs((BigInteger)null);
      asIfPart.setTransitionRules(baseModel.getWildcardSet(), true);
      asIfPart.setTransitionNotes(baseModel.getWildcardSet(), true);
      SchemaParticle[] particleChildren = derivedModel.getParticleChildren();

      for(int i = 0; i < particleChildren.length; ++i) {
         SchemaParticle particle = particleChildren[i];
         switch(particle.getParticleType()) {
         case 1:
         case 2:
         case 3:
            nsRecurseCheckCardinality = nsRecurseCheckCardinality(asIfPart, particle, errors, context);
            break;
         case 4:
            nsRecurseCheckCardinality = nsCompat(asIfPart, (SchemaLocalElement)particle, errors, context);
            break;
         case 5:
            nsRecurseCheckCardinality = nsSubset(asIfPart, particle, errors, context);
         }

         if(!nsRecurseCheckCardinality) {
            break;
         }
      }

      if(nsRecurseCheckCardinality) {
         nsRecurseCheckCardinality = checkGroupOccurrenceOK(baseModel, derivedModel, errors, context);
      }

      return nsRecurseCheckCardinality;
   }

   private static boolean checkGroupOccurrenceOK(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      boolean groupOccurrenceOK = true;
      BigInteger minRange = BigInteger.ZERO;
      BigInteger maxRange = BigInteger.ZERO;
      switch(derivedModel.getParticleType()) {
      case 1:
      case 3:
         minRange = getEffectiveMinRangeAllSeq(derivedModel);
         maxRange = getEffectiveMaxRangeAllSeq(derivedModel);
         break;
      case 2:
         minRange = getEffectiveMinRangeChoice(derivedModel);
         maxRange = getEffectiveMaxRangeChoice(derivedModel);
      }

      if(minRange.compareTo(baseModel.getMinOccurs()) < 0) {
         groupOccurrenceOK = false;
         errors.add(XmlError.forObject("range-ok.1", new Object[]{printParticle(derivedModel), printParticle(baseModel)}, context));
      }

      Object UNBOUNDED = null;
      if(baseModel.getMaxOccurs() != UNBOUNDED) {
         if(maxRange == UNBOUNDED) {
            groupOccurrenceOK = false;
            errors.add(XmlError.forObject("range-ok.2", new Object[]{printParticle(derivedModel), printParticle(baseModel)}, context));
         } else if(maxRange.compareTo(baseModel.getMaxOccurs()) > 0) {
            groupOccurrenceOK = false;
            errors.add(XmlError.forObject("range-ok.2", new Object[]{printParticle(derivedModel), printParticle(baseModel)}, context));
         }
      }

      return groupOccurrenceOK;
   }

   private static BigInteger getEffectiveMaxRangeChoice(SchemaParticle derivedModel) {
      BigInteger maxRange = BigInteger.ZERO;
      Object UNBOUNDED = null;
      boolean nonZeroParticleChildFound = false;
      BigInteger maxOccursInWildCardOrElement = BigInteger.ZERO;
      BigInteger maxOccursInGroup = BigInteger.ZERO;
      SchemaParticle[] particleChildren = derivedModel.getParticleChildren();

      for(int i = 0; i < particleChildren.length; ++i) {
         SchemaParticle particle = particleChildren[i];
         switch(particle.getParticleType()) {
         case 1:
         case 3:
            maxRange = getEffectiveMaxRangeAllSeq(particle);
            if(maxRange != UNBOUNDED && maxRange.compareTo(maxOccursInGroup) > 0) {
               maxOccursInGroup = maxRange;
            }
            break;
         case 2:
            maxRange = getEffectiveMaxRangeChoice(particle);
            if(maxRange != UNBOUNDED && maxRange.compareTo(maxOccursInGroup) > 0) {
               maxOccursInGroup = maxRange;
            }
            break;
         case 4:
         case 5:
            if(particle.getMaxOccurs() == UNBOUNDED) {
               maxRange = (BigInteger)UNBOUNDED;
            } else if(particle.getIntMaxOccurs() > 0) {
               nonZeroParticleChildFound = true;
               if(particle.getMaxOccurs().compareTo(maxOccursInWildCardOrElement) > 0) {
                  maxOccursInWildCardOrElement = particle.getMaxOccurs();
               }
            }
         }

         if(maxRange == UNBOUNDED) {
            break;
         }
      }

      if(maxRange != UNBOUNDED) {
         if(nonZeroParticleChildFound && derivedModel.getMaxOccurs() == UNBOUNDED) {
            maxRange = (BigInteger)UNBOUNDED;
         } else {
            maxRange = derivedModel.getMaxOccurs().multiply(maxOccursInWildCardOrElement.add(maxOccursInGroup));
         }
      }

      return maxRange;
   }

   private static BigInteger getEffectiveMaxRangeAllSeq(SchemaParticle derivedModel) {
      BigInteger maxRange = BigInteger.ZERO;
      Object UNBOUNDED = null;
      boolean nonZeroParticleChildFound = false;
      BigInteger maxOccursTotal = BigInteger.ZERO;
      BigInteger maxOccursInGroup = BigInteger.ZERO;
      SchemaParticle[] particleChildren = derivedModel.getParticleChildren();

      for(int i = 0; i < particleChildren.length; ++i) {
         SchemaParticle particle = particleChildren[i];
         switch(particle.getParticleType()) {
         case 1:
         case 3:
            maxRange = getEffectiveMaxRangeAllSeq(particle);
            if(maxRange != UNBOUNDED && maxRange.compareTo(maxOccursInGroup) > 0) {
               maxOccursInGroup = maxRange;
            }
            break;
         case 2:
            maxRange = getEffectiveMaxRangeChoice(particle);
            if(maxRange != UNBOUNDED && maxRange.compareTo(maxOccursInGroup) > 0) {
               maxOccursInGroup = maxRange;
            }
            break;
         case 4:
         case 5:
            if(particle.getMaxOccurs() == UNBOUNDED) {
               maxRange = (BigInteger)UNBOUNDED;
            } else if(particle.getIntMaxOccurs() > 0) {
               nonZeroParticleChildFound = true;
               maxOccursTotal = maxOccursTotal.add(particle.getMaxOccurs());
            }
         }

         if(maxRange == UNBOUNDED) {
            break;
         }
      }

      if(maxRange != UNBOUNDED) {
         if(nonZeroParticleChildFound && derivedModel.getMaxOccurs() == UNBOUNDED) {
            maxRange = (BigInteger)UNBOUNDED;
         } else {
            maxRange = derivedModel.getMaxOccurs().multiply(maxOccursTotal.add(maxOccursInGroup));
         }
      }

      return maxRange;
   }

   private static BigInteger getEffectiveMinRangeChoice(SchemaParticle derivedModel) {
      SchemaParticle[] particleChildren = derivedModel.getParticleChildren();
      if(particleChildren.length == 0) {
         return BigInteger.ZERO;
      } else {
         BigInteger minRange = null;

         for(int i = 0; i < particleChildren.length; ++i) {
            SchemaParticle particle = particleChildren[i];
            switch(particle.getParticleType()) {
            case 1:
            case 3:
               BigInteger mrs = getEffectiveMinRangeAllSeq(particle);
               if(minRange == null || minRange.compareTo(mrs) > 0) {
                  minRange = mrs;
               }
               break;
            case 2:
               BigInteger mrc = getEffectiveMinRangeChoice(particle);
               if(minRange == null || minRange.compareTo(mrc) > 0) {
                  minRange = mrc;
               }
               break;
            case 4:
            case 5:
               if(minRange == null || minRange.compareTo(particle.getMinOccurs()) > 0) {
                  minRange = particle.getMinOccurs();
               }
            }
         }

         if(minRange == null) {
            minRange = BigInteger.ZERO;
         }

         minRange = derivedModel.getMinOccurs().multiply(minRange);
         return minRange;
      }
   }

   private static BigInteger getEffectiveMinRangeAllSeq(SchemaParticle derivedModel) {
      BigInteger minRange = BigInteger.ZERO;
      SchemaParticle[] particleChildren = derivedModel.getParticleChildren();
      BigInteger particleTotalMinOccurs = BigInteger.ZERO;

      for(int i = 0; i < particleChildren.length; ++i) {
         SchemaParticle particle = particleChildren[i];
         switch(particle.getParticleType()) {
         case 1:
         case 3:
            particleTotalMinOccurs = particleTotalMinOccurs.add(getEffectiveMinRangeAllSeq(particle));
            break;
         case 2:
            particleTotalMinOccurs = particleTotalMinOccurs.add(getEffectiveMinRangeChoice(particle));
            break;
         case 4:
         case 5:
            particleTotalMinOccurs = particleTotalMinOccurs.add(particle.getMinOccurs());
         }
      }

      minRange = derivedModel.getMinOccurs().multiply(particleTotalMinOccurs);
      return minRange;
   }

   private static boolean nsSubset(SchemaParticle baseModel, SchemaParticle derivedModel, Collection errors, XmlObject context) {
      assert baseModel.getParticleType() == 5;

      assert derivedModel.getParticleType() == 5;

      boolean nsSubset = false;
      if(occurrenceRangeOK(baseModel, derivedModel, errors, context)) {
         if(baseModel.getWildcardSet().inverse().isDisjoint(derivedModel.getWildcardSet())) {
            nsSubset = true;
         } else {
            nsSubset = false;
            errors.add(XmlError.forObject("rcase-NSSubset.2", new Object[]{printParticle(derivedModel), printParticle(baseModel)}, context));
         }
      } else {
         nsSubset = false;
      }

      return nsSubset;
   }

   private static boolean nsCompat(SchemaParticle baseModel, SchemaLocalElement derivedElement, Collection errors, XmlObject context) {
      assert baseModel.getParticleType() == 5;

      boolean nsCompat = false;
      if(baseModel.getWildcardSet().contains(derivedElement.getName())) {
         if(occurrenceRangeOK(baseModel, (SchemaParticle)derivedElement, errors, context)) {
            nsCompat = true;
         }
      } else {
         nsCompat = false;
         errors.add(XmlError.forObject("rcase-NSCompat.1", new Object[]{printParticle((SchemaParticle)derivedElement), printParticle(baseModel)}, context));
      }

      return nsCompat;
   }

   private static boolean nameAndTypeOK(SchemaLocalElement baseElement, SchemaLocalElement derivedElement, Collection errors, XmlObject context) {
      if(!((SchemaParticle)baseElement).canStartWithElement(derivedElement.getName())) {
         errors.add(XmlError.forObject("rcase-NameAndTypeOK.1", new Object[]{printParticle((SchemaParticle)derivedElement), printParticle((SchemaParticle)baseElement)}, context));
         return false;
      } else if(!baseElement.isNillable() && derivedElement.isNillable()) {
         errors.add(XmlError.forObject("rcase-NameAndTypeOK.2", new Object[]{printParticle((SchemaParticle)derivedElement), printParticle((SchemaParticle)baseElement)}, context));
         return false;
      } else {
         return !occurrenceRangeOK((SchemaParticle)baseElement, (SchemaParticle)derivedElement, errors, context)?false:(!checkFixed(baseElement, derivedElement, errors, context)?false:(!checkIdentityConstraints(baseElement, derivedElement, errors, context)?false:(!typeDerivationOK(baseElement.getType(), derivedElement.getType(), errors, context)?false:blockSetOK(baseElement, derivedElement, errors, context))));
      }
   }

   private static boolean blockSetOK(SchemaLocalElement baseElement, SchemaLocalElement derivedElement, Collection errors, XmlObject context) {
      if(baseElement.blockRestriction() && !derivedElement.blockRestriction()) {
         errors.add(XmlError.forObject("rcase-NameAndTypeOK.6", new Object[]{printParticle((SchemaParticle)derivedElement), "restriction", printParticle((SchemaParticle)baseElement)}, context));
         return false;
      } else if(baseElement.blockExtension() && !derivedElement.blockExtension()) {
         errors.add(XmlError.forObject("rcase-NameAndTypeOK.6", new Object[]{printParticle((SchemaParticle)derivedElement), "extension", printParticle((SchemaParticle)baseElement)}, context));
         return false;
      } else if(baseElement.blockSubstitution() && !derivedElement.blockSubstitution()) {
         errors.add(XmlError.forObject("rcase-NameAndTypeOK.6", new Object[]{printParticle((SchemaParticle)derivedElement), "substitution", printParticle((SchemaParticle)baseElement)}, context));
         return false;
      } else {
         return true;
      }
   }

   private static boolean typeDerivationOK(SchemaType baseType, SchemaType derivedType, Collection errors, XmlObject context) {
      boolean typeDerivationOK = false;
      if(baseType.isAssignableFrom(derivedType)) {
         typeDerivationOK = checkAllDerivationsForRestriction(baseType, derivedType, errors, context);
      } else {
         typeDerivationOK = false;
         errors.add(XmlError.forObject("rcase-NameAndTypeOK.7a", new Object[]{printType(derivedType), printType(baseType)}, context));
      }

      return typeDerivationOK;
   }

   private static boolean checkAllDerivationsForRestriction(SchemaType baseType, SchemaType derivedType, Collection errors, XmlObject context) {
      boolean allDerivationsAreRestrictions = true;
      SchemaType currentType = derivedType;
      HashSet possibleTypes = null;
      if(baseType.getSimpleVariety() == 2) {
         possibleTypes = new HashSet(Arrays.asList(baseType.getUnionConstituentTypes()));
      }

      while(!baseType.equals(currentType) && possibleTypes != null && !possibleTypes.contains(currentType)) {
         if(currentType.getDerivationType() != 1) {
            allDerivationsAreRestrictions = false;
            errors.add(XmlError.forObject("rcase-NameAndTypeOK.7b", new Object[]{printType(derivedType), printType(baseType), printType(currentType)}, context));
            break;
         }

         currentType = currentType.getBaseType();
      }

      return allDerivationsAreRestrictions;
   }

   private static boolean checkIdentityConstraints(SchemaLocalElement baseElement, SchemaLocalElement derivedElement, Collection errors, XmlObject context) {
      boolean identityConstraintsOK = true;
      SchemaIdentityConstraint[] baseConstraints = baseElement.getIdentityConstraints();
      SchemaIdentityConstraint[] derivedConstraints = derivedElement.getIdentityConstraints();

      for(int i = 0; i < derivedConstraints.length; ++i) {
         SchemaIdentityConstraint derivedConstraint = derivedConstraints[i];
         if(checkForIdentityConstraintExistence(baseConstraints, derivedConstraint)) {
            identityConstraintsOK = false;
            errors.add(XmlError.forObject("rcase-NameAndTypeOK.5", new Object[]{printParticle((SchemaParticle)derivedElement), printParticle((SchemaParticle)baseElement)}, context));
            break;
         }
      }

      return identityConstraintsOK;
   }

   private static boolean checkForIdentityConstraintExistence(SchemaIdentityConstraint[] baseConstraints, SchemaIdentityConstraint derivedConstraint) {
      boolean identityConstraintExists = false;

      for(int i = 0; i < baseConstraints.length; ++i) {
         SchemaIdentityConstraint baseConstraint = baseConstraints[i];
         if(baseConstraint.getName().equals(derivedConstraint.getName())) {
            identityConstraintExists = true;
            break;
         }
      }

      return identityConstraintExists;
   }

   private static boolean checkFixed(SchemaLocalElement baseModel, SchemaLocalElement derivedModel, Collection errors, XmlObject context) {
      boolean checkFixed = false;
      if(baseModel.isFixed()) {
         if(baseModel.getDefaultText().equals(derivedModel.getDefaultText())) {
            checkFixed = true;
         } else {
            errors.add(XmlError.forObject("rcase-NameAndTypeOK.4", new Object[]{printParticle((SchemaParticle)derivedModel), derivedModel.getDefaultText(), printParticle((SchemaParticle)baseModel), baseModel.getDefaultText()}, context));
            checkFixed = false;
         }
      } else {
         checkFixed = true;
      }

      return checkFixed;
   }

   private static boolean occurrenceRangeOK(SchemaParticle baseParticle, SchemaParticle derivedParticle, Collection errors, XmlObject context) {
      boolean occurrenceRangeOK = false;
      if(derivedParticle.getMinOccurs().compareTo(baseParticle.getMinOccurs()) >= 0) {
         if(baseParticle.getMaxOccurs() == null) {
            occurrenceRangeOK = true;
         } else if(derivedParticle.getMaxOccurs() != null && baseParticle.getMaxOccurs() != null && derivedParticle.getMaxOccurs().compareTo(baseParticle.getMaxOccurs()) <= 0) {
            occurrenceRangeOK = true;
         } else {
            occurrenceRangeOK = false;
            errors.add(XmlError.forObject("range-ok.2", new Object[]{printParticle(derivedParticle), printMaxOccurs(derivedParticle.getMaxOccurs()), printParticle(baseParticle), printMaxOccurs(baseParticle.getMaxOccurs())}, context));
         }
      } else {
         occurrenceRangeOK = false;
         errors.add(XmlError.forObject("range-ok.1", new Object[]{printParticle(derivedParticle), derivedParticle.getMinOccurs().toString(), printParticle(baseParticle), baseParticle.getMinOccurs().toString()}, context));
      }

      return occurrenceRangeOK;
   }

   private static String printParticles(List parts) {
      return printParticles((SchemaParticle[])((SchemaParticle[])parts.toArray(new SchemaParticle[parts.size()])));
   }

   private static String printParticles(SchemaParticle[] parts) {
      return printParticles(parts, 0, parts.length);
   }

   private static String printParticles(SchemaParticle[] parts, int start) {
      return printParticles(parts, start, parts.length);
   }

   private static String printParticles(SchemaParticle[] parts, int start, int end) {
      StringBuffer buf = new StringBuffer(parts.length * 30);
      int i = start;

      while(i < end) {
         buf.append(printParticle(parts[i]));
         ++i;
         if(i != end) {
            buf.append(", ");
         }
      }

      return buf.toString();
   }

   private static String printParticle(SchemaParticle part) {
      switch(part.getParticleType()) {
      case 1:
         return "<all>";
      case 2:
         return "<choice>";
      case 3:
         return "<sequence>";
      case 4:
         return "<element name=\"" + QNameHelper.pretty(part.getName()) + "\">";
      case 5:
         return "<any>";
      default:
         return "??";
      }
   }

   private static String printMaxOccurs(BigInteger bi) {
      return bi == null?"unbounded":bi.toString();
   }

   private static String printType(SchemaType type) {
      return type.getName() != null?QNameHelper.pretty(type.getName()):type.toString();
   }

   private static void checkSubstitutionGroups(SchemaGlobalElement[] elts) {
      StscState state = StscState.get();

      for(int i = 0; i < elts.length; ++i) {
         SchemaGlobalElement elt = elts[i];
         SchemaGlobalElement head = elt.substitutionGroup();
         if(head != null) {
            SchemaType headType = head.getType();
            SchemaType tailType = elt.getType();
            XmlObject parseTree = ((SchemaGlobalElementImpl)elt)._parseObject;
            if(!headType.isAssignableFrom(tailType)) {
               state.error("e-props-correct.4", new Object[]{QNameHelper.pretty(elt.getName()), QNameHelper.pretty(head.getName())}, parseTree);
            } else if(head.finalExtension() && head.finalRestriction()) {
               state.error("e-props-correct.4a", new Object[]{QNameHelper.pretty(elt.getName()), QNameHelper.pretty(head.getName()), "#all"}, parseTree);
            } else if(!headType.equals(tailType)) {
               if(head.finalExtension() && tailType.getDerivationType() == 2) {
                  state.error("e-props-correct.4a", new Object[]{QNameHelper.pretty(elt.getName()), QNameHelper.pretty(head.getName()), "extension"}, parseTree);
               } else if(head.finalRestriction() && tailType.getDerivationType() == 1) {
                  state.error("e-props-correct.4a", new Object[]{QNameHelper.pretty(elt.getName()), QNameHelper.pretty(head.getName()), "restriction"}, parseTree);
               }
            }
         }
      }

   }

}
