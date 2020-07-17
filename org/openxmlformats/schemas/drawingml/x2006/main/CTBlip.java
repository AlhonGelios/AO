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
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaBiLevelEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaCeilingEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaFloorEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaInverseEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaModulateFixedEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTAlphaReplaceEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBiLevelEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTBlurEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorChangeEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTColorReplaceEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTDuotoneEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTFillOverlayEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGrayscaleEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTHSLEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLuminanceEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.CTOfficeArtExtensionList;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTintEffect;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression;
import org.openxmlformats.schemas.drawingml.x2006.main.STBlipCompression$Enum;
import org.openxmlformats.schemas.officeDocument.x2006.relationships.STRelationshipId;
import org.w3c.dom.Node;

public interface CTBlip extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTBlip.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctblip034ctype");


   List getAlphaBiLevelList();

   CTAlphaBiLevelEffect[] getAlphaBiLevelArray();

   CTAlphaBiLevelEffect getAlphaBiLevelArray(int var1);

   int sizeOfAlphaBiLevelArray();

   void setAlphaBiLevelArray(CTAlphaBiLevelEffect[] var1);

   void setAlphaBiLevelArray(int var1, CTAlphaBiLevelEffect var2);

   CTAlphaBiLevelEffect insertNewAlphaBiLevel(int var1);

   CTAlphaBiLevelEffect addNewAlphaBiLevel();

   void removeAlphaBiLevel(int var1);

   List getAlphaCeilingList();

   CTAlphaCeilingEffect[] getAlphaCeilingArray();

   CTAlphaCeilingEffect getAlphaCeilingArray(int var1);

   int sizeOfAlphaCeilingArray();

   void setAlphaCeilingArray(CTAlphaCeilingEffect[] var1);

   void setAlphaCeilingArray(int var1, CTAlphaCeilingEffect var2);

   CTAlphaCeilingEffect insertNewAlphaCeiling(int var1);

   CTAlphaCeilingEffect addNewAlphaCeiling();

   void removeAlphaCeiling(int var1);

   List getAlphaFloorList();

   CTAlphaFloorEffect[] getAlphaFloorArray();

   CTAlphaFloorEffect getAlphaFloorArray(int var1);

   int sizeOfAlphaFloorArray();

   void setAlphaFloorArray(CTAlphaFloorEffect[] var1);

   void setAlphaFloorArray(int var1, CTAlphaFloorEffect var2);

   CTAlphaFloorEffect insertNewAlphaFloor(int var1);

   CTAlphaFloorEffect addNewAlphaFloor();

   void removeAlphaFloor(int var1);

   List getAlphaInvList();

   CTAlphaInverseEffect[] getAlphaInvArray();

   CTAlphaInverseEffect getAlphaInvArray(int var1);

   int sizeOfAlphaInvArray();

   void setAlphaInvArray(CTAlphaInverseEffect[] var1);

   void setAlphaInvArray(int var1, CTAlphaInverseEffect var2);

   CTAlphaInverseEffect insertNewAlphaInv(int var1);

   CTAlphaInverseEffect addNewAlphaInv();

   void removeAlphaInv(int var1);

   List getAlphaModList();

   CTAlphaModulateEffect[] getAlphaModArray();

   CTAlphaModulateEffect getAlphaModArray(int var1);

   int sizeOfAlphaModArray();

   void setAlphaModArray(CTAlphaModulateEffect[] var1);

   void setAlphaModArray(int var1, CTAlphaModulateEffect var2);

   CTAlphaModulateEffect insertNewAlphaMod(int var1);

   CTAlphaModulateEffect addNewAlphaMod();

   void removeAlphaMod(int var1);

   List getAlphaModFixList();

   CTAlphaModulateFixedEffect[] getAlphaModFixArray();

   CTAlphaModulateFixedEffect getAlphaModFixArray(int var1);

   int sizeOfAlphaModFixArray();

   void setAlphaModFixArray(CTAlphaModulateFixedEffect[] var1);

   void setAlphaModFixArray(int var1, CTAlphaModulateFixedEffect var2);

   CTAlphaModulateFixedEffect insertNewAlphaModFix(int var1);

   CTAlphaModulateFixedEffect addNewAlphaModFix();

   void removeAlphaModFix(int var1);

   List getAlphaReplList();

   CTAlphaReplaceEffect[] getAlphaReplArray();

   CTAlphaReplaceEffect getAlphaReplArray(int var1);

   int sizeOfAlphaReplArray();

   void setAlphaReplArray(CTAlphaReplaceEffect[] var1);

   void setAlphaReplArray(int var1, CTAlphaReplaceEffect var2);

   CTAlphaReplaceEffect insertNewAlphaRepl(int var1);

   CTAlphaReplaceEffect addNewAlphaRepl();

   void removeAlphaRepl(int var1);

   List getBiLevelList();

   CTBiLevelEffect[] getBiLevelArray();

   CTBiLevelEffect getBiLevelArray(int var1);

   int sizeOfBiLevelArray();

   void setBiLevelArray(CTBiLevelEffect[] var1);

   void setBiLevelArray(int var1, CTBiLevelEffect var2);

   CTBiLevelEffect insertNewBiLevel(int var1);

   CTBiLevelEffect addNewBiLevel();

   void removeBiLevel(int var1);

   List getBlurList();

   CTBlurEffect[] getBlurArray();

   CTBlurEffect getBlurArray(int var1);

   int sizeOfBlurArray();

   void setBlurArray(CTBlurEffect[] var1);

   void setBlurArray(int var1, CTBlurEffect var2);

   CTBlurEffect insertNewBlur(int var1);

   CTBlurEffect addNewBlur();

   void removeBlur(int var1);

   List getClrChangeList();

   CTColorChangeEffect[] getClrChangeArray();

   CTColorChangeEffect getClrChangeArray(int var1);

   int sizeOfClrChangeArray();

   void setClrChangeArray(CTColorChangeEffect[] var1);

   void setClrChangeArray(int var1, CTColorChangeEffect var2);

   CTColorChangeEffect insertNewClrChange(int var1);

   CTColorChangeEffect addNewClrChange();

   void removeClrChange(int var1);

   List getClrReplList();

   CTColorReplaceEffect[] getClrReplArray();

   CTColorReplaceEffect getClrReplArray(int var1);

   int sizeOfClrReplArray();

   void setClrReplArray(CTColorReplaceEffect[] var1);

   void setClrReplArray(int var1, CTColorReplaceEffect var2);

   CTColorReplaceEffect insertNewClrRepl(int var1);

   CTColorReplaceEffect addNewClrRepl();

   void removeClrRepl(int var1);

   List getDuotoneList();

   CTDuotoneEffect[] getDuotoneArray();

   CTDuotoneEffect getDuotoneArray(int var1);

   int sizeOfDuotoneArray();

   void setDuotoneArray(CTDuotoneEffect[] var1);

   void setDuotoneArray(int var1, CTDuotoneEffect var2);

   CTDuotoneEffect insertNewDuotone(int var1);

   CTDuotoneEffect addNewDuotone();

   void removeDuotone(int var1);

   List getFillOverlayList();

   CTFillOverlayEffect[] getFillOverlayArray();

   CTFillOverlayEffect getFillOverlayArray(int var1);

   int sizeOfFillOverlayArray();

   void setFillOverlayArray(CTFillOverlayEffect[] var1);

   void setFillOverlayArray(int var1, CTFillOverlayEffect var2);

   CTFillOverlayEffect insertNewFillOverlay(int var1);

   CTFillOverlayEffect addNewFillOverlay();

   void removeFillOverlay(int var1);

   List getGraysclList();

   CTGrayscaleEffect[] getGraysclArray();

   CTGrayscaleEffect getGraysclArray(int var1);

   int sizeOfGraysclArray();

   void setGraysclArray(CTGrayscaleEffect[] var1);

   void setGraysclArray(int var1, CTGrayscaleEffect var2);

   CTGrayscaleEffect insertNewGrayscl(int var1);

   CTGrayscaleEffect addNewGrayscl();

   void removeGrayscl(int var1);

   List getHslList();

   CTHSLEffect[] getHslArray();

   CTHSLEffect getHslArray(int var1);

   int sizeOfHslArray();

   void setHslArray(CTHSLEffect[] var1);

   void setHslArray(int var1, CTHSLEffect var2);

   CTHSLEffect insertNewHsl(int var1);

   CTHSLEffect addNewHsl();

   void removeHsl(int var1);

   List getLumList();

   CTLuminanceEffect[] getLumArray();

   CTLuminanceEffect getLumArray(int var1);

   int sizeOfLumArray();

   void setLumArray(CTLuminanceEffect[] var1);

   void setLumArray(int var1, CTLuminanceEffect var2);

   CTLuminanceEffect insertNewLum(int var1);

   CTLuminanceEffect addNewLum();

   void removeLum(int var1);

   List getTintList();

   CTTintEffect[] getTintArray();

   CTTintEffect getTintArray(int var1);

   int sizeOfTintArray();

   void setTintArray(CTTintEffect[] var1);

   void setTintArray(int var1, CTTintEffect var2);

   CTTintEffect insertNewTint(int var1);

   CTTintEffect addNewTint();

   void removeTint(int var1);

   CTOfficeArtExtensionList getExtLst();

   boolean isSetExtLst();

   void setExtLst(CTOfficeArtExtensionList var1);

   CTOfficeArtExtensionList addNewExtLst();

   void unsetExtLst();

   String getEmbed();

   STRelationshipId xgetEmbed();

   boolean isSetEmbed();

   void setEmbed(String var1);

   void xsetEmbed(STRelationshipId var1);

   void unsetEmbed();

   String getLink();

   STRelationshipId xgetLink();

   boolean isSetLink();

   void setLink(String var1);

   void xsetLink(STRelationshipId var1);

   void unsetLink();

   STBlipCompression$Enum getCstate();

   STBlipCompression xgetCstate();

   boolean isSetCstate();

   void setCstate(STBlipCompression$Enum var1);

   void xsetCstate(STBlipCompression var1);

   void unsetCstate();


   public static final class Factory {

      public static CTBlip newInstance() {
         return (CTBlip)POIXMLTypeLoader.newInstance(CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip newInstance(XmlOptions var0) {
         return (CTBlip)POIXMLTypeLoader.newInstance(CTBlip.type, var0);
      }

      public static CTBlip parse(String var0) throws XmlException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip parse(String var0, XmlOptions var1) throws XmlException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, var1);
      }

      public static CTBlip parse(File var0) throws XmlException, IOException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, var1);
      }

      public static CTBlip parse(URL var0) throws XmlException, IOException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, var1);
      }

      public static CTBlip parse(InputStream var0) throws XmlException, IOException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, var1);
      }

      public static CTBlip parse(Reader var0) throws XmlException, IOException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, var1);
      }

      public static CTBlip parse(XMLStreamReader var0) throws XmlException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, var1);
      }

      public static CTBlip parse(Node var0) throws XmlException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, var1);
      }

      public static CTBlip parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, (XmlOptions)null);
      }

      public static CTBlip parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTBlip)POIXMLTypeLoader.parse(var0, CTBlip.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBlip.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTBlip.type, var1);
      }

   }
}
