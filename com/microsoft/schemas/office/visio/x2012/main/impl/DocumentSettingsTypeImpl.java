package com.microsoft.schemas.office.visio.x2012.main.impl;

import com.microsoft.schemas.office.visio.x2012.main.AttachedToolbarsType;
import com.microsoft.schemas.office.visio.x2012.main.CustomMenusFileType;
import com.microsoft.schemas.office.visio.x2012.main.CustomToolbarsFileType;
import com.microsoft.schemas.office.visio.x2012.main.DocumentSettingsType;
import com.microsoft.schemas.office.visio.x2012.main.DynamicGridEnabledType;
import com.microsoft.schemas.office.visio.x2012.main.GlueSettingsType;
import com.microsoft.schemas.office.visio.x2012.main.ProtectBkgndsType;
import com.microsoft.schemas.office.visio.x2012.main.ProtectMastersType;
import com.microsoft.schemas.office.visio.x2012.main.ProtectShapesType;
import com.microsoft.schemas.office.visio.x2012.main.ProtectStylesType;
import com.microsoft.schemas.office.visio.x2012.main.SnapAnglesType;
import com.microsoft.schemas.office.visio.x2012.main.SnapExtensionsType;
import com.microsoft.schemas.office.visio.x2012.main.SnapSettingsType;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlUnsignedInt;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;

public class DocumentSettingsTypeImpl extends XmlComplexContentImpl implements DocumentSettingsType {

