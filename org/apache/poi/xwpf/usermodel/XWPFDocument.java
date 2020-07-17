package org.apache.poi.xwpf.usermodel;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLProperties;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.openxml4j.opc.TargetMode;
import org.apache.poi.poifs.crypt.HashAlgorithm;
import org.apache.poi.util.IOUtils;
import org.apache.poi.util.IdentifierManager;
import org.apache.poi.util.Internal;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;
import org.apache.poi.util.PackageHelper;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.BodyElementType;
import org.apache.poi.xwpf.usermodel.BodyType;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.IBody;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.TOC;
import org.apache.poi.xwpf.usermodel.XWPFComment;
import org.apache.poi.xwpf.usermodel.XWPFFactory;
import org.apache.poi.xwpf.usermodel.XWPFFooter;
import org.apache.poi.xwpf.usermodel.XWPFFootnote;
import org.apache.poi.xwpf.usermodel.XWPFFootnotes;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFHyperlink;
import org.apache.poi.xwpf.usermodel.XWPFNumbering;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;
import org.apache.poi.xwpf.usermodel.XWPFRelation;
import org.apache.poi.xwpf.usermodel.XWPFSDT;
import org.apache.poi.xwpf.usermodel.XWPFSettings;
import org.apache.poi.xwpf.usermodel.XWPFStyles;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTComment;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFtnEdn;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTP;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtBlock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTStyles;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CommentsDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.DocumentDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.EndnotesDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.FootnotesDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.NumberingDocument;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STDocProtect;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.StylesDocument;

public class XWPFDocument extends POIXMLDocument implements Document, IBody {

   private static final POILogger LOG = POILogFactory.getLogger(XWPFDocument.class);
   protected List footers = new ArrayList();
   protected List headers = new ArrayList();
   protected List comments = new ArrayList();
   protected List hyperlinks = new ArrayList();
   protected List paragraphs = new ArrayList();
   protected List tables = new ArrayList();
   protected List contentControls = new ArrayList();
   protected List bodyElements = new ArrayList();
   protected List pictures = new ArrayList();
   protected Map packagePictures = new HashMap();
   protected Map endnotes = new HashMap();
   protected XWPFNumbering numbering;
   protected XWPFStyles styles;
   protected XWPFFootnotes footnotes;
   private CTDocument1 ctDocument;
   private XWPFSettings settings;
   private IdentifierManager drawingIdManager = new IdentifierManager(0L, 4294967295L);
   private XWPFHeaderFooterPolicy headerFooterPolicy;


   public XWPFDocument(OPCPackage pkg) throws IOException {
      super(pkg);
      this.load(XWPFFactory.getInstance());
   }

   public XWPFDocument(InputStream is) throws IOException {
      super(PackageHelper.open(is));
      this.load(XWPFFactory.getInstance());
   }

   public XWPFDocument() {
      super(newPackage());
      this.onDocumentCreate();
   }

