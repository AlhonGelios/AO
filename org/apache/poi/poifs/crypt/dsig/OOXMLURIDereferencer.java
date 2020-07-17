package org.apache.poi.poifs.crypt.dsig;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import javax.xml.crypto.Data;
import javax.xml.crypto.OctetStreamData;
import javax.xml.crypto.URIDereferencer;
import javax.xml.crypto.URIReference;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.XMLCryptoContext;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.poifs.crypt.dsig.SignatureConfig;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class OOXMLURIDereferencer implements URIDereferencer, SignatureConfig.SignatureConfigurable {

   private static final POILogger LOG = POILogFactory.getLogger(OOXMLURIDereferencer.class);
   private SignatureConfig signatureConfig;
   private URIDereferencer baseUriDereferencer;


   public void setSignatureConfig(SignatureConfig signatureConfig) {
      this.signatureConfig = signatureConfig;
   }

   public Data dereference(URIReference uriReference, XMLCryptoContext context) throws URIReferenceException {
      if(this.baseUriDereferencer == null) {
         this.baseUriDereferencer = this.signatureConfig.getSignatureFactory().getURIDereferencer();
      }

      if(null == uriReference) {
         throw new NullPointerException("URIReference cannot be null");
      } else if(null == context) {
         throw new NullPointerException("XMLCrytoContext cannot be null");
      } else {
         URI uri;
         try {
            uri = new URI(uriReference.getURI());
         } catch (URISyntaxException var8) {
            throw new URIReferenceException("could not URL decode the uri: " + uriReference.getURI(), var8);
         }

         PackagePart part = this.findPart(uri);
         if(part == null) {
            LOG.log(1, new Object[]{"cannot resolve, delegating to base DOM URI dereferencer", uri});
            return this.baseUriDereferencer.dereference(uriReference, context);
         } else {
            Object dataStream;
            try {
               dataStream = part.getInputStream();
               if(part.getPartName().toString().endsWith(".rels")) {
                  ByteArrayOutputStream e = new ByteArrayOutputStream();

                  int ch;
                  while((ch = ((InputStream)dataStream).read()) != -1) {
                     if(ch != 10 && ch != 13) {
                        e.write(ch);
                     }
                  }

                  dataStream = new ByteArrayInputStream(e.toByteArray());
               }
            } catch (IOException var9) {
               throw new URIReferenceException("I/O error: " + var9.getMessage(), var9);
            }

            return new OctetStreamData((InputStream)dataStream, uri.toString(), (String)null);
         }
      }
   }

   private PackagePart findPart(URI uri) {
      LOG.log(1, new Object[]{"dereference", uri});
      String path = uri.getPath();
      if(path != null && !"".equals(path)) {
         PackagePartName ppn;
         try {
            ppn = PackagingURIHelper.createPartName(path);
         } catch (InvalidFormatException var5) {
            LOG.log(5, new Object[]{"illegal part name (not expected)", uri});
            return null;
         }

         return this.signatureConfig.getOpcPackage().getPart(ppn);
      } else {
         LOG.log(1, new Object[]{"illegal part name (expected)", uri});
         return null;
      }
   }

}
