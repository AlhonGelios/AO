package org.apache.poi.ss.formula.udf;

import org.apache.poi.ss.formula.atp.AnalysisToolPak;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.udf.AggregatingUDFFinder;

public interface UDFFinder {

   @Deprecated
   UDFFinder DEFAULT = new AggregatingUDFFinder(new UDFFinder[]{AnalysisToolPak.instance});


   FreeRefFunction findFunction(String var1);

}