   protected static OPCPackage newPackage() {
      try {
         OPCPackage e = OPCPackage.create((OutputStream)(new ByteArrayOutputStream()));
         PackagePartName corePartName = PackagingURIHelper.createPartName(XWPFRelation.DOCUMENT.getDefaultFileName());
         e.addRelationship(corePartName, TargetMode.INTERNAL, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument");
         e.createPart(corePartName, XWPFRelation.DOCUMENT.getContentType());
         e.getPackageProperties().setCreatorProperty("Apache POI");
         return e;
      } catch (Exception var2) {
         throw new POIXMLException(var2);
      }
   }

   protected void onDocumentRead() throws IOException {
      try {
         DocumentDocument e = DocumentDocument.Factory.parse(this.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.ctDocument = e.getDocument();
         this.initFootnotes();
         XmlCursor cursor = this.ctDocument.getBody().newCursor();
         cursor.selectPath("./*");

         while(cursor.toNextSelection()) {
            XmlObject i$ = cursor.getObject();
            if(i$ instanceof CTP) {
               XWPFParagraph rp = new XWPFParagraph((CTP)i$, this);
               this.bodyElements.add(rp);
               this.paragraphs.add(rp);
            } else if(i$ instanceof CTTbl) {
               XWPFTable var14 = new XWPFTable((CTTbl)i$, this);
               this.bodyElements.add(var14);
               this.tables.add(var14);
            } else if(i$ instanceof CTSdtBlock) {
               XWPFSDT var15 = new XWPFSDT((CTSdtBlock)i$, this);
               this.bodyElements.add(var15);
               this.contentControls.add(var15);
            }
         }

         cursor.dispose();
         if(e.getDocument().getBody().getSectPr() != null) {
            this.headerFooterPolicy = new XWPFHeaderFooterPolicy(this);
         }

         Iterator var13 = this.getRelationParts().iterator();

         while(var13.hasNext()) {
            POIXMLDocumentPart.RelationPart var16 = (POIXMLDocumentPart.RelationPart)var13.next();
            POIXMLDocumentPart p = var16.getDocumentPart();
            String relation = var16.getRelationship().getRelationshipType();
            if(relation.equals(XWPFRelation.STYLES.getRelation())) {
               this.styles = (XWPFStyles)p;
               this.styles.onDocumentRead();
            } else if(relation.equals(XWPFRelation.NUMBERING.getRelation())) {
               this.numbering = (XWPFNumbering)p;
               this.numbering.onDocumentRead();
            } else if(relation.equals(XWPFRelation.FOOTER.getRelation())) {
               XWPFFooter var20 = (XWPFFooter)p;
               this.footers.add(var20);
               var20.onDocumentRead();
            } else if(relation.equals(XWPFRelation.HEADER.getRelation())) {
               XWPFHeader var19 = (XWPFHeader)p;
               this.headers.add(var19);
               var19.onDocumentRead();
            } else if(relation.equals(XWPFRelation.COMMENT.getRelation())) {
               CommentsDocument var18 = CommentsDocument.Factory.parse(p.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
               CTComment[] var21 = var18.getComments().getCommentArray();
               int len$ = var21.length;

               for(int i$2 = 0; i$2 < len$; ++i$2) {
                  CTComment ctcomment = var21[i$2];
                  this.comments.add(new XWPFComment(ctcomment, this));
               }
            } else if(relation.equals(XWPFRelation.SETTINGS.getRelation())) {
               this.settings = (XWPFSettings)p;
               this.settings.onDocumentRead();
            } else if(relation.equals(XWPFRelation.IMAGES.getRelation())) {
               XWPFPictureData var17 = (XWPFPictureData)p;
               var17.onDocumentRead();
               this.registerPackagePictureData(var17);
               this.pictures.add(var17);
            } else if(relation.equals(XWPFRelation.GLOSSARY_DOCUMENT.getRelation())) {
               Iterator i$1 = p.getRelations().iterator();

               while(i$1.hasNext()) {
                  POIXMLDocumentPart gp = (POIXMLDocumentPart)i$1.next();
                  POIXMLDocumentPart._invokeOnDocumentRead(gp);
               }
            }
         }

         this.initHyperlinks();
      } catch (XmlException var12) {
         throw new POIXMLException(var12);
      }
   }

   private void initHyperlinks() {
      try {
         Iterator e = this.getPackagePart().getRelationshipsByType(XWPFRelation.HYPERLINK.getRelation()).iterator();

         while(e.hasNext()) {
            PackageRelationship rel = (PackageRelationship)e.next();
            this.hyperlinks.add(new XWPFHyperlink(rel.getId(), rel.getTargetURI().toString()));
         }

      } catch (InvalidFormatException var3) {
         throw new POIXMLException(var3);
      }
   }

   private void initFootnotes() throws XmlException, IOException {
      Iterator i$ = this.getRelationParts().iterator();

      while(i$.hasNext()) {
         POIXMLDocumentPart.RelationPart rp = (POIXMLDocumentPart.RelationPart)i$.next();
         POIXMLDocumentPart p = rp.getDocumentPart();
         String relation = rp.getRelationship().getRelationshipType();
         if(relation.equals(XWPFRelation.FOOTNOTE.getRelation())) {
            this.footnotes = (XWPFFootnotes)p;
            this.footnotes.onDocumentRead();
         } else if(relation.equals(XWPFRelation.ENDNOTE.getRelation())) {
            EndnotesDocument endnotesDocument = EndnotesDocument.Factory.parse(p.getPackagePart().getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
            CTFtnEdn[] arr$ = endnotesDocument.getEndnotes().getEndnoteArray();
            int len$ = arr$.length;

            for(int i$1 = 0; i$1 < len$; ++i$1) {
               CTFtnEdn ctFtnEdn = arr$[i$1];
               this.endnotes.put(Integer.valueOf(ctFtnEdn.getId().intValue()), new XWPFFootnote(this, ctFtnEdn));
            }
         }
      }

   }

   protected void onDocumentCreate() {
      this.ctDocument = CTDocument1.Factory.newInstance();
      this.ctDocument.addNewBody();
      this.settings = (XWPFSettings)this.createRelationship(XWPFRelation.SETTINGS, XWPFFactory.getInstance());
      POIXMLProperties.ExtendedProperties expProps = this.getProperties().getExtendedProperties();
      expProps.getUnderlyingProperties().setApplication("Apache POI");
   }

   @Internal
   public CTDocument1 getDocument() {
      return this.ctDocument;
   }

   IdentifierManager getDrawingIdManager() {
      return this.drawingIdManager;
   }

   public List getBodyElements() {
      return Collections.unmodifiableList(this.bodyElements);
   }

   public Iterator getBodyElementsIterator() {
      return this.bodyElements.iterator();
   }

   public List getParagraphs() {
      return Collections.unmodifiableList(this.paragraphs);
   }

   public List getTables() {
      return Collections.unmodifiableList(this.tables);
   }

   public XWPFTable getTableArray(int pos) {
      return pos >= 0 && pos < this.tables.size()?(XWPFTable)this.tables.get(pos):null;
   }

   public List getFooterList() {
      return Collections.unmodifiableList(this.footers);
   }

   public XWPFFooter getFooterArray(int pos) {
      return pos >= 0 && pos < this.footers.size()?(XWPFFooter)this.footers.get(pos):null;
   }

   public List getHeaderList() {
      return Collections.unmodifiableList(this.headers);
   }

   public XWPFHeader getHeaderArray(int pos) {
      return pos >= 0 && pos < this.headers.size()?(XWPFHeader)this.headers.get(pos):null;
   }

   public String getTblStyle(XWPFTable table) {
      return table.getStyleID();
   }

   public XWPFHyperlink getHyperlinkByID(String id) {
      Iterator i$ = this.hyperlinks.iterator();

      XWPFHyperlink link;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         link = (XWPFHyperlink)i$.next();
      } while(!link.getId().equals(id));

      return link;
   }

   public XWPFFootnote getFootnoteByID(int id) {
      return this.footnotes == null?null:this.footnotes.getFootnoteById(id);
   }

   public XWPFFootnote getEndnoteByID(int id) {
      return this.endnotes == null?null:(XWPFFootnote)this.endnotes.get(Integer.valueOf(id));
   }

   public List getFootnotes() {
      return this.footnotes == null?Collections.emptyList():this.footnotes.getFootnotesList();
   }

   public XWPFHyperlink[] getHyperlinks() {
      return (XWPFHyperlink[])this.hyperlinks.toArray(new XWPFHyperlink[this.hyperlinks.size()]);
   }

   public XWPFComment getCommentByID(String id) {
      Iterator i$ = this.comments.iterator();

      XWPFComment comment;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         comment = (XWPFComment)i$.next();
      } while(!comment.getId().equals(id));

      return comment;
   }

   public XWPFComment[] getComments() {
      return (XWPFComment[])this.comments.toArray(new XWPFComment[this.comments.size()]);
   }

   public PackagePart getPartById(String id) {
      try {
         PackagePart e = this.getCorePart();
         return e.getRelatedPart(e.getRelationship(id));
      } catch (InvalidFormatException var3) {
         throw new IllegalArgumentException(var3);
      }
   }

   public XWPFHeaderFooterPolicy getHeaderFooterPolicy() {
      return this.headerFooterPolicy;
   }

   public XWPFHeaderFooterPolicy createHeaderFooterPolicy() {
      if(this.headerFooterPolicy == null) {
         if(!this.ctDocument.getBody().isSetSectPr()) {
            this.ctDocument.getBody().addNewSectPr();
         }

         this.headerFooterPolicy = new XWPFHeaderFooterPolicy(this);
      }

      return this.headerFooterPolicy;
   }

   @Internal
   public CTStyles getStyle() throws XmlException, IOException {
      PackagePart[] parts;
      try {
         parts = this.getRelatedByType(XWPFRelation.STYLES.getRelation());
      } catch (InvalidFormatException var3) {
         throw new IllegalStateException(var3);
      }

      if(parts.length != 1) {
         throw new IllegalStateException("Expecting one Styles document part, but found " + parts.length);
      } else {
         StylesDocument sd = StylesDocument.Factory.parse(parts[0].getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         return sd.getStyles();
      }
   }

   public List getAllEmbedds() throws OpenXML4JException {
      LinkedList embedds = new LinkedList();
      PackagePart part = this.getPackagePart();
      Iterator i$ = this.getPackagePart().getRelationshipsByType("http://schemas.openxmlformats.org/officeDocument/2006/relationships/oleObject").iterator();

      PackageRelationship rel;
      while(i$.hasNext()) {
         rel = (PackageRelationship)i$.next();
         embedds.add(part.getRelatedPart(rel));
      }

      i$ = this.getPackagePart().getRelationshipsByType("http://schemas.openxmlformats.org/officeDocument/2006/relationships/package").iterator();

      while(i$.hasNext()) {
         rel = (PackageRelationship)i$.next();
         embedds.add(part.getRelatedPart(rel));
      }

      return embedds;
   }

   private int getBodyElementSpecificPos(int pos, List list) {
      if(list.size() == 0) {
         return -1;
      } else {
         if(pos >= 0 && pos < this.bodyElements.size()) {
            IBodyElement needle = (IBodyElement)this.bodyElements.get(pos);
            if(needle.getElementType() != ((IBodyElement)list.get(0)).getElementType()) {
               return -1;
            }

            int startPos = Math.min(pos, list.size() - 1);

            for(int i = startPos; i >= 0; --i) {
               if(list.get(i) == needle) {
                  return i;
               }
            }
         }

         return -1;
      }
   }

   public int getParagraphPos(int pos) {
      return this.getBodyElementSpecificPos(pos, this.paragraphs);
   }

   public int getTablePos(int pos) {
      return this.getBodyElementSpecificPos(pos, this.tables);
   }

   public XWPFParagraph insertNewParagraph(XmlCursor cursor) {
      if(!this.isCursorInBody(cursor)) {
         return null;
      } else {
         String uri = CTP.type.getName().getNamespaceURI();
         String localPart = "p";
         cursor.beginElement(localPart, uri);
         cursor.toParent();
         CTP p = (CTP)cursor.getObject();
         XWPFParagraph newP = new XWPFParagraph(p, this);

         XmlObject o;
         for(o = null; !(o instanceof CTP) && cursor.toPrevSibling(); o = cursor.getObject()) {
            ;
         }

         if(o instanceof CTP && (CTP)o != p) {
            int newParaPos = this.paragraphs.indexOf(this.getParagraph((CTP)o)) + 1;
            this.paragraphs.add(newParaPos, newP);
         } else {
            this.paragraphs.add(0, newP);
         }

         XmlCursor var13 = p.newCursor();

         XWPFParagraph var9;
         try {
            int i = 0;
            cursor.toCursor(var13);

            while(cursor.toPrevSibling()) {
               o = cursor.getObject();
               if(o instanceof CTP || o instanceof CTTbl) {
                  ++i;
               }
            }

            this.bodyElements.add(i, newP);
            cursor.toCursor(var13);
            cursor.toEndToken();
            var9 = newP;
         } finally {
            var13.dispose();
         }

         return var9;
      }
   }

   public XWPFTable insertNewTbl(XmlCursor cursor) {
      if(!this.isCursorInBody(cursor)) {
         return null;
      } else {
         String uri = CTTbl.type.getName().getNamespaceURI();
         String localPart = "tbl";
         cursor.beginElement(localPart, uri);
         cursor.toParent();
         CTTbl t = (CTTbl)cursor.getObject();
         XWPFTable newT = new XWPFTable(t, this);

         XmlObject o;
         for(o = null; !(o instanceof CTTbl) && cursor.toPrevSibling(); o = cursor.getObject()) {
            ;
         }

         int i;
         if(!(o instanceof CTTbl)) {
            this.tables.add(0, newT);
         } else {
            i = this.tables.indexOf(this.getTable((CTTbl)o)) + 1;
            this.tables.add(i, newT);
         }

         i = 0;
         XmlCursor tableCursor = t.newCursor();

         try {
            cursor.toCursor(tableCursor);

            while(cursor.toPrevSibling()) {
               o = cursor.getObject();
               if(o instanceof CTP || o instanceof CTTbl) {
                  ++i;
               }
            }

            this.bodyElements.add(i, newT);
            cursor.toCursor(tableCursor);
            cursor.toEndToken();
            XWPFTable var9 = newT;
            return var9;
         } finally {
            tableCursor.dispose();
         }
      }
   }

   private boolean isCursorInBody(XmlCursor cursor) {
      XmlCursor verify = cursor.newCursor();
      verify.toParent();
      boolean result = verify.getObject() == this.ctDocument.getBody();
      verify.dispose();
      return result;
   }

   private int getPosOfBodyElement(IBodyElement needle) {
      BodyElementType type = needle.getElementType();

      for(int i = 0; i < this.bodyElements.size(); ++i) {
         IBodyElement current = (IBodyElement)this.bodyElements.get(i);
         if(current.getElementType() == type && current.equals(needle)) {
            return i;
         }
      }

      return -1;
   }

   public int getPosOfParagraph(XWPFParagraph p) {
      return this.getPosOfBodyElement(p);
   }

   public int getPosOfTable(XWPFTable t) {
      return this.getPosOfBodyElement(t);
   }

   protected void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTDocument1.type.getName().getNamespaceURI(), "document"));
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.ctDocument.save(out, xmlOptions);
      out.close();
   }

