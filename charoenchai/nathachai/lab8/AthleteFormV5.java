package charoenchai.nathachai.lab8;

import java.awt.*;

import javax.swing.*;

public class AthleteFormV5 extends AthleteFormV4 {
    protected Font labelFont = new Font("Serif", Font.BOLD,14),
                    buttomFont = new Font("Serif", Font.BOLD,16),
                    menusFont = new Font("SanSerif", Font.BOLD,14);
    protected Color redKkuColor = new Color(167,59,36),
                    blueSportList = new Color(35,45, 222),
                    grayBioTextArea = new Color(200,200,200),
                    menusColor = new Color(6,57,112);

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

public static void createAndShowGUI() { // Method createAndShowGUI is call addComponents setFrameFeatures and
    // addMenus
AthleteFormV5 msw = new AthleteFormV5("Athlete Form V5"); // JFrame title is "Athlete Form V3"
msw.addComponents();
msw.addMenus();
msw.setFrameFeatures();
}

@Override
protected void addComponents() {
    super.addComponents();

    textDate.setBackground(redKkuColor);
    textHeight.setBackground(redKkuColor);
    textWeight.setBackground(redKkuColor);
    textName.setBackground(redKkuColor);

    labelName.setFont(labelFont);
    labelWeight.setFont(labelFont);
    labelHeight.setFont(labelFont);
    labelGender.setFont(labelFont);
    bioLabel.setFont(labelFont);
    sportLabel.setFont(labelFont);
    nationalityLabel.setFont(labelFont);
    yearLabel.setFont(labelFont);

    sportList.setForeground(blueSportList);

    cancelButton.setFont(buttomFont);
    resetButton.setFont(buttomFont);
    submitButton.setFont(buttomFont);

    bioArea.setBackground(grayBioTextArea);

    cancelButton.setToolTipText("Press the cancel button to cancel this form");
    resetButton.setToolTipText("Press the reset button to reset this form");
    submitButton.setToolTipText("Press the submit button to submit this form");

}

@Override
protected void addMenus() {
    super.addMenus();

    FileMenu.setFont(menusFont);
    FileMenu.setToolTipText("To create new, open, save form or exit");
    ConfigMenu.setFont(menusFont);
    ConfigMenu.setToolTipText("To configure size and color of a component");
    
    colorMenu.setFont(menusFont);
    colorMenu.setForeground(menusColor);
    sizeMenu.setFont(menusFont);
    sizeMenu.setForeground(menusColor);
    
    newItem.setFont(menusFont);
    newItem.setForeground(menusColor);
    openItem.setFont(menusFont);
    openItem.setForeground(menusColor);
    saveItem.setFont(menusFont);
    saveItem.setForeground(menusColor);
    exitItem.setFont(menusFont);
    exitItem.setForeground(menusColor);

    redItem.setFont(menusFont);
    redItem.setForeground(menusColor);
    greenItem.setFont(menusFont);
    greenItem.setForeground(menusColor);
    blueItem.setFont(menusFont);
    blueItem.setForeground(menusColor);

    sixteenItem.setFont(menusFont);
    sixteenItem.setForeground(menusColor);
    twentyItem.setFont(menusFont);
    twentyItem.setForeground(menusColor);
    twentyfourItem.setFont(menusFont);
    twentyfourItem.setForeground(menusColor);

    
    

}















}
