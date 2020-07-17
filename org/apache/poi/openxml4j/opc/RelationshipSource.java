package org.apache.poi.openxml4j.opc;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.openxml4j.opc.PackageRelationshipCollection;
import org.apache.poi.openxml4j.opc.TargetMode;

public interface RelationshipSource {

   PackageRelationship addRelationship(PackagePartName var1, TargetMode var2, String var3);

   PackageRelationship addRelationship(PackagePartName var1, TargetMode var2, String var3, String var4);

   PackageRelationship addExternalRelationship(String var1, String var2);

   PackageRelationship addExternalRelationship(String var1, String var2, String var3);

   void clearRelationships();

   void removeRelationship(String var1);

   PackageRelationshipCollection getRelationships() throws InvalidFormatException, OpenXML4JException;

   PackageRelationship getRelationship(String var1);

   PackageRelationshipCollection getRelationshipsByType(String var1) throws InvalidFormatException, IllegalArgumentException, OpenXML4JException;

   boolean hasRelationships();

   boolean isRelationshipExists(PackageRelationship var1);
}
