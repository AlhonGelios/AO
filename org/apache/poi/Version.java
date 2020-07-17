package org.apache.poi;


public class Version {

   private static final String VERSION_STRING = "3.15";
   private static final String RELEASE_DATE = "20160924";


   public static String getVersion() {
      return "3.15";
   }

   public static String getReleaseDate() {
      return "20160924";
   }

   public static String getProduct() {
      return "POI";
   }

   public static String getImplementationLanguage() {
      return "Java";
   }

   public static void main(String[] args) {
      System.out.println("Apache " + getProduct() + " " + getVersion() + " (" + getReleaseDate() + ")");
   }
}