   private int getRelationIndex(XWPFRelation relation) {
      int i = 1;
      Iterator i$ = this.getRelationParts().iterator();

      while(i$.hasNext()) {
         POIXMLDocumentPart.RelationPart rp = (POIXMLDocumentPart.RelationPart)i$.next();
         if(rp.getRelationship().getRelationshipType().equals(relation.getRelation())) {
            ++i;
         }
      }

      return i;
   }

   public XWPFParagraph createParagraph() {
      XWPFParagraph p = new XWPFParagraph(this.ctDocument.getBody().addNewP(), this);
      this.bodyElements.add(p);
      this.paragraphs.add(p);
      return p;
   }

   public XWPFNumbering createNumbering() {
      if(this.numbering == null) {
         NumberingDocument numberingDoc = NumberingDocument.Factory.newInstance();
         XWPFRelation relation = XWPFRelation.NUMBERING;
         int i = this.getRelationIndex(relation);
         XWPFNumbering wrapper = (XWPFNumbering)this.createRelationship(relation, XWPFFactory.getInstance(), i);
         wrapper.setNumbering(numberingDoc.addNewNumbering());
         this.numbering = wrapper;
      }

      return this.numbering;
   }

   public XWPFStyles createStyles() {
      if(this.styles == null) {
         StylesDocument stylesDoc = StylesDocument.Factory.newInstance();
         XWPFRelation relation = XWPFRelation.STYLES;
         int i = this.getRelationIndex(relation);
         XWPFStyles wrapper = (XWPFStyles)this.createRelationship(relation, XWPFFactory.getInstance(), i);
         wrapper.setStyles(stylesDoc.addNewStyles());
         this.styles = wrapper;
      }

      return this.styles;
   }

