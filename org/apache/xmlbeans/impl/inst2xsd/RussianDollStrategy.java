package org.apache.xmlbeans.impl.inst2xsd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlByte;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlDate;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDuration;
import org.apache.xmlbeans.XmlFloat;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlLong;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlQName;
import org.apache.xmlbeans.XmlShort;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.XmlTime;
import org.apache.xmlbeans.impl.common.PrefixResolver;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.common.XmlWhitespace;
import org.apache.xmlbeans.impl.inst2xsd.Inst2XsdOptions;
import org.apache.xmlbeans.impl.inst2xsd.XsdGenStrategy;
import org.apache.xmlbeans.impl.inst2xsd.util.Attribute;
import org.apache.xmlbeans.impl.inst2xsd.util.Element;
import org.apache.xmlbeans.impl.inst2xsd.util.Type;
import org.apache.xmlbeans.impl.inst2xsd.util.TypeSystemHolder;
import org.apache.xmlbeans.impl.util.XsTypeConverter;
import org.apache.xmlbeans.impl.values.XmlAnyUriImpl;
import org.apache.xmlbeans.impl.values.XmlDateImpl;
import org.apache.xmlbeans.impl.values.XmlDateTimeImpl;
import org.apache.xmlbeans.impl.values.XmlDurationImpl;
import org.apache.xmlbeans.impl.values.XmlQNameImpl;
import org.apache.xmlbeans.impl.values.XmlTimeImpl;

public class RussianDollStrategy implements XsdGenStrategy {

   static final String _xsi = "http://www.w3.org/2001/XMLSchema-instance";
   static final QName _xsiNil = new QName("http://www.w3.org/2001/XMLSchema-instance", "nil", "xsi");
   static final QName _xsiType = new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi");
   private RussianDollStrategy.SCTValidationContext _validationContext = new RussianDollStrategy.SCTValidationContext();


   public void processDoc(XmlObject[] instances, Inst2XsdOptions options, TypeSystemHolder typeSystemHolder) {
      for(int i = 0; i < instances.length; ++i) {
         XmlObject instance = instances[i];
         XmlCursor xc = instance.newCursor();
         StringBuffer comment = new StringBuffer();

         while(!xc.isStart()) {
            xc.toNextToken();
            if(xc.isComment()) {
               comment.append(xc.getTextValue());
            } else if(xc.isEnddoc()) {
               return;
            }
         }

         Element withElem = this.processElement(xc, comment.toString(), options, typeSystemHolder);
         withElem.setGlobal(true);
         this.addGlobalElement(withElem, typeSystemHolder, options);
      }

   }

   protected Element addGlobalElement(Element withElem, TypeSystemHolder typeSystemHolder, Inst2XsdOptions options) {
      assert withElem.isGlobal();

      Element intoElem = typeSystemHolder.getGlobalElement(withElem.getName());
      if(intoElem == null) {
         typeSystemHolder.addGlobalElement(withElem);
         return withElem;
      } else {
         this.combineTypes(intoElem.getType(), withElem.getType(), options);
         this.combineElementComments(intoElem, withElem);
         return intoElem;
      }
   }

