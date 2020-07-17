package tab_catalogs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tab_catalogs.EditCatalogElem;

public class EditMenuListener implements ActionListener {

   private String table;
   private String title;


   public EditMenuListener(String table, String title) {
      this.table = table;
      this.title = title;
   }

   public void actionPerformed(ActionEvent e) {
      try {
         EditCatalogElem exc = new EditCatalogElem(this.table, this.title);
         exc.setVisible(true);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }
}
