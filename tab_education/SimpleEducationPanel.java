package tab_education;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;
import java.util.ArrayList;
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

public class SimpleEducationPanel extends JPanel {

   private String currentAbit;
   private Dimension dimStartRigidArea = new Dimension(50, 0);
   private Dimension dimTextDigitInfo = new Dimension(170, 25);
   private Dimension dimRigidArea = new Dimension(10, 0);
   private JTextField textSeria;
   private JTextField textNum;
   private JTextField textYear;
   private JTextField textSpeciality;
   private JTextField textAvgBall;
   private JTextArea textIssuedBy;


   public SimpleEducationPanel(String name) {
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
      JLabel yearLabel = new JLabel("Год окончания");
      digitInfoEducPanel.add(yearLabel);
      this.textYear = new JTextField();
      this.textYear.setPreferredSize(this.dimTextDigitInfo);
      this.textYear.setBackground(Color.WHITE);
      digitInfoEducPanel.add(this.textYear);
      this.add(digitInfoEducPanel);
      JPanel specialityEducPanel = new JPanel();
      specialityEducPanel.setLayout(new FlowLayout(0));
      specialityEducPanel.add(Box.createRigidArea(this.dimStartRigidArea));
      JLabel specialityLabel = new JLabel("Специальность");
      specialityEducPanel.add(specialityLabel);
      this.textSpeciality = new JTextField();
      this.textSpeciality.setPreferredSize(new Dimension(450, 25));
      this.textSpeciality.setBackground(Color.WHITE);
      specialityEducPanel.add(this.textSpeciality);
      specialityEducPanel.add(Box.createRigidArea(this.dimRigidArea));
      JLabel avgBallLabel = new JLabel("Средний балл");
      specialityEducPanel.add(avgBallLabel);

      try {
         MaskFormatter issuedByEducPanel = new MaskFormatter("#.##");
         issuedByEducPanel.setPlaceholderCharacter('_');
         this.textAvgBall = new JFormattedTextField(issuedByEducPanel);
      } catch (ParseException var12) {
         this.textAvgBall = new JTextField();
      }

      this.textAvgBall.setPreferredSize(new Dimension(70, 25));
      this.textAvgBall.setBackground(Color.WHITE);
      specialityEducPanel.add(this.textAvgBall);
      this.add(specialityEducPanel);
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
      this.textSpeciality.setText(values[3]);
      this.textIssuedBy.setText(values[4]);
      this.textYear.setText(values[5]);
      if(values[6] != null) {
         while(values[6].length() < 4) {
            values[6] = values[6] + "0";
         }
      }

      this.textAvgBall.setText(values[6]);
   }

   public void setEditable(boolean state) {
      this.textSeria.setEditable(state);
      this.textNum.setEditable(state);
      this.textYear.setEditable(state);
      this.textSpeciality.setEditable(state);
      this.textIssuedBy.setEditable(state);
      this.textAvgBall.setEditable(state);
   }

   public String[] getValues() {
      String[] values = new String[]{this.currentAbit, !this.textSeria.getText().equals("")?this.textSeria.getText():null, !this.textNum.getText().equals("")?this.textNum.getText():null, !this.textSpeciality.getText().equals("")?this.textSpeciality.getText():null, !this.textIssuedBy.getText().equals("")?this.textIssuedBy.getText():null, !this.textYear.getText().equals("")?this.textYear.getText():null, !this.textAvgBall.getText().equals("_.__")?this.textAvgBall.getText():null};
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

      if(data[5] != null && !data[5].matches("^[0-9]+$")) {
         mistakesIndices.add(Integer.valueOf(5));
         this.textYear.setForeground(Color.RED);
      } else {
         this.textYear.setForeground(Color.BLACK);
      }

      if(data[6] != null && !data[6].matches("^[0-9]+\\.?[0-9]*$")) {
         mistakesIndices.add(Integer.valueOf(6));
         this.textAvgBall.setForeground(Color.RED);
      } else {
         this.textAvgBall.setForeground(Color.BLACK);
      }

      return mistakesIndices;
   }
}
