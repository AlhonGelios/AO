package org.apache.poi.sl.usermodel;

import java.awt.Dimension;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.apache.poi.sl.usermodel.MasterSheet;
import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.Resources;
import org.apache.poi.sl.usermodel.Slide;

public interface SlideShow extends Closeable {

   Slide createSlide() throws IOException;

   List getSlides();

   MasterSheet createMasterSheet() throws IOException;

   List getSlideMasters();

   Resources getResources();

   Dimension getPageSize();

   void setPageSize(Dimension var1);

   List getPictureData();

   PictureData addPicture(byte[] var1, PictureData.PictureType var2) throws IOException;

   PictureData addPicture(InputStream var1, PictureData.PictureType var2) throws IOException;

   PictureData addPicture(File var1, PictureData.PictureType var2) throws IOException;

   PictureData findPictureData(byte[] var1);

   void write(OutputStream var1) throws IOException;
}
