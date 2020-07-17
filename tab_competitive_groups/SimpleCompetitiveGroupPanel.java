package tab_competitive_groups;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import tab_competitive_groups.CompetitiveGroupPanelListener;

public class SimpleCompetitiveGroupPanel extends JPanel {

   private JPanel parentPanel;
   private String currentAbit;
   private String[] data;
   private Dimension dimText = new Dimension(170, 25);
   private Dimension dimEducForm = new Dimension(90, 25);
   private Dimension dimGroup = new Dimension(340, 25);
   private Dimension dimRigidArea = new Dimension(10, 0);
   private JTextField textDir;
   private JTextField textSpec;
   private JTextField textEducForm;
   private JTextField textGroup;
   private JTextField textBall;
   JPanel allInfoPanel;
   JButton showInfo;


   public SimpleCompetitiveGroupPanel(String[] data, JPanel parentPanel) {
      this.parentPanel = parentPanel;
      this.setLayout(new BorderLayout());
      this.setBorder(BorderFactory.createEtchedBorder());
      JPanel compGroupPanel = new JPanel();
      compGroupPanel.setLayout(new BoxLayout(compGroupPanel, 3));
      this.add(compGroupPanel, "Center");
      JPanel dirSpecPanel = new JPanel();
      dirSpecPanel.setLayout(new FlowLayout(0));
      JLabel dirLabel = new JLabel("Направление");
      dirSpecPanel.add(dirLabel);
      this.textDir = new JTextField();
      this.textDir.setPreferredSize(this.dimText);
      this.textDir.setEditable(false);
      this.textDir.setBackground(Color.WHITE);
      dirSpecPanel.add(this.textDir);
      dirSpecPanel.add(Box.createRigidArea(this.dimRigidArea));
      JLabel specLabel = new JLabel("Специальность");
      dirSpecPanel.add(specLabel);
      this.textSpec = new JTextField();
      this.textSpec.setPreferredSize(this.dimText);
      this.textSpec.setEditable(false);
      this.textSpec.setBackground(Color.WHITE);
      dirSpecPanel.add(this.textSpec);
      compGroupPanel.add(dirSpecPanel);
      dirSpecPanel.add(Box.createRigidArea(this.dimRigidArea));
      JLabel educFormLabel = new JLabel("Форма обучения");
      dirSpecPanel.add(educFormLabel);
      this.textEducForm = new JTextField();
      this.textEducForm.setPreferredSize(this.dimEducForm);
      this.textEducForm.setEditable(false);
      this.textEducForm.setBackground(Color.WHITE);
      dirSpecPanel.add(this.textEducForm);
      JPanel groupBallPanel = new JPanel();
      groupBallPanel.setLayout(new FlowLayout(0));
      JLabel groupLabel = new JLabel("Конкурсная группа");
      groupBallPanel.add(groupLabel);
      this.textGroup = new JTextField();
      this.textGroup.setPreferredSize(this.dimGroup);
      this.textGroup.setEditable(false);
      this.textGroup.setBackground(Color.WHITE);
      this.textGroup.setHorizontalAlignment(2);
      groupBallPanel.add(this.textGroup);
      groupBallPanel.add(Box.createRigidArea(this.dimRigidArea));
      JLabel ballLabel = new JLabel("Конкурсный балл");
      groupBallPanel.add(ballLabel);
      this.textBall = new JTextField();
      this.textBall.setPreferredSize(this.dimText);
      this.textBall.setEditable(false);
      this.textBall.setBackground(Color.WHITE);
      groupBallPanel.add(this.textBall);
      compGroupPanel.add(groupBallPanel);
      this.showInfo = new JButton("+");
      this.showInfo.setForeground(Color.BLACK);
      this.showInfo.setFont(new Font("Tahoma", 1, 20));
      this.add(this.showInfo, "After");
      this.allInfoPanel = new JPanel();
      this.add(this.allInfoPanel, "Last");
      this.setValues(data);
      this.showInfo.addActionListener(new CompetitiveGroupPanelListener(this.allInfoPanel, data, parentPanel));
      this.limitMaxSize(true);
   }

   public void setValues(String[] values) {
      this.data = values;
      this.currentAbit = values[0];
      this.textDir.setText(values[12]);
      this.textSpec.setText(values[13]);
      this.textGroup.setText(values[14]);
      this.textEducForm.setText(values[15]);
      this.textBall.setText(values[8]);
   }

   public void limitMaxSize(boolean status) {
      this.setMaximumSize(status?new Dimension(this.parentPanel.getWidth(), this.parentPanel.getHeight() / 4):null);
   }

   public String getSpeciality() {
      return this.textSpec.getText();
   }

   public String[] getCompetitiveGroupWithDetails() {
      String[] competitiveGroupWithDetails = ((CompetitiveGroupPanelListener)this.showInfo.getActionListeners()[0]).getValues(true);
      String[] result = new String[]{competitiveGroupWithDetails[1], competitiveGroupWithDetails[2], competitiveGroupWithDetails[4], competitiveGroupWithDetails[5], competitiveGroupWithDetails[3]};
      return result;
   }

   public int getCompetitiveGroupOriginalBoxValue() {
      String[] competitiveGroupWithDetails = ((CompetitiveGroupPanelListener)this.showInfo.getActionListeners()[0]).getValues(true);
      return competitiveGroupWithDetails[10] != null?1:0;
   }
}
