package com.microsoft.schemas.office.x2006.digsig.impl;

import com.microsoft.schemas.office.x2006.digsig.CTSignatureInfoV1;
import com.microsoft.schemas.office.x2006.digsig.STPositiveInteger;
import com.microsoft.schemas.office.x2006.digsig.STSignatureComments;
import com.microsoft.schemas.office.x2006.digsig.STSignatureProviderUrl;
import com.microsoft.schemas.office.x2006.digsig.STSignatureText;
import com.microsoft.schemas.office.x2006.digsig.STSignatureType;
import com.microsoft.schemas.office.x2006.digsig.STUniqueIdentifierWithBraces;
import com.microsoft.schemas.office.x2006.digsig.STVersion;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnyURI;
import org.apache.xmlbeans.XmlBase64Binary;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class CTSignatureInfoV1Impl extends XmlComplexContentImpl implements CTSignatureInfoV1 {

   private static final QName SETUPID$0 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SetupID");
   private static final QName SIGNATURETEXT$2 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureText");
   private static final QName SIGNATUREIMAGE$4 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureImage");
   private static final QName SIGNATURECOMMENTS$6 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureComments");
   private static final QName WINDOWSVERSION$8 = new QName("http://schemas.microsoft.com/office/2006/digsig", "WindowsVersion");
   private static final QName OFFICEVERSION$10 = new QName("http://schemas.microsoft.com/office/2006/digsig", "OfficeVersion");
   private static final QName APPLICATIONVERSION$12 = new QName("http://schemas.microsoft.com/office/2006/digsig", "ApplicationVersion");
   private static final QName MONITORS$14 = new QName("http://schemas.microsoft.com/office/2006/digsig", "Monitors");
   private static final QName HORIZONTALRESOLUTION$16 = new QName("http://schemas.microsoft.com/office/2006/digsig", "HorizontalResolution");
   private static final QName VERTICALRESOLUTION$18 = new QName("http://schemas.microsoft.com/office/2006/digsig", "VerticalResolution");
   private static final QName COLORDEPTH$20 = new QName("http://schemas.microsoft.com/office/2006/digsig", "ColorDepth");
   private static final QName SIGNATUREPROVIDERID$22 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderId");
   private static final QName SIGNATUREPROVIDERURL$24 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderUrl");
   private static final QName SIGNATUREPROVIDERDETAILS$26 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureProviderDetails");
   private static final QName SIGNATURETYPE$28 = new QName("http://schemas.microsoft.com/office/2006/digsig", "SignatureType");
   private static final QName DELEGATESUGGESTEDSIGNER$30 = new QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSigner");
   private static final QName DELEGATESUGGESTEDSIGNER2$32 = new QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSigner2");
   private static final QName DELEGATESUGGESTEDSIGNEREMAIL$34 = new QName("http://schemas.microsoft.com/office/2006/digsig", "DelegateSuggestedSignerEmail");
   private static final QName MANIFESTHASHALGORITHM$36 = new QName("http://schemas.microsoft.com/office/2006/digsig", "ManifestHashAlgorithm");


   public CTSignatureInfoV1Impl(SchemaType var1) {
      super(var1);
   }

   public String getSetupID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SETUPID$0, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STUniqueIdentifierWithBraces xgetSetupID() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUniqueIdentifierWithBraces var2 = null;
         var2 = (STUniqueIdentifierWithBraces)this.get_store().find_element_user(SETUPID$0, 0);
         return var2;
      }
   }

   public void setSetupID(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SETUPID$0, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SETUPID$0);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSetupID(STUniqueIdentifierWithBraces var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUniqueIdentifierWithBraces var3 = null;
         var3 = (STUniqueIdentifierWithBraces)this.get_store().find_element_user(SETUPID$0, 0);
         if(var3 == null) {
            var3 = (STUniqueIdentifierWithBraces)this.get_store().add_element_user(SETUPID$0);
         }

         var3.set(var1);
      }
   }

   public String getSignatureText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SIGNATURETEXT$2, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STSignatureText xgetSignatureText() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignatureText var2 = null;
         var2 = (STSignatureText)this.get_store().find_element_user(SIGNATURETEXT$2, 0);
         return var2;
      }
   }

   public void setSignatureText(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIGNATURETEXT$2, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SIGNATURETEXT$2);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSignatureText(STSignatureText var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignatureText var3 = null;
         var3 = (STSignatureText)this.get_store().find_element_user(SIGNATURETEXT$2, 0);
         if(var3 == null) {
            var3 = (STSignatureText)this.get_store().add_element_user(SIGNATURETEXT$2);
         }

         var3.set(var1);
      }
   }

   public byte[] getSignatureImage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SIGNATUREIMAGE$4, 0);
         return var2 == null?null:var2.getByteArrayValue();
      }
   }

   public XmlBase64Binary xgetSignatureImage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var2 = null;
         var2 = (XmlBase64Binary)this.get_store().find_element_user(SIGNATUREIMAGE$4, 0);
         return var2;
      }
   }

   public void setSignatureImage(byte[] var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIGNATUREIMAGE$4, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SIGNATUREIMAGE$4);
         }

         var3.setByteArrayValue(var1);
      }
   }

   public void xsetSignatureImage(XmlBase64Binary var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlBase64Binary var3 = null;
         var3 = (XmlBase64Binary)this.get_store().find_element_user(SIGNATUREIMAGE$4, 0);
         if(var3 == null) {
            var3 = (XmlBase64Binary)this.get_store().add_element_user(SIGNATUREIMAGE$4);
         }

         var3.set(var1);
      }
   }

   public String getSignatureComments() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SIGNATURECOMMENTS$6, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STSignatureComments xgetSignatureComments() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignatureComments var2 = null;
         var2 = (STSignatureComments)this.get_store().find_element_user(SIGNATURECOMMENTS$6, 0);
         return var2;
      }
   }

   public void setSignatureComments(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIGNATURECOMMENTS$6, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SIGNATURECOMMENTS$6);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSignatureComments(STSignatureComments var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignatureComments var3 = null;
         var3 = (STSignatureComments)this.get_store().find_element_user(SIGNATURECOMMENTS$6, 0);
         if(var3 == null) {
            var3 = (STSignatureComments)this.get_store().add_element_user(SIGNATURECOMMENTS$6);
         }

         var3.set(var1);
      }
   }

   public String getWindowsVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(WINDOWSVERSION$8, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STVersion xgetWindowsVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVersion var2 = null;
         var2 = (STVersion)this.get_store().find_element_user(WINDOWSVERSION$8, 0);
         return var2;
      }
   }

   public void setWindowsVersion(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(WINDOWSVERSION$8, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(WINDOWSVERSION$8);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetWindowsVersion(STVersion var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVersion var3 = null;
         var3 = (STVersion)this.get_store().find_element_user(WINDOWSVERSION$8, 0);
         if(var3 == null) {
            var3 = (STVersion)this.get_store().add_element_user(WINDOWSVERSION$8);
         }

         var3.set(var1);
      }
   }

   public String getOfficeVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(OFFICEVERSION$10, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STVersion xgetOfficeVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVersion var2 = null;
         var2 = (STVersion)this.get_store().find_element_user(OFFICEVERSION$10, 0);
         return var2;
      }
   }

   public void setOfficeVersion(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(OFFICEVERSION$10, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(OFFICEVERSION$10);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetOfficeVersion(STVersion var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVersion var3 = null;
         var3 = (STVersion)this.get_store().find_element_user(OFFICEVERSION$10, 0);
         if(var3 == null) {
            var3 = (STVersion)this.get_store().add_element_user(OFFICEVERSION$10);
         }

         var3.set(var1);
      }
   }

   public String getApplicationVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(APPLICATIONVERSION$12, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STVersion xgetApplicationVersion() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVersion var2 = null;
         var2 = (STVersion)this.get_store().find_element_user(APPLICATIONVERSION$12, 0);
         return var2;
      }
   }

   public void setApplicationVersion(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(APPLICATIONVERSION$12, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(APPLICATIONVERSION$12);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetApplicationVersion(STVersion var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STVersion var3 = null;
         var3 = (STVersion)this.get_store().find_element_user(APPLICATIONVERSION$12, 0);
         if(var3 == null) {
            var3 = (STVersion)this.get_store().add_element_user(APPLICATIONVERSION$12);
         }

         var3.set(var1);
      }
   }

   public int getMonitors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(MONITORS$14, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveInteger xgetMonitors() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveInteger var2 = null;
         var2 = (STPositiveInteger)this.get_store().find_element_user(MONITORS$14, 0);
         return var2;
      }
   }

   public void setMonitors(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MONITORS$14, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(MONITORS$14);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetMonitors(STPositiveInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveInteger var3 = null;
         var3 = (STPositiveInteger)this.get_store().find_element_user(MONITORS$14, 0);
         if(var3 == null) {
            var3 = (STPositiveInteger)this.get_store().add_element_user(MONITORS$14);
         }

         var3.set(var1);
      }
   }

   public int getHorizontalResolution() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(HORIZONTALRESOLUTION$16, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveInteger xgetHorizontalResolution() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveInteger var2 = null;
         var2 = (STPositiveInteger)this.get_store().find_element_user(HORIZONTALRESOLUTION$16, 0);
         return var2;
      }
   }

   public void setHorizontalResolution(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(HORIZONTALRESOLUTION$16, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(HORIZONTALRESOLUTION$16);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetHorizontalResolution(STPositiveInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveInteger var3 = null;
         var3 = (STPositiveInteger)this.get_store().find_element_user(HORIZONTALRESOLUTION$16, 0);
         if(var3 == null) {
            var3 = (STPositiveInteger)this.get_store().add_element_user(HORIZONTALRESOLUTION$16);
         }

         var3.set(var1);
      }
   }

   public int getVerticalResolution() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(VERTICALRESOLUTION$18, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveInteger xgetVerticalResolution() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveInteger var2 = null;
         var2 = (STPositiveInteger)this.get_store().find_element_user(VERTICALRESOLUTION$18, 0);
         return var2;
      }
   }

   public void setVerticalResolution(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(VERTICALRESOLUTION$18, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(VERTICALRESOLUTION$18);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetVerticalResolution(STPositiveInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveInteger var3 = null;
         var3 = (STPositiveInteger)this.get_store().find_element_user(VERTICALRESOLUTION$18, 0);
         if(var3 == null) {
            var3 = (STPositiveInteger)this.get_store().add_element_user(VERTICALRESOLUTION$18);
         }

         var3.set(var1);
      }
   }

   public int getColorDepth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(COLORDEPTH$20, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STPositiveInteger xgetColorDepth() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveInteger var2 = null;
         var2 = (STPositiveInteger)this.get_store().find_element_user(COLORDEPTH$20, 0);
         return var2;
      }
   }

   public void setColorDepth(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(COLORDEPTH$20, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(COLORDEPTH$20);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetColorDepth(STPositiveInteger var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STPositiveInteger var3 = null;
         var3 = (STPositiveInteger)this.get_store().find_element_user(COLORDEPTH$20, 0);
         if(var3 == null) {
            var3 = (STPositiveInteger)this.get_store().add_element_user(COLORDEPTH$20);
         }

         var3.set(var1);
      }
   }

   public String getSignatureProviderId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SIGNATUREPROVIDERID$22, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STUniqueIdentifierWithBraces xgetSignatureProviderId() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUniqueIdentifierWithBraces var2 = null;
         var2 = (STUniqueIdentifierWithBraces)this.get_store().find_element_user(SIGNATUREPROVIDERID$22, 0);
         return var2;
      }
   }

   public void setSignatureProviderId(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIGNATUREPROVIDERID$22, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SIGNATUREPROVIDERID$22);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSignatureProviderId(STUniqueIdentifierWithBraces var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STUniqueIdentifierWithBraces var3 = null;
         var3 = (STUniqueIdentifierWithBraces)this.get_store().find_element_user(SIGNATUREPROVIDERID$22, 0);
         if(var3 == null) {
            var3 = (STUniqueIdentifierWithBraces)this.get_store().add_element_user(SIGNATUREPROVIDERID$22);
         }

         var3.set(var1);
      }
   }

   public String getSignatureProviderUrl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SIGNATUREPROVIDERURL$24, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public STSignatureProviderUrl xgetSignatureProviderUrl() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignatureProviderUrl var2 = null;
         var2 = (STSignatureProviderUrl)this.get_store().find_element_user(SIGNATUREPROVIDERURL$24, 0);
         return var2;
      }
   }

   public void setSignatureProviderUrl(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIGNATUREPROVIDERURL$24, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SIGNATUREPROVIDERURL$24);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetSignatureProviderUrl(STSignatureProviderUrl var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignatureProviderUrl var3 = null;
         var3 = (STSignatureProviderUrl)this.get_store().find_element_user(SIGNATUREPROVIDERURL$24, 0);
         if(var3 == null) {
            var3 = (STSignatureProviderUrl)this.get_store().add_element_user(SIGNATUREPROVIDERURL$24);
         }

         var3.set(var1);
      }
   }

   public int getSignatureProviderDetails() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SIGNATUREPROVIDERDETAILS$26, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public XmlInt xgetSignatureProviderDetails() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var2 = null;
         var2 = (XmlInt)this.get_store().find_element_user(SIGNATUREPROVIDERDETAILS$26, 0);
         return var2;
      }
   }

   public void setSignatureProviderDetails(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIGNATUREPROVIDERDETAILS$26, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SIGNATUREPROVIDERDETAILS$26);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSignatureProviderDetails(XmlInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlInt var3 = null;
         var3 = (XmlInt)this.get_store().find_element_user(SIGNATUREPROVIDERDETAILS$26, 0);
         if(var3 == null) {
            var3 = (XmlInt)this.get_store().add_element_user(SIGNATUREPROVIDERDETAILS$26);
         }

         var3.set(var1);
      }
   }

   public int getSignatureType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(SIGNATURETYPE$28, 0);
         return var2 == null?0:var2.getIntValue();
      }
   }

   public STSignatureType xgetSignatureType() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignatureType var2 = null;
         var2 = (STSignatureType)this.get_store().find_element_user(SIGNATURETYPE$28, 0);
         return var2;
      }
   }

   public void setSignatureType(int var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(SIGNATURETYPE$28, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(SIGNATURETYPE$28);
         }

         var3.setIntValue(var1);
      }
   }

   public void xsetSignatureType(STSignatureType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         STSignatureType var3 = null;
         var3 = (STSignatureType)this.get_store().find_element_user(SIGNATURETYPE$28, 0);
         if(var3 == null) {
            var3 = (STSignatureType)this.get_store().add_element_user(SIGNATURETYPE$28);
         }

         var3.set(var1);
      }
   }

   public String getDelegateSuggestedSigner() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNER$30, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetDelegateSuggestedSigner() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNER$30, 0);
         return var2;
      }
   }

   public boolean isSetDelegateSuggestedSigner() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DELEGATESUGGESTEDSIGNER$30) != 0;
      }
   }

   public void setDelegateSuggestedSigner(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNER$30, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(DELEGATESUGGESTEDSIGNER$30);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDelegateSuggestedSigner(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNER$30, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(DELEGATESUGGESTEDSIGNER$30);
         }

         var3.set(var1);
      }
   }

   public void unsetDelegateSuggestedSigner() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DELEGATESUGGESTEDSIGNER$30, 0);
      }
   }

   public String getDelegateSuggestedSigner2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNER2$32, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetDelegateSuggestedSigner2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNER2$32, 0);
         return var2;
      }
   }

   public boolean isSetDelegateSuggestedSigner2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DELEGATESUGGESTEDSIGNER2$32) != 0;
      }
   }

   public void setDelegateSuggestedSigner2(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNER2$32, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(DELEGATESUGGESTEDSIGNER2$32);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDelegateSuggestedSigner2(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNER2$32, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(DELEGATESUGGESTEDSIGNER2$32);
         }

         var3.set(var1);
      }
   }

   public void unsetDelegateSuggestedSigner2() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DELEGATESUGGESTEDSIGNER2$32, 0);
      }
   }

   public String getDelegateSuggestedSignerEmail() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlString xgetDelegateSuggestedSignerEmail() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var2 = null;
         var2 = (XmlString)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
         return var2;
      }
   }

   public boolean isSetDelegateSuggestedSignerEmail() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DELEGATESUGGESTEDSIGNEREMAIL$34) != 0;
      }
   }

   public void setDelegateSuggestedSignerEmail(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetDelegateSuggestedSignerEmail(XmlString var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlString var3 = null;
         var3 = (XmlString)this.get_store().find_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
         if(var3 == null) {
            var3 = (XmlString)this.get_store().add_element_user(DELEGATESUGGESTEDSIGNEREMAIL$34);
         }

         var3.set(var1);
      }
   }

   public void unsetDelegateSuggestedSignerEmail() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DELEGATESUGGESTEDSIGNEREMAIL$34, 0);
      }
   }

   public String getManifestHashAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_element_user(MANIFESTHASHALGORITHM$36, 0);
         return var2 == null?null:var2.getStringValue();
      }
   }

   public XmlAnyURI xgetManifestHashAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var2 = null;
         var2 = (XmlAnyURI)this.get_store().find_element_user(MANIFESTHASHALGORITHM$36, 0);
         return var2;
      }
   }

   public boolean isSetManifestHashAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(MANIFESTHASHALGORITHM$36) != 0;
      }
   }

   public void setManifestHashAlgorithm(String var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var3 = null;
         var3 = (SimpleValue)this.get_store().find_element_user(MANIFESTHASHALGORITHM$36, 0);
         if(var3 == null) {
            var3 = (SimpleValue)this.get_store().add_element_user(MANIFESTHASHALGORITHM$36);
         }

         var3.setStringValue(var1);
      }
   }

   public void xsetManifestHashAlgorithm(XmlAnyURI var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlAnyURI var3 = null;
         var3 = (XmlAnyURI)this.get_store().find_element_user(MANIFESTHASHALGORITHM$36, 0);
         if(var3 == null) {
            var3 = (XmlAnyURI)this.get_store().add_element_user(MANIFESTHASHALGORITHM$36);
         }

         var3.set(var1);
      }
   }

   public void unsetManifestHashAlgorithm() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(MANIFESTHASHALGORITHM$36, 0);
      }
   }

}
