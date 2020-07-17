package org.apache.poi.poifs.crypt.dsig;

import org.apache.poi.poifs.crypt.dsig.SignatureConfig;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MutationEvent;

public class SignatureMarshalListener implements EventListener, SignatureConfig.SignatureConfigurable {

   ThreadLocal target = new ThreadLocal();
   SignatureConfig signatureConfig;


   public void setEventTarget(EventTarget target) {
      this.target.set(target);
   }

   public void handleEvent(Event e) {
      if(e instanceof MutationEvent) {
         MutationEvent mutEvt = (MutationEvent)e;
         EventTarget et = mutEvt.getTarget();
         if(et instanceof Element) {
            this.handleElement((Element)et);
         }
      }
   }

   public void handleElement(Element el) {
      EventTarget target = (EventTarget)this.target.get();
      String packageId = this.signatureConfig.getPackageSignatureId();
      if(el.hasAttribute("Id")) {
         el.setIdAttribute("Id", true);
      }

      setListener(target, this, false);
      if(packageId.equals(el.getAttribute("Id"))) {
         el.setAttributeNS("http://www.w3.org/2000/xmlns/", "xmlns:mdssi", "http://schemas.openxmlformats.org/package/2006/digital-signature");
      }

      this.setPrefix(el);
      setListener(target, this, true);
   }

   public static void setListener(EventTarget target, EventListener listener, boolean enabled) {
      String type = "DOMSubtreeModified";
      boolean useCapture = false;
      if(enabled) {
         target.addEventListener(type, listener, useCapture);
      } else {
         target.removeEventListener(type, listener, useCapture);
      }

   }

   protected void setPrefix(Node el) {
      String prefix = (String)this.signatureConfig.getNamespacePrefixes().get(el.getNamespaceURI());
      if(prefix != null && el.getPrefix() == null) {
         el.setPrefix(prefix);
      }

      NodeList nl = el.getChildNodes();

      for(int i = 0; i < nl.getLength(); ++i) {
         this.setPrefix(nl.item(i));
      }

   }

   public void setSignatureConfig(SignatureConfig signatureConfig) {
      this.signatureConfig = signatureConfig;
   }
}
