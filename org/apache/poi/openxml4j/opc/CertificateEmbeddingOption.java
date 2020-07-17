package org.apache.poi.openxml4j.opc;


public enum CertificateEmbeddingOption {

   IN_CERTIFICATE_PART("IN_CERTIFICATE_PART", 0),
   IN_SIGNATURE_PART("IN_SIGNATURE_PART", 1),
   NOT_EMBEDDED("NOT_EMBEDDED", 2);
   // $FF: synthetic field
   private static final CertificateEmbeddingOption[] $VALUES = new CertificateEmbeddingOption[]{IN_CERTIFICATE_PART, IN_SIGNATURE_PART, NOT_EMBEDDED};


   private CertificateEmbeddingOption(String var1, int var2) {}

}