   protected Element processElement(XmlCursor xc, String comment, Inst2XsdOptions options, TypeSystemHolder typeSystemHolder) {
      assert xc.isStart();

      Element element = new Element();
      element.setName(xc.getName());
      element.setGlobal(false);
      Type elemType = Type.createUnnamedType(1);
      element.setType(elemType);
      StringBuffer textBuff = new StringBuffer();
      StringBuffer commentBuff = new StringBuffer();
      ArrayList children = new ArrayList();
      ArrayList attributes = new ArrayList();

      while(true) {
         XmlCursor.TokenType collapsedText = xc.toNextToken();
         switch(collapsedText.intValue()) {
         case 0:
         case 2:
         case 4:
            String collapsedText1 = XmlWhitespace.collapse(textBuff.toString(), 3);
            String commnetStr1 = comment == null?(commentBuff.length() == 0?null:commentBuff.toString()):(commentBuff.length() == 0?comment:commentBuff.insert(0, comment).toString());
            element.setComment(commnetStr1);
            if(children.size() > 0) {
               if(collapsedText1.length() > 0) {
                  elemType.setContentType(4);
               } else {
                  elemType.setContentType(3);
               }

               this.processElementsInComplexType(elemType, children, element.getName().getNamespaceURI(), typeSystemHolder, options);
               this.processAttributesInComplexType(elemType, attributes);
            } else {
               XmlCursor xcForNamespaces = xc.newCursor();
               xcForNamespaces.toParent();
               if(attributes.size() > 0) {
                  elemType.setContentType(2);
                  Type enumValue = Type.createNamedType(this.processSimpleContentType(textBuff.toString(), options, xcForNamespaces), 1);
                  elemType.setExtensionType(enumValue);
                  this.processAttributesInComplexType(elemType, attributes);
               } else {
                  elemType.setContentType(1);
                  elemType.setName(this.processSimpleContentType(textBuff.toString(), options, xcForNamespaces));
                  String enumValue1 = XmlString.type.getName().equals(elemType.getName())?textBuff.toString():collapsedText1;
                  elemType.addEnumerationValue(enumValue1, xcForNamespaces);
               }

               xcForNamespaces.dispose();
            }

            this.checkIfReferenceToGlobalTypeIsNeeded(element, typeSystemHolder, options);
            return element;
         case 1:
            throw new IllegalStateException();
         case 3:
            children.add(this.processElement(xc, commentBuff.toString(), options, typeSystemHolder));
            commentBuff.delete(0, commentBuff.length());
            break;
         case 5:
            textBuff.append(xc.getChars());
            break;
         case 6:
            QName commnetStr = xc.getName();
            if(!_xsiNil.getNamespaceURI().equals(commnetStr.getNamespaceURI())) {
               attributes.add(this.processAttribute(xc, options, element.getName().getNamespaceURI(), typeSystemHolder));
            } else if(_xsiNil.equals(commnetStr)) {
               element.setNillable(true);
            }
         case 7:
         case 9:
            break;
         case 8:
            commentBuff.append(xc.getTextValue());
            break;
         default:
            throw new IllegalStateException("Unknown TokenType.");
         }
      }
   }

   protected void processElementsInComplexType(Type elemType, List children, String parentNamespace, TypeSystemHolder typeSystemHolder, Inst2XsdOptions options) {
      HashMap elemNamesToElements = new HashMap();
      Element currentElem = null;
      Iterator iterator = children.iterator();

      while(iterator.hasNext()) {
         Element child = (Element)iterator.next();
         if(currentElem == null) {
            this.checkIfElementReferenceIsNeeded(child, parentNamespace, typeSystemHolder, options);
            elemType.addElement(child);
            elemNamesToElements.put(child.getName(), child);
            currentElem = child;
         } else if(currentElem.getName() == child.getName()) {
            this.combineTypes(currentElem.getType(), child.getType(), options);
            this.combineElementComments(currentElem, child);
            currentElem.setMinOccurs(0);
            currentElem.setMaxOccurs(-1);
         } else {
            Element sameElem = (Element)elemNamesToElements.get(child.getName());
            if(sameElem == null) {
               this.checkIfElementReferenceIsNeeded(child, parentNamespace, typeSystemHolder, options);
               elemType.addElement(child);
               elemNamesToElements.put(child.getName(), child);
            } else {
               this.combineTypes(currentElem.getType(), child.getType(), options);
               this.combineElementComments(currentElem, child);
               elemType.setTopParticleForComplexOrMixedContent(2);
            }

            currentElem = child;
         }
      }

   }

