package org.apache.poi.xssf.usermodel.helpers;


public class HeaderFooterHelper {

   private static final String HeaderFooterEntity_L = "&L";
   private static final String HeaderFooterEntity_C = "&C";
   private static final String HeaderFooterEntity_R = "&R";
   public static final String HeaderFooterEntity_File = "&F";
   public static final String HeaderFooterEntity_Date = "&D";
   public static final String HeaderFooterEntity_Time = "&T";


   public String getLeftSection(String string) {
      return this.getParts(string)[0];
   }

   public String getCenterSection(String string) {
      return this.getParts(string)[1];
   }

   public String getRightSection(String string) {
      return this.getParts(string)[2];
   }

   public String setLeftSection(String string, String newLeft) {
      String[] parts = this.getParts(string);
      parts[0] = newLeft;
      return this.joinParts(parts);
   }

   public String setCenterSection(String string, String newCenter) {
      String[] parts = this.getParts(string);
      parts[1] = newCenter;
      return this.joinParts(parts);
   }

   public String setRightSection(String string, String newRight) {
      String[] parts = this.getParts(string);
      parts[2] = newRight;
      return this.joinParts(parts);
   }

   private String[] getParts(String string) {
      String[] parts = new String[]{"", "", ""};
      if(string == null) {
         return parts;
      } else {
         boolean lAt = false;
         boolean cAt = false;
         boolean rAt = false;

         int lAt1;
         int cAt1;
         int rAt1;
         while((lAt1 = string.indexOf("&L")) > -2 && (cAt1 = string.indexOf("&C")) > -2 && (rAt1 = string.indexOf("&R")) > -2 && (lAt1 > -1 || cAt1 > -1 || rAt1 > -1)) {
            if(rAt1 > cAt1 && rAt1 > lAt1) {
               parts[2] = string.substring(rAt1 + "&R".length());
               string = string.substring(0, rAt1);
            } else if(cAt1 > rAt1 && cAt1 > lAt1) {
               parts[1] = string.substring(cAt1 + "&C".length());
               string = string.substring(0, cAt1);
            } else {
               parts[0] = string.substring(lAt1 + "&L".length());
               string = string.substring(0, lAt1);
            }
         }

         return parts;
      }
   }

   private String joinParts(String[] parts) {
      return this.joinParts(parts[0], parts[1], parts[2]);
   }

   private String joinParts(String l, String c, String r) {
      StringBuffer ret = new StringBuffer();
      if(c.length() > 0) {
         ret.append("&C");
         ret.append(c);
      }

      if(l.length() > 0) {
         ret.append("&L");
         ret.append(l);
      }

      if(r.length() > 0) {
         ret.append("&R");
         ret.append(r);
      }

      return ret.toString();
   }
}
