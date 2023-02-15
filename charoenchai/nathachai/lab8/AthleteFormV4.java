package charoenchai.nathachai.lab8;

import java.awt.*;

import javax.swing.*; // Import all Javax.swing
import charoenchai.nathachai.lab7.*;

public class AthleteFormV4 extends AthleteFormV3 {

    protected JCheckBox readingCheckBox, gardenignCheckBox, watchingCheckBox, shoppingCheckBox, othersCheckBox;
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

    public static void createAndShowGUI() { // Method createAndShowGUI is call addComponents setFrameFeatures and
                                            // addMenus
        AthleteFormV4 msw = new AthleteFormV4("Athlete Form V4"); // JFrame title is "Athlete Form V3"
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    @Override
    protected void addComponents() {
        super.addComponents();

        // String[] hobbiesList = {"Reading", "Gardening", "Watching movies", "Shopping"
        // ,"Others"};
        readingCheckBox = new JCheckBox("Reading");
        gardenignCheckBox = new JCheckBox("Gardening");
        watchingCheckBox = new JCheckBox("Watching movies", true);
        shoppingCheckBox = new JCheckBox("Shopping");
        othersCheckBox = new JCheckBox("Others");

        hobbiesBoxPanel = new JPanel();
        hobbiesBoxPanel.add(readingCheckBox);
        hobbiesBoxPanel.add(gardenignCheckBox);
        hobbiesBoxPanel.add(watchingCheckBox);
        hobbiesBoxPanel.add(shoppingCheckBox);
        hobbiesBoxPanel.add(othersCheckBox);

        hobbiLabel = new JLabel("Hobbies: ");

        hobbiesLabelAndBox = new JPanel(new BorderLayout());
        hobbiesLabelAndBox.add(hobbiLabel, BorderLayout.WEST);
        hobbiesLabelAndBox.add(hobbiesBoxPanel, BorderLayout.SOUTH);

        yearLabel = new JLabel("Year of experience in this sport: ");

        yearSlider = new JSlider(0, 20, 0);
        yearSlider.setPaintTrack(true);
        yearSlider.setPaintTicks(true);
        yearSlider.setPaintLabels(true);

        // set spacing
        yearSlider.setMajorTickSpacing(5);
        yearSlider.setMinorTickSpacing(1);

        yearPanel = new JPanel(new BorderLayout());
        yearPanel.add(yearLabel, BorderLayout.WEST);
        yearPanel.add(yearSlider, BorderLayout.SOUTH);

        bioPanel.add(yearPanel, BorderLayout.SOUTH);

        centerPanel = new JPanel(new BorderLayout(0,0));
        centerPanel.add(hobbiesLabelAndBox, BorderLayout.CENTER);

        userIUpanel.add(centerPanel, BorderLayout.CENTER);

    }

}
