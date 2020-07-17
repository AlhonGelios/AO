package org.apache.commons.collections4.sequence;

import org.apache.commons.collections4.sequence.CommandVisitor;
import org.apache.commons.collections4.sequence.EditCommand;

public class DeleteCommand extends EditCommand {

   public DeleteCommand(Object object) {
      super(object);
   }

   public void accept(CommandVisitor visitor) {
      visitor.visitDeleteCommand(this.getObject());
   }
}
