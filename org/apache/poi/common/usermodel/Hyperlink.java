package org.apache.poi.common.usermodel;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.util.Removal;

public interface Hyperlink {

   @Removal(
      version = "3.17"
   )
   int LINK_URL = 1;
   @Removal(
      version = "3.17"
   )
   int LINK_DOCUMENT = 2;
   @Removal(
      version = "3.17"
   )
   int LINK_EMAIL = 3;
   @Removal(
      version = "3.17"
   )
   int LINK_FILE = 4;


   String getAddress();

   void setAddress(String var1);

   String getLabel();

   void setLabel(String var1);

   int getType();

   HyperlinkType getTypeEnum();
}
