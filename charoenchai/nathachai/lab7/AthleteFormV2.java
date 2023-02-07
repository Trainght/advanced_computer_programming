package charoenchai.nathachai.lab7;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV2 extends AthleteForm{
    protected JTextArea bioArea;
    protected JLabel nationalityLabel, sportLabel, bioLabel; 
    protected JPanel sportPanel, nationPanel, bioPanel, centerPanel ;
    protected JComboBox<String> nationComboBox;
    protected JList sportList;

    /**
     *     protected JPanel mainPanel, genderPannel, userIUpanel, TannLpanel, userButtomPanel, nortPanel, genderButtonPanel;
     * 
     */




    public AthleteFormV2(String title) {
        super(title);



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
}

    public static void createAndShowGUI() {
        AthleteFormV2 msw = new AthleteFormV2("Athlete Form V2");
        msw.addComponents();
        msw.setFrameFeatures();
        }
        
    @Override
    protected void addComponents() {
        super.addComponents();

         /* nation label and comboBox */
        nationalityLabel = new JLabel("Nationality :");
        nationComboBox = new JComboBox<String>();
        nationComboBox.addItem("American");
        nationComboBox.addItem("Chinese");
        nationComboBox.addItem("Indonesian");
        nationComboBox.addItem("Japanese");
        nationComboBox.addItem("Thai");
        nationComboBox.addItem("Vietnamese");
        /* set select to Thai */
        nationComboBox.setSelectedItem("Thai");
        /* Nation Panel */
        nationPanel = new JPanel(new GridLayout(1,2));
        nationPanel.add(nationalityLabel);
        nationPanel.add(nationComboBox);

        /* sport label and list */
        sportLabel = new JLabel("Sport :");
        String[] sportName = {"Badminton", "Boxing", "Football", "Running"};
        sportList = new JList(sportName);
        sportList.setSelectedIndex(2);
        /* Sport Panel */
        sportPanel = new JPanel(new GridLayout(1,2));
        sportPanel.add(sportLabel);
        sportPanel.add(sportList);
        
        /* bio label and textArea */
        bioLabel = new JLabel("Bio :");
        bioArea = new JTextArea(5,5);
        /* Bio Panel */
        bioPanel = new JPanel(new BorderLayout());
        bioPanel.add(bioLabel, BorderLayout.NORTH);
        bioPanel.add(bioArea, BorderLayout.CENTER);

        /* manage centerPanel to setting position of nationPanel sportPanel and bioPanel */
        centerPanel = new JPanel(new BorderLayout(0,4));
        centerPanel.add(nationPanel, BorderLayout.NORTH);
        centerPanel.add(sportPanel,BorderLayout.CENTER);
        centerPanel.add(bioPanel,BorderLayout.SOUTH);

        /* add centerPanel to userIUpanel and then will add to mainPanel  */
        userIUpanel.add(centerPanel, BorderLayout.CENTER);



    }
    

    }

