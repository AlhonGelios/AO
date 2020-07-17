package org.apache.poi.ss.formula;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.poi.ss.formula.EvaluationCache;
import org.apache.poi.ss.formula.IEvaluationListener;
import org.apache.poi.ss.formula.WorkbookEvaluator;
import org.apache.poi.ss.formula.WorkbookEvaluatorProvider;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.util.Internal;

@Internal
public final class CollaboratingWorkbooksEnvironment {

   public static final CollaboratingWorkbooksEnvironment EMPTY = new CollaboratingWorkbooksEnvironment();
   private final Map _evaluatorsByName;
   private final WorkbookEvaluator[] _evaluators;
   private boolean _unhooked;


   private CollaboratingWorkbooksEnvironment() {
      this._evaluatorsByName = Collections.emptyMap();
      this._evaluators = new WorkbookEvaluator[0];
   }

   public static void setup(String[] workbookNames, WorkbookEvaluator[] evaluators) {
      int nItems = workbookNames.length;
      if(evaluators.length != nItems) {
         throw new IllegalArgumentException("Number of workbook names is " + nItems + " but number of evaluators is " + evaluators.length);
      } else if(nItems < 1) {
         throw new IllegalArgumentException("Must provide at least one collaborating worbook");
      } else {
         new CollaboratingWorkbooksEnvironment(workbookNames, evaluators, nItems);
      }
   }

   public static void setup(Map evaluatorsByName) {
      if(evaluatorsByName.size() < 1) {
         throw new IllegalArgumentException("Must provide at least one collaborating worbook");
      } else {
         WorkbookEvaluator[] evaluators = (WorkbookEvaluator[])evaluatorsByName.values().toArray(new WorkbookEvaluator[evaluatorsByName.size()]);
         new CollaboratingWorkbooksEnvironment(evaluatorsByName, evaluators);
      }
   }

   public static void setupFormulaEvaluator(Map evaluators) {
      HashMap evaluatorsByName = new HashMap(evaluators.size());
      Iterator i$ = evaluators.entrySet().iterator();

      while(i$.hasNext()) {
         Entry swb = (Entry)i$.next();
         String wbName = (String)swb.getKey();
         FormulaEvaluator eval = (FormulaEvaluator)swb.getValue();
         if(!(eval instanceof WorkbookEvaluatorProvider)) {
            throw new IllegalArgumentException("Formula Evaluator " + eval + " provides no WorkbookEvaluator access");
         }

         evaluatorsByName.put(wbName, ((WorkbookEvaluatorProvider)eval)._getWorkbookEvaluator());
      }

      setup(evaluatorsByName);
   }

   private CollaboratingWorkbooksEnvironment(String[] workbookNames, WorkbookEvaluator[] evaluators, int nItems) {
      this(toUniqueMap(workbookNames, evaluators, nItems), evaluators);
   }

   private static Map toUniqueMap(String[] workbookNames, WorkbookEvaluator[] evaluators, int nItems) {
      HashMap evaluatorsByName = new HashMap(nItems * 3 / 2);

      for(int i = 0; i < nItems; ++i) {
         String wbName = workbookNames[i];
         WorkbookEvaluator wbEval = evaluators[i];
         if(evaluatorsByName.containsKey(wbName)) {
            throw new IllegalArgumentException("Duplicate workbook name \'" + wbName + "\'");
         }

         evaluatorsByName.put(wbName, wbEval);
      }

      return evaluatorsByName;
   }

   private CollaboratingWorkbooksEnvironment(Map evaluatorsByName, WorkbookEvaluator[] evaluators) {
      IdentityHashMap uniqueEvals = new IdentityHashMap(evaluators.length);
      Iterator i$ = evaluatorsByName.entrySet().iterator();

      Entry me;
      String uniEval;
      do {
         if(!i$.hasNext()) {
            this.unhookOldEnvironments(evaluators);
            hookNewEnvironment(evaluators, this);
            this._unhooked = false;
            this._evaluators = (WorkbookEvaluator[])evaluators.clone();
            this._evaluatorsByName = evaluatorsByName;
            return;
         }

         me = (Entry)i$.next();
         uniEval = (String)uniqueEvals.put(me.getValue(), me.getKey());
      } while(uniEval == null);

      String msg = "Attempted to register same workbook under names \'" + uniEval + "\' and \'" + (String)me.getKey() + "\'";
      throw new IllegalArgumentException(msg);
   }

   private static void hookNewEnvironment(WorkbookEvaluator[] evaluators, CollaboratingWorkbooksEnvironment env) {
      int nItems = evaluators.length;
      IEvaluationListener evalListener = evaluators[0].getEvaluationListener();

      for(int cache = 0; cache < nItems; ++cache) {
         if(evalListener != evaluators[cache].getEvaluationListener()) {
            throw new RuntimeException("Workbook evaluators must all have the same evaluation listener");
         }
      }

      EvaluationCache var6 = new EvaluationCache(evalListener);

      for(int i = 0; i < nItems; ++i) {
         evaluators[i].attachToEnvironment(env, var6, i);
      }

   }

   private void unhookOldEnvironments(WorkbookEvaluator[] evaluators) {
      HashSet oldEnvs = new HashSet();

      for(int oldCWEs = 0; oldCWEs < evaluators.length; ++oldCWEs) {
         oldEnvs.add(evaluators[oldCWEs].getEnvironment());
      }

      CollaboratingWorkbooksEnvironment[] var5 = new CollaboratingWorkbooksEnvironment[oldEnvs.size()];
      oldEnvs.toArray(var5);

      for(int i = 0; i < var5.length; ++i) {
         var5[i].unhook();
      }

   }

   private void unhook() {
      if(this._evaluators.length >= 1) {
         for(int i = 0; i < this._evaluators.length; ++i) {
            this._evaluators[i].detachFromEnvironment();
         }

         this._unhooked = true;
      }
   }

   public WorkbookEvaluator getWorkbookEvaluator(String workbookName) throws CollaboratingWorkbooksEnvironment.WorkbookNotFoundException {
      if(this._unhooked) {
         throw new IllegalStateException("This environment has been unhooked");
      } else {
         WorkbookEvaluator result = (WorkbookEvaluator)this._evaluatorsByName.get(workbookName);
         if(result != null) {
            return result;
         } else {
            StringBuffer sb = new StringBuffer(256);
            sb.append("Could not resolve external workbook name \'").append(workbookName).append("\'.");
            if(this._evaluators.length < 1) {
               sb.append(" Workbook environment has not been set up.");
            } else {
               sb.append(" The following workbook names are valid: (");
               Iterator i = this._evaluatorsByName.keySet().iterator();

               for(int count = 0; i.hasNext(); sb.append("\'").append((String)i.next()).append("\'")) {
                  if(count++ > 0) {
                     sb.append(", ");
                  }
               }

               sb.append(")");
            }

            throw new CollaboratingWorkbooksEnvironment.WorkbookNotFoundException(sb.toString());
         }
      }
   }


   public static final class WorkbookNotFoundException extends Exception {

      private static final long serialVersionUID = 8787784539811167941L;


      WorkbookNotFoundException(String msg) {
         super(msg);
      }
   }
}
