/**
 * This program is call AthleteFormV10 extends frome AthleteFormV9 and implements ListSelectionListener 
 * and ChangeListener for handle JSlider and Jlist when the user choose some value will show the message dialog.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 10, 2023
 */
package charoenchai.nathachai.lab9;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AthleteFormV10 extends AthleteFormV9 implements ListSelectionListener, ChangeListener {
    protected int sliderValue;
    protected int[] sportIndicesArr;
    protected String textofSport;

    public AthleteFormV10(java.lang.String title) {
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
        AthleteFormV10 msw = new AthleteFormV10("Athlete Form V10");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    /*
     * This method will add Jslide to ChangeListener and add Jlist to
     * ListSelectionListener for handle.
     */
    @Override
    protected void addListeners() {
        super.addListeners();
        sportList.addListSelectionListener(this);
        yearSlider.addChangeListener(this);
    }

    /*
     * This medthod will check state Change for Jslider if the arrow stop will show
     * the message dialog.
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        if (!yearSlider.getValueIsAdjusting()) {
            sliderValue = yearSlider.getValue();
            JOptionPane.showMessageDialog(this,
                    "# of experience years is " + sliderValue,
                    "Slider Value Changed",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /*
     * This medthod will check value Change for JList when the user selected
     * multiple interval then will show the message dialog according to user choice.
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            sportIndicesArr = sportList.getSelectedIndices();
            textofSport = "Selected sports are ";
            for (int i = 0; i < sportIndicesArr.length; i++) {
                textofSport += sportName[sportIndicesArr[i]] + " ";
            }
            JOptionPane.showMessageDialog(this, textofSport);
        }
    }
}
