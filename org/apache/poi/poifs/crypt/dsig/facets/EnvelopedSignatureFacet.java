package org.apache.poi.poifs.crypt.dsig.facets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignatureException;
import org.apache.poi.poifs.crypt.dsig.facets.SignatureFacet;
import org.w3c.dom.Document;

public class EnvelopedSignatureFacet extends SignatureFacet {

   public void preSign(Document document, List references, List objects) throws XMLSignatureException {
      ArrayList transforms = new ArrayList();
      Transform envelopedTransform = this.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
      transforms.add(envelopedTransform);
      Transform exclusiveTransform = this.newTransform("http://www.w3.org/2001/10/xml-exc-c14n#");
      transforms.add(exclusiveTransform);
      Reference reference = this.newReference("", transforms, (String)null, (String)null, (byte[])null);
      references.add(reference);
   }
}
