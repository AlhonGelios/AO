package tab_accreditation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class SimpleAccreditationPanel extends JPanel {

   private String currentAbit;
   private Dimension dimStartRigidArea = new Dimension(50, 0);
   private Dimension dimTextDigitInfo = new Dimension(174, 25);
   private Dimension dimRigidArea = new Dimension(10, 0);
   private JTextField textSeria;
   private JTextField textNum;
   private JTextField textDate;
   private JTextArea textIssuedBy;


   public SimpleAccreditationPanel(String name) {
      this.setBorder(new TitledBorder((Border)null, name, 4, 2, (Font)null, (Color)null));
      this.setLayout(new BoxLayout(this, 1));
      JPanel digitInfoEducPanel = new JPanel();
      digitInfoEducPanel.setLayout(new FlowLayout(0));
      digitInfoEducPanel.add(Box.createRigidArea(this.dimStartRigidArea));
      JLabel seriaLabel = new JLabel("Серия");
      digitInfoEducPanel.add(seriaLabel);
      this.textSeria = new JTextField();
      this.textSeria.setPreferredSize(this.dimTextDigitInfo);
      this.textSeria.setBackground(Color.WHITE);
      digitInfoEducPanel.add(this.textSeria);
      digitInfoEducPanel.add(Box.createRigidArea(this.dimRigidArea));
      JLabel numLabel = new JLabel("Номер");
      digitInfoEducPanel.add(numLabel);
      this.textNum = new JTextField();
      this.textNum.setPreferredSize(this.dimTextDigitInfo);
      this.textNum.setBackground(Color.WHITE);
      digitInfoEducPanel.add(this.textNum);
      digitInfoEducPanel.add(Box.createRigidArea(this.dimRigidArea));
      JLabel yearLabel = new JLabel("Дата выдачи");
      digitInfoEducPanel.add(yearLabel);

      try {
         MaskFormatter issuedByEducPanel = new MaskFormatter("##.##.####");
         issuedByEducPanel.setPlaceholderCharacter('_');
         this.textDate = new JFormattedTextField(issuedByEducPanel);
      } catch (ParseException var9) {
         this.textDate = new JTextField();
      }

      this.textDate.setPreferredSize(this.dimTextDigitInfo);
      this.textDate.setBackground(Color.WHITE);
      digitInfoEducPanel.add(this.textDate);
      this.add(digitInfoEducPanel);
      JPanel issuedByEducPanel1 = new JPanel();
      issuedByEducPanel1.setLayout(new FlowLayout(0));
      issuedByEducPanel1.add(Box.createRigidArea(this.dimStartRigidArea));
      JLabel issuedByLabel = new JLabel("Кем выдан");
      issuedByEducPanel1.add(issuedByLabel);
      this.textIssuedBy = new JTextArea(2, 60);
      this.textIssuedBy.setBackground(Color.WHITE);
      JScrollPane paneIssuedBy = new JScrollPane(this.textIssuedBy);
      this.textIssuedBy.setLineWrap(true);
      issuedByEducPanel1.add(paneIssuedBy);
      this.add(issuedByEducPanel1);
      this.setEditable(false);
   }

   public void setValues(String[] values) {
      this.currentAbit = values[0];
      this.textSeria.setText(values[1]);
      this.textNum.setText(values[2]);
      this.textIssuedBy.setText(values[3]);
      if(values[4] != null) {
         try {
            SimpleDateFormat e = new SimpleDateFormat();
            e.applyPattern("dd.MM.yyyy");
            Date docDate = e.parse(values[4]);
            this.textDate.setText(e.format(docDate));
         } catch (ParseException var4) {
            this.textDate.setText((String)null);
         }
      } else {
         this.textDate.setText((String)null);
      }

   }

   public void setEditable(boolean state) {
      this.textSeria.setEditable(state);
      this.textNum.setEditable(state);
      this.textIssuedBy.setEditable(state);
      this.textDate.setEditable(state);
   }

   public String[] getValues() {
      String[] values = new String[]{this.currentAbit, !this.textSeria.getText().equals("")?this.textSeria.getText():null, !this.textNum.getText().equals("")?this.textNum.getText():null, !this.textIssuedBy.getText().equals("")?this.textIssuedBy.getText():null, !this.textDate.getText().equals("__.__.____")?this.textDate.getText():null};
      return values;
   }

   public String getCurrentAbit() {
      return this.currentAbit;
   }

   public ArrayList checkData(String[] data) {
      ArrayList mistakesIndices = new ArrayList();
      boolean isEmpty = true;

      for(int i = 1; i < data.length; ++i) {
         if(data[i] != null) {
            isEmpty = false;
            break;
         }
      }

      if(isEmpty) {
         mistakesIndices.add(Integer.valueOf(-1));
      }

      return mistakesIndices;
   }
}
