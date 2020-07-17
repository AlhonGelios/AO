package org.apache.poi.ss.usermodel;

import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Picture;

public interface Drawing {

   Picture createPicture(ClientAnchor var1, int var2);

   Comment createCellComment(ClientAnchor var1);

   Chart createChart(ClientAnchor var1);

   ClientAnchor createAnchor(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);
}