   protected void checkIfElementReferenceIsNeeded(Element child, String parentNamespace, TypeSystemHolder typeSystemHolder, Inst2XsdOptions options) {
      if(!child.getName().getNamespaceURI().equals(parentNamespace)) {
         Element referencedElem = new Element();
         referencedElem.setGlobal(true);
         referencedElem.setName(child.getName());
         referencedElem.setType(child.getType());
         if(child.isNillable()) {
            referencedElem.setNillable(true);
            child.setNillable(false);
         }

         referencedElem = this.addGlobalElement(referencedElem, typeSystemHolder, options);
         child.setRef(referencedElem);
      }

   }

   protected void checkIfReferenceToGlobalTypeIsNeeded(Element elem, TypeSystemHolder typeSystemHolder, Inst2XsdOptions options) {}

   protected void processAttributesInComplexType(Type elemType, List attributes) {
      assert elemType.isComplexType();

      Iterator iterator = attributes.iterator();

      while(iterator.hasNext()) {
         Attribute att = (Attribute)iterator.next();
         elemType.addAttribute(att);
      }

   }

   protected Attribute processAttribute(XmlCursor xc, Inst2XsdOptions options, String parentNamespace, TypeSystemHolder typeSystemHolder) {
      assert xc.isAttr() : "xc not on attribute";

      Attribute attribute = new Attribute();
      QName attName = xc.getName();
      attribute.setName(attName);
      XmlCursor parent = xc.newCursor();
      parent.toParent();
      Type simpleContentType = Type.createNamedType(this.processSimpleContentType(xc.getTextValue(), options, parent), 1);
      parent.dispose();
      attribute.setType(simpleContentType);
      this.checkIfAttributeReferenceIsNeeded(attribute, parentNamespace, typeSystemHolder);
      return attribute;
   }

   protected void checkIfAttributeReferenceIsNeeded(Attribute attribute, String parentNamespace, TypeSystemHolder typeSystemHolder) {
      if(!attribute.getName().getNamespaceURI().equals("") && !attribute.getName().getNamespaceURI().equals(parentNamespace)) {
         Attribute referencedAtt = new Attribute();
         referencedAtt.setGlobal(true);
         referencedAtt.setName(attribute.getName());
         referencedAtt.setType(attribute.getType());
         typeSystemHolder.addGlobalAttribute(referencedAtt);
         attribute.setRef(referencedAtt);
      }

   }

