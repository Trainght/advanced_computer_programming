/**
 * This program is call MySimpleWindow will show like program AthleteFormV2 and show nation sport bio.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 9, 2023
 */
package charoenchai.nathachai.lab7;

import javax.swing.*; // Import all Javax.swing
import java.awt.*; // Import all Javax.swing

public class AthleteFormV2 extends AthleteForm { // This class AthleteFormV2 extends from AthleteForm
    protected JTextArea bioArea; // protected JTextArea
    protected JLabel nationalityLabel, sportLabel, bioLabel; // protected JLabel
    protected JPanel sportPanel, nationPanel, bioPanel, southUIPanel; // protected JPanel
    protected JComboBox<String> nationComboBox; // protected JComboBox<String>
    protected JList<String> sportList; // protected JList
    protected JScrollPane bioscroll; // protected JScrollPane
    protected String[] sportName = { "Badminton", "Boxing", "Football", "Running" }; // protected list String[]

    public AthleteFormV2(String title) {
        super(title); // sent string to JFrame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() { // Method createAndShowGUI is call addComponents and setFrameFeatures
        AthleteFormV2 msw = new AthleteFormV2("Athlete Form V2"); // JFrame title is "Athlete Form V2"
        msw.addComponents();
        msw.setFrameFeatures();
    }

    @Override // Override method addComponents
    protected void addComponents() {
        super.addComponents();
        /* nation label and comboBox */
        nationalityLabel = new JLabel("Nationality :"); // add text of nationalityLabel
        nationComboBox = new JComboBox<String>(); // JComboBox<String>
        nationComboBox.addItem("American"); // add Item to comboBox
        nationComboBox.addItem("Chinese"); // add Item to comboBox
        nationComboBox.addItem("Indonesian"); // add Item to comboBox
        nationComboBox.addItem("Japanese"); // add Item to comboBox
        nationComboBox.addItem("Thai"); // add Item to comboBox
        nationComboBox.addItem("Vietnamese"); // add Item to comboBox
        /* set select to Thai */
        nationComboBox.setSelectedItem("Thai");
        /* Nation Panel */
        nationPanel = new JPanel(new GridLayout(1, 2)); // JPanel in GridLayout 1 rows 2 clos
        nationPanel.add(nationalityLabel);
        nationPanel.add(nationComboBox);

        /* sport label and list */
        sportLabel = new JLabel("Sport :"); // JLabel sport
        sportList = new JList<String>(sportName); // list sport
        sportList.setSelectedIndex(2); // set select position of sportList
        /* Sport Panel */
        sportPanel = new JPanel(new GridLayout(1, 2)); // JPanel in GridLayout 1 rows 2 clos
        sportPanel.add(sportLabel); // add to panel sport
        sportPanel.add(sportList); // add to panel sport
        /* bio label and textArea */
        bioLabel = new JLabel("Bio :");// JLabel Bio
        bioArea = new JTextArea(5, 5);// JTextArea rows 5 columns 5
        bioArea.setLineWrap(true); // setLineWrap is true
        bioArea.setWrapStyleWord(true); // setWrapStyleWord is true
        bioscroll = new JScrollPane(bioArea); // add scoll pane to TextArea
        /* Bio Panel */
        bioPanel = new JPanel(new BorderLayout()); // JPanel in BorderLayout
        bioPanel.add(bioLabel, BorderLayout.NORTH); // set bioLabel to NORTH in bioPanel
        bioPanel.add(bioscroll, BorderLayout.CENTER); // set bioscroll to CENTER in bioPanel
        /*
         * manage centerPanel to setting position of nationPanel sportPanel and bioPanel
         */
        southUIPanel = new JPanel(new BorderLayout(0, 4)); // JPanel in BorderLayout
        southUIPanel.add(nationPanel, BorderLayout.NORTH); // set nationPanel to NORTH in southUIPanel
        southUIPanel.add(sportPanel, BorderLayout.CENTER); // set sportPanel to CENTER in southUIPanel
        southUIPanel.add(bioPanel, BorderLayout.SOUTH); // set bioPanel to SOUTH in southUIPanel

        /* add centerPanel to userIUpanel and then will add to mainPanel */
        userIUpanel.add(southUIPanel, BorderLayout.SOUTH); // set southUIPanel to SOUTH in userIUpanel
    }
}
