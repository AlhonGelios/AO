package org.apache.poi.xssf.usermodel.helpers;

import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.util.Internal;
import org.apache.poi.util.Removal;
import org.apache.poi.xssf.usermodel.helpers.XSSFPasswordHelper;
import org.apache.xmlbeans.XmlObject;

@Internal(
   since = "3.15 beta 3"
)
@Deprecated
@Removal(
   version = "3.17"
)
public class XSSFPaswordHelper {

   public static void setPassword(XmlObject xobj, String password, HashAlgorithm hashAlgo, String prefix) {
      XSSFPasswordHelper.setPassword(xobj, password, hashAlgo, prefix);
   }

   public static boolean validatePassword(XmlObject xobj, String password, String prefix) {
      return XSSFPasswordHelper.validatePassword(xobj, password, prefix);
   }
}
