package org.apache.poi.poifs.crypt;


public enum EncryptionMode {

   binaryRC4("binaryRC4", 0, "org.apache.poi.poifs.crypt.binaryrc4.BinaryRC4EncryptionInfoBuilder", 1, 1, 0),
   cryptoAPI("cryptoAPI", 1, "org.apache.poi.poifs.crypt.cryptoapi.CryptoAPIEncryptionInfoBuilder", 4, 2, 4),
   standard("standard", 2, "org.apache.poi.poifs.crypt.standard.StandardEncryptionInfoBuilder", 4, 2, 36),
   agile("agile", 3, "org.apache.poi.poifs.crypt.agile.AgileEncryptionInfoBuilder", 4, 4, 64);
   public final String builder;
   public final int versionMajor;
   public final int versionMinor;
   public final int encryptionFlags;
   // $FF: synthetic field
   private static final EncryptionMode[] $VALUES = new EncryptionMode[]{binaryRC4, cryptoAPI, standard, agile};


   private EncryptionMode(String var1, int var2, String builder, int versionMajor, int versionMinor, int encryptionFlags) {
      this.builder = builder;
      this.versionMajor = versionMajor;
      this.versionMinor = versionMinor;
      this.encryptionFlags = encryptionFlags;
   }

}
