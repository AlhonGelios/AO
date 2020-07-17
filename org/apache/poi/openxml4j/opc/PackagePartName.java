package org.apache.poi.openxml4j.opc;

import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JRuntimeException;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;

public final class PackagePartName implements Comparable {

   private URI partNameURI;
   private static String[] RFC3986_PCHAR_SUB_DELIMS = new String[]{"!", "$", "&", "\'", "(", ")", "*", "+", ",", ";", "="};
   private static String[] RFC3986_PCHAR_UNRESERVED_SUP = new String[]{"-", ".", "_", "~"};
   private static String[] RFC3986_PCHAR_AUTHORIZED_SUP = new String[]{":", "@"};
   private boolean isRelationship;


   PackagePartName(URI uri, boolean checkConformance) throws InvalidFormatException {
      if(checkConformance) {
         throwExceptionIfInvalidPartUri(uri);
      } else if(!PackagingURIHelper.PACKAGE_ROOT_URI.equals(uri)) {
         throw new OpenXML4JRuntimeException("OCP conformance must be check for ALL part name except special cases : [\'/\']");
      }

      this.partNameURI = uri;
      this.isRelationship = this.isRelationshipPartURI(this.partNameURI);
   }

   PackagePartName(String partName, boolean checkConformance) throws InvalidFormatException {
      URI partURI;
      try {
         partURI = new URI(partName);
      } catch (URISyntaxException var5) {
         throw new IllegalArgumentException("partName argmument is not a valid OPC part name !");
      }

      if(checkConformance) {
         throwExceptionIfInvalidPartUri(partURI);
      } else if(!PackagingURIHelper.PACKAGE_ROOT_URI.equals(partURI)) {
         throw new OpenXML4JRuntimeException("OCP conformance must be check for ALL part name except special cases : [\'/\']");
      }

      this.partNameURI = partURI;
      this.isRelationship = this.isRelationshipPartURI(this.partNameURI);
   }

   private boolean isRelationshipPartURI(URI partUri) {
      if(partUri == null) {
         throw new IllegalArgumentException("partUri");
      } else {
         return partUri.getPath().matches("^.*/" + PackagingURIHelper.RELATIONSHIP_PART_SEGMENT_NAME + "/.*\\" + PackagingURIHelper.RELATIONSHIP_PART_EXTENSION_NAME + "$");
      }
   }

   public boolean isRelationshipPartURI() {
      return this.isRelationship;
   }

   private static void throwExceptionIfInvalidPartUri(URI partUri) throws InvalidFormatException {
      if(partUri == null) {
         throw new IllegalArgumentException("partUri");
      } else {
         throwExceptionIfEmptyURI(partUri);
         throwExceptionIfAbsoluteUri(partUri);
         throwExceptionIfPartNameNotStartsWithForwardSlashChar(partUri);
         throwExceptionIfPartNameEndsWithForwardSlashChar(partUri);
         throwExceptionIfPartNameHaveInvalidSegments(partUri);
      }
   }

   private static void throwExceptionIfEmptyURI(URI partURI) throws InvalidFormatException {
      if(partURI == null) {
         throw new IllegalArgumentException("partURI");
      } else {
         String uriPath = partURI.getPath();
         if(uriPath.length() == 0 || uriPath.length() == 1 && uriPath.charAt(0) == PackagingURIHelper.FORWARD_SLASH_CHAR) {
            throw new InvalidFormatException("A part name shall not be empty [M1.1]: " + partURI.getPath());
         }
      }
   }

   private static void throwExceptionIfPartNameHaveInvalidSegments(URI partUri) throws InvalidFormatException {
      if(partUri == null) {
         throw new IllegalArgumentException("partUri");
      } else {
         String[] segments = partUri.toASCIIString().split("/");
         if(segments.length > 1 && segments[0].equals("")) {
            for(int i = 1; i < segments.length; ++i) {
               String seg = segments[i];
               if(seg == null || "".equals(seg)) {
                  throw new InvalidFormatException("A part name shall not have empty segments [M1.3]: " + partUri.getPath());
               }

               if(seg.endsWith(".")) {
                  throw new InvalidFormatException("A segment shall not end with a dot (\'.\') character [M1.9]: " + partUri.getPath());
               }

               if("".equals(seg.replaceAll("\\\\.", ""))) {
                  throw new InvalidFormatException("A segment shall include at least one non-dot character. [M1.10]: " + partUri.getPath());
               }

               checkPCharCompliance(seg);
            }

         } else {
            throw new InvalidFormatException("A part name shall not have empty segments [M1.3]: " + partUri.getPath());
         }
      }
   }

