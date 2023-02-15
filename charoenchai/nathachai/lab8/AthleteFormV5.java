/**
 * This program is call AthleteFormV5 extends frome AthleteFormV4 to create tool tips and set font style,
 * font color, font background of AthleteForm.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 16, 2023
 */
package charoenchai.nathachai.lab8;

import java.awt.*;
import javax.swing.*;

public class AthleteFormV5 extends AthleteFormV4 {
    /**
     * protected variable have Font, Color.
     */
    protected Font labelFont = new Font("Serif", Font.BOLD, 14),
            buttomFont = new Font("Serif", Font.BOLD, 16),
            menusFont = new Font("SanSerif", Font.BOLD, 14);
    protected Color redKkuColor = new Color(167, 59, 36),
            blueSportList = new Color(35, 45, 222),
            grayBioTextArea = new Color(200, 200, 200),
            menusColor = new Color(6, 57, 112);

    public AthleteFormV5(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    /**
     * Method createAndShowGUI is call addComponents setFrameFeatures and addMenus.
     * JFrame title is "Athlete Form V5".
     */
    public static void createAndShowGUI() {
        AthleteFormV5 msw = new AthleteFormV5("Athlete Form V5");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }
    /**
     * Override addComponents and call super addComponents.
     * In this method will set font, set color background and set color foreground.
     * Set tooltips to buttom of cancel reset and submit.
     */
    @Override
    protected void addComponents() {
        super.addComponents();
        /* Set color background of 4 textField */
        textDate.setBackground(redKkuColor);
        textHeight.setBackground(redKkuColor);
        textWeight.setBackground(redKkuColor);
        textName.setBackground(redKkuColor);
        /* Set font of 8 label */
        labelName.setFont(labelFont);
        labelWeight.setFont(labelFont);
        labelHeight.setFont(labelFont);
        labelGender.setFont(labelFont);
        bioLabel.setFont(labelFont);
        sportLabel.setFont(labelFont);
        nationalityLabel.setFont(labelFont);
        yearLabel.setFont(labelFont);
        /* Set color foreground of sportLisrt */
        sportList.setForeground(blueSportList);
        /* Set font of 3 buttom */
        cancelButton.setFont(buttomFont);
        resetButton.setFont(buttomFont);
        submitButton.setFont(buttomFont);
        /* Set color backgroung of textArea */
        bioArea.setBackground(grayBioTextArea);
        /* Set tooltips of 3 buttom */
        cancelButton.setToolTipText("Press the cancel button to cancel this form");
        resetButton.setToolTipText("Press the reset button to reset this form");
        submitButton.setToolTipText("Press the submit button to submit this form");

    }
    /**
     * This method is will add tooltips and Set font, Set foreground of menu 
     */
    @Override
    protected void addMenus() {
        super.addMenus();
        /* Set font and set tooltips of FileMenu and ConfigMenu */
        FileMenu.setFont(menusFont);
        FileMenu.setToolTipText("To create new, open, save form or exit");
        ConfigMenu.setFont(menusFont);
        ConfigMenu.setToolTipText("To configure size and color of a component");
        /* Set font and set color foreground of colorMenu and sizeMenu */
        colorMenu.setFont(menusFont);
        colorMenu.setForeground(menusColor);
        sizeMenu.setFont(menusFont);
        sizeMenu.setForeground(menusColor);
        /* Set font and set color foreground of newItem, openItem, saveItem and exitItem */
        newItem.setFont(menusFont);
        newItem.setForeground(menusColor);
        openItem.setFont(menusFont);
        openItem.setForeground(menusColor);
        saveItem.setFont(menusFont);
        saveItem.setForeground(menusColor);
        exitItem.setFont(menusFont);
        exitItem.setForeground(menusColor);
        /* Set font and set color foreground of redItem, greenItem and blueItem */
        redItem.setFont(menusFont);
        redItem.setForeground(menusColor);
        greenItem.setFont(menusFont);
        greenItem.setForeground(menusColor);
        blueItem.setFont(menusFont);
        blueItem.setForeground(menusColor);
        /* Set font and set color foregtound of sixteenItem, twentyItem and twentyfourItem */
        sixteenItem.setFont(menusFont);
        sixteenItem.setForeground(menusColor);
        twentyItem.setFont(menusFont);
        twentyItem.setForeground(menusColor);
        twentyfourItem.setFont(menusFont);
        twentyfourItem.setForeground(menusColor);
    }
}
