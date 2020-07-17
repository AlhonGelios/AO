package org.apache.poi.xslf.usermodel;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.sl.usermodel.MasterSheet;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.Resources;
import org.apache.poi.sl.usermodel.SlideShow;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.Internal;
import org.apache.poi.util.LittleEndian;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.PackageHelper;
import org.apache.poi.util.Units;
import org.apache.poi.xslf.usermodel.SlideLayout;
import org.apache.poi.xslf.usermodel.XSLFCommentAuthors;
import org.apache.poi.xslf.usermodel.XSLFFactory;
import org.apache.poi.xslf.usermodel.XSLFNotes;
import org.apache.poi.xslf.usermodel.XSLFNotesMaster;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFRelation;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTableStyles;
import org.apache.poi.xslf.usermodel.XSLFTheme;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextParagraphProperties;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTNotesMasterIdListEntry;
import org.openxmlformats.schemas.presentationml.x2006.main.CTPresentation;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdList;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideIdListEntry;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideMasterIdListEntry;
import org.openxmlformats.schemas.presentationml.x2006.main.CTSlideSize;
import org.openxmlformats.schemas.presentationml.x2006.main.PresentationDocument;

public class XMLSlideShow extends POIXMLDocument implements SlideShow {

   private static POILogger _logger = POILogFactory.getLogger(XMLSlideShow.class);
   private CTPresentation _presentation;
   private List _slides;
   private List _masters;
   private List _pictures;
   private XSLFTableStyles _tableStyles;
   private XSLFNotesMaster _notesMaster;
   private XSLFCommentAuthors _commentAuthors;


   public XMLSlideShow() {
      this(empty());
   }

   public XMLSlideShow(OPCPackage pkg) {
      super(pkg);

      try {
         if(this.getCorePart().getContentType().equals(XSLFRelation.THEME_MANAGER.getContentType())) {
            this.rebase(this.getPackage());
         }

         this.load(XSLFFactory.getInstance());
      } catch (Exception var3) {
         throw new POIXMLException(var3);
      }
   }

   public XMLSlideShow(InputStream is) throws IOException {
      this(PackageHelper.open(is));
   }

   static OPCPackage empty() {
      InputStream is = XMLSlideShow.class.getResourceAsStream("empty.pptx");
      if(is == null) {
         throw new POIXMLException("Missing resource \'empty.pptx\'");
      } else {
         OPCPackage e;
         try {
            e = OPCPackage.open(is);
         } catch (Exception var10) {
            throw new POIXMLException(var10);
         } finally {
            try {
               is.close();
            } catch (Exception var9) {
               throw new POIXMLException(var9);
            }
         }

         return e;
      }
   }