   private static void checkPCharCompliance(String segment) throws InvalidFormatException {
      int length = segment.length();

      for(int i = 0; i < length; ++i) {
         char c = segment.charAt(i);
         boolean errorFlag = true;
         if((c < 65 || c > 90) && (c < 97 || c > 122) && (c < 48 || c > 57)) {
            int decodedChar;
            for(decodedChar = 0; decodedChar < RFC3986_PCHAR_UNRESERVED_SUP.length; ++decodedChar) {
               if(c == RFC3986_PCHAR_UNRESERVED_SUP[decodedChar].charAt(0)) {
                  errorFlag = false;
                  break;
               }
            }

            for(decodedChar = 0; errorFlag && decodedChar < RFC3986_PCHAR_AUTHORIZED_SUP.length; ++decodedChar) {
               if(c == RFC3986_PCHAR_AUTHORIZED_SUP[decodedChar].charAt(0)) {
                  errorFlag = false;
               }
            }

            for(decodedChar = 0; errorFlag && decodedChar < RFC3986_PCHAR_SUB_DELIMS.length; ++decodedChar) {
               if(c == RFC3986_PCHAR_SUB_DELIMS[decodedChar].charAt(0)) {
                  errorFlag = false;
               }
            }
         } else {
            errorFlag = false;
         }

         if(errorFlag && c == 37) {
            if(length - i < 2) {
               throw new InvalidFormatException("The segment " + segment + " contain invalid encoded character !");
            }

            errorFlag = false;
            char var7 = (char)Integer.parseInt(segment.substring(i + 1, i + 3), 16);
            i += 2;
            if(var7 == 47 || var7 == 92) {
               throw new InvalidFormatException("A segment shall not contain percent-encoded forward slash (\'/\'), or backward slash (\'\') characters. [M1.7]");
            }

            if(var7 >= 65 && var7 <= 90 || var7 >= 97 && var7 <= 122 || var7 >= 48 && var7 <= 57) {
               errorFlag = true;
            }

            for(int j = 0; !errorFlag && j < RFC3986_PCHAR_UNRESERVED_SUP.length; ++j) {
               if(c == RFC3986_PCHAR_UNRESERVED_SUP[j].charAt(0)) {
                  errorFlag = true;
                  break;
               }
            }

            if(errorFlag) {
               throw new InvalidFormatException("A segment shall not contain percent-encoded unreserved characters. [M1.8]");
            }
         }

         if(errorFlag) {
            throw new InvalidFormatException("A segment shall not hold any characters other than pchar characters. [M1.6]");
         }
      }

   }

   private static void throwExceptionIfPartNameNotStartsWithForwardSlashChar(URI partUri) throws InvalidFormatException {
      String uriPath = partUri.getPath();
      if(uriPath.length() > 0 && uriPath.charAt(0) != PackagingURIHelper.FORWARD_SLASH_CHAR) {
         throw new InvalidFormatException("A part name shall start with a forward slash (\'/\') character [M1.4]: " + partUri.getPath());
      }
   }

   private static void throwExceptionIfPartNameEndsWithForwardSlashChar(URI partUri) throws InvalidFormatException {
      String uriPath = partUri.getPath();
      if(uriPath.length() > 0 && uriPath.charAt(uriPath.length() - 1) == PackagingURIHelper.FORWARD_SLASH_CHAR) {
         throw new InvalidFormatException("A part name shall not have a forward slash as the last character [M1.5]: " + partUri.getPath());
      }
   }

   private static void throwExceptionIfAbsoluteUri(URI partUri) throws InvalidFormatException {
      if(partUri.isAbsolute()) {
         throw new InvalidFormatException("Absolute URI forbidden: " + partUri);
      }
   }

   public int compareTo(PackagePartName other) {
      return compare(this, other);
   }

   public String getExtension() {
      String fragment = this.partNameURI.getPath();
      if(fragment.length() > 0) {
         int i = fragment.lastIndexOf(".");
         if(i > -1) {
            return fragment.substring(i + 1);
         }
      }

      return "";
   }

   public String getName() {
      return this.partNameURI.toASCIIString();
   }

   public boolean equals(Object other) {
      return other instanceof PackagePartName?this.partNameURI.toASCIIString().toLowerCase(Locale.ROOT).equals(((PackagePartName)other).partNameURI.toASCIIString().toLowerCase(Locale.ROOT)):false;
   }

   public int hashCode() {
      return this.partNameURI.toASCIIString().toLowerCase(Locale.ROOT).hashCode();
   }

   public String toString() {
      return this.getName();
   }

   public URI getURI() {
      return this.partNameURI;
   }

   public static int compare(PackagePartName obj1, PackagePartName obj2) {
      return obj1 == null?(obj2 == null?0:-1):(obj2 == null?1:compare(obj1.getURI().toASCIIString().toLowerCase(Locale.ROOT), obj2.getURI().toASCIIString().toLowerCase(Locale.ROOT)));
   }

   public static int compare(String str1, String str2) {
      if(str1 == null) {
         return str2 == null?0:-1;
      } else if(str2 == null) {
         return 1;
      } else {
         int len1 = str1.length();
         int len2 = str2.length();
         int idx1 = 0;
         int idx2 = 0;

         while(idx1 < len1 && idx2 < len2) {
            char c1 = str1.charAt(idx1++);
            char c2 = str2.charAt(idx2++);
            if(Character.isDigit(c1) && Character.isDigit(c2)) {
               int beg1;
               for(beg1 = idx1 - 1; idx1 < len1 && Character.isDigit(str1.charAt(idx1)); ++idx1) {
                  ;
               }

               int beg2;
               for(beg2 = idx2 - 1; idx2 < len2 && Character.isDigit(str2.charAt(idx2)); ++idx2) {
                  ;
               }

               int cmp = (new BigInteger(str1.substring(beg1, idx1))).compareTo(new BigInteger(str2.substring(beg2, idx2)));
               if(cmp != 0) {
                  return cmp;
               }
            } else if(c1 != c2) {
               return c1 - c2;
            }
         }

         return len1 - len2;
      }
   }

}
