package org.apache.poi.openxml4j.opc;


public interface PackageRelationshipTypes {

   String CORE_PROPERTIES = "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties";
   String CORE_PROPERTIES_ECMA376 = "http://schemas.openxmlformats.org/officedocument/2006/relationships/metadata/core-properties";
   String DIGITAL_SIGNATURE = "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/signature";
   String DIGITAL_SIGNATURE_CERTIFICATE = "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/certificate";
   String DIGITAL_SIGNATURE_ORIGIN = "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin";
   String THUMBNAIL = "http://schemas.openxmlformats.org/package/2006/relationships/metadata/thumbnail";
   String EXTENDED_PROPERTIES = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/extended-properties";
   String STRICT_EXTENDED_PROPERTIES = "http://purl.oclc.org/ooxml/officeDocument/relationships/extendedProperties";
   String CUSTOM_PROPERTIES = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/custom-properties";
   String CORE_DOCUMENT = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/officeDocument";
   String STRICT_CORE_DOCUMENT = "http://purl.oclc.org/ooxml/officeDocument/relationships/officeDocument";
   String CUSTOM_XML = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/customXml";
   String IMAGE_PART = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image";
   String HYPERLINK_PART = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink";
   String STYLE_PART = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/styles";
   String EXTERNAL_LINK_PATH = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/externalLinkPath";
   String VISIO_CORE_DOCUMENT = "http://schemas.microsoft.com/visio/2010/relationships/document";

}
