package org.openxmlformats.schemas.drawingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTComplementTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFixedPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGammaTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTInverseGammaTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTInverseTransform;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedAngle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveFixedPercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.CTPositivePercentage;
import org.openxmlformats.schemas.drawingml.x2006.main.STPercentage;
import org.w3c.dom.Node;

public interface CTScRgbColor extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTScRgbColor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctscrgbcolorf3e1type");


   List getTintList();

   CTPositiveFixedPercentage[] getTintArray();

   CTPositiveFixedPercentage getTintArray(int var1);

   int sizeOfTintArray();

   void setTintArray(CTPositiveFixedPercentage[] var1);

   void setTintArray(int var1, CTPositiveFixedPercentage var2);

   CTPositiveFixedPercentage insertNewTint(int var1);

   CTPositiveFixedPercentage addNewTint();

   void removeTint(int var1);

   List getShadeList();

   CTPositiveFixedPercentage[] getShadeArray();

   CTPositiveFixedPercentage getShadeArray(int var1);

   int sizeOfShadeArray();

   void setShadeArray(CTPositiveFixedPercentage[] var1);

   void setShadeArray(int var1, CTPositiveFixedPercentage var2);

   CTPositiveFixedPercentage insertNewShade(int var1);

   CTPositiveFixedPercentage addNewShade();

   void removeShade(int var1);

   List getCompList();

   CTComplementTransform[] getCompArray();

   CTComplementTransform getCompArray(int var1);

   int sizeOfCompArray();

   void setCompArray(CTComplementTransform[] var1);

   void setCompArray(int var1, CTComplementTransform var2);

   CTComplementTransform insertNewComp(int var1);

   CTComplementTransform addNewComp();

   void removeComp(int var1);

   List getInvList();

   CTInverseTransform[] getInvArray();

   CTInverseTransform getInvArray(int var1);

   int sizeOfInvArray();

   void setInvArray(CTInverseTransform[] var1);

   void setInvArray(int var1, CTInverseTransform var2);

   CTInverseTransform insertNewInv(int var1);

   CTInverseTransform addNewInv();

   void removeInv(int var1);

   List getGrayList();

   CTGrayscaleTransform[] getGrayArray();

   CTGrayscaleTransform getGrayArray(int var1);

   int sizeOfGrayArray();

   void setGrayArray(CTGrayscaleTransform[] var1);

   void setGrayArray(int var1, CTGrayscaleTransform var2);

   CTGrayscaleTransform insertNewGray(int var1);

   CTGrayscaleTransform addNewGray();

   void removeGray(int var1);

   List getAlphaList();

   CTPositiveFixedPercentage[] getAlphaArray();

   CTPositiveFixedPercentage getAlphaArray(int var1);

   int sizeOfAlphaArray();

   void setAlphaArray(CTPositiveFixedPercentage[] var1);

   void setAlphaArray(int var1, CTPositiveFixedPercentage var2);

   CTPositiveFixedPercentage insertNewAlpha(int var1);

   CTPositiveFixedPercentage addNewAlpha();

   void removeAlpha(int var1);

   List getAlphaOffList();

   CTFixedPercentage[] getAlphaOffArray();

   CTFixedPercentage getAlphaOffArray(int var1);

   int sizeOfAlphaOffArray();

   void setAlphaOffArray(CTFixedPercentage[] var1);

   void setAlphaOffArray(int var1, CTFixedPercentage var2);

   CTFixedPercentage insertNewAlphaOff(int var1);

   CTFixedPercentage addNewAlphaOff();

   void removeAlphaOff(int var1);

   List getAlphaModList();

   CTPositivePercentage[] getAlphaModArray();

   CTPositivePercentage getAlphaModArray(int var1);

   int sizeOfAlphaModArray();

   void setAlphaModArray(CTPositivePercentage[] var1);

   void setAlphaModArray(int var1, CTPositivePercentage var2);

   CTPositivePercentage insertNewAlphaMod(int var1);

   CTPositivePercentage addNewAlphaMod();

   void removeAlphaMod(int var1);

   List getHueList();

   CTPositiveFixedAngle[] getHueArray();

   CTPositiveFixedAngle getHueArray(int var1);

   int sizeOfHueArray();

   void setHueArray(CTPositiveFixedAngle[] var1);

   void setHueArray(int var1, CTPositiveFixedAngle var2);

   CTPositiveFixedAngle insertNewHue(int var1);

   CTPositiveFixedAngle addNewHue();

   void removeHue(int var1);

   List getHueOffList();

   CTAngle[] getHueOffArray();

   CTAngle getHueOffArray(int var1);

   int sizeOfHueOffArray();

   void setHueOffArray(CTAngle[] var1);

   void setHueOffArray(int var1, CTAngle var2);

   CTAngle insertNewHueOff(int var1);

   CTAngle addNewHueOff();

   void removeHueOff(int var1);

   List getHueModList();

   CTPositivePercentage[] getHueModArray();

   CTPositivePercentage getHueModArray(int var1);

   int sizeOfHueModArray();

   void setHueModArray(CTPositivePercentage[] var1);

   void setHueModArray(int var1, CTPositivePercentage var2);

   CTPositivePercentage insertNewHueMod(int var1);

   CTPositivePercentage addNewHueMod();

   void removeHueMod(int var1);

   List getSatList();

   CTPercentage[] getSatArray();

   CTPercentage getSatArray(int var1);

   int sizeOfSatArray();

   void setSatArray(CTPercentage[] var1);

   void setSatArray(int var1, CTPercentage var2);

   CTPercentage insertNewSat(int var1);

   CTPercentage addNewSat();

   void removeSat(int var1);

   List getSatOffList();

   CTPercentage[] getSatOffArray();

   CTPercentage getSatOffArray(int var1);

   int sizeOfSatOffArray();

   void setSatOffArray(CTPercentage[] var1);

   void setSatOffArray(int var1, CTPercentage var2);

   CTPercentage insertNewSatOff(int var1);

   CTPercentage addNewSatOff();

   void removeSatOff(int var1);

   List getSatModList();

   CTPercentage[] getSatModArray();

   CTPercentage getSatModArray(int var1);

   int sizeOfSatModArray();

   void setSatModArray(CTPercentage[] var1);

   void setSatModArray(int var1, CTPercentage var2);

   CTPercentage insertNewSatMod(int var1);

   CTPercentage addNewSatMod();

   void removeSatMod(int var1);

   List getLumList();

   CTPercentage[] getLumArray();

   CTPercentage getLumArray(int var1);

   int sizeOfLumArray();

   void setLumArray(CTPercentage[] var1);

   void setLumArray(int var1, CTPercentage var2);

   CTPercentage insertNewLum(int var1);

   CTPercentage addNewLum();

   void removeLum(int var1);

   List getLumOffList();

   CTPercentage[] getLumOffArray();

   CTPercentage getLumOffArray(int var1);

   int sizeOfLumOffArray();

   void setLumOffArray(CTPercentage[] var1);

   void setLumOffArray(int var1, CTPercentage var2);

   CTPercentage insertNewLumOff(int var1);

   CTPercentage addNewLumOff();

   void removeLumOff(int var1);

   List getLumModList();

   CTPercentage[] getLumModArray();

   CTPercentage getLumModArray(int var1);

   int sizeOfLumModArray();

   void setLumModArray(CTPercentage[] var1);

   void setLumModArray(int var1, CTPercentage var2);

   CTPercentage insertNewLumMod(int var1);

   CTPercentage addNewLumMod();

   void removeLumMod(int var1);

   List getRedList();

   CTPercentage[] getRedArray();

   CTPercentage getRedArray(int var1);

   int sizeOfRedArray();

   void setRedArray(CTPercentage[] var1);

   void setRedArray(int var1, CTPercentage var2);

   CTPercentage insertNewRed(int var1);

   CTPercentage addNewRed();

   void removeRed(int var1);

   List getRedOffList();

   CTPercentage[] getRedOffArray();

   CTPercentage getRedOffArray(int var1);

   int sizeOfRedOffArray();

   void setRedOffArray(CTPercentage[] var1);

   void setRedOffArray(int var1, CTPercentage var2);

   CTPercentage insertNewRedOff(int var1);

   CTPercentage addNewRedOff();

   void removeRedOff(int var1);

   List getRedModList();

   CTPercentage[] getRedModArray();

   CTPercentage getRedModArray(int var1);

   int sizeOfRedModArray();

   void setRedModArray(CTPercentage[] var1);

   void setRedModArray(int var1, CTPercentage var2);

   CTPercentage insertNewRedMod(int var1);

   CTPercentage addNewRedMod();

   void removeRedMod(int var1);

   List getGreenList();

   CTPercentage[] getGreenArray();

   CTPercentage getGreenArray(int var1);

   int sizeOfGreenArray();

   void setGreenArray(CTPercentage[] var1);

   void setGreenArray(int var1, CTPercentage var2);

   CTPercentage insertNewGreen(int var1);

   CTPercentage addNewGreen();

   void removeGreen(int var1);

   List getGreenOffList();

   CTPercentage[] getGreenOffArray();

   CTPercentage getGreenOffArray(int var1);

   int sizeOfGreenOffArray();

   void setGreenOffArray(CTPercentage[] var1);

   void setGreenOffArray(int var1, CTPercentage var2);

   CTPercentage insertNewGreenOff(int var1);

   CTPercentage addNewGreenOff();

   void removeGreenOff(int var1);

   List getGreenModList();

   CTPercentage[] getGreenModArray();

   CTPercentage getGreenModArray(int var1);

   int sizeOfGreenModArray();

   void setGreenModArray(CTPercentage[] var1);

   void setGreenModArray(int var1, CTPercentage var2);

   CTPercentage insertNewGreenMod(int var1);

   CTPercentage addNewGreenMod();

   void removeGreenMod(int var1);

   List getBlueList();

   CTPercentage[] getBlueArray();

   CTPercentage getBlueArray(int var1);

   int sizeOfBlueArray();

   void setBlueArray(CTPercentage[] var1);

   void setBlueArray(int var1, CTPercentage var2);

   CTPercentage insertNewBlue(int var1);

   CTPercentage addNewBlue();

   void removeBlue(int var1);

   List getBlueOffList();

   CTPercentage[] getBlueOffArray();

   CTPercentage getBlueOffArray(int var1);

   int sizeOfBlueOffArray();

   void setBlueOffArray(CTPercentage[] var1);

   void setBlueOffArray(int var1, CTPercentage var2);

   CTPercentage insertNewBlueOff(int var1);

   CTPercentage addNewBlueOff();

   void removeBlueOff(int var1);

   List getBlueModList();

   CTPercentage[] getBlueModArray();

   CTPercentage getBlueModArray(int var1);

   int sizeOfBlueModArray();

   void setBlueModArray(CTPercentage[] var1);

   void setBlueModArray(int var1, CTPercentage var2);

   CTPercentage insertNewBlueMod(int var1);

   CTPercentage addNewBlueMod();

   void removeBlueMod(int var1);

   List getGammaList();

   CTGammaTransform[] getGammaArray();

   CTGammaTransform getGammaArray(int var1);

   int sizeOfGammaArray();

   void setGammaArray(CTGammaTransform[] var1);

   void setGammaArray(int var1, CTGammaTransform var2);

   CTGammaTransform insertNewGamma(int var1);

   CTGammaTransform addNewGamma();

   void removeGamma(int var1);

   List getInvGammaList();

   CTInverseGammaTransform[] getInvGammaArray();

   CTInverseGammaTransform getInvGammaArray(int var1);

   int sizeOfInvGammaArray();

   void setInvGammaArray(CTInverseGammaTransform[] var1);

   void setInvGammaArray(int var1, CTInverseGammaTransform var2);

   CTInverseGammaTransform insertNewInvGamma(int var1);

   CTInverseGammaTransform addNewInvGamma();

   void removeInvGamma(int var1);

   int getR();

   STPercentage xgetR();

   void setR(int var1);

   void xsetR(STPercentage var1);

   int getG();

   STPercentage xgetG();

   void setG(int var1);

   void xsetG(STPercentage var1);

   int getB();

   STPercentage xgetB();

   void setB(int var1);

   void xsetB(STPercentage var1);


   public static final class Factory {

      public static CTScRgbColor newInstance() {
         return (CTScRgbColor)POIXMLTypeLoader.newInstance(CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor newInstance(XmlOptions var0) {
         return (CTScRgbColor)POIXMLTypeLoader.newInstance(CTScRgbColor.type, var0);
      }

      public static CTScRgbColor parse(String var0) throws XmlException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor parse(String var0, XmlOptions var1) throws XmlException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, var1);
      }

      public static CTScRgbColor parse(File var0) throws XmlException, IOException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, var1);
      }

      public static CTScRgbColor parse(URL var0) throws XmlException, IOException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, var1);
      }

      public static CTScRgbColor parse(InputStream var0) throws XmlException, IOException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, var1);
      }

      public static CTScRgbColor parse(Reader var0) throws XmlException, IOException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, var1);
      }

      public static CTScRgbColor parse(XMLStreamReader var0) throws XmlException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, var1);
      }

      public static CTScRgbColor parse(Node var0) throws XmlException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, var1);
      }

      public static CTScRgbColor parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static CTScRgbColor parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTScRgbColor)POIXMLTypeLoader.parse(var0, CTScRgbColor.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTScRgbColor.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTScRgbColor.type, var1);
      }

   }
}
