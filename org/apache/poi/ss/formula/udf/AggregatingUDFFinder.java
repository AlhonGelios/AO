package org.apache.poi.ss.formula.udf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.apache.poi.ss.formula.atp.AnalysisToolPak;
import org.apache.poi.ss.formula.functions.FreeRefFunction;
import org.apache.poi.ss.formula.udf.UDFFinder;

public class AggregatingUDFFinder implements UDFFinder {

   public static final UDFFinder DEFAULT = new AggregatingUDFFinder(new UDFFinder[]{AnalysisToolPak.instance});
   private final Collection _usedToolPacks;


   public AggregatingUDFFinder(UDFFinder ... usedToolPacks) {
      this._usedToolPacks = new ArrayList(usedToolPacks.length);
      this._usedToolPacks.addAll(Arrays.asList(usedToolPacks));
   }

   public FreeRefFunction findFunction(String name) {
      Iterator i$ = this._usedToolPacks.iterator();

      FreeRefFunction evaluatorForFunction;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         UDFFinder pack = (UDFFinder)i$.next();
         evaluatorForFunction = pack.findFunction(name);
      } while(evaluatorForFunction == null);

      return evaluatorForFunction;
   }

   public void add(UDFFinder toolPack) {
      this._usedToolPacks.add(toolPack);
   }

}
