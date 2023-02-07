package charoenchai.nathachai.lab7;

import javax.swing.*;

import java.awt.*;

public class AthleteForm extends MySimpleWindow {
    protected JLabel labelName, labelWeight, labelHeight, labelDate, labelGender;
    protected JTextField textName, textWeight, textHeight, textDate;

    protected JPanel mainPanel, genderPannel, userIUpanel, TannLpanel, userButtomPanel, nortPanel, genderButtonPanel;
    protected ButtonGroup selectionGender;
    protected JRadioButton male, female;

    public AthleteForm(String title) {
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
        AthleteForm msw = new AthleteForm("Athlete Form");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        // Label
        labelName = new JLabel("Name :");
        labelWeight = new JLabel("Weight :");
        labelHeight = new JLabel("Height :");
        labelDate = new JLabel("Date of Birth (dd-mm-yyyy) :");
        labelGender = new JLabel("Gender :");
        // TextField
        textDate = new JTextField(15);
        textHeight = new JTextField(15);
        textWeight = new JTextField(15);
        textName = new JTextField(15);

        TannLpanel = new JPanel(new GridLayout(4, 2, 5, 4));
        TannLpanel.add(labelName);
        TannLpanel.add(textName);

        TannLpanel.add(labelWeight);
        TannLpanel.add(textWeight);

        TannLpanel.add(labelHeight);
        TannLpanel.add(textHeight);

        TannLpanel.add(labelDate);
        TannLpanel.add(textDate);

        // RadioButtom and ButtonGroup
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        selectionGender = new ButtonGroup();
        selectionGender.add(male);
        selectionGender.add(female);
        genderButtonPanel = new JPanel();
        genderButtonPanel.add(male);
        genderButtonPanel.add(female);

        genderPannel = new JPanel(new GridLayout(1, 2));
        genderPannel.add(labelGender);
        genderPannel.add(genderButtonPanel);

        nortPanel = new JPanel(new BorderLayout());
        nortPanel.add(TannLpanel, BorderLayout.NORTH);
        nortPanel.add(genderPannel, BorderLayout.CENTER);

        // - userIUpanel
        userIUpanel = new JPanel(new BorderLayout());
        userIUpanel.add(nortPanel, BorderLayout.NORTH);

        userButtomPanel = new JPanel(new BorderLayout());
        userButtomPanel.add(buttonPanel, BorderLayout.CENTER);
        // - main panel
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(userIUpanel, BorderLayout.NORTH);
        mainPanel.add(userButtomPanel, BorderLayout.SOUTH);

        // add mainPanel to frame
        this.add(mainPanel);

    }
}
