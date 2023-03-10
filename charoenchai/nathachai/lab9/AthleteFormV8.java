/**
 * This program is call AthleteFormV8 extends frome AthleteFormV6 and implements ActionListener
 * to handled three button cancel reset and submit.
 * the user clicks click submit button then the program should show the values of all components in the Bio text area
 *
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 10, 2023
 */
package charoenchai.nathachai.lab9;

import charoenchai.nathachai.lab8.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {

    protected Object ATEGetSource;
    protected String resultTxt, textofCheckBox, textofGender, newLine = "\n";
    protected JButton[] buttomArr;
    protected JTextField[] textFieldArr;
    protected JCheckBox[] checkBoxArr;
    protected JRadioButton[] gendeRadioArr;

    public AthleteFormV8(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    /*
     * Add two medthod initValues() and addListeners() for set the value and
     * addListener.
     */
    public static void createAndShowGUI() {
        AthleteFormV8 msw = new AthleteFormV8("Athlete Form V8");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    /*
     * Creat Array of JButton[] JTextField[] JCheckBox[] and JRadioButton[] for easy
     * to use in the other method.
     */
    @Override
    protected void addComponents() {
        super.addComponents();
        buttomArr = new JButton[] { cancelButton, resetButton, submitButton };
        textFieldArr = new JTextField[] { textName, textWeight, textHeight, textDate };
        checkBoxArr = new JCheckBox[] { readingCheckBox, gardeningCheckBox, watchingCheckBox, shoppingCheckBox,
                othersCheckBox };
        gendeRadioArr = new JRadioButton[] { male, female };
    }

    /*
     * initValues() set the value when the user run the program.
     */
    public void initValues() {
        for (JTextField JtextSetBackground : textFieldArr) {
            JtextSetBackground.setBackground(Color.PINK);
        }

        textName.setText("Nathachai Charoenchai");
        textWeight.setText("80");
        textHeight.setText("175");
        textDate.setText("03/06/2003");
        male.setSelected(true);
        yearSlider.setValue(10);
    }

    protected void addListeners() {
        for (JButton buttomAddAction : buttomArr) {
            buttomAddAction.addActionListener(this);
        }
    }

    /*
     * This medtod will check when the user click some button in three button and
     * call the method name handleSubmitButton(); handleResetButton(); and
     * handleCancelButton(); .
     */
    public void actionPerformed(ActionEvent event) {
        ATEGetSource = event.getSource();

        if (ATEGetSource == submitButton) {
            handleSubmitButton();
        } else if (ATEGetSource == resetButton) {
            handleResetButton();
        } else if (ATEGetSource == cancelButton) {
            handleCancelButton();
        }
    }

    /*
     * getValues() method get and set the all value in resultTxt .
     */
    public void getValues() {

        textofCheckBox = "";
        for (JCheckBox checkBoxSelected : checkBoxArr) {
            if (checkBoxSelected.isSelected()) {
                textofCheckBox += " " + checkBoxSelected.getText();
            }
        }

        textofGender = "";
        for (JRadioButton JRadioButtonSelected : gendeRadioArr) {
            if (JRadioButtonSelected.isSelected()) {
                textofGender = JRadioButtonSelected.getText();
            }
        }

        resultTxt = ("Name: " + textName.getText() +
                newLine + "Weight: " + textWeight.getText() +
                newLine + "Height: " + textHeight.getText() +
                newLine + "Date of birth : " + textDate.getText() +
                newLine + "Gender: " + textofGender +
                newLine + "Hobbies:" + textofCheckBox +
                newLine + "Nationality: " + nationComboBox.getSelectedItem() +
                newLine + "Sport: " + sportList.getSelectedValue() +
                newLine + "Year: " + yearSlider.getValue());
    }

    /*
     * the user clicks click submit button then the program should show the values
     * of all components in the Bio text area.
     */
    public void handleSubmitButton() {
        getValues();
        bioArea.setText(resultTxt);
    }

    /*
     * Click reset button the program reset all values and also reset the background
     * color of all text fields to white color.
     */
    public void handleResetButton() {
        for (JTextField JtextSetText : textFieldArr) {
            JtextSetText.setText(null);
        }

        for (JTextField JtextSetBackground : textFieldArr) {
            JtextSetBackground.setBackground(Color.WHITE);
        }

        for (JCheckBox checkBoxSetS : checkBoxArr) {
            checkBoxSetS.setSelected(false);
        }

        bioArea.setText(null);
        selectionGender.clearSelection();
        nationComboBox.setSelectedIndex(-1);
        sportList.clearSelection();
        yearSlider.setValue(0);
    }

    /*
     * Click cancle button the program undo all settings that are performed in the
     * method initValues() and also cancel the background color setting of all text
     * fields to red color.
     */
    public void handleCancelButton() {
        for (JTextField JtextSetText : textFieldArr) {
            JtextSetText.setText(null);
        }

        for (JTextField JtextSetBackground : textFieldArr) {
            JtextSetBackground.setBackground(redKkuColor);
        }

        for (JCheckBox checkBoxSetS : checkBoxArr) {
            if (checkBoxSetS == watchingCheckBox) {
                watchingCheckBox.setSelected(true);
            } else {
                checkBoxSetS.setSelected(false);
            }
        }

        bioArea.setText(null);
        selectionGender.clearSelection();
        nationComboBox.setSelectedIndex(4);
        sportList.setSelectedIndex(2);
        yearSlider.setValue(0);
    }
}