   public XWPFFootnotes createFootnotes() {
      if(this.footnotes == null) {
         FootnotesDocument footnotesDoc = FootnotesDocument.Factory.newInstance();
         XWPFRelation relation = XWPFRelation.FOOTNOTE;
         int i = this.getRelationIndex(relation);
         XWPFFootnotes wrapper = (XWPFFootnotes)this.createRelationship(relation, XWPFFactory.getInstance(), i);
         wrapper.setFootnotes(footnotesDoc.addNewFootnotes());
         this.footnotes = wrapper;
      }

      return this.footnotes;
   }

   public XWPFFootnote addFootnote(CTFtnEdn note) {
      return this.footnotes.addFootnote(note);
   }

   public XWPFFootnote addEndnote(CTFtnEdn note) {
      XWPFFootnote endnote = new XWPFFootnote(this, note);
      this.endnotes.put(Integer.valueOf(note.getId().intValue()), endnote);
      return endnote;
   }

   public boolean removeBodyElement(int pos) {
      if(pos >= 0 && pos < this.bodyElements.size()) {
         BodyElementType type = ((IBodyElement)this.bodyElements.get(pos)).getElementType();
         int paraPos;
         if(type == BodyElementType.TABLE) {
            paraPos = this.getTablePos(pos);
            this.tables.remove(paraPos);
            this.ctDocument.getBody().removeTbl(paraPos);
         }

         if(type == BodyElementType.PARAGRAPH) {
            paraPos = this.getParagraphPos(pos);
            this.paragraphs.remove(paraPos);
            this.ctDocument.getBody().removeP(paraPos);
         }

         this.bodyElements.remove(pos);
         return true;
      } else {
         return false;
      }
   }