   private static final QName GLUESETTINGS$0 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "GlueSettings");
   private static final QName SNAPSETTINGS$2 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "SnapSettings");
   private static final QName SNAPEXTENSIONS$4 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "SnapExtensions");
   private static final QName SNAPANGLES$6 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "SnapAngles");
   private static final QName DYNAMICGRIDENABLED$8 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "DynamicGridEnabled");
   private static final QName PROTECTSTYLES$10 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "ProtectStyles");
   private static final QName PROTECTSHAPES$12 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "ProtectShapes");
   private static final QName PROTECTMASTERS$14 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "ProtectMasters");
   private static final QName PROTECTBKGNDS$16 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "ProtectBkgnds");
   private static final QName CUSTOMMENUSFILE$18 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "CustomMenusFile");
   private static final QName CUSTOMTOOLBARSFILE$20 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "CustomToolbarsFile");
   private static final QName ATTACHEDTOOLBARS$22 = new QName("http://schemas.microsoft.com/office/visio/2012/main", "AttachedToolbars");
   private static final QName TOPPAGE$24 = new QName("", "TopPage");
   private static final QName DEFAULTTEXTSTYLE$26 = new QName("", "DefaultTextStyle");
   private static final QName DEFAULTLINESTYLE$28 = new QName("", "DefaultLineStyle");
   private static final QName DEFAULTFILLSTYLE$30 = new QName("", "DefaultFillStyle");
   private static final QName DEFAULTGUIDESTYLE$32 = new QName("", "DefaultGuideStyle");


   public DocumentSettingsTypeImpl(SchemaType var1) {
      super(var1);
   }

   public GlueSettingsType getGlueSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         GlueSettingsType var2 = null;
         var2 = (GlueSettingsType)this.get_store().find_element_user(GLUESETTINGS$0, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetGlueSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(GLUESETTINGS$0) != 0;
      }
   }

   public void setGlueSettings(GlueSettingsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         GlueSettingsType var3 = null;
         var3 = (GlueSettingsType)this.get_store().find_element_user(GLUESETTINGS$0, 0);
         if(var3 == null) {
            var3 = (GlueSettingsType)this.get_store().add_element_user(GLUESETTINGS$0);
         }

         var3.set(var1);
      }
   }

   public GlueSettingsType addNewGlueSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         GlueSettingsType var2 = null;
         var2 = (GlueSettingsType)this.get_store().add_element_user(GLUESETTINGS$0);
         return var2;
      }
   }

   public void unsetGlueSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(GLUESETTINGS$0, 0);
      }
   }

   public SnapSettingsType getSnapSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapSettingsType var2 = null;
         var2 = (SnapSettingsType)this.get_store().find_element_user(SNAPSETTINGS$2, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSnapSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SNAPSETTINGS$2) != 0;
      }
   }

   public void setSnapSettings(SnapSettingsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapSettingsType var3 = null;
         var3 = (SnapSettingsType)this.get_store().find_element_user(SNAPSETTINGS$2, 0);
         if(var3 == null) {
            var3 = (SnapSettingsType)this.get_store().add_element_user(SNAPSETTINGS$2);
         }

         var3.set(var1);
      }
   }

   public SnapSettingsType addNewSnapSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapSettingsType var2 = null;
         var2 = (SnapSettingsType)this.get_store().add_element_user(SNAPSETTINGS$2);
         return var2;
      }
   }

   public void unsetSnapSettings() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SNAPSETTINGS$2, 0);
      }
   }

   public SnapExtensionsType getSnapExtensions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapExtensionsType var2 = null;
         var2 = (SnapExtensionsType)this.get_store().find_element_user(SNAPEXTENSIONS$4, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSnapExtensions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SNAPEXTENSIONS$4) != 0;
      }
   }

   public void setSnapExtensions(SnapExtensionsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapExtensionsType var3 = null;
         var3 = (SnapExtensionsType)this.get_store().find_element_user(SNAPEXTENSIONS$4, 0);
         if(var3 == null) {
            var3 = (SnapExtensionsType)this.get_store().add_element_user(SNAPEXTENSIONS$4);
         }

         var3.set(var1);
      }
   }

   public SnapExtensionsType addNewSnapExtensions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapExtensionsType var2 = null;
         var2 = (SnapExtensionsType)this.get_store().add_element_user(SNAPEXTENSIONS$4);
         return var2;
      }
   }

   public void unsetSnapExtensions() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SNAPEXTENSIONS$4, 0);
      }
   }

   public SnapAnglesType getSnapAngles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapAnglesType var2 = null;
         var2 = (SnapAnglesType)this.get_store().find_element_user(SNAPANGLES$6, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetSnapAngles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(SNAPANGLES$6) != 0;
      }
   }

   public void setSnapAngles(SnapAnglesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapAnglesType var3 = null;
         var3 = (SnapAnglesType)this.get_store().find_element_user(SNAPANGLES$6, 0);
         if(var3 == null) {
            var3 = (SnapAnglesType)this.get_store().add_element_user(SNAPANGLES$6);
         }

         var3.set(var1);
      }
   }

   public SnapAnglesType addNewSnapAngles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SnapAnglesType var2 = null;
         var2 = (SnapAnglesType)this.get_store().add_element_user(SNAPANGLES$6);
         return var2;
      }
   }

   public void unsetSnapAngles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(SNAPANGLES$6, 0);
      }
   }

   public DynamicGridEnabledType getDynamicGridEnabled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DynamicGridEnabledType var2 = null;
         var2 = (DynamicGridEnabledType)this.get_store().find_element_user(DYNAMICGRIDENABLED$8, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetDynamicGridEnabled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(DYNAMICGRIDENABLED$8) != 0;
      }
   }

   public void setDynamicGridEnabled(DynamicGridEnabledType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DynamicGridEnabledType var3 = null;
         var3 = (DynamicGridEnabledType)this.get_store().find_element_user(DYNAMICGRIDENABLED$8, 0);
         if(var3 == null) {
            var3 = (DynamicGridEnabledType)this.get_store().add_element_user(DYNAMICGRIDENABLED$8);
         }

         var3.set(var1);
      }
   }

   public DynamicGridEnabledType addNewDynamicGridEnabled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         DynamicGridEnabledType var2 = null;
         var2 = (DynamicGridEnabledType)this.get_store().add_element_user(DYNAMICGRIDENABLED$8);
         return var2;
      }
   }

   public void unsetDynamicGridEnabled() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(DYNAMICGRIDENABLED$8, 0);
      }
   }

   public ProtectStylesType getProtectStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectStylesType var2 = null;
         var2 = (ProtectStylesType)this.get_store().find_element_user(PROTECTSTYLES$10, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProtectStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROTECTSTYLES$10) != 0;
      }
   }

   public void setProtectStyles(ProtectStylesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectStylesType var3 = null;
         var3 = (ProtectStylesType)this.get_store().find_element_user(PROTECTSTYLES$10, 0);
         if(var3 == null) {
            var3 = (ProtectStylesType)this.get_store().add_element_user(PROTECTSTYLES$10);
         }

         var3.set(var1);
      }
   }

   public ProtectStylesType addNewProtectStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectStylesType var2 = null;
         var2 = (ProtectStylesType)this.get_store().add_element_user(PROTECTSTYLES$10);
         return var2;
      }
   }

   public void unsetProtectStyles() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROTECTSTYLES$10, 0);
      }
   }

   public ProtectShapesType getProtectShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectShapesType var2 = null;
         var2 = (ProtectShapesType)this.get_store().find_element_user(PROTECTSHAPES$12, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProtectShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROTECTSHAPES$12) != 0;
      }
   }

   public void setProtectShapes(ProtectShapesType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectShapesType var3 = null;
         var3 = (ProtectShapesType)this.get_store().find_element_user(PROTECTSHAPES$12, 0);
         if(var3 == null) {
            var3 = (ProtectShapesType)this.get_store().add_element_user(PROTECTSHAPES$12);
         }

         var3.set(var1);
      }
   }

   public ProtectShapesType addNewProtectShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectShapesType var2 = null;
         var2 = (ProtectShapesType)this.get_store().add_element_user(PROTECTSHAPES$12);
         return var2;
      }
   }

   public void unsetProtectShapes() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROTECTSHAPES$12, 0);
      }
   }

   public ProtectMastersType getProtectMasters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectMastersType var2 = null;
         var2 = (ProtectMastersType)this.get_store().find_element_user(PROTECTMASTERS$14, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProtectMasters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROTECTMASTERS$14) != 0;
      }
   }

   public void setProtectMasters(ProtectMastersType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectMastersType var3 = null;
         var3 = (ProtectMastersType)this.get_store().find_element_user(PROTECTMASTERS$14, 0);
         if(var3 == null) {
            var3 = (ProtectMastersType)this.get_store().add_element_user(PROTECTMASTERS$14);
         }

         var3.set(var1);
      }
   }

   public ProtectMastersType addNewProtectMasters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectMastersType var2 = null;
         var2 = (ProtectMastersType)this.get_store().add_element_user(PROTECTMASTERS$14);
         return var2;
      }
   }

   public void unsetProtectMasters() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROTECTMASTERS$14, 0);
      }
   }

   public ProtectBkgndsType getProtectBkgnds() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectBkgndsType var2 = null;
         var2 = (ProtectBkgndsType)this.get_store().find_element_user(PROTECTBKGNDS$16, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetProtectBkgnds() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(PROTECTBKGNDS$16) != 0;
      }
   }

   public void setProtectBkgnds(ProtectBkgndsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectBkgndsType var3 = null;
         var3 = (ProtectBkgndsType)this.get_store().find_element_user(PROTECTBKGNDS$16, 0);
         if(var3 == null) {
            var3 = (ProtectBkgndsType)this.get_store().add_element_user(PROTECTBKGNDS$16);
         }

         var3.set(var1);
      }
   }

   public ProtectBkgndsType addNewProtectBkgnds() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         ProtectBkgndsType var2 = null;
         var2 = (ProtectBkgndsType)this.get_store().add_element_user(PROTECTBKGNDS$16);
         return var2;
      }
   }

   public void unsetProtectBkgnds() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(PROTECTBKGNDS$16, 0);
      }
   }

   public CustomMenusFileType getCustomMenusFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CustomMenusFileType var2 = null;
         var2 = (CustomMenusFileType)this.get_store().find_element_user(CUSTOMMENUSFILE$18, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustomMenusFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMMENUSFILE$18) != 0;
      }
   }

   public void setCustomMenusFile(CustomMenusFileType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CustomMenusFileType var3 = null;
         var3 = (CustomMenusFileType)this.get_store().find_element_user(CUSTOMMENUSFILE$18, 0);
         if(var3 == null) {
            var3 = (CustomMenusFileType)this.get_store().add_element_user(CUSTOMMENUSFILE$18);
         }

         var3.set(var1);
      }
   }

   public CustomMenusFileType addNewCustomMenusFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CustomMenusFileType var2 = null;
         var2 = (CustomMenusFileType)this.get_store().add_element_user(CUSTOMMENUSFILE$18);
         return var2;
      }
   }

   public void unsetCustomMenusFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMMENUSFILE$18, 0);
      }
   }

   public CustomToolbarsFileType getCustomToolbarsFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CustomToolbarsFileType var2 = null;
         var2 = (CustomToolbarsFileType)this.get_store().find_element_user(CUSTOMTOOLBARSFILE$20, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetCustomToolbarsFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(CUSTOMTOOLBARSFILE$20) != 0;
      }
   }

   public void setCustomToolbarsFile(CustomToolbarsFileType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CustomToolbarsFileType var3 = null;
         var3 = (CustomToolbarsFileType)this.get_store().find_element_user(CUSTOMTOOLBARSFILE$20, 0);
         if(var3 == null) {
            var3 = (CustomToolbarsFileType)this.get_store().add_element_user(CUSTOMTOOLBARSFILE$20);
         }

         var3.set(var1);
      }
   }

   public CustomToolbarsFileType addNewCustomToolbarsFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         CustomToolbarsFileType var2 = null;
         var2 = (CustomToolbarsFileType)this.get_store().add_element_user(CUSTOMTOOLBARSFILE$20);
         return var2;
      }
   }

   public void unsetCustomToolbarsFile() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(CUSTOMTOOLBARSFILE$20, 0);
      }
   }

   public AttachedToolbarsType getAttachedToolbars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AttachedToolbarsType var2 = null;
         var2 = (AttachedToolbarsType)this.get_store().find_element_user(ATTACHEDTOOLBARS$22, 0);
         return var2 == null?null:var2;
      }
   }

   public boolean isSetAttachedToolbars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().count_elements(ATTACHEDTOOLBARS$22) != 0;
      }
   }

   public void setAttachedToolbars(AttachedToolbarsType var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AttachedToolbarsType var3 = null;
         var3 = (AttachedToolbarsType)this.get_store().find_element_user(ATTACHEDTOOLBARS$22, 0);
         if(var3 == null) {
            var3 = (AttachedToolbarsType)this.get_store().add_element_user(ATTACHEDTOOLBARS$22);
         }

         var3.set(var1);
      }
   }

   public AttachedToolbarsType addNewAttachedToolbars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         AttachedToolbarsType var2 = null;
         var2 = (AttachedToolbarsType)this.get_store().add_element_user(ATTACHEDTOOLBARS$22);
         return var2;
      }
   }

   public void unsetAttachedToolbars() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_element(ATTACHEDTOOLBARS$22, 0);
      }
   }

   public long getTopPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(TOPPAGE$24);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetTopPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(TOPPAGE$24);
         return var2;
      }
   }

   public boolean isSetTopPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(TOPPAGE$24) != null;
      }
   }

   public void setTopPage(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(TOPPAGE$24);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(TOPPAGE$24);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetTopPage(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(TOPPAGE$24);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(TOPPAGE$24);
         }

         var3.set(var1);
      }
   }

   public void unsetTopPage() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(TOPPAGE$24);
      }
   }

   public long getDefaultTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTTEXTSTYLE$26);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetDefaultTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTTEXTSTYLE$26);
         return var2;
      }
   }

   public boolean isSetDefaultTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTTEXTSTYLE$26) != null;
      }
   }

   public void setDefaultTextStyle(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTTEXTSTYLE$26);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTTEXTSTYLE$26);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDefaultTextStyle(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTTEXTSTYLE$26);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(DEFAULTTEXTSTYLE$26);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultTextStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTTEXTSTYLE$26);
      }
   }

   public long getDefaultLineStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTLINESTYLE$28);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetDefaultLineStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTLINESTYLE$28);
         return var2;
      }
   }

   public boolean isSetDefaultLineStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTLINESTYLE$28) != null;
      }
   }

   public void setDefaultLineStyle(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTLINESTYLE$28);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTLINESTYLE$28);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDefaultLineStyle(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTLINESTYLE$28);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(DEFAULTLINESTYLE$28);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultLineStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTLINESTYLE$28);
      }
   }

   public long getDefaultFillStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTFILLSTYLE$30);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetDefaultFillStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTFILLSTYLE$30);
         return var2;
      }
   }

   public boolean isSetDefaultFillStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTFILLSTYLE$30) != null;
      }
   }

   public void setDefaultFillStyle(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTFILLSTYLE$30);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTFILLSTYLE$30);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDefaultFillStyle(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTFILLSTYLE$30);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(DEFAULTFILLSTYLE$30);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultFillStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTFILLSTYLE$30);
      }
   }

   public long getDefaultGuideStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var2 = null;
         var2 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTGUIDESTYLE$32);
         return var2 == null?0L:var2.getLongValue();
      }
   }

   public XmlUnsignedInt xgetDefaultGuideStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var2 = null;
         var2 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTGUIDESTYLE$32);
         return var2;
      }
   }

   public boolean isSetDefaultGuideStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         return this.get_store().find_attribute_user(DEFAULTGUIDESTYLE$32) != null;
      }
   }

   public void setDefaultGuideStyle(long var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         SimpleValue var4 = null;
         var4 = (SimpleValue)this.get_store().find_attribute_user(DEFAULTGUIDESTYLE$32);
         if(var4 == null) {
            var4 = (SimpleValue)this.get_store().add_attribute_user(DEFAULTGUIDESTYLE$32);
         }

         var4.setLongValue(var1);
      }
   }

   public void xsetDefaultGuideStyle(XmlUnsignedInt var1) {
      synchronized(this.monitor()) {
         this.check_orphaned();
         XmlUnsignedInt var3 = null;
         var3 = (XmlUnsignedInt)this.get_store().find_attribute_user(DEFAULTGUIDESTYLE$32);
         if(var3 == null) {
            var3 = (XmlUnsignedInt)this.get_store().add_attribute_user(DEFAULTGUIDESTYLE$32);
         }

         var3.set(var1);
      }
   }

   public void unsetDefaultGuideStyle() {
      synchronized(this.monitor()) {
         this.check_orphaned();
         this.get_store().remove_attribute(DEFAULTGUIDESTYLE$32);
      }
   }

}
