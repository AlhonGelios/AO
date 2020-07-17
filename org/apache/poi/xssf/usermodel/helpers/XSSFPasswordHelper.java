package org.apache.poi.xssf.usermodel.helpers;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.xml.bind.DatatypeConverter;
import javax.xml.namespace.QName;
import org.apache.poi.poifs.crypt.CryptoFunctions;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.util.Internal;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;

@Internal(
   since = "3.15 beta 3"
)
public final class XSSFPasswordHelper {

   public static void setPassword(XmlObject xobj, String password, HashAlgorithm hashAlgo, String prefix) {
      XmlCursor cur = xobj.newCursor();
      if(password == null) {
         cur.removeAttribute(getAttrName(prefix, "password"));
         cur.removeAttribute(getAttrName(prefix, "algorithmName"));
         cur.removeAttribute(getAttrName(prefix, "hashValue"));
         cur.removeAttribute(getAttrName(prefix, "saltValue"));
         cur.removeAttribute(getAttrName(prefix, "spinCount"));
      } else {
         cur.toFirstContentToken();
         if(hashAlgo == null) {
            int random = CryptoFunctions.createXorVerifier1(password);
            cur.insertAttributeWithValue(getAttrName(prefix, "password"), String.format(Locale.ROOT, "%04X", new Object[]{Integer.valueOf(random)}).toUpperCase(Locale.ROOT));
         } else {
            SecureRandom random1 = new SecureRandom();
            byte[] salt = random1.generateSeed(16);
            int spinCount = 100000;
            byte[] hash = CryptoFunctions.hashPassword(password, hashAlgo, salt, spinCount, false);
            cur.insertAttributeWithValue(getAttrName(prefix, "algorithmName"), hashAlgo.jceId);
            cur.insertAttributeWithValue(getAttrName(prefix, "hashValue"), DatatypeConverter.printBase64Binary(hash));
            cur.insertAttributeWithValue(getAttrName(prefix, "saltValue"), DatatypeConverter.printBase64Binary(salt));
            cur.insertAttributeWithValue(getAttrName(prefix, "spinCount"), "" + spinCount);
         }

         cur.dispose();
      }
   }

   public static boolean validatePassword(XmlObject xobj, String password, String prefix) {
      if(password == null) {
         return false;
      } else {
         XmlCursor cur = xobj.newCursor();
         String xorHashVal = cur.getAttributeText(getAttrName(prefix, "password"));
         String algoName = cur.getAttributeText(getAttrName(prefix, "algorithmName"));
         String hashVal = cur.getAttributeText(getAttrName(prefix, "hashValue"));
         String saltVal = cur.getAttributeText(getAttrName(prefix, "saltValue"));
         String spinCount = cur.getAttributeText(getAttrName(prefix, "spinCount"));
         cur.dispose();
         if(xorHashVal != null) {
            int hash11 = Integer.parseInt(xorHashVal, 16);
            int hashAlgo1 = CryptoFunctions.createXorVerifier1(password);
            return hash11 == hashAlgo1;
         } else if(hashVal != null && algoName != null && saltVal != null && spinCount != null) {
            byte[] hash1 = DatatypeConverter.parseBase64Binary(hashVal);
            HashAlgorithm hashAlgo = HashAlgorithm.fromString(algoName);
            byte[] salt = DatatypeConverter.parseBase64Binary(saltVal);
            int spinCnt = Integer.parseInt(spinCount);
            byte[] hash2 = CryptoFunctions.hashPassword(password, hashAlgo, salt, spinCnt, false);
            return Arrays.equals(hash1, hash2);
         } else {
            return false;
         }
      }
   }

   private static QName getAttrName(String prefix, String name) {
      return prefix != null && !"".equals(prefix)?new QName(prefix + Character.toUpperCase(name.charAt(0)) + name.substring(1)):new QName(name);
   }
}
