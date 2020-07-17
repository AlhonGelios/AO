package org.apache.xmlbeans.xml.stream.events;


public class ElementTypeNames {

   public static String getName(int val) {
      switch(val) {
      case 1:
         return "XML_EVENT";
      case 2:
         return "START_ELEMENT";
      case 4:
         return "END_ELEMENT";
      case 8:
         return "PROCESSING_INSTRUCTION";
      case 16:
         return "CHARACTER_DATA";
      case 32:
         return "COMMENT";
      case 64:
         return "SPACE";
      case 128:
         return "NULL_ELEMENT";
      case 256:
         return "START_DOCUMENT";
      case 512:
         return "END_DOCUMENT";
      case 1024:
         return "START_PREFIX_MAPPING";
      case 2048:
         return "END_PREFIX_MAPPING";
      case 4096:
         return "CHANGE_PREFIX_MAPPING";
      case 8192:
         return "ENTITY_REFERENCE";
      default:
         return "";
      }
   }

   public static int getType(String val) {
      return val.equals("XML_EVENT")?1:(val.equals("START_ELEMENT")?2:(val.equals("END_ELEMENT")?4:(val.equals("PROCESSING_INSTRUCTION")?8:(val.equals("CHARACTER_DATA")?16:(val.equals("COMMENT")?32:(val.equals("SPACE")?64:(val.equals("NULL_ELEMENT")?128:(val.equals("START_DOCUMENT")?256:(val.equals("END_DOCUMENT")?512:(val.equals("START_PREFIX_MAPPING")?1024:(val.equals("CHANGE_PREFIX_MAPPING")?4096:(val.equals("ENTITY_REFERENCE")?8192:(val.equals("END_PREFIX_MAPPING")?2048:128)))))))))))));
   }
}