   public void setParagraph(XWPFParagraph paragraph, int pos) {
      this.paragraphs.set(pos, paragraph);
      this.ctDocument.getBody().setPArray(pos, paragraph.getCTP());
   }

   public XWPFParagraph getLastParagraph() {
      int lastPos = this.paragraphs.toArray().length - 1;
      return (XWPFParagraph)this.paragraphs.get(lastPos);
   }

   public XWPFTable createTable() {
      XWPFTable table = new XWPFTable(this.ctDocument.getBody().addNewTbl(), this);
      this.bodyElements.add(table);
      this.tables.add(table);
      return table;
   }

   public XWPFTable createTable(int rows, int cols) {
      XWPFTable table = new XWPFTable(this.ctDocument.getBody().addNewTbl(), this, rows, cols);
      this.bodyElements.add(table);
      this.tables.add(table);
      return table;
   }

   public void createTOC() {
      CTSdtBlock block = this.getDocument().getBody().addNewSdt();
      TOC toc = new TOC(block);
      Iterator i$ = this.paragraphs.iterator();

      while(i$.hasNext()) {
         XWPFParagraph par = (XWPFParagraph)i$.next();
         String parStyle = par.getStyle();
         if(parStyle != null && parStyle.startsWith("Heading")) {
            try {
               int e = Integer.parseInt(parStyle.substring("Heading".length()));
               toc.addRow(e, par.getText(), 1, "112723803");
            } catch (NumberFormatException var7) {
               LOG.log(7, new Object[]{"can\'t format number in TOC heading", var7});
            }
         }
      }

   }

