package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.sl.usermodel.MasterSheet;
import org.apache.poi.sl.usermodel.Placeholder;
import org.apache.poi.util.Internal;
import org.apache.poi.xslf.usermodel.SlideLayout;
import org.apache.poi.xslf.usermodel.XSLFBackground;
import org.apache.poi.xslf.usermodel.XSLFShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xslf.usermodel.XSLFSimpleShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTBackground;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPlaceholder;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideLayout;
import org.openxmlformats.schemas.presentationml.x2006.main.SldLayoutDocument;

public class XSLFSlideLayout extends XSLFSheet implements MasterSheet {

   private CTSlideLayout _layout;
   private XSLFSlideMaster _master;


   XSLFSlideLayout() {
      this._layout = CTSlideLayout.Factory.newInstance();
   }

   public XSLFSlideLayout(PackagePart part) throws IOException, XmlException {
      super(part);
      SldLayoutDocument doc = SldLayoutDocument.Factory.parse(this.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this._layout = doc.getSldLayout();
      this.setCommonSlideData(this._layout.getCSld());
   }

   @Deprecated
   public XSLFSlideLayout(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   public String getName() {
      return this._layout.getCSld().getName();
   }

   @Internal
   public CTSlideLayout getXmlObject() {
      return this._layout;
   }

   protected String getRootElementName() {
      return "sldLayout";
   }

   public XSLFSlideMaster getSlideMaster() {
      if(this._master == null) {
         Iterator i$ = this.getRelations().iterator();

         while(i$.hasNext()) {
            POIXMLDocumentPart p = (POIXMLDocumentPart)i$.next();
            if(p instanceof XSLFSlideMaster) {
               this._master = (XSLFSlideMaster)p;
            }
         }
      }

      if(this._master == null) {
         throw new IllegalStateException("SlideMaster was not found for " + this.toString());
      } else {
         return this._master;
      }
   }

   public XSLFSlideMaster getMasterSheet() {
      return this.getSlideMaster();
   }

   public XSLFTheme getTheme() {
      return this.getSlideMaster().getTheme();
   }

   public boolean getFollowMasterGraphics() {
      return this._layout.isSetShowMasterSp() && this._layout.getShowMasterSp();
   }

   protected boolean canDraw(XSLFShape shape) {
      if(shape instanceof XSLFSimpleShape) {
         XSLFSimpleShape txt = (XSLFSimpleShape)shape;
         CTPlaceholder ph = txt.getCTPlaceholder();
         if(ph != null) {
            return false;
         }
      }

      return true;
   }

   public XSLFBackground getBackground() {
      CTBackground bg = this._layout.getCSld().getBg();
      return bg != null?new XSLFBackground(bg, this):this.getMasterSheet().getBackground();
   }

   public void copyLayout(XSLFSlide slide) {
      Iterator i$ = this.getShapes().iterator();

      while(i$.hasNext()) {
         XSLFShape sh = (XSLFShape)i$.next();
         if(sh instanceof XSLFTextShape) {
            XSLFTextShape tsh = (XSLFTextShape)sh;
            Placeholder ph = tsh.getTextType();
            if(ph != null) {
               switch(XSLFSlideLayout.NamelessClass838781241.$SwitchMap$org$apache$poi$sl$usermodel$Placeholder[ph.ordinal()]) {
               case 1:
               case 2:
               case 3:
                  break;
               default:
                  slide.getSpTree().addNewSp().set(tsh.getXmlObject().copy());
               }
            }
         }
      }

   }

   public SlideLayout getType() {
      int ordinal = this._layout.getType().intValue() - 1;
      return SlideLayout.values()[ordinal];
   }

   // $FF: synthetic class
   static class NamelessClass838781241 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$sl$usermodel$Placeholder = new int[Placeholder.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$sl$usermodel$Placeholder[Placeholder.DATETIME.ordinal()] = 1;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$Placeholder[Placeholder.SLIDE_NUMBER.ordinal()] = 2;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$sl$usermodel$Placeholder[Placeholder.FOOTER.ordinal()] = 3;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}
