/**
 * This program is call AthleteFormV12 extends frome AthleteFormV11 and import AthleteV2 in lab.6
 * This program will manage the JMenu sort and sort the infomation in ArryList Athlete by name by height and by height weight
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 17, 2023
 */
package charoenchai.nathachai.lab10;

import java.awt.event.ActionEvent;
import javax.swing.*;
import charoenchai.nathachai.lab6.AthleteV2;
import java.util.Collections;
import java.util.Comparator;

public class AthleteFormV12 extends AthleteFormV11 {

    public AthleteFormV12(String title) {
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
        AthleteFormV12 msw = new AthleteFormV12("Athlete Form V12");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    /*
     * This method will add JMenuItem Bname Bheight and BheightAndWeight in JMenu
     * sort to actionListener
     */
    @Override
    protected void addListeners() {
        super.addListeners();
        for (JMenuItem string : sortArr) {
            string.addActionListener(this);
        }
    }

    /*
     * This method will detect the user when click any JMenuItem will call the same
     * method of JMenuItem
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        if (ATEGetSource == Bname) {
            sortName();
        }
        if (ATEGetSource == Bheight) {
            sortHeight();
        }
        if (ATEGetSource == BheightAndWeight) {
            sortHeightAndWeight();
        }
    }

    /*
     * This method will use collection.sort to sent the ArryList Athlete to class
     * NameComparator
     */
    public void sortName() {
        Collections.sort(arrListAthlete, new NameComparator());
    }

    /*
     * This method will use collection.sort to sent the ArryList Athlete to class
     * HeightComparator
     */
    public void sortHeight() {
        Collections.sort(arrListAthlete, new HeightComparator());
    }

    /*
     * This method will use collection.sort to sent the ArryList Athlete to class
     * HeightWeightComparator
     */
    public void sortHeightAndWeight() {
        Collections.sort(arrListAthlete, new HeightWeightComparator());
    }

    /*
     * This class implements Comparator<AthleteV2> will use compare 2 value of name
     * in AthleteV2 if atl1 compare to atl2 more than 0 will return 1 and less than
     * 0 will return -1 or there the balanced will return 0
     */
    public class NameComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 atl1, AthleteV2 atl2) {
            if (atl1.getName().compareTo(atl2.getName()) < 0) {
                return -1;
            } else if (atl1.getName().compareTo(atl2.getName()) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /*
     * This class implements Comparator<AthleteV2> will use compare 2 value of
     * height AthleteV2 and use symbol ( > more than) ( < less than) and if atl1
     * more than atl2 will return 1 and less than atl2 will return -1 or there the
     * balanced will return 0
     */
    public class HeightComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 atl1, AthleteV2 atl2) {
            if (atl1.getHeight() < atl2.getHeight()) {
                return -1;
            } else if (atl1.getHeight() > atl2.getHeight()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /*
     * This class implements Comparator<AthleteV2> will use compare 2 value of
     * height and weight AthleteV2 and use symbol ( > more than) ( < less than) and
     * if atl1 more than atl2 will return 1 and less than atl2 will return -1 or
     * there the balanced will compare with weight if atl1 more than atl2 will
     * return 1 and less than atl2 will return -1 or there the balanced will return
     * 0
     */
    public class HeightWeightComparator implements Comparator<AthleteV2> {
        @Override
        public int compare(AthleteV2 atl1, AthleteV2 atl2) {
            if (atl1.getHeight() > atl2.getHeight()) {
                return 1;
            } else if (atl1.getHeight() < atl2.getHeight()) {
                return -1;
            } else {
                if (atl1.getWeight() > atl2.getWeight()) {
                    return 1;
                } else if (atl1.getWeight() < atl2.getWeight()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}
