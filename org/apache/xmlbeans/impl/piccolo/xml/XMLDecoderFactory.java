package org.apache.xmlbeans.impl.piccolo.xml;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.apache.xmlbeans.impl.piccolo.xml.ASCIIXMLDecoder;
import org.apache.xmlbeans.impl.piccolo.xml.ISO8859_1XMLDecoder;
import org.apache.xmlbeans.impl.piccolo.xml.UTF8XMLDecoder;
import org.apache.xmlbeans.impl.piccolo.xml.UnicodeBigXMLDecoder;
import org.apache.xmlbeans.impl.piccolo.xml.UnicodeLittleXMLDecoder;
import org.apache.xmlbeans.impl.piccolo.xml.XMLDecoder;

public class XMLDecoderFactory {

   private static HashMap decoders = new HashMap();


   public static XMLDecoder createDecoder(String encoding) throws UnsupportedEncodingException {
      XMLDecoder d = (XMLDecoder)decoders.get(encoding.toUpperCase());
      if(d != null) {
         return d.newXMLDecoder();
      } else {
         throw new UnsupportedEncodingException("Encoding \'" + encoding + "\' not supported");
      }
   }

   static {
      UTF8XMLDecoder utf8 = new UTF8XMLDecoder();
      ASCIIXMLDecoder ascii = new ASCIIXMLDecoder();
      ISO8859_1XMLDecoder iso8859 = new ISO8859_1XMLDecoder();
      UnicodeBigXMLDecoder utf16be = new UnicodeBigXMLDecoder();
      UnicodeLittleXMLDecoder utf16le = new UnicodeLittleXMLDecoder();
      decoders.put("UTF-8", utf8);
      decoders.put("UTF8", utf8);
      decoders.put("US-ASCII", ascii);
      decoders.put("ASCII", ascii);
      decoders.put("ISO-8859-1", iso8859);
      decoders.put("ISO8859_1", iso8859);
      decoders.put("UTF-16LE", utf16le);
      decoders.put("UNICODELITTLE", utf16le);
      decoders.put("UNICODELITTLEUNMARKED", utf16le);
      decoders.put("UTF-16BE", utf16be);
      decoders.put("UTF-16", utf16be);
      decoders.put("UNICODEBIG", utf16be);
      decoders.put("UNICODEBIGUNMARKED", utf16be);
   }
}
