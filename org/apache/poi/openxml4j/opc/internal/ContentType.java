package org.apache.poi.openxml4j.opc.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public final class ContentType {

   private final String type;
   private final String subType;
   private final Map parameters;
   private static final Pattern patternTypeSubType;
   private static final Pattern patternTypeSubTypeParams;
   private static final Pattern patternParams;


   public ContentType(String contentType) throws InvalidFormatException {
      Matcher mMediaType = patternTypeSubType.matcher(contentType);
      if(!mMediaType.matches()) {
         mMediaType = patternTypeSubTypeParams.matcher(contentType);
      }

      if(!mMediaType.matches()) {
         throw new InvalidFormatException("The specified content type \'" + contentType + "\' is not compliant with RFC 2616: malformed content type.");
      } else {
         if(mMediaType.groupCount() >= 2) {
            this.type = mMediaType.group(1);
            this.subType = mMediaType.group(2);
            this.parameters = new HashMap();
            if(mMediaType.groupCount() >= 5) {
               Matcher mParams = patternParams.matcher(contentType.substring(mMediaType.end(2)));

               while(mParams.find()) {
                  this.parameters.put(mParams.group(1), mParams.group(2));
               }
            }
         } else {
            this.type = "";
            this.subType = "";
            this.parameters = Collections.emptyMap();
         }

      }
   }

   public final String toString() {
      return this.toString(true);
   }

   public final String toString(boolean withParameters) {
      StringBuffer retVal = new StringBuffer();
      retVal.append(this.getType());
      retVal.append("/");
      retVal.append(this.getSubType());
      if(withParameters) {
         Iterator i$ = this.parameters.entrySet().iterator();

         while(i$.hasNext()) {
            Entry me = (Entry)i$.next();
            retVal.append(";");
            retVal.append((String)me.getKey());
            retVal.append("=");
            retVal.append((String)me.getValue());
         }
      }

      return retVal.toString();
   }

   public boolean equals(Object obj) {
      return !(obj instanceof ContentType) || this.toString().equalsIgnoreCase(obj.toString());
   }

   public int hashCode() {
      return this.toString().hashCode();
   }

   public String getSubType() {
      return this.subType;
   }

   public String getType() {
      return this.type;
   }

   public boolean hasParameters() {
      return this.parameters != null && !this.parameters.isEmpty();
   }

   public String[] getParameterKeys() {
      return this.parameters == null?new String[0]:(String[])this.parameters.keySet().toArray(new String[this.parameters.size()]);
   }

   public String getParameter(String key) {
      return (String)this.parameters.get(key);
   }

   static {
      String token = "[\\x21-\\x7E&&[^\\(\\)<>@,;:\\\\/\"\\[\\]\\?={}\\x20\\x09]]";
      String parameter = "(" + token + "+)=(\"?" + token + "+\"?)";
      patternTypeSubType = Pattern.compile("^(" + token + "+)/(" + token + "+)$");
      patternTypeSubTypeParams = Pattern.compile("^(" + token + "+)/(" + token + "+)(;" + parameter + ")*$");
      patternParams = Pattern.compile(";" + parameter);
   }
}