   protected QName processSimpleContentType(String lexicalValue, Inst2XsdOptions options, final XmlCursor xc) {
      if(options.getSimpleContentTypes() == 2) {
         return XmlString.type.getName();
      } else if(options.getSimpleContentTypes() != 1) {
         throw new IllegalArgumentException("Unknown value for Inst2XsdOptions.getSimpleContentTypes() :" + options.getSimpleContentTypes());
      } else {
         try {
            XsTypeConverter.lexByte(lexicalValue);
            return XmlByte.type.getName();
         } catch (Exception var12) {
            try {
               XsTypeConverter.lexShort(lexicalValue);
               return XmlShort.type.getName();
            } catch (Exception var11) {
               try {
                  XsTypeConverter.lexInt(lexicalValue);
                  return XmlInt.type.getName();
               } catch (Exception var10) {
                  try {
                     XsTypeConverter.lexLong(lexicalValue);
                     return XmlLong.type.getName();
                  } catch (Exception var9) {
                     try {
                        XsTypeConverter.lexInteger(lexicalValue);
                        return XmlInteger.type.getName();
                     } catch (Exception var8) {
                        try {
                           XsTypeConverter.lexFloat(lexicalValue);
                           return XmlFloat.type.getName();
                        } catch (Exception var7) {
                           XmlDateImpl.validateLexical(lexicalValue, XmlDate.type, this._validationContext);
                           if(this._validationContext.isValid()) {
                              return XmlDate.type.getName();
                           } else {
                              this._validationContext.resetToValid();
                              XmlDateTimeImpl.validateLexical(lexicalValue, XmlDateTime.type, this._validationContext);
                              if(this._validationContext.isValid()) {
                                 return XmlDateTime.type.getName();
                              } else {
                                 this._validationContext.resetToValid();
                                 XmlTimeImpl.validateLexical(lexicalValue, XmlTime.type, this._validationContext);
                                 if(this._validationContext.isValid()) {
                                    return XmlTime.type.getName();
                                 } else {
                                    this._validationContext.resetToValid();
                                    XmlDurationImpl.validateLexical(lexicalValue, XmlDuration.type, this._validationContext);
                                    if(this._validationContext.isValid()) {
                                       return XmlDuration.type.getName();
                                    } else {
                                       this._validationContext.resetToValid();
                                       if(lexicalValue.startsWith("http://") || lexicalValue.startsWith("www.")) {
                                          XmlAnyUriImpl.validateLexical(lexicalValue, this._validationContext);
                                          if(this._validationContext.isValid()) {
                                             return XmlAnyURI.type.getName();
                                          }

                                          this._validationContext.resetToValid();
                                       }

                                       int idx = lexicalValue.indexOf(58);
                                       if(idx >= 0 && idx == lexicalValue.lastIndexOf(58) && idx + 1 < lexicalValue.length()) {
                                          PrefixResolver prefixResolver = new PrefixResolver() {
                                             public String getNamespaceForPrefix(String prefix) {
                                                return xc.namespaceForPrefix(prefix);
                                             }
                                          };
                                          XmlQNameImpl.validateLexical(lexicalValue, this._validationContext, prefixResolver);
                                          if(this._validationContext.isValid()) {
                                             return XmlQName.type.getName();
                                          }

                                          this._validationContext.resetToValid();
                                       }

                                       return XmlString.type.getName();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   protected void combineTypes(Type into, Type with, Inst2XsdOptions options) {
      if(into != with) {
         if(!into.isGlobal() || !with.isGlobal() || !into.getName().equals(with.getName())) {
            if(into.getContentType() == 1 && with.getContentType() == 1) {
               this.combineSimpleTypes(into, with, options);
            } else if((into.getContentType() == 1 || into.getContentType() == 2) && (with.getContentType() == 1 || with.getContentType() == 2)) {
               QName intoTypeName = into.isComplexType()?into.getExtensionType().getName():into.getName();
               QName withTypeName = with.isComplexType()?with.getExtensionType().getName():with.getName();
               into.setContentType(2);
               QName moreGeneralTypeName = this.combineToMoreGeneralSimpleType(intoTypeName, withTypeName);
               if(into.isComplexType()) {
                  Type extendedType = Type.createNamedType(moreGeneralTypeName, 1);
                  into.setExtensionType(extendedType);
               } else {
                  into.setName(moreGeneralTypeName);
               }

               this.combineAttributesOfTypes(into, with);
            } else if(into.getContentType() == 3 && with.getContentType() == 3) {
               this.combineAttributesOfTypes(into, with);
               this.combineElementsOfTypes(into, with, false, options);
            } else if(into.getContentType() != 1 && into.getContentType() != 2 && with.getContentType() != 1 && with.getContentType() != 2) {
               if((into.getContentType() == 1 || into.getContentType() == 2 || into.getContentType() == 3 || into.getContentType() == 4) && (with.getContentType() == 1 || with.getContentType() == 2 || with.getContentType() == 3 || with.getContentType() == 4)) {
                  into.setContentType(4);
                  this.combineAttributesOfTypes(into, with);
                  this.combineElementsOfTypes(into, with, false, options);
               } else {
                  throw new IllegalArgumentException("Unknown content type.");
               }
            } else {
               into.setContentType(4);
               this.combineAttributesOfTypes(into, with);
               this.combineElementsOfTypes(into, with, true, options);
            }
         }
      }
   }

   protected void combineSimpleTypes(Type into, Type with, Inst2XsdOptions options) {
      assert into.getContentType() == 1 && with.getContentType() == 1 : "Invalid arguments";

      into.setName(this.combineToMoreGeneralSimpleType(into.getName(), with.getName()));
      if(options.isUseEnumerations()) {
         into.addAllEnumerationsFrom(with);
         if(into.getEnumerationValues().size() > options.getUseEnumerations()) {
            into.closeEnumeration();
         }
      }

   }

   protected QName combineToMoreGeneralSimpleType(QName t1, QName t2) {
      return t1.equals(t2)?t1:(t2.equals(XmlShort.type.getName()) && t1.equals(XmlByte.type.getName())?t2:(t1.equals(XmlShort.type.getName()) && t2.equals(XmlByte.type.getName())?t1:(t2.equals(XmlInt.type.getName()) && (t1.equals(XmlShort.type.getName()) || t1.equals(XmlByte.type.getName()))?t2:(t1.equals(XmlInt.type.getName()) && (t2.equals(XmlShort.type.getName()) || t2.equals(XmlByte.type.getName()))?t1:(t2.equals(XmlLong.type.getName()) && (t1.equals(XmlInt.type.getName()) || t1.equals(XmlShort.type.getName()) || t1.equals(XmlByte.type.getName()))?t2:(t1.equals(XmlLong.type.getName()) && (t2.equals(XmlInt.type.getName()) || t2.equals(XmlShort.type.getName()) || t2.equals(XmlByte.type.getName()))?t1:(t2.equals(XmlInteger.type.getName()) && (t1.equals(XmlLong.type.getName()) || t1.equals(XmlInt.type.getName()) || t1.equals(XmlShort.type.getName()) || t1.equals(XmlByte.type.getName()))?t2:(t1.equals(XmlInteger.type.getName()) && (t2.equals(XmlLong.type.getName()) || t2.equals(XmlInt.type.getName()) || t2.equals(XmlShort.type.getName()) || t2.equals(XmlByte.type.getName()))?t1:(t2.equals(XmlFloat.type.getName()) && (t1.equals(XmlInteger.type.getName()) || t1.equals(XmlLong.type.getName()) || t1.equals(XmlInt.type.getName()) || t1.equals(XmlShort.type.getName()) || t1.equals(XmlByte.type.getName()))?t2:(t1.equals(XmlFloat.type.getName()) && (t2.equals(XmlInteger.type.getName()) || t2.equals(XmlLong.type.getName()) || t2.equals(XmlInt.type.getName()) || t2.equals(XmlShort.type.getName()) || t2.equals(XmlByte.type.getName()))?t1:XmlString.type.getName()))))))))));
   }

   protected void combineAttributesOfTypes(Type into, Type from) {
      int i = 0;

      Attribute intoAtt;
      int j;
      Attribute fromAtt;
      while(i < from.getAttributes().size()) {
         intoAtt = (Attribute)from.getAttributes().get(i);
         j = 0;

         while(true) {
            if(j < into.getAttributes().size()) {
               fromAtt = (Attribute)into.getAttributes().get(j);
               if(!fromAtt.getName().equals(intoAtt.getName())) {
                  ++j;
                  continue;
               }

               fromAtt.getType().setName(this.combineToMoreGeneralSimpleType(fromAtt.getType().getName(), intoAtt.getType().getName()));
            } else {
               into.addAttribute(intoAtt);
            }

            ++i;
            break;
         }
      }

      for(i = 0; i < into.getAttributes().size(); ++i) {
         intoAtt = (Attribute)into.getAttributes().get(i);

         for(j = 0; j < from.getAttributes().size(); ++j) {
            fromAtt = (Attribute)from.getAttributes().get(j);
            if(fromAtt.getName().equals(intoAtt.getName())) {
               ;
            }
         }

         intoAtt.setOptional(true);
      }

   }

   protected void combineElementsOfTypes(Type into, Type from, boolean makeElementsOptional, Inst2XsdOptions options) {
      boolean needsUnboundedChoice = false;
      if(into.getTopParticleForComplexOrMixedContent() != 1 || from.getTopParticleForComplexOrMixedContent() != 1) {
         needsUnboundedChoice = true;
      }

      ArrayList res = new ArrayList();
      int fromStartingIndex = 0;
      int fromMatchedIndex = -1;
      int intoMatchedIndex = -1;

      int j;
      Element fromElem;
      int i;
      Element intoElem;
      for(j = 0; !needsUnboundedChoice && j < into.getElements().size(); ++j) {
         fromElem = (Element)into.getElements().get(j);

         for(i = fromStartingIndex; i < from.getElements().size(); ++i) {
            intoElem = (Element)from.getElements().get(i);
            if(fromElem.getName().equals(intoElem.getName())) {
               fromMatchedIndex = i;
               break;
            }
         }

         if(fromMatchedIndex < fromStartingIndex) {
            res.add(fromElem);
            fromElem.setMinOccurs(0);
         } else {
            label98:
            for(i = fromStartingIndex; i < fromMatchedIndex; ++i) {
               intoElem = (Element)from.getElements().get(i);

               for(int i2 = j + 1; i2 < into.getElements().size(); ++i2) {
                  Element intoCandidate = (Element)into.getElements().get(i2);
                  if(intoElem.getName().equals(intoCandidate.getName())) {
                     intoMatchedIndex = i2;
                     break label98;
                  }
               }
            }

            if(intoMatchedIndex < j) {
               for(i = fromStartingIndex; i < fromMatchedIndex; ++i) {
                  intoElem = (Element)from.getElements().get(i);
                  res.add(intoElem);
                  intoElem.setMinOccurs(0);
               }

               res.add(fromElem);
               Element var16 = (Element)from.getElements().get(fromMatchedIndex);
               if(var16.getMinOccurs() <= 0) {
                  fromElem.setMinOccurs(0);
               }

               if(var16.getMaxOccurs() == -1) {
                  fromElem.setMaxOccurs(-1);
               }

               this.combineTypes(fromElem.getType(), var16.getType(), options);
               this.combineElementComments(fromElem, var16);
               fromStartingIndex = fromMatchedIndex + 1;
            } else {
               needsUnboundedChoice = true;
            }
         }
      }

      for(j = fromStartingIndex; j < from.getElements().size(); ++j) {
         fromElem = (Element)from.getElements().get(j);
         res.add(fromElem);
         fromElem.setMinOccurs(0);
      }

      if(!needsUnboundedChoice) {
         into.setElements(res);
      } else {
         into.setTopParticleForComplexOrMixedContent(2);
         j = 0;

         while(j < from.getElements().size()) {
            fromElem = (Element)from.getElements().get(j);
            i = 0;

            while(true) {
               if(i < into.getElements().size()) {
                  intoElem = (Element)into.getElements().get(i);
                  intoElem.setMinOccurs(1);
                  intoElem.setMaxOccurs(1);
                  if(intoElem != fromElem) {
                     if(!intoElem.getName().equals(fromElem.getName())) {
                        ++i;
                        continue;
                     }

                     this.combineTypes(intoElem.getType(), fromElem.getType(), options);
                     this.combineElementComments(intoElem, fromElem);
                  }
               } else {
                  into.addElement(fromElem);
                  fromElem.setMinOccurs(1);
                  fromElem.setMaxOccurs(1);
               }

               ++j;
               break;
            }
         }

      }
   }

   protected void combineElementComments(Element into, Element with) {
      if(with.getComment() != null && with.getComment().length() > 0) {
         if(into.getComment() == null) {
            into.setComment(with.getComment());
         } else {
            into.setComment(into.getComment() + with.getComment());
         }
      }

   }


   protected class SCTValidationContext implements ValidationContext {

      protected boolean valid = true;


      public boolean isValid() {
         return this.valid;
      }

      public void resetToValid() {
         this.valid = true;
      }

      public void invalid(String message) {
         this.valid = false;
      }

      public void invalid(String code, Object[] args) {
         this.valid = false;
      }
   }
}
