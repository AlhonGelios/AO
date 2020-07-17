package org.apache.poi.sl.draw.binding;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.apache.poi.sl.draw.binding.CTAdjPoint2D;
import org.apache.poi.sl.draw.binding.CTAdjustHandleList;
import org.apache.poi.sl.draw.binding.CTAngle;
import org.apache.poi.sl.draw.binding.CTColor;
import org.apache.poi.sl.draw.binding.CTColorMRU;
import org.apache.poi.sl.draw.binding.CTComplementTransform;
import org.apache.poi.sl.draw.binding.CTConnection;
import org.apache.poi.sl.draw.binding.CTConnectionSite;
import org.apache.poi.sl.draw.binding.CTConnectionSiteList;
import org.apache.poi.sl.draw.binding.CTCustomGeometry2D;
import org.apache.poi.sl.draw.binding.CTEmbeddedWAVAudioFile;
import org.apache.poi.sl.draw.binding.CTFixedPercentage;
import org.apache.poi.sl.draw.binding.CTGammaTransform;
import org.apache.poi.sl.draw.binding.CTGeomGuide;
import org.apache.poi.sl.draw.binding.CTGeomGuideList;
import org.apache.poi.sl.draw.binding.CTGeomRect;
import org.apache.poi.sl.draw.binding.CTGrayscaleTransform;
import org.apache.poi.sl.draw.binding.CTGroupTransform2D;
import org.apache.poi.sl.draw.binding.CTHslColor;
import org.apache.poi.sl.draw.binding.CTHyperlink;
import org.apache.poi.sl.draw.binding.CTInverseGammaTransform;
import org.apache.poi.sl.draw.binding.CTInverseTransform;
import org.apache.poi.sl.draw.binding.CTOfficeArtExtension;
import org.apache.poi.sl.draw.binding.CTOfficeArtExtensionList;
import org.apache.poi.sl.draw.binding.CTPath2D;
import org.apache.poi.sl.draw.binding.CTPath2DArcTo;
import org.apache.poi.sl.draw.binding.CTPath2DClose;
import org.apache.poi.sl.draw.binding.CTPath2DCubicBezierTo;
import org.apache.poi.sl.draw.binding.CTPath2DLineTo;
import org.apache.poi.sl.draw.binding.CTPath2DList;
import org.apache.poi.sl.draw.binding.CTPath2DMoveTo;
import org.apache.poi.sl.draw.binding.CTPath2DQuadBezierTo;
import org.apache.poi.sl.draw.binding.CTPercentage;
import org.apache.poi.sl.draw.binding.CTPoint2D;
import org.apache.poi.sl.draw.binding.CTPoint3D;
import org.apache.poi.sl.draw.binding.CTPolarAdjustHandle;
import org.apache.poi.sl.draw.binding.CTPositiveFixedAngle;
import org.apache.poi.sl.draw.binding.CTPositiveFixedPercentage;
import org.apache.poi.sl.draw.binding.CTPositivePercentage;
import org.apache.poi.sl.draw.binding.CTPositiveSize2D;
import org.apache.poi.sl.draw.binding.CTPresetColor;
import org.apache.poi.sl.draw.binding.CTPresetGeometry2D;
import org.apache.poi.sl.draw.binding.CTPresetTextShape;
import org.apache.poi.sl.draw.binding.CTRatio;
import org.apache.poi.sl.draw.binding.CTRelativeRect;
import org.apache.poi.sl.draw.binding.CTSRgbColor;
import org.apache.poi.sl.draw.binding.CTScRgbColor;
import org.apache.poi.sl.draw.binding.CTScale2D;
import org.apache.poi.sl.draw.binding.CTSchemeColor;
import org.apache.poi.sl.draw.binding.CTSphereCoords;
import org.apache.poi.sl.draw.binding.CTSystemColor;
import org.apache.poi.sl.draw.binding.CTTransform2D;
import org.apache.poi.sl.draw.binding.CTVector3D;
import org.apache.poi.sl.draw.binding.CTXYAdjustHandle;

@XmlRegistry
public class ObjectFactory {

