package org.apache.commons.collections4.sequence;

import org.apache.commons.collections4.sequence.CommandVisitor;
import org.apache.commons.collections4.sequence.EditCommand;

public class KeepCommand extends EditCommand {

   public KeepCommand(Object object) {
      super(object);
   }

   public void accept(CommandVisitor visitor) {
      visitor.visitKeepCommand(this.getObject());
   }
}