   protected void onDocumentRead() throws IOException {
      try {
         PresentationDocument e = PresentationDocument.Factory.parse(this.getCorePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this._presentation = e.getPresentation();
         HashMap masterMap = new HashMap();
         HashMap shIdMap = new HashMap();
         Iterator i$ = this.getRelationParts().iterator();

         while(i$.hasNext()) {
            POIXMLDocumentPart.RelationPart slId = (POIXMLDocumentPart.RelationPart)i$.next();
            POIXMLDocumentPart sh = slId.getDocumentPart();
            if(sh instanceof XSLFSlide) {
               shIdMap.put(slId.getRelationship().getId(), (XSLFSlide)sh);
            } else if(sh instanceof XSLFSlideMaster) {
               masterMap.put(this.getRelationId(sh), (XSLFSlideMaster)sh);
            } else if(sh instanceof XSLFTableStyles) {
               this._tableStyles = (XSLFTableStyles)sh;
            } else if(sh instanceof XSLFNotesMaster) {
               this._notesMaster = (XSLFNotesMaster)sh;
            } else if(sh instanceof XSLFCommentAuthors) {
               this._commentAuthors = (XSLFCommentAuthors)sh;
            }
         }

         this._masters = new ArrayList(masterMap.size());
         i$ = this._presentation.getSldMasterIdLst().getSldMasterIdList().iterator();

         while(i$.hasNext()) {
            CTSlideMasterIdListEntry slId1 = (CTSlideMasterIdListEntry)i$.next();
            XSLFSlideMaster sh1 = (XSLFSlideMaster)masterMap.get(slId1.getId2());
            this._masters.add(sh1);
         }

         this._slides = new ArrayList(shIdMap.size());
         if(this._presentation.isSetSldIdLst()) {
            i$ = this._presentation.getSldIdLst().getSldIdList().iterator();

            while(i$.hasNext()) {
               CTSlideIdListEntry slId2 = (CTSlideIdListEntry)i$.next();
               XSLFSlide sh2 = (XSLFSlide)shIdMap.get(slId2.getId2());
               if(sh2 == null) {
                  _logger.log(5, new Object[]{"Slide with r:id " + slId2.getId() + " was defined, but didn\'t exist in package, skipping"});
               } else {
                  this._slides.add(sh2);
               }
            }
         }

      } catch (XmlException var7) {
         throw new POIXMLException(var7);
      }
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this._presentation.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      out.close();
   }

   public List getAllEmbedds() throws OpenXML4JException {
      return Collections.unmodifiableList(this.getPackage().getPartsByName(Pattern.compile("/ppt/embeddings/.*?")));
   }

   public List getPictureData() {
      if(this._pictures == null) {
         List mediaParts = this.getPackage().getPartsByName(Pattern.compile("/ppt/media/.*?"));
         this._pictures = new ArrayList(mediaParts.size());
         Iterator i$ = mediaParts.iterator();

         while(i$.hasNext()) {
            PackagePart part = (PackagePart)i$.next();
            XSLFPictureData pd = new XSLFPictureData(part);
            pd.setIndex(this._pictures.size());
            this._pictures.add(pd);
         }
      }

      return Collections.unmodifiableList(this._pictures);
   }

   public XSLFSlide createSlide(XSLFSlideLayout layout) {
      int slideNumber = 256;
      int cnt = 1;
      CTSlideIdList slideList;
      if(!this._presentation.isSetSldIdLst()) {
         slideList = this._presentation.addNewSldIdLst();
      } else {
         slideList = this._presentation.getSldIdLst();
         CTSlideIdListEntry[] rp = slideList.getSldIdArray();
         int slide = rp.length;

         for(int slideId = 0; slideId < slide; ++slideId) {
            CTSlideIdListEntry relation = rp[slideId];
            slideNumber = (int)Math.max(relation.getId() + 1L, (long)slideNumber);
            ++cnt;
         }

         while(true) {
            String var9 = XSLFRelation.SLIDE.getFileName(cnt);
            boolean var11 = false;
            Iterator var12 = this.getRelations().iterator();

            while(var12.hasNext()) {
               POIXMLDocumentPart var15 = (POIXMLDocumentPart)var12.next();
               if(var15.getPackagePart() != null && var9.equals(var15.getPackagePart().getPartName().getName())) {
                  var11 = true;
                  break;
               }
            }

            if(!var11 && this.getPackage().getPartsByName(Pattern.compile(Pattern.quote(var9))).size() > 0) {
               var11 = true;
            }

            if(!var11) {
               break;
            }

            ++cnt;
         }
      }

      POIXMLDocumentPart.RelationPart var10 = this.createRelationship(XSLFRelation.SLIDE, XSLFFactory.getInstance(), cnt, false);
      XSLFSlide var13 = (XSLFSlide)var10.getDocumentPart();
      CTSlideIdListEntry var14 = slideList.addNewSldId();
      var14.setId((long)slideNumber);
      var14.setId2(var10.getRelationship().getId());
      layout.copyLayout(var13);
      var13.addRelation((String)null, XSLFRelation.SLIDE_LAYOUT, layout);
      this._slides.add(var13);
      return var13;
   }

   public XSLFSlide createSlide() {
      XSLFSlideLayout layout = ((XSLFSlideMaster)this._masters.get(0)).getLayout(SlideLayout.BLANK);
      if(layout == null) {
         throw new IllegalArgumentException("Blank layout was not found");
      } else {
         return this.createSlide(layout);
      }
   }

   public XSLFNotes getNotesSlide(XSLFSlide slide) {
      XSLFNotes notesSlide = slide.getNotes();
      if(notesSlide == null) {
         notesSlide = this.createNotesSlide(slide);
      }

      return notesSlide;
   }

   private XSLFNotes createNotesSlide(XSLFSlide slide) {
      if(this._notesMaster == null) {
         this.createNotesMaster();
      }

      Integer slideIndex = XSLFRelation.SLIDE.getFileNameIndex(slide);
      XSLFNotes notesSlide = (XSLFNotes)this.createRelationship(XSLFRelation.NOTES, XSLFFactory.getInstance(), slideIndex.intValue());
      slide.addRelation((String)null, XSLFRelation.NOTES, notesSlide);
      notesSlide.addRelation((String)null, XSLFRelation.NOTES_MASTER, this._notesMaster);
      notesSlide.addRelation((String)null, XSLFRelation.SLIDE, slide);
      notesSlide.importContent(this._notesMaster);
      return notesSlide;
   }

   public void createNotesMaster() {
      POIXMLDocumentPart.RelationPart rp = this.createRelationship(XSLFRelation.NOTES_MASTER, XSLFFactory.getInstance(), 1, false);
      this._notesMaster = (XSLFNotesMaster)rp.getDocumentPart();
      CTNotesMasterIdList notesMasterIdList = this._presentation.addNewNotesMasterIdLst();
      CTNotesMasterIdListEntry notesMasterId = notesMasterIdList.addNewNotesMasterId();
      notesMasterId.setId(rp.getRelationship().getId());
      Integer themeIndex = Integer.valueOf(1);
      ArrayList themeIndexList = new ArrayList();
      Iterator theme = this.getRelations().iterator();

      while(theme.hasNext()) {
         POIXMLDocumentPart i = (POIXMLDocumentPart)theme.next();
         if(i instanceof XSLFTheme) {
            themeIndexList.add(XSLFRelation.THEME.getFileNameIndex(i));
         }
      }

      if(!themeIndexList.isEmpty()) {
         Boolean theme1 = Boolean.valueOf(false);

         for(Integer i1 = Integer.valueOf(1); i1.intValue() <= themeIndexList.size(); i1 = Integer.valueOf(i1.intValue() + 1)) {
            if(!themeIndexList.contains(i1)) {
               theme1 = Boolean.valueOf(true);
               themeIndex = i1;
            }
         }

         if(!theme1.booleanValue()) {
            themeIndex = Integer.valueOf(themeIndexList.size() + 1);
         }
      }

      XSLFTheme theme2 = (XSLFTheme)this.createRelationship(XSLFRelation.THEME, XSLFFactory.getInstance(), themeIndex.intValue());
      theme2.importTheme(((XSLFSlide)this.getSlides().get(0)).getTheme());
      this._notesMaster.addRelation((String)null, XSLFRelation.THEME, theme2);
   }

   public XSLFNotesMaster getNotesMaster() {
      return this._notesMaster;
   }

   public List getSlideMasters() {
      return this._masters;
   }

   public List getSlides() {
      return this._slides;
   }

   public XSLFCommentAuthors getCommentAuthors() {
      return this._commentAuthors;
   }

   public void setSlideOrder(XSLFSlide slide, int newIndex) {
      int oldIndex = this._slides.indexOf(slide);
      if(oldIndex == -1) {
         throw new IllegalArgumentException("Slide not found");
      } else if(oldIndex != newIndex) {
         this._slides.add(newIndex, this._slides.remove(oldIndex));
         CTSlideIdList sldIdLst = this._presentation.getSldIdLst();
         CTSlideIdListEntry[] entries = sldIdLst.getSldIdArray();
         CTSlideIdListEntry oldEntry = entries[oldIndex];
         if(oldIndex < newIndex) {
            System.arraycopy(entries, oldIndex + 1, entries, oldIndex, newIndex - oldIndex);
         } else {
            System.arraycopy(entries, newIndex, entries, newIndex + 1, oldIndex - newIndex);
         }

         entries[newIndex] = oldEntry;
         sldIdLst.setSldIdArray(entries);
      }
   }

   public XSLFSlide removeSlide(int index) {
      XSLFSlide slide = (XSLFSlide)this._slides.remove(index);
      this.removeRelation(slide);
      this._presentation.getSldIdLst().removeSldId(index);
      return slide;
   }

   public Dimension getPageSize() {
      CTSlideSize sz = this._presentation.getSldSz();
      int cx = sz.getCx();
      int cy = sz.getCy();
      return new Dimension((int)Units.toPoints((long)cx), (int)Units.toPoints((long)cy));
   }

   public void setPageSize(Dimension pgSize) {
      CTSlideSize sz = CTSlideSize.Factory.newInstance();
      sz.setCx(Units.toEMU(pgSize.getWidth()));
      sz.setCy(Units.toEMU(pgSize.getHeight()));
      this._presentation.setSldSz(sz);
   }

   @Internal
   public CTPresentation getCTPresentation() {
      return this._presentation;
   }

   public XSLFPictureData addPicture(byte[] pictureData, PictureData.PictureType format) {
      XSLFPictureData img = this.findPictureData(pictureData);
      if(img != null) {
         return img;
      } else {
         int imageNumber = this._pictures.size();
         XSLFRelation relType = XSLFPictureData.getRelationForType(format);
         if(relType == null) {
            throw new IllegalArgumentException("Picture type " + format + " is not supported.");
         } else {
            img = (XSLFPictureData)this.createRelationship(relType, XSLFFactory.getInstance(), imageNumber + 1, true).getDocumentPart();
            img.setIndex(imageNumber);
            this._pictures.add(img);

            try {
               OutputStream e = img.getPackagePart().getOutputStream();
               e.write(pictureData);
               e.close();
               return img;
            } catch (IOException var7) {
               throw new POIXMLException(var7);
            }
         }
      }
   }

   public XSLFPictureData addPicture(InputStream is, PictureData.PictureType format) throws IOException {
      return this.addPicture(IOUtils.toByteArray(is), format);
   }

   public XSLFPictureData addPicture(File pict, PictureData.PictureType format) throws IOException {
      int length = (int)pict.length();
      byte[] data = new byte[length];
      FileInputStream is = new FileInputStream(pict);

      try {
         IOUtils.readFully((InputStream)is, data);
      } finally {
         is.close();
      }

      return this.addPicture(data, format);
   }

   public XSLFPictureData findPictureData(byte[] pictureData) {
      long checksum = IOUtils.calculateChecksum(pictureData);
      byte[] cs = new byte[8];
      LittleEndian.putLong(cs, 0, checksum);
      Iterator i$ = this.getPictureData().iterator();

      XSLFPictureData pic;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         pic = (XSLFPictureData)i$.next();
      } while(!Arrays.equals(pic.getChecksum(), cs));

      return pic;
   }

   public XSLFSlideLayout findLayout(String name) {
      Iterator i$ = this.getSlideMasters().iterator();

      XSLFSlideLayout layout;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         XSLFSlideMaster master = (XSLFSlideMaster)i$.next();
         layout = master.getLayout(name);
      } while(layout == null);

      return layout;
   }

   public XSLFTableStyles getTableStyles() {
      return this._tableStyles;
   }

   CTTextParagraphProperties getDefaultParagraphStyle(int level) {
      XmlObject[] o = this._presentation.selectPath("declare namespace p=\'http://schemas.openxmlformats.org/presentationml/2006/main\' declare namespace a=\'http://schemas.openxmlformats.org/drawingml/2006/main\' .//p:defaultTextStyle/a:lvl" + (level + 1) + "pPr");
      return o.length == 1?(CTTextParagraphProperties)o[0]:null;
   }

   public MasterSheet createMasterSheet() throws IOException {
      throw new UnsupportedOperationException();
   }

   public Resources getResources() {
      throw new UnsupportedOperationException();
   }

}