   private static final QName _CTSRgbColorAlpha_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alpha");
   private static final QName _CTSRgbColorLum_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lum");
   private static final QName _CTSRgbColorGamma_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gamma");
   private static final QName _CTSRgbColorInvGamma_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "invGamma");
   private static final QName _CTSRgbColorRedOff_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "redOff");
   private static final QName _CTSRgbColorAlphaMod_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaMod");
   private static final QName _CTSRgbColorAlphaOff_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "alphaOff");
   private static final QName _CTSRgbColorGreenOff_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "greenOff");
   private static final QName _CTSRgbColorRedMod_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "redMod");
   private static final QName _CTSRgbColorHue_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hue");
   private static final QName _CTSRgbColorSatOff_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "satOff");
   private static final QName _CTSRgbColorGreenMod_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "greenMod");
   private static final QName _CTSRgbColorSat_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "sat");
   private static final QName _CTSRgbColorBlue_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blue");
   private static final QName _CTSRgbColorRed_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "red");
   private static final QName _CTSRgbColorSatMod_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "satMod");
   private static final QName _CTSRgbColorHueOff_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hueOff");
   private static final QName _CTSRgbColorBlueMod_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blueMod");
   private static final QName _CTSRgbColorShade_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "shade");
   private static final QName _CTSRgbColorLumMod_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lumMod");
   private static final QName _CTSRgbColorInv_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "inv");
   private static final QName _CTSRgbColorLumOff_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "lumOff");
   private static final QName _CTSRgbColorTint_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "tint");
   private static final QName _CTSRgbColorGreen_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "green");
   private static final QName _CTSRgbColorComp_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "comp");
   private static final QName _CTSRgbColorBlueOff_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "blueOff");
   private static final QName _CTSRgbColorHueMod_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "hueMod");
   private static final QName _CTSRgbColorGray_QNAME = new QName("http://schemas.openxmlformats.org/drawingml/2006/main", "gray");


   public CTPositiveSize2D createCTPositiveSize2D() {
      return new CTPositiveSize2D();
   }

   public CTSphereCoords createCTSphereCoords() {
      return new CTSphereCoords();
   }

   public CTPositivePercentage createCTPositivePercentage() {
      return new CTPositivePercentage();
   }

   public CTAdjPoint2D createCTAdjPoint2D() {
      return new CTAdjPoint2D();
   }

   public CTPath2DCubicBezierTo createCTPath2DCubicBezierTo() {
      return new CTPath2DCubicBezierTo();
   }

   public CTEmbeddedWAVAudioFile createCTEmbeddedWAVAudioFile() {
      return new CTEmbeddedWAVAudioFile();
   }

   public CTPresetGeometry2D createCTPresetGeometry2D() {
      return new CTPresetGeometry2D();
   }

   public CTSchemeColor createCTSchemeColor() {
      return new CTSchemeColor();
   }

   public CTInverseTransform createCTInverseTransform() {
      return new CTInverseTransform();
   }

   public CTScRgbColor createCTScRgbColor() {
      return new CTScRgbColor();
   }

   public CTPositiveFixedAngle createCTPositiveFixedAngle() {
      return new CTPositiveFixedAngle();
   }

   public CTInverseGammaTransform createCTInverseGammaTransform() {
      return new CTInverseGammaTransform();
   }

   public CTColorMRU createCTColorMRU() {
      return new CTColorMRU();
   }

   public CTPath2DArcTo createCTPath2DArcTo() {
      return new CTPath2DArcTo();
   }

   public CTSystemColor createCTSystemColor() {
      return new CTSystemColor();
   }

   public CTGroupTransform2D createCTGroupTransform2D() {
      return new CTGroupTransform2D();
   }

   public CTPoint2D createCTPoint2D() {
      return new CTPoint2D();
   }

   public CTGeomRect createCTGeomRect() {
      return new CTGeomRect();
   }

   public CTScale2D createCTScale2D() {
      return new CTScale2D();
   }

   public CTGeomGuide createCTGeomGuide() {
      return new CTGeomGuide();
   }

   public CTXYAdjustHandle createCTXYAdjustHandle() {
      return new CTXYAdjustHandle();
   }

   public CTCustomGeometry2D createCTCustomGeometry2D() {
      return new CTCustomGeometry2D();
   }

   public CTOfficeArtExtension createCTOfficeArtExtension() {
      return new CTOfficeArtExtension();
   }

   public CTGrayscaleTransform createCTGrayscaleTransform() {
      return new CTGrayscaleTransform();
   }

   public CTPath2DClose createCTPath2DClose() {
      return new CTPath2DClose();
   }

   public CTComplementTransform createCTComplementTransform() {
      return new CTComplementTransform();
   }

   public CTPoint3D createCTPoint3D() {
      return new CTPoint3D();
   }

   public CTPositiveFixedPercentage createCTPositiveFixedPercentage() {
      return new CTPositiveFixedPercentage();
   }

   public CTPath2D createCTPath2D() {
      return new CTPath2D();
   }

   public CTAdjustHandleList createCTAdjustHandleList() {
      return new CTAdjustHandleList();
   }

   public CTConnectionSiteList createCTConnectionSiteList() {
      return new CTConnectionSiteList();
   }

   public CTPresetTextShape createCTPresetTextShape() {
      return new CTPresetTextShape();
   }

   public CTSRgbColor createCTSRgbColor() {
      return new CTSRgbColor();
   }

   public CTPath2DMoveTo createCTPath2DMoveTo() {
      return new CTPath2DMoveTo();
   }

   public CTRelativeRect createCTRelativeRect() {
      return new CTRelativeRect();
   }

   public CTPath2DList createCTPath2DList() {
      return new CTPath2DList();
   }

   public CTPolarAdjustHandle createCTPolarAdjustHandle() {
      return new CTPolarAdjustHandle();
   }

   public CTPercentage createCTPercentage() {
      return new CTPercentage();
   }

   public CTHslColor createCTHslColor() {
      return new CTHslColor();
   }

   public CTRatio createCTRatio() {
      return new CTRatio();
   }

   public CTGeomGuideList createCTGeomGuideList() {
      return new CTGeomGuideList();
   }

   public CTTransform2D createCTTransform2D() {
      return new CTTransform2D();
   }

   public CTGammaTransform createCTGammaTransform() {
      return new CTGammaTransform();
   }

   public CTPath2DQuadBezierTo createCTPath2DQuadBezierTo() {
      return new CTPath2DQuadBezierTo();
   }

   public CTAngle createCTAngle() {
      return new CTAngle();
   }

   public CTConnectionSite createCTConnectionSite() {
      return new CTConnectionSite();
   }

   public CTHyperlink createCTHyperlink() {
      return new CTHyperlink();
   }

   public CTFixedPercentage createCTFixedPercentage() {
      return new CTFixedPercentage();
   }

   public CTPath2DLineTo createCTPath2DLineTo() {
      return new CTPath2DLineTo();
   }

   public CTColor createCTColor() {
      return new CTColor();
   }

   public CTPresetColor createCTPresetColor() {
      return new CTPresetColor();
   }

   public CTVector3D createCTVector3D() {
      return new CTVector3D();
   }

   public CTOfficeArtExtensionList createCTOfficeArtExtensionList() {
      return new CTOfficeArtExtensionList();
   }

   public CTConnection createCTConnection() {
      return new CTConnection();
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alpha",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorAlpha(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlpha_QNAME, CTPositiveFixedPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lum",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorLum(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLum_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gamma",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorGamma(CTGammaTransform value) {
      return new JAXBElement(_CTSRgbColorGamma_QNAME, CTGammaTransform.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "invGamma",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorInvGamma(CTInverseGammaTransform value) {
      return new JAXBElement(_CTSRgbColorInvGamma_QNAME, CTInverseGammaTransform.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redOff",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorRedOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedOff_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaMod",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorAlphaMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaMod_QNAME, CTPositivePercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaOff",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorAlphaOff(CTFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaOff_QNAME, CTFixedPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenOff",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorGreenOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenOff_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redMod",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorRedMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedMod_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hue",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorHue(CTPositiveFixedAngle value) {
      return new JAXBElement(_CTSRgbColorHue_QNAME, CTPositiveFixedAngle.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satOff",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorSatOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatOff_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenMod",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorGreenMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenMod_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "sat",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorSat(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSat_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blue",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorBlue(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlue_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "red",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorRed(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRed_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satMod",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorSatMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatMod_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueOff",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorHueOff(CTAngle value) {
      return new JAXBElement(_CTSRgbColorHueOff_QNAME, CTAngle.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueMod",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorBlueMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueMod_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "shade",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorShade(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorShade_QNAME, CTPositiveFixedPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumMod",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorLumMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumMod_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "inv",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorInv(CTInverseTransform value) {
      return new JAXBElement(_CTSRgbColorInv_QNAME, CTInverseTransform.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumOff",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorLumOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumOff_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "tint",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorTint(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorTint_QNAME, CTPositiveFixedPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "green",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorGreen(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreen_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "comp",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorComp(CTComplementTransform value) {
      return new JAXBElement(_CTSRgbColorComp_QNAME, CTComplementTransform.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueOff",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorBlueOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueOff_QNAME, CTPercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueMod",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorHueMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorHueMod_QNAME, CTPositivePercentage.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gray",
      scope = CTSRgbColor.class
   )
   public JAXBElement createCTSRgbColorGray(CTGrayscaleTransform value) {
      return new JAXBElement(_CTSRgbColorGray_QNAME, CTGrayscaleTransform.class, CTSRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lum",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorLum(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLum_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alpha",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorAlpha(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlpha_QNAME, CTPositiveFixedPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gamma",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorGamma(CTGammaTransform value) {
      return new JAXBElement(_CTSRgbColorGamma_QNAME, CTGammaTransform.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "invGamma",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorInvGamma(CTInverseGammaTransform value) {
      return new JAXBElement(_CTSRgbColorInvGamma_QNAME, CTInverseGammaTransform.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaMod",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorAlphaMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaMod_QNAME, CTPositivePercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redOff",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorRedOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedOff_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaOff",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorAlphaOff(CTFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaOff_QNAME, CTFixedPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenOff",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorGreenOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenOff_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redMod",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorRedMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedMod_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hue",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorHue(CTPositiveFixedAngle value) {
      return new JAXBElement(_CTSRgbColorHue_QNAME, CTPositiveFixedAngle.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satOff",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorSatOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatOff_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenMod",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorGreenMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenMod_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blue",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorBlue(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlue_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "sat",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorSat(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSat_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "red",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorRed(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRed_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satMod",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorSatMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatMod_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueMod",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorBlueMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueMod_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueOff",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorHueOff(CTAngle value) {
      return new JAXBElement(_CTSRgbColorHueOff_QNAME, CTAngle.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "shade",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorShade(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorShade_QNAME, CTPositiveFixedPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumMod",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorLumMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumMod_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "inv",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorInv(CTInverseTransform value) {
      return new JAXBElement(_CTSRgbColorInv_QNAME, CTInverseTransform.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumOff",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorLumOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumOff_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "tint",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorTint(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorTint_QNAME, CTPositiveFixedPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "green",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorGreen(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreen_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "comp",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorComp(CTComplementTransform value) {
      return new JAXBElement(_CTSRgbColorComp_QNAME, CTComplementTransform.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueOff",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorBlueOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueOff_QNAME, CTPercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueMod",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorHueMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorHueMod_QNAME, CTPositivePercentage.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gray",
      scope = CTSystemColor.class
   )
   public JAXBElement createCTSystemColorGray(CTGrayscaleTransform value) {
      return new JAXBElement(_CTSRgbColorGray_QNAME, CTGrayscaleTransform.class, CTSystemColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lum",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorLum(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLum_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alpha",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorAlpha(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlpha_QNAME, CTPositiveFixedPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gamma",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorGamma(CTGammaTransform value) {
      return new JAXBElement(_CTSRgbColorGamma_QNAME, CTGammaTransform.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "invGamma",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorInvGamma(CTInverseGammaTransform value) {
      return new JAXBElement(_CTSRgbColorInvGamma_QNAME, CTInverseGammaTransform.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redOff",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorRedOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedOff_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaMod",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorAlphaMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaMod_QNAME, CTPositivePercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaOff",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorAlphaOff(CTFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaOff_QNAME, CTFixedPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenOff",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorGreenOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenOff_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hue",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorHue(CTPositiveFixedAngle value) {
      return new JAXBElement(_CTSRgbColorHue_QNAME, CTPositiveFixedAngle.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redMod",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorRedMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedMod_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satOff",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorSatOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatOff_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenMod",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorGreenMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenMod_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blue",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorBlue(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlue_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "sat",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorSat(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSat_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "red",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorRed(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRed_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satMod",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorSatMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatMod_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueOff",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorHueOff(CTAngle value) {
      return new JAXBElement(_CTSRgbColorHueOff_QNAME, CTAngle.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueMod",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorBlueMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueMod_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "shade",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorShade(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorShade_QNAME, CTPositiveFixedPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumMod",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorLumMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumMod_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "inv",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorInv(CTInverseTransform value) {
      return new JAXBElement(_CTSRgbColorInv_QNAME, CTInverseTransform.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumOff",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorLumOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumOff_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "tint",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorTint(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorTint_QNAME, CTPositiveFixedPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "green",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorGreen(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreen_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "comp",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorComp(CTComplementTransform value) {
      return new JAXBElement(_CTSRgbColorComp_QNAME, CTComplementTransform.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueOff",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorBlueOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueOff_QNAME, CTPercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueMod",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorHueMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorHueMod_QNAME, CTPositivePercentage.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gray",
      scope = CTSchemeColor.class
   )
   public JAXBElement createCTSchemeColorGray(CTGrayscaleTransform value) {
      return new JAXBElement(_CTSRgbColorGray_QNAME, CTGrayscaleTransform.class, CTSchemeColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lum",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorLum(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLum_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alpha",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorAlpha(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlpha_QNAME, CTPositiveFixedPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gamma",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorGamma(CTGammaTransform value) {
      return new JAXBElement(_CTSRgbColorGamma_QNAME, CTGammaTransform.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "invGamma",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorInvGamma(CTInverseGammaTransform value) {
      return new JAXBElement(_CTSRgbColorInvGamma_QNAME, CTInverseGammaTransform.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redOff",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorRedOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedOff_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaMod",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorAlphaMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaMod_QNAME, CTPositivePercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaOff",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorAlphaOff(CTFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaOff_QNAME, CTFixedPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenOff",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorGreenOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenOff_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hue",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorHue(CTPositiveFixedAngle value) {
      return new JAXBElement(_CTSRgbColorHue_QNAME, CTPositiveFixedAngle.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redMod",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorRedMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedMod_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satOff",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorSatOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatOff_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenMod",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorGreenMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenMod_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "sat",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorSat(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSat_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blue",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorBlue(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlue_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "red",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorRed(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRed_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satMod",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorSatMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatMod_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueOff",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorHueOff(CTAngle value) {
      return new JAXBElement(_CTSRgbColorHueOff_QNAME, CTAngle.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueMod",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorBlueMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueMod_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "shade",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorShade(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorShade_QNAME, CTPositiveFixedPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumMod",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorLumMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumMod_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "inv",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorInv(CTInverseTransform value) {
      return new JAXBElement(_CTSRgbColorInv_QNAME, CTInverseTransform.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumOff",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorLumOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumOff_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "tint",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorTint(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorTint_QNAME, CTPositiveFixedPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "green",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorGreen(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreen_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "comp",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorComp(CTComplementTransform value) {
      return new JAXBElement(_CTSRgbColorComp_QNAME, CTComplementTransform.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueOff",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorBlueOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueOff_QNAME, CTPercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueMod",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorHueMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorHueMod_QNAME, CTPositivePercentage.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gray",
      scope = CTScRgbColor.class
   )
   public JAXBElement createCTScRgbColorGray(CTGrayscaleTransform value) {
      return new JAXBElement(_CTSRgbColorGray_QNAME, CTGrayscaleTransform.class, CTScRgbColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alpha",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorAlpha(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlpha_QNAME, CTPositiveFixedPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lum",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorLum(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLum_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gamma",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorGamma(CTGammaTransform value) {
      return new JAXBElement(_CTSRgbColorGamma_QNAME, CTGammaTransform.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "invGamma",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorInvGamma(CTInverseGammaTransform value) {
      return new JAXBElement(_CTSRgbColorInvGamma_QNAME, CTInverseGammaTransform.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaMod",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorAlphaMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaMod_QNAME, CTPositivePercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redOff",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorRedOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedOff_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaOff",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorAlphaOff(CTFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaOff_QNAME, CTFixedPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenOff",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorGreenOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenOff_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hue",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorHue(CTPositiveFixedAngle value) {
      return new JAXBElement(_CTSRgbColorHue_QNAME, CTPositiveFixedAngle.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redMod",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorRedMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedMod_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satOff",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorSatOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatOff_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenMod",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorGreenMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenMod_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blue",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorBlue(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlue_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "sat",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorSat(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSat_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "red",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorRed(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRed_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satMod",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorSatMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatMod_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueMod",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorBlueMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueMod_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueOff",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorHueOff(CTAngle value) {
      return new JAXBElement(_CTSRgbColorHueOff_QNAME, CTAngle.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "shade",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorShade(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorShade_QNAME, CTPositiveFixedPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumMod",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorLumMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumMod_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "inv",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorInv(CTInverseTransform value) {
      return new JAXBElement(_CTSRgbColorInv_QNAME, CTInverseTransform.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumOff",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorLumOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumOff_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "tint",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorTint(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorTint_QNAME, CTPositiveFixedPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "green",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorGreen(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreen_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "comp",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorComp(CTComplementTransform value) {
      return new JAXBElement(_CTSRgbColorComp_QNAME, CTComplementTransform.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueOff",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorBlueOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueOff_QNAME, CTPercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueMod",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorHueMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorHueMod_QNAME, CTPositivePercentage.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gray",
      scope = CTHslColor.class
   )
   public JAXBElement createCTHslColorGray(CTGrayscaleTransform value) {
      return new JAXBElement(_CTSRgbColorGray_QNAME, CTGrayscaleTransform.class, CTHslColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lum",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorLum(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLum_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alpha",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorAlpha(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlpha_QNAME, CTPositiveFixedPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gamma",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorGamma(CTGammaTransform value) {
      return new JAXBElement(_CTSRgbColorGamma_QNAME, CTGammaTransform.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "invGamma",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorInvGamma(CTInverseGammaTransform value) {
      return new JAXBElement(_CTSRgbColorInvGamma_QNAME, CTInverseGammaTransform.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redOff",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorRedOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedOff_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaMod",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorAlphaMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaMod_QNAME, CTPositivePercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "alphaOff",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorAlphaOff(CTFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorAlphaOff_QNAME, CTFixedPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenOff",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorGreenOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenOff_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hue",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorHue(CTPositiveFixedAngle value) {
      return new JAXBElement(_CTSRgbColorHue_QNAME, CTPositiveFixedAngle.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "redMod",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorRedMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRedMod_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satOff",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorSatOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatOff_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "greenMod",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorGreenMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreenMod_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blue",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorBlue(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlue_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "sat",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorSat(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSat_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "red",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorRed(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorRed_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "satMod",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorSatMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorSatMod_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueMod",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorBlueMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueMod_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueOff",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorHueOff(CTAngle value) {
      return new JAXBElement(_CTSRgbColorHueOff_QNAME, CTAngle.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "shade",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorShade(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorShade_QNAME, CTPositiveFixedPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumMod",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorLumMod(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumMod_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "inv",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorInv(CTInverseTransform value) {
      return new JAXBElement(_CTSRgbColorInv_QNAME, CTInverseTransform.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "lumOff",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorLumOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorLumOff_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "tint",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorTint(CTPositiveFixedPercentage value) {
      return new JAXBElement(_CTSRgbColorTint_QNAME, CTPositiveFixedPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "green",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorGreen(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorGreen_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "comp",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorComp(CTComplementTransform value) {
      return new JAXBElement(_CTSRgbColorComp_QNAME, CTComplementTransform.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "blueOff",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorBlueOff(CTPercentage value) {
      return new JAXBElement(_CTSRgbColorBlueOff_QNAME, CTPercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "hueMod",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorHueMod(CTPositivePercentage value) {
      return new JAXBElement(_CTSRgbColorHueMod_QNAME, CTPositivePercentage.class, CTPresetColor.class, value);
   }

   @XmlElementDecl(
      namespace = "http://schemas.openxmlformats.org/drawingml/2006/main",
      name = "gray",
      scope = CTPresetColor.class
   )
   public JAXBElement createCTPresetColorGray(CTGrayscaleTransform value) {
      return new JAXBElement(_CTSRgbColorGray_QNAME, CTGrayscaleTransform.class, CTPresetColor.class, value);
   }

}