   public void setTable(int pos, XWPFTable table) {
      this.tables.set(pos, table);
      this.ctDocument.getBody().setTblArray(pos, table.getCTTbl());
   }

   public boolean isEnforcedProtection() {
      return this.settings.isEnforcedWith();
   }

   public boolean isEnforcedReadonlyProtection() {
      return this.settings.isEnforcedWith(STDocProtect.READ_ONLY);
   }

   public boolean isEnforcedFillingFormsProtection() {
      return this.settings.isEnforcedWith(STDocProtect.FORMS);
   }

   public boolean isEnforcedCommentsProtection() {
      return this.settings.isEnforcedWith(STDocProtect.COMMENTS);
   }

   public boolean isEnforcedTrackedChangesProtection() {
      return this.settings.isEnforcedWith(STDocProtect.TRACKED_CHANGES);
   }

   public boolean isEnforcedUpdateFields() {
      return this.settings.isUpdateFields();
   }

   public void enforceReadonlyProtection() {
      this.settings.setEnforcementEditValue(STDocProtect.READ_ONLY);
   }

   public void enforceReadonlyProtection(String password, HashAlgorithm hashAlgo) {
      this.settings.setEnforcementEditValue(STDocProtect.READ_ONLY, password, hashAlgo);
   }

   public void enforceFillingFormsProtection() {
      this.settings.setEnforcementEditValue(STDocProtect.FORMS);
   }

