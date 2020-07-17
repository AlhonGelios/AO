package org.apache.poi.xssf.model;

import com.microsoft.schemas.vml.CTShape;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComment;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCommentList;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTComments;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CommentsDocument;

@Internal
public class CommentsTable extends POIXMLDocumentPart {

   public static final String DEFAULT_AUTHOR = "";
   public static final int DEFAULT_AUTHOR_ID = 0;
   private CTComments comments;
   private Map commentRefs;


   public CommentsTable() {
      this.comments = CTComments.Factory.newInstance();
      this.comments.addNewCommentList();
      this.comments.addNewAuthors().addAuthor("");
   }

   public CommentsTable(PackagePart part) throws IOException {
      super(part);
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   public CommentsTable(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void readFrom(InputStream is) throws IOException {
      try {
         CommentsDocument e = CommentsDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.comments = e.getComments();
      } catch (XmlException var3) {
         throw new IOException(var3.getLocalizedMessage());
      }
   }

   public void writeTo(OutputStream out) throws IOException {
      CommentsDocument doc = CommentsDocument.Factory.newInstance();
      doc.setComments(this.comments);
      doc.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.writeTo(out);
      out.close();
   }

   public void referenceUpdated(String oldReference, CTComment comment) {
      this.referenceUpdated(new CellAddress(oldReference), comment);
   }

   public void referenceUpdated(CellAddress oldReference, CTComment comment) {
      if(this.commentRefs != null) {
         this.commentRefs.remove(oldReference);
         this.commentRefs.put(new CellAddress(comment.getRef()), comment);
      }

   }

   public int getNumberOfComments() {
      return this.comments.getCommentList().sizeOfCommentArray();
   }

   public int getNumberOfAuthors() {
      return this.comments.getAuthors().sizeOfAuthorArray();
   }

   public String getAuthor(long authorId) {
      return this.comments.getAuthors().getAuthorArray((int)authorId);
   }

   public int findAuthor(String author) {
      String[] authorArray = this.comments.getAuthors().getAuthorArray();

      for(int i = 0; i < authorArray.length; ++i) {
         if(authorArray[i].equals(author)) {
            return i;
         }
      }

      return this.addNewAuthor(author);
   }

   public XSSFComment findCellComment(String cellRef) {
      return this.findCellComment(new CellAddress(cellRef));
   }

   public XSSFComment findCellComment(CellAddress cellAddress) {
      CTComment ct = this.getCTComment(cellAddress);
      return ct == null?null:new XSSFComment(this, ct, (CTShape)null);
   }

   @Internal
   public CTComment getCTComment(String ref) {
      return this.getCTComment(new CellAddress(ref));
   }

   @Internal
   public CTComment getCTComment(CellAddress cellRef) {
      this.prepareCTCommentCache();
      return (CTComment)this.commentRefs.get(cellRef);
   }

   public Map getCellComments() {
      this.prepareCTCommentCache();
      TreeMap map = new TreeMap();
      Iterator i$ = this.commentRefs.entrySet().iterator();

      while(i$.hasNext()) {
         Entry e = (Entry)i$.next();
         map.put(e.getKey(), new XSSFComment(this, (CTComment)e.getValue(), (CTShape)null));
      }

      return map;
   }

   private void prepareCTCommentCache() {
      if(this.commentRefs == null) {
         this.commentRefs = new HashMap();
         CTComment[] arr$ = this.comments.getCommentList().getCommentArray();
         int len$ = arr$.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            CTComment comment = arr$[i$];
            this.commentRefs.put(new CellAddress(comment.getRef()), comment);
         }
      }

   }

   @Internal
   public CTComment newComment(String ref) {
      return this.newComment(new CellAddress(ref));
   }

   @Internal
   public CTComment newComment(CellAddress ref) {
      CTComment ct = this.comments.getCommentList().addNewComment();
      ct.setRef(ref.formatAsString());
      ct.setAuthorId(0L);
      if(this.commentRefs != null) {
         this.commentRefs.put(ref, ct);
      }

      return ct;
   }

   public boolean removeComment(String cellRef) {
      return this.removeComment(new CellAddress(cellRef));
   }

   public boolean removeComment(CellAddress cellRef) {
      String stringRef = cellRef.formatAsString();
      CTCommentList lst = this.comments.getCommentList();
      if(lst != null) {
         CTComment[] commentArray = lst.getCommentArray();

         for(int i = 0; i < commentArray.length; ++i) {
            CTComment comment = commentArray[i];
            if(stringRef.equals(comment.getRef())) {
               lst.removeComment(i);
               if(this.commentRefs != null) {
                  this.commentRefs.remove(cellRef);
               }

               return true;
            }
         }
      }

      return false;
   }

   private int addNewAuthor(String author) {
      int index = this.comments.getAuthors().sizeOfAuthorArray();
      this.comments.getAuthors().insertAuthor(index, author);
      return index;
   }

   @Internal
   public CTComments getCTComments() {
      return this.comments;
   }
}
