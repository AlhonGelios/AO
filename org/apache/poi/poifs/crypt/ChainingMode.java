package org.apache.poi.poifs.crypt;


public enum ChainingMode {

   ecb("ecb", 0, "ECB", 1),
   cbc("cbc", 1, "CBC", 2),
   cfb("cfb", 2, "CFB8", 3);
   public final String jceId;
   public final int ecmaId;
   // $FF: synthetic field
   private static final ChainingMode[] $VALUES = new ChainingMode[]{ecb, cbc, cfb};


   private ChainingMode(String var1, int var2, String jceId, int ecmaId) {
      this.jceId = jceId;
      this.ecmaId = ecmaId;
   }

}
