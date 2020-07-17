package org.apache.poi.poifs.crypt.dsig;

import java.io.Serializable;
import org.apache.poi.poifs.crypt.HashAlgorithm;

public class DigestInfo implements Serializable {

   private static final long serialVersionUID = 1L;
   public final byte[] digestValue;
   public final String description;
   public final HashAlgorithm hashAlgo;


   public DigestInfo(byte[] digestValue, HashAlgorithm hashAlgo, String description) {
      this.digestValue = (byte[])digestValue.clone();
      this.hashAlgo = hashAlgo;
      this.description = description;
   }
}
