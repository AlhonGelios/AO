package org.apache.commons.collections4.sequence;

import org.apache.commons.collections4.sequence.CommandVisitor;
import org.apache.commons.collections4.sequence.EditCommand;

public class InsertCommand extends EditCommand {

   public InsertCommand(Object object) {
      super(object);
   }

   public void accept(CommandVisitor visitor) {
      visitor.visitInsertCommand(this.getObject());
   }
}