   public void enforceFillingFormsProtection(String password, HashAlgorithm hashAlgo) {
      this.settings.setEnforcementEditValue(STDocProtect.FORMS, password, hashAlgo);
   }

   public void enforceCommentsProtection() {
      this.settings.setEnforcementEditValue(STDocProtect.COMMENTS);
   }

   public void enforceCommentsProtection(String password, HashAlgorithm hashAlgo) {
      this.settings.setEnforcementEditValue(STDocProtect.COMMENTS, password, hashAlgo);
   }

   public void enforceTrackedChangesProtection() {
      this.settings.setEnforcementEditValue(STDocProtect.TRACKED_CHANGES);
   }

   public void enforceTrackedChangesProtection(String password, HashAlgorithm hashAlgo) {
      this.settings.setEnforcementEditValue(STDocProtect.TRACKED_CHANGES, password, hashAlgo);
   }

   public boolean validateProtectionPassword(String password) {
      return this.settings.validateProtectionPassword(password);
   }

   public void removeProtectionEnforcement() {
      this.settings.removeEnforcement();
   }

   public void enforceUpdateFields() {
      this.settings.setUpdateFields();
   }

   public boolean isTrackRevisions() {
      return this.settings.isTrackRevisions();
   }

   public void setTrackRevisions(boolean enable) {
      this.settings.setTrackRevisions(enable);
   }

   public long getZoomPercent() {
      return this.settings.getZoomPercent();
   }

   public void setZoomPercent(long zoomPercent) {
      this.settings.setZoomPercent(zoomPercent);
   }

   public void insertTable(int pos, XWPFTable table) {
      this.bodyElements.add(pos, table);
      int i = 0;
      CTTbl[] arr$ = this.ctDocument.getBody().getTblArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTTbl tbl = arr$[i$];
         if(tbl == table.getCTTbl()) {
            break;
         }

         ++i;
      }

