package org.apache.poi.poifs.crypt.dsig.services;

import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.util.ArrayList;
import java.util.List;

public class RevocationData {

   private final List crls = new ArrayList();
   private final List ocsps = new ArrayList();


   public void addCRL(byte[] encodedCrl) {
      this.crls.add(encodedCrl);
   }

   public void addCRL(X509CRL crl) {
      byte[] encodedCrl;
      try {
         encodedCrl = crl.getEncoded();
      } catch (CRLException var4) {
         throw new IllegalArgumentException("CRL coding error: " + var4.getMessage(), var4);
      }

      this.addCRL(encodedCrl);
   }

   public void addOCSP(byte[] encodedOcsp) {
      this.ocsps.add(encodedOcsp);
   }

   public List getCRLs() {
      return this.crls;
   }

   public List getOCSPs() {
      return this.ocsps;
   }

   public boolean hasOCSPs() {
      return !this.ocsps.isEmpty();
   }

   public boolean hasCRLs() {
      return !this.crls.isEmpty();
   }

   public boolean hasRevocationDataEntries() {
      return this.hasOCSPs() || this.hasCRLs();
   }
}
