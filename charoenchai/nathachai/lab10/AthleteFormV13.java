/**
 * This program is call AthleteFormV13 extends frome AthleteFormV12 will check whether weight and height are valid double numbers
 * In other words, the numbers cannot be characters. In addition, the weight value needs to be in the
 * range (0, 200] and the height value needs to be in the range (0, 300]
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 17, 2023
 */
package charoenchai.nathachai.lab10;

import javax.swing.*;
import java.awt.event.*;

public class AthleteFormV13 extends AthleteFormV12 {
    protected final double MAX_WEIGHT = 200;
    protected final double MAX_HEIGHT = 300;
    protected boolean weightBoo, heightBoo;
    protected Double number;
    protected String numberTxt, nameOfTxtField;
    protected Object newATEGetSource;

    public AthleteFormV13(String title) {
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
        AthleteFormV13 msw = new AthleteFormV13("Athlete Form V13");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    /*
     * This is Override method of actionPerformed for write code to check the value
     * input then the user input some value in textFeild weight and height then will
     * sent the textFeild to method notifyNumberTxtFieldChange if the method
     * notifyNumberTxtFieldChange return true or false they will show message dialog
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        newATEGetSource = event.getSource();
        if (newATEGetSource == textWeight) {
            notifyNumberTxtFieldChange(textWeight);
            if (weightBoo == false) {
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Weigh is change to " + textWeight.getText());
            }
        } else if (newATEGetSource == textHeight) {
            notifyNumberTxtFieldChange(textHeight);
            if (heightBoo == false) {
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Height is change to " + textHeight.getText());
            }
        } else {
            super.actionPerformed(event);
        }
    }

    /*
     * This is Override method of addAthlete for write code to check true or false
     * then will sent the 3 value to method getValidNumber of String ,String ,Double
     */
    @Override
    protected void addAthlete() {
        getValues();
        weightBoo = getValidNumber(textWeight.getText(), "Weight", MAX_WEIGHT);
        if (weightBoo == false) {
            return;
        }
        heightBoo = getValidNumber(textHeight.getText(), "Height", MAX_HEIGHT);
        if (heightBoo == false) {
            return;
        }
        super.addAthlete();

    }

    /*
     * This method will get value type JTextField from method actionPerformed and
     * then get text from textFeild and set the string of text feild
     */
    protected void notifyNumberTxtFieldChange(JTextField txtField) {
        numberTxt = txtField.getText();
        if (txtField == textWeight) {
            nameOfTxtField = "Weight";
        }
        if (txtField == textHeight) {
            nameOfTxtField = "Height";
        }

        if (txtField == textWeight) {
            weightBoo = getValidNumber(numberTxt, nameOfTxtField, MAX_WEIGHT);
        } else if (txtField == textHeight) {
            heightBoo = getValidNumber(numberTxt, nameOfTxtField, MAX_HEIGHT);
        }
    }

    /*
     * The method will get the value from method notifyNumberTxtFieldChange or
     * method addAthlete to check the value to less than 0 or more than MAXVALUE and
     * if the value is not the number will show show message dialog
     */
    protected boolean getValidNumber(String numberTxt, String nameOfTxtField, double MAXVALUE) {
        try {
            number = Double.parseDouble(numberTxt);
            if (number < 0) {
                JOptionPane.showMessageDialog(this, nameOfTxtField + " should be greater than 0");
                return false;
            } else if (number > MAXVALUE) {
                JOptionPane.showMessageDialog(this, nameOfTxtField + " should be less than " + MAXVALUE);
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for " + nameOfTxtField);
            return false;
        }

    }
}
