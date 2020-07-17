package com.microsoft.schemas.vml;

import com.microsoft.schemas.office.excel.CTClientData;
import com.microsoft.schemas.office.office.CTCallout;
import com.microsoft.schemas.office.office.CTClipPath;
import com.microsoft.schemas.office.office.CTDiagram;
import com.microsoft.schemas.office.office.CTExtrusion;
import com.microsoft.schemas.office.office.CTLock;
import com.microsoft.schemas.office.office.CTSignatureLine;
import com.microsoft.schemas.office.office.CTSkew;
import com.microsoft.schemas.office.office.STHrAlign;
import com.microsoft.schemas.office.office.STHrAlign$Enum;
import com.microsoft.schemas.office.office.STInsetMode;
import com.microsoft.schemas.office.powerpoint.CTRel;
import com.microsoft.schemas.office.word.CTAnchorLock;
import com.microsoft.schemas.office.word.CTBorder;
import com.microsoft.schemas.office.word.CTWrap;
import com.microsoft.schemas.vml.CTArc;
import com.microsoft.schemas.vml.CTCurve;
import com.microsoft.schemas.vml.CTFill;
import com.microsoft.schemas.vml.CTFormulas;
import com.microsoft.schemas.vml.CTHandles;
import com.microsoft.schemas.vml.CTImage;
import com.microsoft.schemas.vml.CTImageData;
import com.microsoft.schemas.vml.CTLine;
import com.microsoft.schemas.vml.CTOval;
import com.microsoft.schemas.vml.CTPath;
import com.microsoft.schemas.vml.CTPolyLine;
import com.microsoft.schemas.vml.CTRect;
import com.microsoft.schemas.vml.CTRoundRect;
import com.microsoft.schemas.vml.CTShadow;
import com.microsoft.schemas.vml.CTShape;
import com.microsoft.schemas.vml.CTShapetype;
import com.microsoft.schemas.vml.CTStroke;
import com.microsoft.schemas.vml.CTTextPath;
import com.microsoft.schemas.vml.CTTextbox;
import com.microsoft.schemas.vml.STColorType;
import com.microsoft.schemas.vml.STEditAs;
import com.microsoft.schemas.vml.STEditAs$Enum;
import com.microsoft.schemas.vml.STTrueFalse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlFloat;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTGroup extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctgroup2b13type");


   List getPathList();

   CTPath[] getPathArray();

   CTPath getPathArray(int var1);

   int sizeOfPathArray();

   void setPathArray(CTPath[] var1);

   void setPathArray(int var1, CTPath var2);

   CTPath insertNewPath(int var1);

   CTPath addNewPath();

   void removePath(int var1);

   List getFormulasList();

   CTFormulas[] getFormulasArray();

   CTFormulas getFormulasArray(int var1);

   int sizeOfFormulasArray();

   void setFormulasArray(CTFormulas[] var1);

   void setFormulasArray(int var1, CTFormulas var2);

   CTFormulas insertNewFormulas(int var1);

   CTFormulas addNewFormulas();

   void removeFormulas(int var1);

   List getHandlesList();

   CTHandles[] getHandlesArray();

   CTHandles getHandlesArray(int var1);

   int sizeOfHandlesArray();

   void setHandlesArray(CTHandles[] var1);

   void setHandlesArray(int var1, CTHandles var2);

   CTHandles insertNewHandles(int var1);

   CTHandles addNewHandles();

   void removeHandles(int var1);

   List getFillList();

   CTFill[] getFillArray();

   CTFill getFillArray(int var1);

   int sizeOfFillArray();

   void setFillArray(CTFill[] var1);

   void setFillArray(int var1, CTFill var2);

   CTFill insertNewFill(int var1);

   CTFill addNewFill();

   void removeFill(int var1);

   List getStrokeList();

   CTStroke[] getStrokeArray();

   CTStroke getStrokeArray(int var1);

   int sizeOfStrokeArray();

   void setStrokeArray(CTStroke[] var1);

   void setStrokeArray(int var1, CTStroke var2);

   CTStroke insertNewStroke(int var1);

   CTStroke addNewStroke();

   void removeStroke(int var1);

   List getShadowList();

   CTShadow[] getShadowArray();

   CTShadow getShadowArray(int var1);

   int sizeOfShadowArray();

   void setShadowArray(CTShadow[] var1);

   void setShadowArray(int var1, CTShadow var2);

   CTShadow insertNewShadow(int var1);

   CTShadow addNewShadow();

   void removeShadow(int var1);

   List getTextboxList();

   CTTextbox[] getTextboxArray();

   CTTextbox getTextboxArray(int var1);

   int sizeOfTextboxArray();

   void setTextboxArray(CTTextbox[] var1);

   void setTextboxArray(int var1, CTTextbox var2);

   CTTextbox insertNewTextbox(int var1);

   CTTextbox addNewTextbox();

   void removeTextbox(int var1);

   List getTextpathList();

   CTTextPath[] getTextpathArray();

   CTTextPath getTextpathArray(int var1);

   int sizeOfTextpathArray();

   void setTextpathArray(CTTextPath[] var1);

   void setTextpathArray(int var1, CTTextPath var2);

   CTTextPath insertNewTextpath(int var1);

   CTTextPath addNewTextpath();

   void removeTextpath(int var1);

   List getImagedataList();

   CTImageData[] getImagedataArray();

   CTImageData getImagedataArray(int var1);

   int sizeOfImagedataArray();

   void setImagedataArray(CTImageData[] var1);

   void setImagedataArray(int var1, CTImageData var2);

   CTImageData insertNewImagedata(int var1);

   CTImageData addNewImagedata();

   void removeImagedata(int var1);

   List getSkewList();

   CTSkew[] getSkewArray();

   CTSkew getSkewArray(int var1);

   int sizeOfSkewArray();

   void setSkewArray(CTSkew[] var1);

   void setSkewArray(int var1, CTSkew var2);

   CTSkew insertNewSkew(int var1);

   CTSkew addNewSkew();

   void removeSkew(int var1);

   List getExtrusionList();

   CTExtrusion[] getExtrusionArray();

   CTExtrusion getExtrusionArray(int var1);

   int sizeOfExtrusionArray();

   void setExtrusionArray(CTExtrusion[] var1);

   void setExtrusionArray(int var1, CTExtrusion var2);

   CTExtrusion insertNewExtrusion(int var1);

   CTExtrusion addNewExtrusion();

   void removeExtrusion(int var1);

   List getCalloutList();

   CTCallout[] getCalloutArray();

   CTCallout getCalloutArray(int var1);

   int sizeOfCalloutArray();

   void setCalloutArray(CTCallout[] var1);

   void setCalloutArray(int var1, CTCallout var2);

   CTCallout insertNewCallout(int var1);

   CTCallout addNewCallout();

   void removeCallout(int var1);

   List getLockList();

   CTLock[] getLockArray();

   CTLock getLockArray(int var1);

   int sizeOfLockArray();

   void setLockArray(CTLock[] var1);

   void setLockArray(int var1, CTLock var2);

   CTLock insertNewLock(int var1);

   CTLock addNewLock();

   void removeLock(int var1);

   List getClippathList();

   CTClipPath[] getClippathArray();

   CTClipPath getClippathArray(int var1);

   int sizeOfClippathArray();

   void setClippathArray(CTClipPath[] var1);

   void setClippathArray(int var1, CTClipPath var2);

   CTClipPath insertNewClippath(int var1);

   CTClipPath addNewClippath();

   void removeClippath(int var1);

   List getSignaturelineList();

   CTSignatureLine[] getSignaturelineArray();

   CTSignatureLine getSignaturelineArray(int var1);

   int sizeOfSignaturelineArray();

   void setSignaturelineArray(CTSignatureLine[] var1);

   void setSignaturelineArray(int var1, CTSignatureLine var2);

   CTSignatureLine insertNewSignatureline(int var1);

   CTSignatureLine addNewSignatureline();

   void removeSignatureline(int var1);

   List getWrapList();

   CTWrap[] getWrapArray();

   CTWrap getWrapArray(int var1);

   int sizeOfWrapArray();

   void setWrapArray(CTWrap[] var1);

   void setWrapArray(int var1, CTWrap var2);

   CTWrap insertNewWrap(int var1);

   CTWrap addNewWrap();

   void removeWrap(int var1);

   List getAnchorlockList();

   CTAnchorLock[] getAnchorlockArray();

   CTAnchorLock getAnchorlockArray(int var1);

   int sizeOfAnchorlockArray();

   void setAnchorlockArray(CTAnchorLock[] var1);

   void setAnchorlockArray(int var1, CTAnchorLock var2);

   CTAnchorLock insertNewAnchorlock(int var1);

   CTAnchorLock addNewAnchorlock();

   void removeAnchorlock(int var1);

   List getBordertopList();

   CTBorder[] getBordertopArray();

   CTBorder getBordertopArray(int var1);

   int sizeOfBordertopArray();

   void setBordertopArray(CTBorder[] var1);

   void setBordertopArray(int var1, CTBorder var2);

   CTBorder insertNewBordertop(int var1);

   CTBorder addNewBordertop();

   void removeBordertop(int var1);

   List getBorderbottomList();

   CTBorder[] getBorderbottomArray();

   CTBorder getBorderbottomArray(int var1);

   int sizeOfBorderbottomArray();

   void setBorderbottomArray(CTBorder[] var1);

   void setBorderbottomArray(int var1, CTBorder var2);

   CTBorder insertNewBorderbottom(int var1);

   CTBorder addNewBorderbottom();

   void removeBorderbottom(int var1);

   List getBorderleftList();

   CTBorder[] getBorderleftArray();

   CTBorder getBorderleftArray(int var1);

   int sizeOfBorderleftArray();

   void setBorderleftArray(CTBorder[] var1);

   void setBorderleftArray(int var1, CTBorder var2);

   CTBorder insertNewBorderleft(int var1);

   CTBorder addNewBorderleft();

   void removeBorderleft(int var1);

   List getBorderrightList();

   CTBorder[] getBorderrightArray();

   CTBorder getBorderrightArray(int var1);

   int sizeOfBorderrightArray();

   void setBorderrightArray(CTBorder[] var1);

   void setBorderrightArray(int var1, CTBorder var2);

   CTBorder insertNewBorderright(int var1);

   CTBorder addNewBorderright();

   void removeBorderright(int var1);

   List getClientDataList();

   CTClientData[] getClientDataArray();

   CTClientData getClientDataArray(int var1);

   int sizeOfClientDataArray();

   void setClientDataArray(CTClientData[] var1);

   void setClientDataArray(int var1, CTClientData var2);

   CTClientData insertNewClientData(int var1);

   CTClientData addNewClientData();

   void removeClientData(int var1);

   List getTextdataList();

   CTRel[] getTextdataArray();

   CTRel getTextdataArray(int var1);

   int sizeOfTextdataArray();

   void setTextdataArray(CTRel[] var1);

   void setTextdataArray(int var1, CTRel var2);

   CTRel insertNewTextdata(int var1);

   CTRel addNewTextdata();

   void removeTextdata(int var1);

   List getGroupList();

   CTGroup[] getGroupArray();

   CTGroup getGroupArray(int var1);

   int sizeOfGroupArray();

   void setGroupArray(CTGroup[] var1);

   void setGroupArray(int var1, CTGroup var2);

   CTGroup insertNewGroup(int var1);

   CTGroup addNewGroup();

   void removeGroup(int var1);

   List getShapeList();

   CTShape[] getShapeArray();

   CTShape getShapeArray(int var1);

   int sizeOfShapeArray();

   void setShapeArray(CTShape[] var1);

   void setShapeArray(int var1, CTShape var2);

   CTShape insertNewShape(int var1);

   CTShape addNewShape();

   void removeShape(int var1);

   List getShapetypeList();

   CTShapetype[] getShapetypeArray();

   CTShapetype getShapetypeArray(int var1);

   int sizeOfShapetypeArray();

   void setShapetypeArray(CTShapetype[] var1);

   void setShapetypeArray(int var1, CTShapetype var2);

   CTShapetype insertNewShapetype(int var1);

   CTShapetype addNewShapetype();

   void removeShapetype(int var1);

   List getArcList();

   CTArc[] getArcArray();

   CTArc getArcArray(int var1);

   int sizeOfArcArray();

   void setArcArray(CTArc[] var1);

   void setArcArray(int var1, CTArc var2);

   CTArc insertNewArc(int var1);

   CTArc addNewArc();

   void removeArc(int var1);

   List getCurveList();

   CTCurve[] getCurveArray();

   CTCurve getCurveArray(int var1);

   int sizeOfCurveArray();

   void setCurveArray(CTCurve[] var1);

   void setCurveArray(int var1, CTCurve var2);

   CTCurve insertNewCurve(int var1);

   CTCurve addNewCurve();

   void removeCurve(int var1);

   List getImageList();

   CTImage[] getImageArray();

   CTImage getImageArray(int var1);

   int sizeOfImageArray();

   void setImageArray(CTImage[] var1);

   void setImageArray(int var1, CTImage var2);

   CTImage insertNewImage(int var1);

   CTImage addNewImage();

   void removeImage(int var1);

   List getLineList();

   CTLine[] getLineArray();

   CTLine getLineArray(int var1);

   int sizeOfLineArray();

   void setLineArray(CTLine[] var1);

   void setLineArray(int var1, CTLine var2);

   CTLine insertNewLine(int var1);

   CTLine addNewLine();

   void removeLine(int var1);

   List getOvalList();

   CTOval[] getOvalArray();

   CTOval getOvalArray(int var1);

   int sizeOfOvalArray();

   void setOvalArray(CTOval[] var1);

   void setOvalArray(int var1, CTOval var2);

   CTOval insertNewOval(int var1);

   CTOval addNewOval();

   void removeOval(int var1);

   List getPolylineList();

   CTPolyLine[] getPolylineArray();

   CTPolyLine getPolylineArray(int var1);

   int sizeOfPolylineArray();

   void setPolylineArray(CTPolyLine[] var1);

   void setPolylineArray(int var1, CTPolyLine var2);

   CTPolyLine insertNewPolyline(int var1);

   CTPolyLine addNewPolyline();

   void removePolyline(int var1);

   List getRectList();

   CTRect[] getRectArray();

   CTRect getRectArray(int var1);

   int sizeOfRectArray();

   void setRectArray(CTRect[] var1);

   void setRectArray(int var1, CTRect var2);

   CTRect insertNewRect(int var1);

   CTRect addNewRect();

   void removeRect(int var1);

   List getRoundrectList();

   CTRoundRect[] getRoundrectArray();

   CTRoundRect getRoundrectArray(int var1);

   int sizeOfRoundrectArray();

   void setRoundrectArray(CTRoundRect[] var1);

   void setRoundrectArray(int var1, CTRoundRect var2);

   CTRoundRect insertNewRoundrect(int var1);

   CTRoundRect addNewRoundrect();

   void removeRoundrect(int var1);

   List getDiagramList();

   CTDiagram[] getDiagramArray();

   CTDiagram getDiagramArray(int var1);

   int sizeOfDiagramArray();

   void setDiagramArray(CTDiagram[] var1);

   void setDiagramArray(int var1, CTDiagram var2);

   CTDiagram insertNewDiagram(int var1);

   CTDiagram addNewDiagram();

   void removeDiagram(int var1);

   String getId();

   XmlString xgetId();

   boolean isSetId();

   void setId(String var1);

   void xsetId(XmlString var1);

   void unsetId();

   String getStyle();

   XmlString xgetStyle();

   boolean isSetStyle();

   void setStyle(String var1);

   void xsetStyle(XmlString var1);

   void unsetStyle();

   String getHref();

   XmlString xgetHref();

   boolean isSetHref();

   void setHref(String var1);

   void xsetHref(XmlString var1);

   void unsetHref();

   String getTarget();

   XmlString xgetTarget();

   boolean isSetTarget();

   void setTarget(String var1);

   void xsetTarget(XmlString var1);

   void unsetTarget();

   String getClass1();

   XmlString xgetClass1();

   boolean isSetClass1();

   void setClass1(String var1);

   void xsetClass1(XmlString var1);

   void unsetClass1();

   String getTitle();

   XmlString xgetTitle();

   boolean isSetTitle();

   void setTitle(String var1);

   void xsetTitle(XmlString var1);

   void unsetTitle();

   String getAlt();

   XmlString xgetAlt();

   boolean isSetAlt();

   void setAlt(String var1);

   void xsetAlt(XmlString var1);

   void unsetAlt();

   String getCoordsize();

   XmlString xgetCoordsize();

   boolean isSetCoordsize();

   void setCoordsize(String var1);

   void xsetCoordsize(XmlString var1);

   void unsetCoordsize();

   String getCoordorigin();

   XmlString xgetCoordorigin();

   boolean isSetCoordorigin();

   void setCoordorigin(String var1);

   void xsetCoordorigin(XmlString var1);

   void unsetCoordorigin();

   String getWrapcoords();

   XmlString xgetWrapcoords();

   boolean isSetWrapcoords();

   void setWrapcoords(String var1);

   void xsetWrapcoords(XmlString var1);

   void unsetWrapcoords();

   STTrueFalse.Enum getPrint();

   STTrueFalse xgetPrint();

   boolean isSetPrint();

   void setPrint(STTrueFalse.Enum var1);

   void xsetPrint(STTrueFalse var1);

   void unsetPrint();

   String getSpid();

   XmlString xgetSpid();

   boolean isSetSpid();

   void setSpid(String var1);

   void xsetSpid(XmlString var1);

   void unsetSpid();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getOned();

   com.microsoft.schemas.office.office.STTrueFalse xgetOned();

   boolean isSetOned();

   void setOned(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetOned(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetOned();

   BigInteger getRegroupid();

   XmlInteger xgetRegroupid();

   boolean isSetRegroupid();

   void setRegroupid(BigInteger var1);

   void xsetRegroupid(XmlInteger var1);

   void unsetRegroupid();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getDoubleclicknotify();

   com.microsoft.schemas.office.office.STTrueFalse xgetDoubleclicknotify();

   boolean isSetDoubleclicknotify();

   void setDoubleclicknotify(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetDoubleclicknotify(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetDoubleclicknotify();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getButton();

   com.microsoft.schemas.office.office.STTrueFalse xgetButton();

   boolean isSetButton();

   void setButton(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetButton(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetButton();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getUserhidden();

   com.microsoft.schemas.office.office.STTrueFalse xgetUserhidden();

   boolean isSetUserhidden();

   void setUserhidden(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetUserhidden(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetUserhidden();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getBullet();

   com.microsoft.schemas.office.office.STTrueFalse xgetBullet();

   boolean isSetBullet();

   void setBullet(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetBullet(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetBullet();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getHr();

   com.microsoft.schemas.office.office.STTrueFalse xgetHr();

   boolean isSetHr();

   void setHr(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetHr(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetHr();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getHrstd();

   com.microsoft.schemas.office.office.STTrueFalse xgetHrstd();

   boolean isSetHrstd();

   void setHrstd(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetHrstd(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetHrstd();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getHrnoshade();

   com.microsoft.schemas.office.office.STTrueFalse xgetHrnoshade();

   boolean isSetHrnoshade();

   void setHrnoshade(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetHrnoshade(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetHrnoshade();

   float getHrpct();

   XmlFloat xgetHrpct();

   boolean isSetHrpct();

   void setHrpct(float var1);

   void xsetHrpct(XmlFloat var1);

   void unsetHrpct();

   STHrAlign$Enum getHralign();

   STHrAlign xgetHralign();

   boolean isSetHralign();

   void setHralign(STHrAlign$Enum var1);

   void xsetHralign(STHrAlign var1);

   void unsetHralign();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getAllowincell();

   com.microsoft.schemas.office.office.STTrueFalse xgetAllowincell();

   boolean isSetAllowincell();

   void setAllowincell(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetAllowincell(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetAllowincell();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getAllowoverlap();

   com.microsoft.schemas.office.office.STTrueFalse xgetAllowoverlap();

   boolean isSetAllowoverlap();

   void setAllowoverlap(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetAllowoverlap(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetAllowoverlap();

   com.microsoft.schemas.office.office.STTrueFalse$Enum getUserdrawn();

   com.microsoft.schemas.office.office.STTrueFalse xgetUserdrawn();

   boolean isSetUserdrawn();

   void setUserdrawn(com.microsoft.schemas.office.office.STTrueFalse$Enum var1);

   void xsetUserdrawn(com.microsoft.schemas.office.office.STTrueFalse var1);

   void unsetUserdrawn();

   String getBordertopcolor();

   XmlString xgetBordertopcolor();

   boolean isSetBordertopcolor();

   void setBordertopcolor(String var1);

   void xsetBordertopcolor(XmlString var1);

   void unsetBordertopcolor();

   String getBorderleftcolor();

   XmlString xgetBorderleftcolor();

   boolean isSetBorderleftcolor();

   void setBorderleftcolor(String var1);

   void xsetBorderleftcolor(XmlString var1);

   void unsetBorderleftcolor();

   String getBorderbottomcolor();

   XmlString xgetBorderbottomcolor();

   boolean isSetBorderbottomcolor();

   void setBorderbottomcolor(String var1);

   void xsetBorderbottomcolor(XmlString var1);

   void unsetBorderbottomcolor();

   String getBorderrightcolor();

   XmlString xgetBorderrightcolor();

   boolean isSetBorderrightcolor();

   void setBorderrightcolor(String var1);

   void xsetBorderrightcolor(XmlString var1);

   void unsetBorderrightcolor();

   BigInteger getDgmlayout();

   XmlInteger xgetDgmlayout();

   boolean isSetDgmlayout();

   void setDgmlayout(BigInteger var1);

   void xsetDgmlayout(XmlInteger var1);

   void unsetDgmlayout();

   BigInteger getDgmnodekind();

   XmlInteger xgetDgmnodekind();

   boolean isSetDgmnodekind();

   void setDgmnodekind(BigInteger var1);

   void xsetDgmnodekind(XmlInteger var1);

   void unsetDgmnodekind();

   BigInteger getDgmlayoutmru();

   XmlInteger xgetDgmlayoutmru();

   boolean isSetDgmlayoutmru();

   void setDgmlayoutmru(BigInteger var1);

   void xsetDgmlayoutmru(XmlInteger var1);

   void unsetDgmlayoutmru();

   STInsetMode.Enum getInsetmode();

   STInsetMode xgetInsetmode();

   boolean isSetInsetmode();

   void setInsetmode(STInsetMode.Enum var1);

   void xsetInsetmode(STInsetMode var1);

   void unsetInsetmode();

   STTrueFalse.Enum getFilled();

   STTrueFalse xgetFilled();

   boolean isSetFilled();

   void setFilled(STTrueFalse.Enum var1);

   void xsetFilled(STTrueFalse var1);

   void unsetFilled();

   String getFillcolor();

   STColorType xgetFillcolor();

   boolean isSetFillcolor();

   void setFillcolor(String var1);

   void xsetFillcolor(STColorType var1);

   void unsetFillcolor();

   STEditAs$Enum getEditas();

   STEditAs xgetEditas();

   boolean isSetEditas();

   void setEditas(STEditAs$Enum var1);

   void xsetEditas(STEditAs var1);

   void unsetEditas();

   String getTableproperties();

   XmlString xgetTableproperties();

   boolean isSetTableproperties();

   void setTableproperties(String var1);

   void xsetTableproperties(XmlString var1);

   void unsetTableproperties();

   String getTablelimits();

   XmlString xgetTablelimits();

   boolean isSetTablelimits();

   void setTablelimits(String var1);

   void xsetTablelimits(XmlString var1);

   void unsetTablelimits();


   public static final class Factory {

      public static CTGroup newInstance() {
         return (CTGroup)POIXMLTypeLoader.newInstance(CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup newInstance(XmlOptions var0) {
         return (CTGroup)POIXMLTypeLoader.newInstance(CTGroup.type, var0);
      }

      public static CTGroup parse(String var0) throws XmlException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup parse(String var0, XmlOptions var1) throws XmlException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, var1);
      }

      public static CTGroup parse(File var0) throws XmlException, IOException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, var1);
      }

      public static CTGroup parse(URL var0) throws XmlException, IOException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, var1);
      }

      public static CTGroup parse(InputStream var0) throws XmlException, IOException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, var1);
      }

      public static CTGroup parse(Reader var0) throws XmlException, IOException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, var1);
      }

      public static CTGroup parse(XMLStreamReader var0) throws XmlException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, var1);
      }

      public static CTGroup parse(Node var0) throws XmlException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, var1);
      }

      public static CTGroup parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, (XmlOptions)null);
      }

      public static CTGroup parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTGroup)POIXMLTypeLoader.parse(var0, CTGroup.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroup.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTGroup.type, var1);
      }

   }
}
