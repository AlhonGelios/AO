package org.apache.poi.openxml4j.opc;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public final class PackagingURIHelper {

   private static final POILogger _logger = POILogFactory.getLogger(PackagingURIHelper.class);
   private static URI packageRootUri;
   public static final String RELATIONSHIP_PART_EXTENSION_NAME = ".rels";
   public static final String RELATIONSHIP_PART_SEGMENT_NAME = "_rels";
   public static final String PACKAGE_PROPERTIES_SEGMENT_NAME = "docProps";
   public static final String PACKAGE_CORE_PROPERTIES_NAME = "core.xml";
   public static final char FORWARD_SLASH_CHAR = 47;
   public static final String FORWARD_SLASH_STRING = "/";
   public static final URI PACKAGE_RELATIONSHIPS_ROOT_URI;
   public static final PackagePartName PACKAGE_RELATIONSHIPS_ROOT_PART_NAME;
   public static final URI CORE_PROPERTIES_URI;
   public static final PackagePartName CORE_PROPERTIES_PART_NAME;
   public static final URI PACKAGE_ROOT_URI;
   public static final PackagePartName PACKAGE_ROOT_PART_NAME;
   private static final Pattern missingAuthPattern;
   private static final char[] hexDigits;


   public static URI getPackageRootUri() {
      return packageRootUri;
   }

   public static boolean isRelationshipPartURI(URI partUri) {
      if(partUri == null) {
         throw new IllegalArgumentException("partUri");
      } else {
         return partUri.getPath().matches(".*" + RELATIONSHIP_PART_SEGMENT_NAME + ".*" + RELATIONSHIP_PART_EXTENSION_NAME + "$");
      }
   }

   public static String getFilename(URI uri) {
      if(uri != null) {
         String path = uri.getPath();
         int len = path.length();
         int num2 = len;

         while(true) {
            --num2;
            if(num2 < 0) {
               break;
            }

            char ch1 = path.charAt(num2);
            if(ch1 == FORWARD_SLASH_CHAR) {
               return path.substring(num2 + 1, len);
            }
         }
      }

      return "";
   }

   public static String getFilenameWithoutExtension(URI uri) {
      String filename = getFilename(uri);
      int dotIndex = filename.lastIndexOf(".");
      return dotIndex == -1?filename:filename.substring(0, dotIndex);
   }

   public static URI getPath(URI uri) {
      if(uri != null) {
         String path = uri.getPath();
         int len = path.length();
         int num2 = len;

         while(true) {
            --num2;
            if(num2 < 0) {
               break;
            }

            char ch1 = path.charAt(num2);
            if(ch1 == FORWARD_SLASH_CHAR) {
               try {
                  return new URI(path.substring(0, num2));
               } catch (URISyntaxException var6) {
                  return null;
               }
            }
         }
      }

      return null;
   }

   public static URI combine(URI prefix, URI suffix) {
      URI retUri = null;

      try {
         retUri = new URI(combine(prefix.getPath(), suffix.getPath()));
         return retUri;
      } catch (URISyntaxException var4) {
         throw new IllegalArgumentException("Prefix and suffix can\'t be combine !");
      }
   }

   public static String combine(String prefix, String suffix) {
      return !prefix.endsWith("" + FORWARD_SLASH_CHAR) && !suffix.startsWith("" + FORWARD_SLASH_CHAR)?prefix + FORWARD_SLASH_CHAR + suffix:((prefix.endsWith("" + FORWARD_SLASH_CHAR) || !suffix.startsWith("" + FORWARD_SLASH_CHAR)) && (!prefix.endsWith("" + FORWARD_SLASH_CHAR) || suffix.startsWith("" + FORWARD_SLASH_CHAR))?"":prefix + suffix);
   }

   public static URI relativizeURI(URI sourceURI, URI targetURI, boolean msCompatible) {
      StringBuilder retVal = new StringBuilder();
      String[] segmentsSource = sourceURI.getPath().split("/", -1);
      String[] segmentsTarget = targetURI.getPath().split("/", -1);
      if(segmentsSource.length == 0) {
         throw new IllegalArgumentException("Can\'t relativize an empty source URI !");
      } else if(segmentsTarget.length == 0) {
         throw new IllegalArgumentException("Can\'t relativize an empty target URI !");
      } else if(sourceURI.toString().equals("/")) {
         String var12 = targetURI.getPath();
         if(msCompatible && var12.length() > 0 && var12.charAt(0) == 47) {
            try {
               targetURI = new URI(var12.substring(1));
            } catch (Exception var9) {
               _logger.log(5, new Object[]{var9});
               return null;
            }
         }

         return targetURI;
      } else {
         int segmentsTheSame = 0;

         int fragment;
         for(fragment = 0; fragment < segmentsSource.length && fragment < segmentsTarget.length && segmentsSource[fragment].equals(segmentsTarget[fragment]); ++fragment) {
            ++segmentsTheSame;
         }

         if((segmentsTheSame == 0 || segmentsTheSame == 1) && segmentsSource[0].equals("") && segmentsTarget[0].equals("")) {
            for(fragment = 0; fragment < segmentsSource.length - 2; ++fragment) {
               retVal.append("../");
            }

            for(fragment = 0; fragment < segmentsTarget.length; ++fragment) {
               if(!segmentsTarget[fragment].equals("")) {
                  retVal.append(segmentsTarget[fragment]);
                  if(fragment != segmentsTarget.length - 1) {
                     retVal.append("/");
                  }
               }
            }

            try {
               return new URI(retVal.toString());
            } catch (Exception var10) {
               _logger.log(5, new Object[]{var10});
               return null;
            }
         } else {
            if(segmentsTheSame == segmentsSource.length && segmentsTheSame == segmentsTarget.length) {
               if(sourceURI.equals(targetURI)) {
                  retVal.append(segmentsSource[segmentsSource.length - 1]);
               } else {
                  retVal.append("");
               }
            } else {
               if(segmentsTheSame == 1) {
                  retVal.append("/");
               } else {
                  for(fragment = segmentsTheSame; fragment < segmentsSource.length - 1; ++fragment) {
                     retVal.append("../");
                  }
               }

               for(fragment = segmentsTheSame; fragment < segmentsTarget.length; ++fragment) {
                  if(retVal.length() > 0 && retVal.charAt(retVal.length() - 1) != 47) {
                     retVal.append("/");
                  }

                  retVal.append(segmentsTarget[fragment]);
               }
            }

            String var13 = targetURI.getRawFragment();
            if(var13 != null) {
               retVal.append("#").append(var13);
            }

            try {
               return new URI(retVal.toString());
            } catch (Exception var11) {
               _logger.log(5, new Object[]{var11});
               return null;
            }
         }
      }
   }

   public static URI relativizeURI(URI sourceURI, URI targetURI) {
      return relativizeURI(sourceURI, targetURI, false);
   }

   public static URI resolvePartUri(URI sourcePartUri, URI targetUri) {
      if(sourcePartUri != null && !sourcePartUri.isAbsolute()) {
         if(targetUri != null && !targetUri.isAbsolute()) {
            return sourcePartUri.resolve(targetUri);
         } else {
            throw new IllegalArgumentException("targetUri invalid - " + targetUri);
         }
      } else {
         throw new IllegalArgumentException("sourcePartUri invalid - " + sourcePartUri);
      }
   }

   public static URI getURIFromPath(String path) {
      try {
         URI retUri = toURI(path);
         return retUri;
      } catch (URISyntaxException var3) {
         throw new IllegalArgumentException("path");
      }
   }

   public static URI getSourcePartUriFromRelationshipPartUri(URI relationshipPartUri) {
      if(relationshipPartUri == null) {
         throw new IllegalArgumentException("Must not be null");
      } else if(!isRelationshipPartURI(relationshipPartUri)) {
         throw new IllegalArgumentException("Must be a relationship part");
      } else if(relationshipPartUri.compareTo(PACKAGE_RELATIONSHIPS_ROOT_URI) == 0) {
         return PACKAGE_ROOT_URI;
      } else {
         String filename = relationshipPartUri.getPath();
         String filenameWithoutExtension = getFilenameWithoutExtension(relationshipPartUri);
         filename = filename.substring(0, filename.length() - filenameWithoutExtension.length() - RELATIONSHIP_PART_EXTENSION_NAME.length());
         filename = filename.substring(0, filename.length() - RELATIONSHIP_PART_SEGMENT_NAME.length() - 1);
         filename = combine(filename, filenameWithoutExtension);
         return getURIFromPath(filename);
      }
   }

   public static PackagePartName createPartName(URI partUri) throws InvalidFormatException {
      if(partUri == null) {
         throw new IllegalArgumentException("partName");
      } else {
         return new PackagePartName(partUri, true);
      }
   }

   public static PackagePartName createPartName(String partName) throws InvalidFormatException {
      URI partNameURI;
      try {
         partNameURI = toURI(partName);
      } catch (URISyntaxException var3) {
         throw new InvalidFormatException(var3.getMessage());
      }

      return createPartName(partNameURI);
   }

   public static PackagePartName createPartName(String partName, PackagePart relativePart) throws InvalidFormatException {
      URI newPartNameURI;
      try {
         newPartNameURI = resolvePartUri(relativePart.getPartName().getURI(), new URI(partName));
      } catch (URISyntaxException var4) {
         throw new InvalidFormatException(var4.getMessage());
      }

      return createPartName(newPartNameURI);
   }

   public static PackagePartName createPartName(URI partName, PackagePart relativePart) throws InvalidFormatException {
      URI newPartNameURI = resolvePartUri(relativePart.getPartName().getURI(), partName);
      return createPartName(newPartNameURI);
   }

   public static boolean isValidPartName(URI partUri) {
      if(partUri == null) {
         throw new IllegalArgumentException("partUri");
      } else {
         try {
            createPartName(partUri);
            return true;
         } catch (Exception var2) {
            return false;
         }
      }
   }

   public static String decodeURI(URI uri) {
      StringBuffer retVal = new StringBuffer();
      String uriStr = uri.toASCIIString();
      int length = uriStr.length();

      for(int i = 0; i < length; ++i) {
         char c = uriStr.charAt(i);
         if(c == 37) {
            if(length - i < 2) {
               throw new IllegalArgumentException("The uri " + uriStr + " contain invalid encoded character !");
            }

            char decodedChar = (char)Integer.parseInt(uriStr.substring(i + 1, i + 3), 16);
            retVal.append(decodedChar);
            i += 2;
         } else {
            retVal.append(c);
         }
      }

      return retVal.toString();
   }

   public static PackagePartName getRelationshipPartName(PackagePartName partName) {
      if(partName == null) {
         throw new IllegalArgumentException("partName");
      } else if(PACKAGE_ROOT_URI.getPath().equals(partName.getURI().getPath())) {
         return PACKAGE_RELATIONSHIPS_ROOT_PART_NAME;
      } else if(partName.isRelationshipPartURI()) {
         throw new InvalidOperationException("Can\'t be a relationship part");
      } else {
         String fullPath = partName.getURI().getPath();
         String filename = getFilename(partName.getURI());
         fullPath = fullPath.substring(0, fullPath.length() - filename.length());
         fullPath = combine(fullPath, RELATIONSHIP_PART_SEGMENT_NAME);
         fullPath = combine(fullPath, filename);
         fullPath = fullPath + RELATIONSHIP_PART_EXTENSION_NAME;

         try {
            PackagePartName retPartName = createPartName(fullPath);
            return retPartName;
         } catch (InvalidFormatException var5) {
            return null;
         }
      }
   }

   public static URI toURI(String value) throws URISyntaxException {
      if(value.indexOf("\\") != -1) {
         value = value.replace('\\', '/');
      }

      int fragmentIdx = value.indexOf(35);
      if(fragmentIdx != -1) {
         String b = value.substring(0, fragmentIdx);
         String idx = value.substring(fragmentIdx + 1);
         value = b + "#" + encode(idx);
      }

      if(value.length() > 0) {
         StringBuilder var5 = new StringBuilder();

         int var6;
         for(var6 = value.length() - 1; var6 >= 0; --var6) {
            char c = value.charAt(var6);
            if(!Character.isWhitespace(c) && c != 160) {
               break;
            }

            var5.append(c);
         }

         if(var5.length() > 0) {
            value = value.substring(0, var6 + 1) + encode(var5.reverse().toString());
         }
      }

      if(missingAuthPattern.matcher(value).matches()) {
         value = value + "/";
      }

      return new URI(value);
   }

   public static String encode(String s) {
      int n = s.length();
      if(n == 0) {
         return s;
      } else {
         ByteBuffer bb = ByteBuffer.wrap(s.getBytes(Charset.forName("UTF-8")));
         StringBuilder sb = new StringBuilder();

         while(bb.hasRemaining()) {
            int b = bb.get() & 255;
            if(isUnsafe(b)) {
               sb.append('%');
               sb.append(hexDigits[b >> 4 & 15]);
               sb.append(hexDigits[b >> 0 & 15]);
            } else {
               sb.append((char)b);
            }
         }

         return sb.toString();
      }
   }

   private static boolean isUnsafe(int ch) {
      return ch > 128 || Character.isWhitespace(ch);
   }

   static {
      URI uriPACKAGE_ROOT_URI = null;
      URI uriPACKAGE_RELATIONSHIPS_ROOT_URI = null;
      URI uriPACKAGE_PROPERTIES_URI = null;

      try {
         uriPACKAGE_ROOT_URI = new URI("/");
         uriPACKAGE_RELATIONSHIPS_ROOT_URI = new URI(FORWARD_SLASH_CHAR + RELATIONSHIP_PART_SEGMENT_NAME + FORWARD_SLASH_CHAR + RELATIONSHIP_PART_EXTENSION_NAME);
         packageRootUri = new URI("/");
         uriPACKAGE_PROPERTIES_URI = new URI(FORWARD_SLASH_CHAR + PACKAGE_PROPERTIES_SEGMENT_NAME + FORWARD_SLASH_CHAR + PACKAGE_CORE_PROPERTIES_NAME);
      } catch (URISyntaxException var8) {
         ;
      }

      PACKAGE_ROOT_URI = uriPACKAGE_ROOT_URI;
      PACKAGE_RELATIONSHIPS_ROOT_URI = uriPACKAGE_RELATIONSHIPS_ROOT_URI;
      CORE_PROPERTIES_URI = uriPACKAGE_PROPERTIES_URI;
      PackagePartName tmpPACKAGE_ROOT_PART_NAME = null;
      PackagePartName tmpPACKAGE_RELATIONSHIPS_ROOT_PART_NAME = null;
      PackagePartName tmpCORE_PROPERTIES_URI = null;

      try {
         tmpPACKAGE_RELATIONSHIPS_ROOT_PART_NAME = createPartName(PACKAGE_RELATIONSHIPS_ROOT_URI);
         tmpCORE_PROPERTIES_URI = createPartName(CORE_PROPERTIES_URI);
         tmpPACKAGE_ROOT_PART_NAME = new PackagePartName(PACKAGE_ROOT_URI, false);
      } catch (InvalidFormatException var7) {
         ;
      }

      PACKAGE_RELATIONSHIPS_ROOT_PART_NAME = tmpPACKAGE_RELATIONSHIPS_ROOT_PART_NAME;
      CORE_PROPERTIES_PART_NAME = tmpCORE_PROPERTIES_URI;
      PACKAGE_ROOT_PART_NAME = tmpPACKAGE_ROOT_PART_NAME;
      missingAuthPattern = Pattern.compile("\\w+://");
      hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   }
}