      this.tables.add(i, table);
   }

   public List getAllPictures() {
      return Collections.unmodifiableList(this.pictures);
   }

   public List getAllPackagePictures() {
      ArrayList result = new ArrayList();
      Collection values = this.packagePictures.values();
      Iterator i$ = values.iterator();

      while(i$.hasNext()) {
         List list = (List)i$.next();
         result.addAll(list);
      }

      return Collections.unmodifiableList(result);
   }

   void registerPackagePictureData(XWPFPictureData picData) {
      Object list = (List)this.packagePictures.get(picData.getChecksum());
      if(list == null) {
         list = new ArrayList(1);
         this.packagePictures.put(picData.getChecksum(), list);
      }

      if(!((List)list).contains(picData)) {
         ((List)list).add(picData);
      }

   }

   XWPFPictureData findPackagePictureData(byte[] pictureData, int format) {
      long checksum = IOUtils.calculateChecksum(pictureData);
      XWPFPictureData xwpfPicData = null;
      List xwpfPicDataList = (List)this.packagePictures.get(Long.valueOf(checksum));
      if(xwpfPicDataList != null) {
         Iterator iter = xwpfPicDataList.iterator();

         while(iter.hasNext() && xwpfPicData == null) {
            XWPFPictureData curElem = (XWPFPictureData)iter.next();
            if(Arrays.equals(pictureData, curElem.getData())) {
               xwpfPicData = curElem;
            }
         }
      }

      return xwpfPicData;
   }

   public String addPictureData(byte[] pictureData, int format) throws InvalidFormatException {
      XWPFPictureData xwpfPicData = this.findPackagePictureData(pictureData, format);
      POIXMLRelation relDesc = XWPFPictureData.RELATIONS[format];
      if(xwpfPicData == null) {
         int rp1 = this.getNextPicNameNumber(format);
         xwpfPicData = (XWPFPictureData)this.createRelationship(relDesc, XWPFFactory.getInstance(), rp1);
         PackagePart picDataPart = xwpfPicData.getPackagePart();
         OutputStream out = null;

         try {
            out = picDataPart.getOutputStream();
            out.write(pictureData);
         } catch (IOException var16) {
            throw new POIXMLException(var16);
         } finally {
            try {
               if(out != null) {
                  out.close();
               }
            } catch (IOException var15) {
               ;
            }

         }

         this.registerPackagePictureData(xwpfPicData);
         this.pictures.add(xwpfPicData);
         return this.getRelationId(xwpfPicData);
      } else if(!this.getRelations().contains(xwpfPicData)) {
         POIXMLDocumentPart.RelationPart rp = this.addRelation((String)null, XWPFRelation.IMAGES, xwpfPicData);
         return rp.getRelationship().getId();
      } else {
         return this.getRelationId(xwpfPicData);
      }
   }

   public String addPictureData(InputStream is, int format) throws InvalidFormatException {
      try {
         byte[] e = IOUtils.toByteArray(is);
         return this.addPictureData(e, format);
      } catch (IOException var4) {
         throw new POIXMLException(var4);
      }
   }

   public int getNextPicNameNumber(int format) throws InvalidFormatException {
      int img = this.getAllPackagePictures().size() + 1;
      String proposal = XWPFPictureData.RELATIONS[format].getFileName(img);

      for(PackagePartName createPartName = PackagingURIHelper.createPartName(proposal); this.getPackage().getPart(createPartName) != null; createPartName = PackagingURIHelper.createPartName(proposal)) {
         ++img;
         proposal = XWPFPictureData.RELATIONS[format].getFileName(img);
      }

      return img;
   }

   public XWPFPictureData getPictureDataByID(String blipID) {
      POIXMLDocumentPart relatedPart = this.getRelationById(blipID);
      if(relatedPart instanceof XWPFPictureData) {
         XWPFPictureData xwpfPicData = (XWPFPictureData)relatedPart;
         return xwpfPicData;
      } else {
         return null;
      }
   }

   public XWPFNumbering getNumbering() {
      return this.numbering;
   }

   public XWPFStyles getStyles() {
      return this.styles;
   }

   public XWPFParagraph getParagraph(CTP p) {
      for(int i = 0; i < this.getParagraphs().size(); ++i) {
         if(((XWPFParagraph)this.getParagraphs().get(i)).getCTP() == p) {
            return (XWPFParagraph)this.getParagraphs().get(i);
         }
      }

      return null;
   }

   public XWPFTable getTable(CTTbl ctTbl) {
      for(int i = 0; i < this.tables.size(); ++i) {
         if(((XWPFTable)this.getTables().get(i)).getCTTbl() == ctTbl) {
            return (XWPFTable)this.getTables().get(i);
         }
      }

      return null;
   }

   public Iterator getTablesIterator() {
      return this.tables.iterator();
   }

   public Iterator getParagraphsIterator() {
      return this.paragraphs.iterator();
   }

   public XWPFParagraph getParagraphArray(int pos) {
      return pos >= 0 && pos < this.paragraphs.size()?(XWPFParagraph)this.paragraphs.get(pos):null;
   }

   public POIXMLDocumentPart getPart() {
      return this;
   }

   public BodyType getPartType() {
      return BodyType.DOCUMENT;
   }

   public XWPFTableCell getTableCell(CTTc cell) {
      XmlCursor cursor = cell.newCursor();
      cursor.toParent();
      XmlObject o = cursor.getObject();
      if(!(o instanceof CTRow)) {
         return null;
      } else {
         CTRow row = (CTRow)o;
         cursor.toParent();
         o = cursor.getObject();
         cursor.dispose();
         if(!(o instanceof CTTbl)) {
            return null;
         } else {
            CTTbl tbl = (CTTbl)o;
            XWPFTable table = this.getTable(tbl);
            if(table == null) {
               return null;
            } else {
               XWPFTableRow tableRow = table.getRow(row);
               return tableRow == null?null:tableRow.getTableCell(cell);
            }
         }
      }
   }

   public XWPFDocument getXWPFDocument() {
      return this;
   }

}
