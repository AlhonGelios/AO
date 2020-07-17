package org.openxmlformats.schemas.wordprocessingml.x2006.main.impl;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocProtect;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgClass;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STAlgType;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STCryptProv;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLongHexNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STString;

public class CTDocProtectImpl extends XmlComplexContentImpl implements CTDocProtect {

   private static final QName EDIT$0 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "edit");
   private static final QName FORMATTING$2 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "formatting");
   private static final QName ENFORCEMENT$4 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "enforcement");
   private static final QName CRYPTPROVIDERTYPE$6 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptProviderType");
   private static final QName CRYPTALGORITHMCLASS$8 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptAlgorithmClass");
   private static final QName CRYPTALGORITHMTYPE$10 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptAlgorithmType");
   private static final QName CRYPTALGORITHMSID$12 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptAlgorithmSid");
   private static final QName CRYPTSPINCOUNT$14 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptSpinCount");
   private static final QName CRYPTPROVIDER$16 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptProvider");
   private static final QName ALGIDEXT$18 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "algIdExt");
   private static final QName ALGIDEXTSOURCE$20 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "algIdExtSource");
   private static final QName CRYPTPROVIDERTYPEEXT$22 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptProviderTypeExt");
   private static final QName CRYPTPROVIDERTYPEEXTSOURCE$24 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "cryptProviderTypeExtSource");
   private static final QName HASH$26 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "hash");
   private static final QName SALT$28 = new QName("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "salt");


   public CTDocProtectImpl(SchemaType var1) {
      super(var1);
   }

   public STDocProtect.Enum getEdit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(EDIT$0);
         return var2 == null?null:(STDocProtect.Enum)var2.getEnumValue();
      }
   }

   public STDocProtect xgetEdit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDocProtect var2 = null;
         var2 = (STDocProtect)this.get_store().find_attribute_user(EDIT$0);
         return var2;
      }
   }

   public boolean isSetEdit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(EDIT$0) != null;
      }
   }

   public void setEdit(STDocProtect.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(EDIT$0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(EDIT$0);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEdit(STDocProtect var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDocProtect var3 = null;
         var3 = (STDocProtect)this.get_store().find_attribute_user(EDIT$0);
         if(var3 == null) {
            var3 = (STDocProtect)this.get_store().add_attribute_user(EDIT$0);
         }

         var3.set(var1);
      }
   }

   public void unsetEdit() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(EDIT$0);
      }
   }

   public STOnOff.Enum getFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(FORMATTING$2);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(FORMATTING$2);
         return var2;
      }
   }

   public boolean isSetFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(FORMATTING$2) != null;
      }
   }

   public void setFormatting(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(FORMATTING$2);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(FORMATTING$2);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetFormatting(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(FORMATTING$2);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(FORMATTING$2);
         }

         var3.set(var1);
      }
   }

   public void unsetFormatting() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(FORMATTING$2);
      }
   }

   public STOnOff.Enum getEnforcement() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ENFORCEMENT$4);
         return var2 == null?null:(STOnOff.Enum)var2.getEnumValue();
      }
   }

   public STOnOff xgetEnforcement() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var2 = null;
         var2 = (STOnOff)this.get_store().find_attribute_user(ENFORCEMENT$4);
         return var2;
      }
   }

   public boolean isSetEnforcement() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ENFORCEMENT$4) != null;
      }
   }

   public void setEnforcement(STOnOff.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ENFORCEMENT$4);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ENFORCEMENT$4);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetEnforcement(STOnOff var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STOnOff var3 = null;
         var3 = (STOnOff)this.get_store().find_attribute_user(ENFORCEMENT$4);
         if(var3 == null) {
            var3 = (STOnOff)this.get_store().add_attribute_user(ENFORCEMENT$4);
         }

         var3.set(var1);
      }
   }

   public void unsetEnforcement() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ENFORCEMENT$4);
      }
   }

   public STCryptProv.Enum getCryptProviderType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CRYPTPROVIDERTYPE$6);
         return var2 == null?null:(STCryptProv.Enum)var2.getEnumValue();
      }
   }

   public STCryptProv xgetCryptProviderType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCryptProv var2 = null;
         var2 = (STCryptProv)this.get_store().find_attribute_user(CRYPTPROVIDERTYPE$6);
         return var2;
      }
   }

   public boolean isSetCryptProviderType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CRYPTPROVIDERTYPE$6) != null;
      }
   }

   public void setCryptProviderType(STCryptProv.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CRYPTPROVIDERTYPE$6);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CRYPTPROVIDERTYPE$6);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCryptProviderType(STCryptProv var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STCryptProv var3 = null;
         var3 = (STCryptProv)this.get_store().find_attribute_user(CRYPTPROVIDERTYPE$6);
         if(var3 == null) {
            var3 = (STCryptProv)this.get_store().add_attribute_user(CRYPTPROVIDERTYPE$6);
         }

         var3.set(var1);
      }
   }

   public void unsetCryptProviderType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CRYPTPROVIDERTYPE$6);
      }
   }

   public STAlgClass.Enum getCryptAlgorithmClass() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CRYPTALGORITHMCLASS$8);
         return var2 == null?null:(STAlgClass.Enum)var2.getEnumValue();
      }
   }

   public STAlgClass xgetCryptAlgorithmClass() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAlgClass var2 = null;
         var2 = (STAlgClass)this.get_store().find_attribute_user(CRYPTALGORITHMCLASS$8);
         return var2;
      }
   }

   public boolean isSetCryptAlgorithmClass() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CRYPTALGORITHMCLASS$8) != null;
      }
   }

   public void setCryptAlgorithmClass(STAlgClass.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CRYPTALGORITHMCLASS$8);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CRYPTALGORITHMCLASS$8);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCryptAlgorithmClass(STAlgClass var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAlgClass var3 = null;
         var3 = (STAlgClass)this.get_store().find_attribute_user(CRYPTALGORITHMCLASS$8);
         if(var3 == null) {
            var3 = (STAlgClass)this.get_store().add_attribute_user(CRYPTALGORITHMCLASS$8);
         }

         var3.set(var1);
      }
   }

   public void unsetCryptAlgorithmClass() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CRYPTALGORITHMCLASS$8);
      }
   }

   public STAlgType.Enum getCryptAlgorithmType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CRYPTALGORITHMTYPE$10);
         return var2 == null?null:(STAlgType.Enum)var2.getEnumValue();
      }
   }

   public STAlgType xgetCryptAlgorithmType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAlgType var2 = null;
         var2 = (STAlgType)this.get_store().find_attribute_user(CRYPTALGORITHMTYPE$10);
         return var2;
      }
   }

   public boolean isSetCryptAlgorithmType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CRYPTALGORITHMTYPE$10) != null;
      }
   }

   public void setCryptAlgorithmType(STAlgType.Enum var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CRYPTALGORITHMTYPE$10);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CRYPTALGORITHMTYPE$10);
         }

         var3.setEnumValue(var1);
      }
   }

   public void xsetCryptAlgorithmType(STAlgType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STAlgType var3 = null;
         var3 = (STAlgType)this.get_store().find_attribute_user(CRYPTALGORITHMTYPE$10);
         if(var3 == null) {
            var3 = (STAlgType)this.get_store().add_attribute_user(CRYPTALGORITHMTYPE$10);
         }

         var3.set(var1);
      }
   }

   public void unsetCryptAlgorithmType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CRYPTALGORITHMTYPE$10);
      }
   }

   public BigInteger getCryptAlgorithmSid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CRYPTALGORITHMSID$12);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetCryptAlgorithmSid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(CRYPTALGORITHMSID$12);
         return var2;
      }
   }

   public boolean isSetCryptAlgorithmSid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CRYPTALGORITHMSID$12) != null;
      }
   }

   public void setCryptAlgorithmSid(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CRYPTALGORITHMSID$12);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CRYPTALGORITHMSID$12);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetCryptAlgorithmSid(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(CRYPTALGORITHMSID$12);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(CRYPTALGORITHMSID$12);
         }

         var3.set(var1);
      }
   }

   public void unsetCryptAlgorithmSid() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CRYPTALGORITHMSID$12);
      }
   }

   public BigInteger getCryptSpinCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CRYPTSPINCOUNT$14);
         return var2 == null?null:var2.getBigIntegerValue();
      }
   }

   public STDecimalNumber xgetCryptSpinCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var2 = null;
         var2 = (STDecimalNumber)this.get_store().find_attribute_user(CRYPTSPINCOUNT$14);
         return var2;
      }
   }

   public boolean isSetCryptSpinCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CRYPTSPINCOUNT$14) != null;
      }
   }

   public void setCryptSpinCount(BigInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CRYPTSPINCOUNT$14);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CRYPTSPINCOUNT$14);
         }

         var3.setBigIntegerValue(var1);
      }
   }

   public void xsetCryptSpinCount(STDecimalNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STDecimalNumber var3 = null;
         var3 = (STDecimalNumber)this.get_store().find_attribute_user(CRYPTSPINCOUNT$14);
         if(var3 == null) {
            var3 = (STDecimalNumber)this.get_store().add_attribute_user(CRYPTSPINCOUNT$14);
         }

         var3.set(var1);
      }
   }

   public void unsetCryptSpinCount() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CRYPTSPINCOUNT$14);
      }
   }

   public String getCryptProvider() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CRYPTPROVIDER$16);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetCryptProvider() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(CRYPTPROVIDER$16);
         return var2;
      }
   }

   public boolean isSetCryptProvider() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CRYPTPROVIDER$16) != null;
      }
   }

   public void setCryptProvider(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CRYPTPROVIDER$16);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CRYPTPROVIDER$16);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCryptProvider(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(CRYPTPROVIDER$16);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(CRYPTPROVIDER$16);
         }

         var3.set(var1);
      }
   }

   public void unsetCryptProvider() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CRYPTPROVIDER$16);
      }
   }

   public byte[] getAlgIdExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALGIDEXT$18);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetAlgIdExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(ALGIDEXT$18);
         return var2;
      }
   }

   public boolean isSetAlgIdExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALGIDEXT$18) != null;
      }
   }

   public void setAlgIdExt(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALGIDEXT$18);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALGIDEXT$18);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetAlgIdExt(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(ALGIDEXT$18);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(ALGIDEXT$18);
         }

         var3.set(var1);
      }
   }

   public void unsetAlgIdExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALGIDEXT$18);
      }
   }

   public String getAlgIdExtSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(ALGIDEXTSOURCE$20);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetAlgIdExtSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(ALGIDEXTSOURCE$20);
         return var2;
      }
   }

   public boolean isSetAlgIdExtSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(ALGIDEXTSOURCE$20) != null;
      }
   }

   public void setAlgIdExtSource(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(ALGIDEXTSOURCE$20);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(ALGIDEXTSOURCE$20);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetAlgIdExtSource(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(ALGIDEXTSOURCE$20);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(ALGIDEXTSOURCE$20);
         }

         var3.set(var1);
      }
   }

   public void unsetAlgIdExtSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(ALGIDEXTSOURCE$20);
      }
   }

   public byte[] getCryptProviderTypeExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public STLongHexNumber xgetCryptProviderTypeExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var2 = null;
         var2 = (STLongHexNumber)this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22);
         return var2;
      }
   }

   public boolean isSetCryptProviderTypeExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22) != null;
      }
   }

   public void setCryptProviderTypeExt(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CRYPTPROVIDERTYPEEXT$22);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetCryptProviderTypeExt(STLongHexNumber var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STLongHexNumber var3 = null;
         var3 = (STLongHexNumber)this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXT$22);
         if(var3 == null) {
            var3 = (STLongHexNumber)this.get_store().add_attribute_user(CRYPTPROVIDERTYPEEXT$22);
         }

         var3.set(var1);
      }
   }

   public void unsetCryptProviderTypeExt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CRYPTPROVIDERTYPEEXT$22);
      }
   }

   public String getCryptProviderTypeExtSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STString xgetCryptProviderTypeExtSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var2 = null;
         var2 = (STString)this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
         return var2;
      }
   }

   public boolean isSetCryptProviderTypeExtSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24) != null;
      }
   }

   public void setCryptProviderTypeExtSource(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetCryptProviderTypeExtSource(STString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STString var3 = null;
         var3 = (STString)this.get_store().find_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
         if(var3 == null) {
            var3 = (STString)this.get_store().add_attribute_user(CRYPTPROVIDERTYPEEXTSOURCE$24);
         }

         var3.set(var1);
      }
   }

   public void unsetCryptProviderTypeExtSource() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(CRYPTPROVIDERTYPEEXTSOURCE$24);
      }
   }

   public byte[] getHash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(HASH$26);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetHash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(HASH$26);
         return var2;
      }
   }

   public boolean isSetHash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(HASH$26) != null;
      }
   }

   public void setHash(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(HASH$26);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(HASH$26);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetHash(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(HASH$26);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(HASH$26);
         }

         var3.set(var1);
      }
   }

   public void unsetHash() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(HASH$26);
      }
   }

   public byte[] getSalt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(SALT$28);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetSalt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_attribute_user(SALT$28);
         return var2;
      }
   }

   public boolean isSetSalt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(SALT$28) != null;
      }
   }

   public void setSalt(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_attribute_user(SALT$28);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_attribute_user(SALT$28);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetSalt(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_attribute_user(SALT$28);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_attribute_user(SALT$28);
         }

         var3.set(var1);
      }
   }

   public void unsetSalt() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(SALT$28);
      }
   }

}
