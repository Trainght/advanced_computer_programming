/**
 * This program is call MySimpleWindow will show like program MySimpleWindow and show infomation of AthleteForm.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 9, 2023
 */
package charoenchai.nathachai.lab7;

import javax.swing.*; // Import all Javax.swing

import java.awt.*; // Import all Java.awt

public class AthleteForm extends MySimpleWindow { // This class MySimpleWindown extends from MySimpleWindow

    protected JLabel labelName, labelWeight, labelHeight, labelDate, labelGender; // protected JLabel
    protected JTextField textName, textWeight, textHeight, textDate; // protected JTextField
    protected JPanel mainPanel, genderPannel, userIUpanel, TandLpanel, NorthUIPanel, genderButtonPanel; // protected JPanel
    protected ButtonGroup selectionGender; // protected ButtonGroup
    protected JRadioButton male, female; // protected JRadioButton

    public AthleteForm(String title) {
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
        AthleteForm msw = new AthleteForm("Athlete Form"); // JFrame title is "Athlete Form"
        msw.addComponents();
        msw.setFrameFeatures();
    }

    @Override // Override method addComponents
    protected void addComponents() {
        super.addComponents(); // call super addComponents
        // Label have name, weight, height,date,gender
        labelName = new JLabel("Name :");
        labelWeight = new JLabel("Weight :");
        labelHeight = new JLabel("Height :");
        labelDate = new JLabel("Date of Birth (dd-mm-yyyy) :");
        labelGender = new JLabel("Gender :");
        // TextField name, weight, height,date and have 15 columns
        textDate = new JTextField(15);
        textHeight = new JTextField(15);
        textWeight = new JTextField(15);
        textName = new JTextField(15);

        TandLpanel = new JPanel(new GridLayout(4, 2, 5, 4)); // JPanel in GridLayout 4 rows 2 clos
        TandLpanel.add(labelName); // add label name to TandLpanel
        TandLpanel.add(textName); // add text name to TandLpanel

        TandLpanel.add(labelWeight); // add label weight to TandLpanel
        TandLpanel.add(textWeight); // add text weight to TandLpanel

        TandLpanel.add(labelHeight); // add label height to TandLpanel
        TandLpanel.add(textHeight); // add text height to TandLpanel

        TandLpanel.add(labelDate); // add label date to TandLpanel
        TandLpanel.add(textDate); // add text date to TandLpanel

        // RadioButtom and ButtonGroup of male and female
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        // add buttom male and female to ButtomGroup to select one
        selectionGender = new ButtonGroup();
        selectionGender.add(male);
        selectionGender.add(female);
        genderButtonPanel = new JPanel(); // add buttom male and female to panel
        genderButtonPanel.add(male);
        genderButtonPanel.add(female);

        genderPannel = new JPanel(new GridLayout(1, 2)); // JPanel in GridLayout 1 rows 2 clos and add labelGender,genderButtomPanel to JPanel genderPannel
        genderPannel.add(labelGender);
        genderPannel.add(genderButtonPanel);

        NorthUIPanel = new JPanel(new BorderLayout(0,3)); // JPanel in BorderLayout
        NorthUIPanel.add(TandLpanel, BorderLayout.NORTH); // set TandLpanel to NORTH in centerUIPanel
        NorthUIPanel.add(genderPannel, BorderLayout.SOUTH); // set genderPannel to CENTER in centerUIPanel

        // - userIUpanel
        userIUpanel = new JPanel(new BorderLayout(0,4));
        userIUpanel.add(NorthUIPanel, BorderLayout.NORTH); // set genderPannel to CENTER in centerUIPanel

        // - main panel5
        mainPanel = new JPanel(new BorderLayout(0, 4));
        mainPanel.add(userIUpanel, BorderLayout.CENTER); // set userIUpanel to CENTER in mainPanel
        mainPanel.add(buttonPanel, BorderLayout.SOUTH); // set userButtomPanel to SOUTH in mainPanel

        // add mainPanel to frame
        this.add(mainPanel);
    }
}
