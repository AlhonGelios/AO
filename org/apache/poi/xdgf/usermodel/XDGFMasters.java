package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.MasterType;
import com.microsoft.schemas.office.visio.x2012.main.MastersDocument;
import com.microsoft.schemas.office.visio.x2012.main.MastersType;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.Internal;
import org.apache.poi.xdgf.exceptions.XDGFException;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFMaster;
import org.apache.poi.xdgf.usermodel.XDGFMasterContents;
import org.apache.poi.xdgf.xml.XDGFXMLDocumentPart;
import org.apache.xmlbeans.XmlException;

public class XDGFMasters extends XDGFXMLDocumentPart {

   MastersType _mastersObject;
   protected Map _masters;


   public XDGFMasters(PackagePart part, XDGFDocument document) {
      super(part, document);
      this._masters = new HashMap();
   }

   @Deprecated
   public XDGFMasters(PackagePart part, PackageRelationship rel, XDGFDocument document) {
      this(part, document);
   }

   @Internal
   protected MastersType getXmlObject() {
      return this._mastersObject;
   }

   protected void onDocumentRead() {
      try {
         try {
            this._mastersObject = MastersDocument.Factory.parse(this.getPackagePart().getInputStream()).getMasters();
         } catch (XmlException var9) {
            throw new POIXMLException(var9);
         } catch (IOException var10) {
            throw new POIXMLException(var10);
         }

         HashMap e = new HashMap();
         MasterType[] i$ = this._mastersObject.getMasterArray();
         int rp = i$.length;

         for(int part = 0; part < rp; ++part) {
            MasterType relId = i$[part];
            e.put(relId.getRel().getId(), relId);
         }

         Iterator var12 = this.getRelationParts().iterator();

         while(var12.hasNext()) {
            POIXMLDocumentPart.RelationPart var13 = (POIXMLDocumentPart.RelationPart)var12.next();
            POIXMLDocumentPart var14 = var13.getDocumentPart();
            String var15 = var13.getRelationship().getId();
            MasterType settings = (MasterType)e.get(var15);
            if(settings == null) {
               throw new POIXMLException("Master relationship for " + var15 + " not found");
            }

            if(!(var14 instanceof XDGFMasterContents)) {
               throw new POIXMLException("Unexpected masters relationship for " + var15 + ": " + var14);
            }

            XDGFMasterContents contents = (XDGFMasterContents)var14;
            contents.onDocumentRead();
            XDGFMaster master = new XDGFMaster(settings, contents, this._document);
            this._masters.put(Long.valueOf(master.getID()), master);
         }

      } catch (POIXMLException var11) {
         throw XDGFException.wrap((POIXMLDocumentPart)this, var11);
      }
   }

   public Collection getMastersList() {
      return Collections.unmodifiableCollection(this._masters.values());
   }

   public XDGFMaster getMasterById(long masterId) {
      return (XDGFMaster)this._masters.get(Long.valueOf(masterId));
   }
}
