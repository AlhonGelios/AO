package com.microsoft.schemas.office.excel;

import com.microsoft.schemas.office.excel.STCF;
import com.microsoft.schemas.office.excel.STCF$Enum;
import com.microsoft.schemas.office.excel.STObjectType;
import com.microsoft.schemas.office.excel.STTrueFalseBlank;
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
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlNonNegativeInteger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlString;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface CTClientData extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTClientData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctclientdata433btype");


   List getMoveWithCellsList();

   STTrueFalseBlank.Enum[] getMoveWithCellsArray();

   STTrueFalseBlank.Enum getMoveWithCellsArray(int var1);

   List xgetMoveWithCellsList();

   STTrueFalseBlank[] xgetMoveWithCellsArray();

   STTrueFalseBlank xgetMoveWithCellsArray(int var1);

   int sizeOfMoveWithCellsArray();

   void setMoveWithCellsArray(STTrueFalseBlank.Enum[] var1);

   void setMoveWithCellsArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetMoveWithCellsArray(STTrueFalseBlank[] var1);

   void xsetMoveWithCellsArray(int var1, STTrueFalseBlank var2);

   void insertMoveWithCells(int var1, STTrueFalseBlank.Enum var2);

   void addMoveWithCells(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewMoveWithCells(int var1);

   STTrueFalseBlank addNewMoveWithCells();

   void removeMoveWithCells(int var1);

   List getSizeWithCellsList();

   STTrueFalseBlank.Enum[] getSizeWithCellsArray();

   STTrueFalseBlank.Enum getSizeWithCellsArray(int var1);

   List xgetSizeWithCellsList();

   STTrueFalseBlank[] xgetSizeWithCellsArray();

   STTrueFalseBlank xgetSizeWithCellsArray(int var1);

   int sizeOfSizeWithCellsArray();

   void setSizeWithCellsArray(STTrueFalseBlank.Enum[] var1);

   void setSizeWithCellsArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetSizeWithCellsArray(STTrueFalseBlank[] var1);

   void xsetSizeWithCellsArray(int var1, STTrueFalseBlank var2);

   void insertSizeWithCells(int var1, STTrueFalseBlank.Enum var2);

   void addSizeWithCells(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewSizeWithCells(int var1);

   STTrueFalseBlank addNewSizeWithCells();

   void removeSizeWithCells(int var1);

   List getAnchorList();

   String[] getAnchorArray();

   String getAnchorArray(int var1);

   List xgetAnchorList();

   XmlString[] xgetAnchorArray();

   XmlString xgetAnchorArray(int var1);

   int sizeOfAnchorArray();

   void setAnchorArray(String[] var1);

   void setAnchorArray(int var1, String var2);

   void xsetAnchorArray(XmlString[] var1);

   void xsetAnchorArray(int var1, XmlString var2);

   void insertAnchor(int var1, String var2);

   void addAnchor(String var1);

   XmlString insertNewAnchor(int var1);

   XmlString addNewAnchor();

   void removeAnchor(int var1);

   List getLockedList();

   STTrueFalseBlank.Enum[] getLockedArray();

   STTrueFalseBlank.Enum getLockedArray(int var1);

   List xgetLockedList();

   STTrueFalseBlank[] xgetLockedArray();

   STTrueFalseBlank xgetLockedArray(int var1);

   int sizeOfLockedArray();

   void setLockedArray(STTrueFalseBlank.Enum[] var1);

   void setLockedArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetLockedArray(STTrueFalseBlank[] var1);

   void xsetLockedArray(int var1, STTrueFalseBlank var2);

   void insertLocked(int var1, STTrueFalseBlank.Enum var2);

   void addLocked(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewLocked(int var1);

   STTrueFalseBlank addNewLocked();

   void removeLocked(int var1);

   List getDefaultSizeList();

   STTrueFalseBlank.Enum[] getDefaultSizeArray();

   STTrueFalseBlank.Enum getDefaultSizeArray(int var1);

   List xgetDefaultSizeList();

   STTrueFalseBlank[] xgetDefaultSizeArray();

   STTrueFalseBlank xgetDefaultSizeArray(int var1);

   int sizeOfDefaultSizeArray();

   void setDefaultSizeArray(STTrueFalseBlank.Enum[] var1);

   void setDefaultSizeArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetDefaultSizeArray(STTrueFalseBlank[] var1);

   void xsetDefaultSizeArray(int var1, STTrueFalseBlank var2);

   void insertDefaultSize(int var1, STTrueFalseBlank.Enum var2);

   void addDefaultSize(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewDefaultSize(int var1);

   STTrueFalseBlank addNewDefaultSize();

   void removeDefaultSize(int var1);

   List getPrintObjectList();

   STTrueFalseBlank.Enum[] getPrintObjectArray();

   STTrueFalseBlank.Enum getPrintObjectArray(int var1);

   List xgetPrintObjectList();

   STTrueFalseBlank[] xgetPrintObjectArray();

   STTrueFalseBlank xgetPrintObjectArray(int var1);

   int sizeOfPrintObjectArray();

   void setPrintObjectArray(STTrueFalseBlank.Enum[] var1);

   void setPrintObjectArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetPrintObjectArray(STTrueFalseBlank[] var1);

   void xsetPrintObjectArray(int var1, STTrueFalseBlank var2);

   void insertPrintObject(int var1, STTrueFalseBlank.Enum var2);

   void addPrintObject(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewPrintObject(int var1);

   STTrueFalseBlank addNewPrintObject();

   void removePrintObject(int var1);

   List getDisabledList();

   STTrueFalseBlank.Enum[] getDisabledArray();

   STTrueFalseBlank.Enum getDisabledArray(int var1);

   List xgetDisabledList();

   STTrueFalseBlank[] xgetDisabledArray();

   STTrueFalseBlank xgetDisabledArray(int var1);

   int sizeOfDisabledArray();

   void setDisabledArray(STTrueFalseBlank.Enum[] var1);

   void setDisabledArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetDisabledArray(STTrueFalseBlank[] var1);

   void xsetDisabledArray(int var1, STTrueFalseBlank var2);

   void insertDisabled(int var1, STTrueFalseBlank.Enum var2);

   void addDisabled(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewDisabled(int var1);

   STTrueFalseBlank addNewDisabled();

   void removeDisabled(int var1);

   List getAutoFillList();

   STTrueFalseBlank.Enum[] getAutoFillArray();

   STTrueFalseBlank.Enum getAutoFillArray(int var1);

   List xgetAutoFillList();

   STTrueFalseBlank[] xgetAutoFillArray();

   STTrueFalseBlank xgetAutoFillArray(int var1);

   int sizeOfAutoFillArray();

   void setAutoFillArray(STTrueFalseBlank.Enum[] var1);

   void setAutoFillArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetAutoFillArray(STTrueFalseBlank[] var1);

   void xsetAutoFillArray(int var1, STTrueFalseBlank var2);

   void insertAutoFill(int var1, STTrueFalseBlank.Enum var2);

   void addAutoFill(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewAutoFill(int var1);

   STTrueFalseBlank addNewAutoFill();

   void removeAutoFill(int var1);

   List getAutoLineList();

   STTrueFalseBlank.Enum[] getAutoLineArray();

   STTrueFalseBlank.Enum getAutoLineArray(int var1);

   List xgetAutoLineList();

   STTrueFalseBlank[] xgetAutoLineArray();

   STTrueFalseBlank xgetAutoLineArray(int var1);

   int sizeOfAutoLineArray();

   void setAutoLineArray(STTrueFalseBlank.Enum[] var1);

   void setAutoLineArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetAutoLineArray(STTrueFalseBlank[] var1);

   void xsetAutoLineArray(int var1, STTrueFalseBlank var2);

   void insertAutoLine(int var1, STTrueFalseBlank.Enum var2);

   void addAutoLine(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewAutoLine(int var1);

   STTrueFalseBlank addNewAutoLine();

   void removeAutoLine(int var1);

   List getAutoPictList();

   STTrueFalseBlank.Enum[] getAutoPictArray();

   STTrueFalseBlank.Enum getAutoPictArray(int var1);

   List xgetAutoPictList();

   STTrueFalseBlank[] xgetAutoPictArray();

   STTrueFalseBlank xgetAutoPictArray(int var1);

   int sizeOfAutoPictArray();

   void setAutoPictArray(STTrueFalseBlank.Enum[] var1);

   void setAutoPictArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetAutoPictArray(STTrueFalseBlank[] var1);

   void xsetAutoPictArray(int var1, STTrueFalseBlank var2);

   void insertAutoPict(int var1, STTrueFalseBlank.Enum var2);

   void addAutoPict(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewAutoPict(int var1);

   STTrueFalseBlank addNewAutoPict();

   void removeAutoPict(int var1);

   List getFmlaMacroList();

   String[] getFmlaMacroArray();

   String getFmlaMacroArray(int var1);

   List xgetFmlaMacroList();

   XmlString[] xgetFmlaMacroArray();

   XmlString xgetFmlaMacroArray(int var1);

   int sizeOfFmlaMacroArray();

   void setFmlaMacroArray(String[] var1);

   void setFmlaMacroArray(int var1, String var2);

   void xsetFmlaMacroArray(XmlString[] var1);

   void xsetFmlaMacroArray(int var1, XmlString var2);

   void insertFmlaMacro(int var1, String var2);

   void addFmlaMacro(String var1);

   XmlString insertNewFmlaMacro(int var1);

   XmlString addNewFmlaMacro();

   void removeFmlaMacro(int var1);

   List getTextHAlignList();

   String[] getTextHAlignArray();

   String getTextHAlignArray(int var1);

   List xgetTextHAlignList();

   XmlString[] xgetTextHAlignArray();

   XmlString xgetTextHAlignArray(int var1);

   int sizeOfTextHAlignArray();

   void setTextHAlignArray(String[] var1);

   void setTextHAlignArray(int var1, String var2);

   void xsetTextHAlignArray(XmlString[] var1);

   void xsetTextHAlignArray(int var1, XmlString var2);

   void insertTextHAlign(int var1, String var2);

   void addTextHAlign(String var1);

   XmlString insertNewTextHAlign(int var1);

   XmlString addNewTextHAlign();

   void removeTextHAlign(int var1);

   List getTextVAlignList();

   String[] getTextVAlignArray();

   String getTextVAlignArray(int var1);

   List xgetTextVAlignList();

   XmlString[] xgetTextVAlignArray();

   XmlString xgetTextVAlignArray(int var1);

   int sizeOfTextVAlignArray();

   void setTextVAlignArray(String[] var1);

   void setTextVAlignArray(int var1, String var2);

   void xsetTextVAlignArray(XmlString[] var1);

   void xsetTextVAlignArray(int var1, XmlString var2);

   void insertTextVAlign(int var1, String var2);

   void addTextVAlign(String var1);

   XmlString insertNewTextVAlign(int var1);

   XmlString addNewTextVAlign();

   void removeTextVAlign(int var1);

   List getLockTextList();

   STTrueFalseBlank.Enum[] getLockTextArray();

   STTrueFalseBlank.Enum getLockTextArray(int var1);

   List xgetLockTextList();

   STTrueFalseBlank[] xgetLockTextArray();

   STTrueFalseBlank xgetLockTextArray(int var1);

   int sizeOfLockTextArray();

   void setLockTextArray(STTrueFalseBlank.Enum[] var1);

   void setLockTextArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetLockTextArray(STTrueFalseBlank[] var1);

   void xsetLockTextArray(int var1, STTrueFalseBlank var2);

   void insertLockText(int var1, STTrueFalseBlank.Enum var2);

   void addLockText(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewLockText(int var1);

   STTrueFalseBlank addNewLockText();

   void removeLockText(int var1);

   List getJustLastXList();

   STTrueFalseBlank.Enum[] getJustLastXArray();

   STTrueFalseBlank.Enum getJustLastXArray(int var1);

   List xgetJustLastXList();

   STTrueFalseBlank[] xgetJustLastXArray();

   STTrueFalseBlank xgetJustLastXArray(int var1);

   int sizeOfJustLastXArray();

   void setJustLastXArray(STTrueFalseBlank.Enum[] var1);

   void setJustLastXArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetJustLastXArray(STTrueFalseBlank[] var1);

   void xsetJustLastXArray(int var1, STTrueFalseBlank var2);

   void insertJustLastX(int var1, STTrueFalseBlank.Enum var2);

   void addJustLastX(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewJustLastX(int var1);

   STTrueFalseBlank addNewJustLastX();

   void removeJustLastX(int var1);

   List getSecretEditList();

   STTrueFalseBlank.Enum[] getSecretEditArray();

   STTrueFalseBlank.Enum getSecretEditArray(int var1);

   List xgetSecretEditList();

   STTrueFalseBlank[] xgetSecretEditArray();

   STTrueFalseBlank xgetSecretEditArray(int var1);

   int sizeOfSecretEditArray();

   void setSecretEditArray(STTrueFalseBlank.Enum[] var1);

   void setSecretEditArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetSecretEditArray(STTrueFalseBlank[] var1);

   void xsetSecretEditArray(int var1, STTrueFalseBlank var2);

   void insertSecretEdit(int var1, STTrueFalseBlank.Enum var2);

   void addSecretEdit(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewSecretEdit(int var1);

   STTrueFalseBlank addNewSecretEdit();

   void removeSecretEdit(int var1);

   List getDefaultList();

   STTrueFalseBlank.Enum[] getDefaultArray();

   STTrueFalseBlank.Enum getDefaultArray(int var1);

   List xgetDefaultList();

   STTrueFalseBlank[] xgetDefaultArray();

   STTrueFalseBlank xgetDefaultArray(int var1);

   int sizeOfDefaultArray();

   void setDefaultArray(STTrueFalseBlank.Enum[] var1);

   void setDefaultArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetDefaultArray(STTrueFalseBlank[] var1);

   void xsetDefaultArray(int var1, STTrueFalseBlank var2);

   void insertDefault(int var1, STTrueFalseBlank.Enum var2);

   void addDefault(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewDefault(int var1);

   STTrueFalseBlank addNewDefault();

   void removeDefault(int var1);

   List getHelpList();

   STTrueFalseBlank.Enum[] getHelpArray();

   STTrueFalseBlank.Enum getHelpArray(int var1);

   List xgetHelpList();

   STTrueFalseBlank[] xgetHelpArray();

   STTrueFalseBlank xgetHelpArray(int var1);

   int sizeOfHelpArray();

   void setHelpArray(STTrueFalseBlank.Enum[] var1);

   void setHelpArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetHelpArray(STTrueFalseBlank[] var1);

   void xsetHelpArray(int var1, STTrueFalseBlank var2);

   void insertHelp(int var1, STTrueFalseBlank.Enum var2);

   void addHelp(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewHelp(int var1);

   STTrueFalseBlank addNewHelp();

   void removeHelp(int var1);

   List getCancelList();

   STTrueFalseBlank.Enum[] getCancelArray();

   STTrueFalseBlank.Enum getCancelArray(int var1);

   List xgetCancelList();

   STTrueFalseBlank[] xgetCancelArray();

   STTrueFalseBlank xgetCancelArray(int var1);

   int sizeOfCancelArray();

   void setCancelArray(STTrueFalseBlank.Enum[] var1);

   void setCancelArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetCancelArray(STTrueFalseBlank[] var1);

   void xsetCancelArray(int var1, STTrueFalseBlank var2);

   void insertCancel(int var1, STTrueFalseBlank.Enum var2);

   void addCancel(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewCancel(int var1);

   STTrueFalseBlank addNewCancel();

   void removeCancel(int var1);

   List getDismissList();

   STTrueFalseBlank.Enum[] getDismissArray();

   STTrueFalseBlank.Enum getDismissArray(int var1);

   List xgetDismissList();

   STTrueFalseBlank[] xgetDismissArray();

   STTrueFalseBlank xgetDismissArray(int var1);

   int sizeOfDismissArray();

   void setDismissArray(STTrueFalseBlank.Enum[] var1);

   void setDismissArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetDismissArray(STTrueFalseBlank[] var1);

   void xsetDismissArray(int var1, STTrueFalseBlank var2);

   void insertDismiss(int var1, STTrueFalseBlank.Enum var2);

   void addDismiss(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewDismiss(int var1);

   STTrueFalseBlank addNewDismiss();

   void removeDismiss(int var1);

   List getAccelList();

   BigInteger[] getAccelArray();

   BigInteger getAccelArray(int var1);

   List xgetAccelList();

   XmlInteger[] xgetAccelArray();

   XmlInteger xgetAccelArray(int var1);

   int sizeOfAccelArray();

   void setAccelArray(BigInteger[] var1);

   void setAccelArray(int var1, BigInteger var2);

   void xsetAccelArray(XmlInteger[] var1);

   void xsetAccelArray(int var1, XmlInteger var2);

   void insertAccel(int var1, BigInteger var2);

   void addAccel(BigInteger var1);

   XmlInteger insertNewAccel(int var1);

   XmlInteger addNewAccel();

   void removeAccel(int var1);

   List getAccel2List();

   BigInteger[] getAccel2Array();

   BigInteger getAccel2Array(int var1);

   List xgetAccel2List();

   XmlInteger[] xgetAccel2Array();

   XmlInteger xgetAccel2Array(int var1);

   int sizeOfAccel2Array();

   void setAccel2Array(BigInteger[] var1);

   void setAccel2Array(int var1, BigInteger var2);

   void xsetAccel2Array(XmlInteger[] var1);

   void xsetAccel2Array(int var1, XmlInteger var2);

   void insertAccel2(int var1, BigInteger var2);

   void addAccel2(BigInteger var1);

   XmlInteger insertNewAccel2(int var1);

   XmlInteger addNewAccel2();

   void removeAccel2(int var1);

   List getRowList();

   BigInteger[] getRowArray();

   BigInteger getRowArray(int var1);

   List xgetRowList();

   XmlInteger[] xgetRowArray();

   XmlInteger xgetRowArray(int var1);

   int sizeOfRowArray();

   void setRowArray(BigInteger[] var1);

   void setRowArray(int var1, BigInteger var2);

   void xsetRowArray(XmlInteger[] var1);

   void xsetRowArray(int var1, XmlInteger var2);

   void insertRow(int var1, BigInteger var2);

   void addRow(BigInteger var1);

   XmlInteger insertNewRow(int var1);

   XmlInteger addNewRow();

   void removeRow(int var1);

   List getColumnList();

   BigInteger[] getColumnArray();

   BigInteger getColumnArray(int var1);

   List xgetColumnList();

   XmlInteger[] xgetColumnArray();

   XmlInteger xgetColumnArray(int var1);

   int sizeOfColumnArray();

   void setColumnArray(BigInteger[] var1);

   void setColumnArray(int var1, BigInteger var2);

   void xsetColumnArray(XmlInteger[] var1);

   void xsetColumnArray(int var1, XmlInteger var2);

   void insertColumn(int var1, BigInteger var2);

   void addColumn(BigInteger var1);

   XmlInteger insertNewColumn(int var1);

   XmlInteger addNewColumn();

   void removeColumn(int var1);

   List getVisibleList();

   STTrueFalseBlank.Enum[] getVisibleArray();

   STTrueFalseBlank.Enum getVisibleArray(int var1);

   List xgetVisibleList();

   STTrueFalseBlank[] xgetVisibleArray();

   STTrueFalseBlank xgetVisibleArray(int var1);

   int sizeOfVisibleArray();

   void setVisibleArray(STTrueFalseBlank.Enum[] var1);

   void setVisibleArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetVisibleArray(STTrueFalseBlank[] var1);

   void xsetVisibleArray(int var1, STTrueFalseBlank var2);

   void insertVisible(int var1, STTrueFalseBlank.Enum var2);

   void addVisible(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewVisible(int var1);

   STTrueFalseBlank addNewVisible();

   void removeVisible(int var1);

   List getRowHiddenList();

   STTrueFalseBlank.Enum[] getRowHiddenArray();

   STTrueFalseBlank.Enum getRowHiddenArray(int var1);

   List xgetRowHiddenList();

   STTrueFalseBlank[] xgetRowHiddenArray();

   STTrueFalseBlank xgetRowHiddenArray(int var1);

   int sizeOfRowHiddenArray();

   void setRowHiddenArray(STTrueFalseBlank.Enum[] var1);

   void setRowHiddenArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetRowHiddenArray(STTrueFalseBlank[] var1);

   void xsetRowHiddenArray(int var1, STTrueFalseBlank var2);

   void insertRowHidden(int var1, STTrueFalseBlank.Enum var2);

   void addRowHidden(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewRowHidden(int var1);

   STTrueFalseBlank addNewRowHidden();

   void removeRowHidden(int var1);

   List getColHiddenList();

   STTrueFalseBlank.Enum[] getColHiddenArray();

   STTrueFalseBlank.Enum getColHiddenArray(int var1);

   List xgetColHiddenList();

   STTrueFalseBlank[] xgetColHiddenArray();

   STTrueFalseBlank xgetColHiddenArray(int var1);

   int sizeOfColHiddenArray();

   void setColHiddenArray(STTrueFalseBlank.Enum[] var1);

   void setColHiddenArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetColHiddenArray(STTrueFalseBlank[] var1);

   void xsetColHiddenArray(int var1, STTrueFalseBlank var2);

   void insertColHidden(int var1, STTrueFalseBlank.Enum var2);

   void addColHidden(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewColHidden(int var1);

   STTrueFalseBlank addNewColHidden();

   void removeColHidden(int var1);

   List getVTEditList();

   BigInteger[] getVTEditArray();

   BigInteger getVTEditArray(int var1);

   List xgetVTEditList();

   XmlInteger[] xgetVTEditArray();

   XmlInteger xgetVTEditArray(int var1);

   int sizeOfVTEditArray();

   void setVTEditArray(BigInteger[] var1);

   void setVTEditArray(int var1, BigInteger var2);

   void xsetVTEditArray(XmlInteger[] var1);

   void xsetVTEditArray(int var1, XmlInteger var2);

   void insertVTEdit(int var1, BigInteger var2);

   void addVTEdit(BigInteger var1);

   XmlInteger insertNewVTEdit(int var1);

   XmlInteger addNewVTEdit();

   void removeVTEdit(int var1);

   List getMultiLineList();

   STTrueFalseBlank.Enum[] getMultiLineArray();

   STTrueFalseBlank.Enum getMultiLineArray(int var1);

   List xgetMultiLineList();

   STTrueFalseBlank[] xgetMultiLineArray();

   STTrueFalseBlank xgetMultiLineArray(int var1);

   int sizeOfMultiLineArray();

   void setMultiLineArray(STTrueFalseBlank.Enum[] var1);

   void setMultiLineArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetMultiLineArray(STTrueFalseBlank[] var1);

   void xsetMultiLineArray(int var1, STTrueFalseBlank var2);

   void insertMultiLine(int var1, STTrueFalseBlank.Enum var2);

   void addMultiLine(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewMultiLine(int var1);

   STTrueFalseBlank addNewMultiLine();

   void removeMultiLine(int var1);

   List getVScrollList();

   STTrueFalseBlank.Enum[] getVScrollArray();

   STTrueFalseBlank.Enum getVScrollArray(int var1);

   List xgetVScrollList();

   STTrueFalseBlank[] xgetVScrollArray();

   STTrueFalseBlank xgetVScrollArray(int var1);

   int sizeOfVScrollArray();

   void setVScrollArray(STTrueFalseBlank.Enum[] var1);

   void setVScrollArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetVScrollArray(STTrueFalseBlank[] var1);

   void xsetVScrollArray(int var1, STTrueFalseBlank var2);

   void insertVScroll(int var1, STTrueFalseBlank.Enum var2);

   void addVScroll(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewVScroll(int var1);

   STTrueFalseBlank addNewVScroll();

   void removeVScroll(int var1);

   List getValidIdsList();

   STTrueFalseBlank.Enum[] getValidIdsArray();

   STTrueFalseBlank.Enum getValidIdsArray(int var1);

   List xgetValidIdsList();

   STTrueFalseBlank[] xgetValidIdsArray();

   STTrueFalseBlank xgetValidIdsArray(int var1);

   int sizeOfValidIdsArray();

   void setValidIdsArray(STTrueFalseBlank.Enum[] var1);

   void setValidIdsArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetValidIdsArray(STTrueFalseBlank[] var1);

   void xsetValidIdsArray(int var1, STTrueFalseBlank var2);

   void insertValidIds(int var1, STTrueFalseBlank.Enum var2);

   void addValidIds(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewValidIds(int var1);

   STTrueFalseBlank addNewValidIds();

   void removeValidIds(int var1);

   List getFmlaRangeList();

   String[] getFmlaRangeArray();

   String getFmlaRangeArray(int var1);

   List xgetFmlaRangeList();

   XmlString[] xgetFmlaRangeArray();

   XmlString xgetFmlaRangeArray(int var1);

   int sizeOfFmlaRangeArray();

   void setFmlaRangeArray(String[] var1);

   void setFmlaRangeArray(int var1, String var2);

   void xsetFmlaRangeArray(XmlString[] var1);

   void xsetFmlaRangeArray(int var1, XmlString var2);

   void insertFmlaRange(int var1, String var2);

   void addFmlaRange(String var1);

   XmlString insertNewFmlaRange(int var1);

   XmlString addNewFmlaRange();

   void removeFmlaRange(int var1);

   List getWidthMinList();

   BigInteger[] getWidthMinArray();

   BigInteger getWidthMinArray(int var1);

   List xgetWidthMinList();

   XmlInteger[] xgetWidthMinArray();

   XmlInteger xgetWidthMinArray(int var1);

   int sizeOfWidthMinArray();

   void setWidthMinArray(BigInteger[] var1);

   void setWidthMinArray(int var1, BigInteger var2);

   void xsetWidthMinArray(XmlInteger[] var1);

   void xsetWidthMinArray(int var1, XmlInteger var2);

   void insertWidthMin(int var1, BigInteger var2);

   void addWidthMin(BigInteger var1);

   XmlInteger insertNewWidthMin(int var1);

   XmlInteger addNewWidthMin();

   void removeWidthMin(int var1);

   List getSelList();

   BigInteger[] getSelArray();

   BigInteger getSelArray(int var1);

   List xgetSelList();

   XmlInteger[] xgetSelArray();

   XmlInteger xgetSelArray(int var1);

   int sizeOfSelArray();

   void setSelArray(BigInteger[] var1);

   void setSelArray(int var1, BigInteger var2);

   void xsetSelArray(XmlInteger[] var1);

   void xsetSelArray(int var1, XmlInteger var2);

   void insertSel(int var1, BigInteger var2);

   void addSel(BigInteger var1);

   XmlInteger insertNewSel(int var1);

   XmlInteger addNewSel();

   void removeSel(int var1);

   List getNoThreeD2List();

   STTrueFalseBlank.Enum[] getNoThreeD2Array();

   STTrueFalseBlank.Enum getNoThreeD2Array(int var1);

   List xgetNoThreeD2List();

   STTrueFalseBlank[] xgetNoThreeD2Array();

   STTrueFalseBlank xgetNoThreeD2Array(int var1);

   int sizeOfNoThreeD2Array();

   void setNoThreeD2Array(STTrueFalseBlank.Enum[] var1);

   void setNoThreeD2Array(int var1, STTrueFalseBlank.Enum var2);

   void xsetNoThreeD2Array(STTrueFalseBlank[] var1);

   void xsetNoThreeD2Array(int var1, STTrueFalseBlank var2);

   void insertNoThreeD2(int var1, STTrueFalseBlank.Enum var2);

   void addNoThreeD2(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewNoThreeD2(int var1);

   STTrueFalseBlank addNewNoThreeD2();

   void removeNoThreeD2(int var1);

   List getSelTypeList();

   String[] getSelTypeArray();

   String getSelTypeArray(int var1);

   List xgetSelTypeList();

   XmlString[] xgetSelTypeArray();

   XmlString xgetSelTypeArray(int var1);

   int sizeOfSelTypeArray();

   void setSelTypeArray(String[] var1);

   void setSelTypeArray(int var1, String var2);

   void xsetSelTypeArray(XmlString[] var1);

   void xsetSelTypeArray(int var1, XmlString var2);

   void insertSelType(int var1, String var2);

   void addSelType(String var1);

   XmlString insertNewSelType(int var1);

   XmlString addNewSelType();

   void removeSelType(int var1);

   List getMultiSelList();

   String[] getMultiSelArray();

   String getMultiSelArray(int var1);

   List xgetMultiSelList();

   XmlString[] xgetMultiSelArray();

   XmlString xgetMultiSelArray(int var1);

   int sizeOfMultiSelArray();

   void setMultiSelArray(String[] var1);

   void setMultiSelArray(int var1, String var2);

   void xsetMultiSelArray(XmlString[] var1);

   void xsetMultiSelArray(int var1, XmlString var2);

   void insertMultiSel(int var1, String var2);

   void addMultiSel(String var1);

   XmlString insertNewMultiSel(int var1);

   XmlString addNewMultiSel();

   void removeMultiSel(int var1);

   List getLCTList();

   String[] getLCTArray();

   String getLCTArray(int var1);

   List xgetLCTList();

   XmlString[] xgetLCTArray();

   XmlString xgetLCTArray(int var1);

   int sizeOfLCTArray();

   void setLCTArray(String[] var1);

   void setLCTArray(int var1, String var2);

   void xsetLCTArray(XmlString[] var1);

   void xsetLCTArray(int var1, XmlString var2);

   void insertLCT(int var1, String var2);

   void addLCT(String var1);

   XmlString insertNewLCT(int var1);

   XmlString addNewLCT();

   void removeLCT(int var1);

   List getListItemList();

   String[] getListItemArray();

   String getListItemArray(int var1);

   List xgetListItemList();

   XmlString[] xgetListItemArray();

   XmlString xgetListItemArray(int var1);

   int sizeOfListItemArray();

   void setListItemArray(String[] var1);

   void setListItemArray(int var1, String var2);

   void xsetListItemArray(XmlString[] var1);

   void xsetListItemArray(int var1, XmlString var2);

   void insertListItem(int var1, String var2);

   void addListItem(String var1);

   XmlString insertNewListItem(int var1);

   XmlString addNewListItem();

   void removeListItem(int var1);

   List getDropStyleList();

   String[] getDropStyleArray();

   String getDropStyleArray(int var1);

   List xgetDropStyleList();

   XmlString[] xgetDropStyleArray();

   XmlString xgetDropStyleArray(int var1);

   int sizeOfDropStyleArray();

   void setDropStyleArray(String[] var1);

   void setDropStyleArray(int var1, String var2);

   void xsetDropStyleArray(XmlString[] var1);

   void xsetDropStyleArray(int var1, XmlString var2);

   void insertDropStyle(int var1, String var2);

   void addDropStyle(String var1);

   XmlString insertNewDropStyle(int var1);

   XmlString addNewDropStyle();

   void removeDropStyle(int var1);

   List getColoredList();

   STTrueFalseBlank.Enum[] getColoredArray();

   STTrueFalseBlank.Enum getColoredArray(int var1);

   List xgetColoredList();

   STTrueFalseBlank[] xgetColoredArray();

   STTrueFalseBlank xgetColoredArray(int var1);

   int sizeOfColoredArray();

   void setColoredArray(STTrueFalseBlank.Enum[] var1);

   void setColoredArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetColoredArray(STTrueFalseBlank[] var1);

   void xsetColoredArray(int var1, STTrueFalseBlank var2);

   void insertColored(int var1, STTrueFalseBlank.Enum var2);

   void addColored(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewColored(int var1);

   STTrueFalseBlank addNewColored();

   void removeColored(int var1);

   List getDropLinesList();

   BigInteger[] getDropLinesArray();

   BigInteger getDropLinesArray(int var1);

   List xgetDropLinesList();

   XmlInteger[] xgetDropLinesArray();

   XmlInteger xgetDropLinesArray(int var1);

   int sizeOfDropLinesArray();

   void setDropLinesArray(BigInteger[] var1);

   void setDropLinesArray(int var1, BigInteger var2);

   void xsetDropLinesArray(XmlInteger[] var1);

   void xsetDropLinesArray(int var1, XmlInteger var2);

   void insertDropLines(int var1, BigInteger var2);

   void addDropLines(BigInteger var1);

   XmlInteger insertNewDropLines(int var1);

   XmlInteger addNewDropLines();

   void removeDropLines(int var1);

   List getCheckedList();

   BigInteger[] getCheckedArray();

   BigInteger getCheckedArray(int var1);

   List xgetCheckedList();

   XmlInteger[] xgetCheckedArray();

   XmlInteger xgetCheckedArray(int var1);

   int sizeOfCheckedArray();

   void setCheckedArray(BigInteger[] var1);

   void setCheckedArray(int var1, BigInteger var2);

   void xsetCheckedArray(XmlInteger[] var1);

   void xsetCheckedArray(int var1, XmlInteger var2);

   void insertChecked(int var1, BigInteger var2);

   void addChecked(BigInteger var1);

   XmlInteger insertNewChecked(int var1);

   XmlInteger addNewChecked();

   void removeChecked(int var1);

   List getFmlaLinkList();

   String[] getFmlaLinkArray();

   String getFmlaLinkArray(int var1);

   List xgetFmlaLinkList();

   XmlString[] xgetFmlaLinkArray();

   XmlString xgetFmlaLinkArray(int var1);

   int sizeOfFmlaLinkArray();

   void setFmlaLinkArray(String[] var1);

   void setFmlaLinkArray(int var1, String var2);

   void xsetFmlaLinkArray(XmlString[] var1);

   void xsetFmlaLinkArray(int var1, XmlString var2);

   void insertFmlaLink(int var1, String var2);

   void addFmlaLink(String var1);

   XmlString insertNewFmlaLink(int var1);

   XmlString addNewFmlaLink();

   void removeFmlaLink(int var1);

   List getFmlaPictList();

   String[] getFmlaPictArray();

   String getFmlaPictArray(int var1);

   List xgetFmlaPictList();

   XmlString[] xgetFmlaPictArray();

   XmlString xgetFmlaPictArray(int var1);

   int sizeOfFmlaPictArray();

   void setFmlaPictArray(String[] var1);

   void setFmlaPictArray(int var1, String var2);

   void xsetFmlaPictArray(XmlString[] var1);

   void xsetFmlaPictArray(int var1, XmlString var2);

   void insertFmlaPict(int var1, String var2);

   void addFmlaPict(String var1);

   XmlString insertNewFmlaPict(int var1);

   XmlString addNewFmlaPict();

   void removeFmlaPict(int var1);

   List getNoThreeDList();

   STTrueFalseBlank.Enum[] getNoThreeDArray();

   STTrueFalseBlank.Enum getNoThreeDArray(int var1);

   List xgetNoThreeDList();

   STTrueFalseBlank[] xgetNoThreeDArray();

   STTrueFalseBlank xgetNoThreeDArray(int var1);

   int sizeOfNoThreeDArray();

   void setNoThreeDArray(STTrueFalseBlank.Enum[] var1);

   void setNoThreeDArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetNoThreeDArray(STTrueFalseBlank[] var1);

   void xsetNoThreeDArray(int var1, STTrueFalseBlank var2);

   void insertNoThreeD(int var1, STTrueFalseBlank.Enum var2);

   void addNoThreeD(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewNoThreeD(int var1);

   STTrueFalseBlank addNewNoThreeD();

   void removeNoThreeD(int var1);

   List getFirstButtonList();

   STTrueFalseBlank.Enum[] getFirstButtonArray();

   STTrueFalseBlank.Enum getFirstButtonArray(int var1);

   List xgetFirstButtonList();

   STTrueFalseBlank[] xgetFirstButtonArray();

   STTrueFalseBlank xgetFirstButtonArray(int var1);

   int sizeOfFirstButtonArray();

   void setFirstButtonArray(STTrueFalseBlank.Enum[] var1);

   void setFirstButtonArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetFirstButtonArray(STTrueFalseBlank[] var1);

   void xsetFirstButtonArray(int var1, STTrueFalseBlank var2);

   void insertFirstButton(int var1, STTrueFalseBlank.Enum var2);

   void addFirstButton(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewFirstButton(int var1);

   STTrueFalseBlank addNewFirstButton();

   void removeFirstButton(int var1);

   List getFmlaGroupList();

   String[] getFmlaGroupArray();

   String getFmlaGroupArray(int var1);

   List xgetFmlaGroupList();

   XmlString[] xgetFmlaGroupArray();

   XmlString xgetFmlaGroupArray(int var1);

   int sizeOfFmlaGroupArray();

   void setFmlaGroupArray(String[] var1);

   void setFmlaGroupArray(int var1, String var2);

   void xsetFmlaGroupArray(XmlString[] var1);

   void xsetFmlaGroupArray(int var1, XmlString var2);

   void insertFmlaGroup(int var1, String var2);

   void addFmlaGroup(String var1);

   XmlString insertNewFmlaGroup(int var1);

   XmlString addNewFmlaGroup();

   void removeFmlaGroup(int var1);

   List getValList();

   BigInteger[] getValArray();

   BigInteger getValArray(int var1);

   List xgetValList();

   XmlInteger[] xgetValArray();

   XmlInteger xgetValArray(int var1);

   int sizeOfValArray();

   void setValArray(BigInteger[] var1);

   void setValArray(int var1, BigInteger var2);

   void xsetValArray(XmlInteger[] var1);

   void xsetValArray(int var1, XmlInteger var2);

   void insertVal(int var1, BigInteger var2);

   void addVal(BigInteger var1);

   XmlInteger insertNewVal(int var1);

   XmlInteger addNewVal();

   void removeVal(int var1);

   List getMinList();

   BigInteger[] getMinArray();

   BigInteger getMinArray(int var1);

   List xgetMinList();

   XmlInteger[] xgetMinArray();

   XmlInteger xgetMinArray(int var1);

   int sizeOfMinArray();

   void setMinArray(BigInteger[] var1);

   void setMinArray(int var1, BigInteger var2);

   void xsetMinArray(XmlInteger[] var1);

   void xsetMinArray(int var1, XmlInteger var2);

   void insertMin(int var1, BigInteger var2);

   void addMin(BigInteger var1);

   XmlInteger insertNewMin(int var1);

   XmlInteger addNewMin();

   void removeMin(int var1);

   List getMaxList();

   BigInteger[] getMaxArray();

   BigInteger getMaxArray(int var1);

   List xgetMaxList();

   XmlInteger[] xgetMaxArray();

   XmlInteger xgetMaxArray(int var1);

   int sizeOfMaxArray();

   void setMaxArray(BigInteger[] var1);

   void setMaxArray(int var1, BigInteger var2);

   void xsetMaxArray(XmlInteger[] var1);

   void xsetMaxArray(int var1, XmlInteger var2);

   void insertMax(int var1, BigInteger var2);

   void addMax(BigInteger var1);

   XmlInteger insertNewMax(int var1);

   XmlInteger addNewMax();

   void removeMax(int var1);

   List getIncList();

   BigInteger[] getIncArray();

   BigInteger getIncArray(int var1);

   List xgetIncList();

   XmlInteger[] xgetIncArray();

   XmlInteger xgetIncArray(int var1);

   int sizeOfIncArray();

   void setIncArray(BigInteger[] var1);

   void setIncArray(int var1, BigInteger var2);

   void xsetIncArray(XmlInteger[] var1);

   void xsetIncArray(int var1, XmlInteger var2);

   void insertInc(int var1, BigInteger var2);

   void addInc(BigInteger var1);

   XmlInteger insertNewInc(int var1);

   XmlInteger addNewInc();

   void removeInc(int var1);

   List getPageList();

   BigInteger[] getPageArray();

   BigInteger getPageArray(int var1);

   List xgetPageList();

   XmlInteger[] xgetPageArray();

   XmlInteger xgetPageArray(int var1);

   int sizeOfPageArray();

   void setPageArray(BigInteger[] var1);

   void setPageArray(int var1, BigInteger var2);

   void xsetPageArray(XmlInteger[] var1);

   void xsetPageArray(int var1, XmlInteger var2);

   void insertPage(int var1, BigInteger var2);

   void addPage(BigInteger var1);

   XmlInteger insertNewPage(int var1);

   XmlInteger addNewPage();

   void removePage(int var1);

   List getHorizList();

   STTrueFalseBlank.Enum[] getHorizArray();

   STTrueFalseBlank.Enum getHorizArray(int var1);

   List xgetHorizList();

   STTrueFalseBlank[] xgetHorizArray();

   STTrueFalseBlank xgetHorizArray(int var1);

   int sizeOfHorizArray();

   void setHorizArray(STTrueFalseBlank.Enum[] var1);

   void setHorizArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetHorizArray(STTrueFalseBlank[] var1);

   void xsetHorizArray(int var1, STTrueFalseBlank var2);

   void insertHoriz(int var1, STTrueFalseBlank.Enum var2);

   void addHoriz(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewHoriz(int var1);

   STTrueFalseBlank addNewHoriz();

   void removeHoriz(int var1);

   List getDxList();

   BigInteger[] getDxArray();

   BigInteger getDxArray(int var1);

   List xgetDxList();

   XmlInteger[] xgetDxArray();

   XmlInteger xgetDxArray(int var1);

   int sizeOfDxArray();

   void setDxArray(BigInteger[] var1);

   void setDxArray(int var1, BigInteger var2);

   void xsetDxArray(XmlInteger[] var1);

   void xsetDxArray(int var1, XmlInteger var2);

   void insertDx(int var1, BigInteger var2);

   void addDx(BigInteger var1);

   XmlInteger insertNewDx(int var1);

   XmlInteger addNewDx();

   void removeDx(int var1);

   List getMapOCXList();

   STTrueFalseBlank.Enum[] getMapOCXArray();

   STTrueFalseBlank.Enum getMapOCXArray(int var1);

   List xgetMapOCXList();

   STTrueFalseBlank[] xgetMapOCXArray();

   STTrueFalseBlank xgetMapOCXArray(int var1);

   int sizeOfMapOCXArray();

   void setMapOCXArray(STTrueFalseBlank.Enum[] var1);

   void setMapOCXArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetMapOCXArray(STTrueFalseBlank[] var1);

   void xsetMapOCXArray(int var1, STTrueFalseBlank var2);

   void insertMapOCX(int var1, STTrueFalseBlank.Enum var2);

   void addMapOCX(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewMapOCX(int var1);

   STTrueFalseBlank addNewMapOCX();

   void removeMapOCX(int var1);

   List getCFList();

   STCF$Enum[] getCFArray();

   STCF$Enum getCFArray(int var1);

   List xgetCFList();

   STCF[] xgetCFArray();

   STCF xgetCFArray(int var1);

   int sizeOfCFArray();

   void setCFArray(STCF$Enum[] var1);

   void setCFArray(int var1, STCF$Enum var2);

   void xsetCFArray(STCF[] var1);

   void xsetCFArray(int var1, STCF var2);

   void insertCF(int var1, STCF$Enum var2);

   void addCF(STCF$Enum var1);

   STCF insertNewCF(int var1);

   STCF addNewCF();

   void removeCF(int var1);

   List getCameraList();

   STTrueFalseBlank.Enum[] getCameraArray();

   STTrueFalseBlank.Enum getCameraArray(int var1);

   List xgetCameraList();

   STTrueFalseBlank[] xgetCameraArray();

   STTrueFalseBlank xgetCameraArray(int var1);

   int sizeOfCameraArray();

   void setCameraArray(STTrueFalseBlank.Enum[] var1);

   void setCameraArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetCameraArray(STTrueFalseBlank[] var1);

   void xsetCameraArray(int var1, STTrueFalseBlank var2);

   void insertCamera(int var1, STTrueFalseBlank.Enum var2);

   void addCamera(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewCamera(int var1);

   STTrueFalseBlank addNewCamera();

   void removeCamera(int var1);

   List getRecalcAlwaysList();

   STTrueFalseBlank.Enum[] getRecalcAlwaysArray();

   STTrueFalseBlank.Enum getRecalcAlwaysArray(int var1);

   List xgetRecalcAlwaysList();

   STTrueFalseBlank[] xgetRecalcAlwaysArray();

   STTrueFalseBlank xgetRecalcAlwaysArray(int var1);

   int sizeOfRecalcAlwaysArray();

   void setRecalcAlwaysArray(STTrueFalseBlank.Enum[] var1);

   void setRecalcAlwaysArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetRecalcAlwaysArray(STTrueFalseBlank[] var1);

   void xsetRecalcAlwaysArray(int var1, STTrueFalseBlank var2);

   void insertRecalcAlways(int var1, STTrueFalseBlank.Enum var2);

   void addRecalcAlways(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewRecalcAlways(int var1);

   STTrueFalseBlank addNewRecalcAlways();

   void removeRecalcAlways(int var1);

   List getAutoScaleList();

   STTrueFalseBlank.Enum[] getAutoScaleArray();

   STTrueFalseBlank.Enum getAutoScaleArray(int var1);

   List xgetAutoScaleList();

   STTrueFalseBlank[] xgetAutoScaleArray();

   STTrueFalseBlank xgetAutoScaleArray(int var1);

   int sizeOfAutoScaleArray();

   void setAutoScaleArray(STTrueFalseBlank.Enum[] var1);

   void setAutoScaleArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetAutoScaleArray(STTrueFalseBlank[] var1);

   void xsetAutoScaleArray(int var1, STTrueFalseBlank var2);

   void insertAutoScale(int var1, STTrueFalseBlank.Enum var2);

   void addAutoScale(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewAutoScale(int var1);

   STTrueFalseBlank addNewAutoScale();

   void removeAutoScale(int var1);

   List getDDEList();

   STTrueFalseBlank.Enum[] getDDEArray();

   STTrueFalseBlank.Enum getDDEArray(int var1);

   List xgetDDEList();

   STTrueFalseBlank[] xgetDDEArray();

   STTrueFalseBlank xgetDDEArray(int var1);

   int sizeOfDDEArray();

   void setDDEArray(STTrueFalseBlank.Enum[] var1);

   void setDDEArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetDDEArray(STTrueFalseBlank[] var1);

   void xsetDDEArray(int var1, STTrueFalseBlank var2);

   void insertDDE(int var1, STTrueFalseBlank.Enum var2);

   void addDDE(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewDDE(int var1);

   STTrueFalseBlank addNewDDE();

   void removeDDE(int var1);

   List getUIObjList();

   STTrueFalseBlank.Enum[] getUIObjArray();

   STTrueFalseBlank.Enum getUIObjArray(int var1);

   List xgetUIObjList();

   STTrueFalseBlank[] xgetUIObjArray();

   STTrueFalseBlank xgetUIObjArray(int var1);

   int sizeOfUIObjArray();

   void setUIObjArray(STTrueFalseBlank.Enum[] var1);

   void setUIObjArray(int var1, STTrueFalseBlank.Enum var2);

   void xsetUIObjArray(STTrueFalseBlank[] var1);

   void xsetUIObjArray(int var1, STTrueFalseBlank var2);

   void insertUIObj(int var1, STTrueFalseBlank.Enum var2);

   void addUIObj(STTrueFalseBlank.Enum var1);

   STTrueFalseBlank insertNewUIObj(int var1);

   STTrueFalseBlank addNewUIObj();

   void removeUIObj(int var1);

   List getScriptTextList();

   String[] getScriptTextArray();

   String getScriptTextArray(int var1);

   List xgetScriptTextList();

   XmlString[] xgetScriptTextArray();

   XmlString xgetScriptTextArray(int var1);

   int sizeOfScriptTextArray();

   void setScriptTextArray(String[] var1);

   void setScriptTextArray(int var1, String var2);

   void xsetScriptTextArray(XmlString[] var1);

   void xsetScriptTextArray(int var1, XmlString var2);

   void insertScriptText(int var1, String var2);

   void addScriptText(String var1);

   XmlString insertNewScriptText(int var1);

   XmlString addNewScriptText();

   void removeScriptText(int var1);

   List getScriptExtendedList();

   String[] getScriptExtendedArray();

   String getScriptExtendedArray(int var1);

   List xgetScriptExtendedList();

   XmlString[] xgetScriptExtendedArray();

   XmlString xgetScriptExtendedArray(int var1);

   int sizeOfScriptExtendedArray();

   void setScriptExtendedArray(String[] var1);

   void setScriptExtendedArray(int var1, String var2);

   void xsetScriptExtendedArray(XmlString[] var1);

   void xsetScriptExtendedArray(int var1, XmlString var2);

   void insertScriptExtended(int var1, String var2);

   void addScriptExtended(String var1);

   XmlString insertNewScriptExtended(int var1);

   XmlString addNewScriptExtended();

   void removeScriptExtended(int var1);

   List getScriptLanguageList();

   BigInteger[] getScriptLanguageArray();

   BigInteger getScriptLanguageArray(int var1);

   List xgetScriptLanguageList();

   XmlNonNegativeInteger[] xgetScriptLanguageArray();

   XmlNonNegativeInteger xgetScriptLanguageArray(int var1);

   int sizeOfScriptLanguageArray();

   void setScriptLanguageArray(BigInteger[] var1);

   void setScriptLanguageArray(int var1, BigInteger var2);

   void xsetScriptLanguageArray(XmlNonNegativeInteger[] var1);

   void xsetScriptLanguageArray(int var1, XmlNonNegativeInteger var2);

   void insertScriptLanguage(int var1, BigInteger var2);

   void addScriptLanguage(BigInteger var1);

   XmlNonNegativeInteger insertNewScriptLanguage(int var1);

   XmlNonNegativeInteger addNewScriptLanguage();

   void removeScriptLanguage(int var1);

   List getScriptLocationList();

   BigInteger[] getScriptLocationArray();

   BigInteger getScriptLocationArray(int var1);

   List xgetScriptLocationList();

   XmlNonNegativeInteger[] xgetScriptLocationArray();

   XmlNonNegativeInteger xgetScriptLocationArray(int var1);

   int sizeOfScriptLocationArray();

   void setScriptLocationArray(BigInteger[] var1);

   void setScriptLocationArray(int var1, BigInteger var2);

   void xsetScriptLocationArray(XmlNonNegativeInteger[] var1);

   void xsetScriptLocationArray(int var1, XmlNonNegativeInteger var2);

   void insertScriptLocation(int var1, BigInteger var2);

   void addScriptLocation(BigInteger var1);

   XmlNonNegativeInteger insertNewScriptLocation(int var1);

   XmlNonNegativeInteger addNewScriptLocation();

   void removeScriptLocation(int var1);

   List getFmlaTxbxList();

   String[] getFmlaTxbxArray();

   String getFmlaTxbxArray(int var1);

   List xgetFmlaTxbxList();

   XmlString[] xgetFmlaTxbxArray();

   XmlString xgetFmlaTxbxArray(int var1);

   int sizeOfFmlaTxbxArray();

   void setFmlaTxbxArray(String[] var1);

   void setFmlaTxbxArray(int var1, String var2);

   void xsetFmlaTxbxArray(XmlString[] var1);

   void xsetFmlaTxbxArray(int var1, XmlString var2);

   void insertFmlaTxbx(int var1, String var2);

   void addFmlaTxbx(String var1);

   XmlString insertNewFmlaTxbx(int var1);

   XmlString addNewFmlaTxbx();

   void removeFmlaTxbx(int var1);

   STObjectType.Enum getObjectType();

   STObjectType xgetObjectType();

   void setObjectType(STObjectType.Enum var1);

   void xsetObjectType(STObjectType var1);


   public static final class Factory {

      public static CTClientData newInstance() {
         return (CTClientData)POIXMLTypeLoader.newInstance(CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData newInstance(XmlOptions var0) {
         return (CTClientData)POIXMLTypeLoader.newInstance(CTClientData.type, var0);
      }

      public static CTClientData parse(String var0) throws XmlException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData parse(String var0, XmlOptions var1) throws XmlException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, var1);
      }

      public static CTClientData parse(File var0) throws XmlException, IOException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, var1);
      }

      public static CTClientData parse(URL var0) throws XmlException, IOException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, var1);
      }

      public static CTClientData parse(InputStream var0) throws XmlException, IOException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, var1);
      }

      public static CTClientData parse(Reader var0) throws XmlException, IOException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, var1);
      }

      public static CTClientData parse(XMLStreamReader var0) throws XmlException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, var1);
      }

      public static CTClientData parse(Node var0) throws XmlException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, var1);
      }

      public static CTClientData parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, (XmlOptions)null);
      }

      public static CTClientData parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTClientData)POIXMLTypeLoader.parse(var0, CTClientData.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTClientData.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTClientData.type, var1);
      }

   }
}
