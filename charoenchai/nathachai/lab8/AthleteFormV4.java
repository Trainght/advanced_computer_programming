/**
 * This program is call AthleteFormV4 extends frome AthleteFormV3 to add label hobbies and 
 * checkbox reading, gardening, watching, shopping, others .
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 16, 2023
 */
package charoenchai.nathachai.lab8;

import java.awt.*;
import javax.swing.*;
import charoenchai.nathachai.lab7.*;

public class AthleteFormV4 extends AthleteFormV3 {
    /**
     * protected variable have JCheckBox, JPanel, JLabel, JSlider.
     */
    protected JCheckBox readingCheckBox, gardeningCheckBox, watchingCheckBox, shoppingCheckBox, othersCheckBox;
    protected JPanel hobbiesBoxPanel, hobbiesLabelAndBox, yearPanel, centerPanel;
    protected JLabel hobbiLabel, yearLabel;
    protected JSlider yearSlider;

    public AthleteFormV4(String title) {
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
     * Method createAndShowGUI is call addComponents setFrameFeatures and addMenus.
     * JFrame title is "Athlete Form V4".
     */
    public static void createAndShowGUI() {
        AthleteFormV4 msw = new AthleteFormV4("Athlete Form V4");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }
    /**
     * The method addComponents will call super addComponents and create new panel.
     * of hobbies and have 5 checkbox in side panel.
     * And create new panel of experience year in type JSlider have 0 to 20 year.
     */
    @Override
    protected void addComponents() {
        super.addComponents();

        readingCheckBox = new JCheckBox("Reading");
        gardeningCheckBox = new JCheckBox("Gardening");
        watchingCheckBox = new JCheckBox("Watching movies", true); // Choose this JCheckBox to correct.
        shoppingCheckBox = new JCheckBox("Shopping");
        othersCheckBox = new JCheckBox("Others");
        /**
         * Create new panel and add 5 checkbox to in this new panel.
         */
        hobbiesBoxPanel = new JPanel();
        hobbiesBoxPanel.add(readingCheckBox);
        hobbiesBoxPanel.add(gardeningCheckBox);
        hobbiesBoxPanel.add(watchingCheckBox);
        hobbiesBoxPanel.add(shoppingCheckBox);
        hobbiesBoxPanel.add(othersCheckBox);
        hobbiLabel = new JLabel("Hobbies: ");
        hobbiesLabelAndBox = new JPanel(new BorderLayout());
        hobbiesLabelAndBox.add(hobbiLabel, BorderLayout.WEST);
        hobbiesLabelAndBox.add(hobbiesBoxPanel, BorderLayout.SOUTH);
        /**
         * Create new panel and slider of experience year.
         * Add yearLabel and yearSlider to yearPanel.
         */
        yearLabel = new JLabel("Year of experience in this sport: ");
        yearSlider = new JSlider(0, 20, 0);
        yearSlider.setPaintTrack(true);
        yearSlider.setPaintTicks(true);
        yearSlider.setPaintLabels(true);
        yearSlider.setMajorTickSpacing(5);
        yearSlider.setMinorTickSpacing(1);

        yearPanel = new JPanel(new BorderLayout());
        yearPanel.add(yearLabel, BorderLayout.WEST);
        yearPanel.add(yearSlider, BorderLayout.SOUTH);

        bioPanel.add(yearPanel, BorderLayout.SOUTH); // Set yearPanel to south of bioPanel.
        /**
         * Create new panel for set hobbiesLabelAndBox to center of centerPanel.
         */
        centerPanel = new JPanel(new BorderLayout(0, 0));
        centerPanel.add(hobbiesLabelAndBox, BorderLayout.CENTER);

        userIUpanel.add(centerPanel, BorderLayout.CENTER); // Set centerPanel to center of userIUpanel
    }
}
