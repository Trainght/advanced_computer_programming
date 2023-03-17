/**
 * This program is call AthleteFormV11 extends frome AthleteFormV10 and import Gender from lab.5 and AthleteV2 from lab.6
 * This program will creat new JMenu and add in MenuBar and can click menu add the infomation of Athlete in ArrayList
 * And then click menu display will show all Athlete and click menu clear or no one Athlete in ArratList will show message dialog
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 17, 2023
 */
package charoenchai.nathachai.lab10;

import charoenchai.nathachai.lab9.*;
import charoenchai.nathachai.lab5.Athlete.Gender;
import charoenchai.nathachai.lab6.AthleteV2;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class AthleteFormV11 extends AthleteFormV10 {
    protected Gender genderEnum;
    protected JMenu data, sort;
    protected JMenuItem Bname, Bheight, BheightAndWeight, addItem, display, clear, search;

    protected JMenuItem[] dataArr, sortArr;
    protected Double weightATV, heightATV;
    protected String nameATV, nationality, birthdateATV, textDisplay, textSearch, nameAthlete;
    protected ArrayList<AthleteV2> arrListAthlete;
    protected AthleteV2 athlete;

    public AthleteFormV11(String title) {
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
        AthleteFormV11 msw = new AthleteFormV11("Athlete Form V11");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        arrListAthlete = new ArrayList<AthleteV2>();
    }

    /*
     * This Method will creat new JMenu and JMenuItem for manage infomation Athlete
     * and creat Arry of 2 JMenuItem and add then to MenuBar
     */
    @Override
    protected void addMenus() {
        super.addMenus();
        /* Creat new JMenu */
        data = new JMenu("Data");
        sort = new JMenu("Sort");
        /* Creat new JMenuItem */
        addItem = new JMenuItem("Add");
        display = new JMenuItem("Display");
        clear = new JMenuItem("Clear");
        search = new JMenuItem("Search");
        Bname = new JMenuItem("By Name");
        Bheight = new JMenuItem("By Height");
        BheightAndWeight = new JMenuItem("By Height and Weight");
        sortArr = new JMenuItem[] { Bname, Bheight, BheightAndWeight };
        /* Add JmenuItem to JMenu srot and dada */
        for (JMenuItem sortJmenuItem : sortArr) {
            sort.add(sortJmenuItem);
        }
        dataArr = new JMenuItem[] { addItem, display, clear, search };
        for (JMenuItem dataJmenuAndItem : dataArr) {
            data.add(dataJmenuAndItem);
        }
        /* Add JMnue sort to data and Add JMenu data to MenuBar */
        data.add(sort);
        menuBar.add(data);
    }

    /*
     * Add 4 JMenuItem addItem display clear and search to action listener for
     * handle the action
     */
    @Override
    protected void addListeners() {
        super.addListeners();
        for (JMenuItem dataJmenuAndItem : dataArr) {
            dataJmenuAndItem.addActionListener(this);
        }
    }

    /*
     * This method will detect the user when click any JMenuItem will call the same
     * method of JMenuItem
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);

        if (ATEGetSource == addItem) {
            addAthlete();
        } else if (ATEGetSource == display) {
            displayAthlete();
        } else if (ATEGetSource == clear) {
            clearAthlete();
        } else if (ATEGetSource == search) {
            searchAthlete();
        }
    }

    /*
     * This method will start when the user click add in MenuBar and set the value
     * of name weight height gender nation and birthDate then sent to class athlete
     * and add to ArryList then will show message dialog of athlete
     */
    protected void addAthlete() {
        weightATV = Double.parseDouble(textWeight.getText());
        heightATV = Double.parseDouble(textHeight.getText());
        nameATV = textName.getText();
        nationality = (String) nationComboBox.getSelectedItem();
        birthdateATV = textDate.getText();

        if (male.isSelected()) {
            genderEnum = Gender.MALE;
        } else if (female.isSelected()) {
            genderEnum = Gender.FEMALE;
        }

        athlete = new AthleteV2(nameATV, weightATV, heightATV, genderEnum, nationality, birthdateATV);
        arrListAthlete.add(athlete);
        JOptionPane.showMessageDialog(this, athlete);
    }

    /*
     * This method will start when the user click display in MenuBar will detect the
     * amount in ArryList Athlete and show message dialog all of athlet
     */
    protected void displayAthlete() {
        textDisplay = "There ";
        if (arrListAthlete.size() == 0) {
            textDisplay += "is no Athlete in the list";
        }
        if (arrListAthlete.size() == 1) {
            textDisplay += "is one Athlete as follows:" + newLine + "1. " + athlete;
        }
        if (arrListAthlete.size() >= 2) {
            textDisplay += "are " + arrListAthlete.size() + " Athletes as follows:" + newLine;
            for (int i = 0; i < arrListAthlete.size(); i++) {
                textDisplay += (i + 1) + ". " + arrListAthlete.get(i) + newLine;
            }
        }
        JOptionPane.showMessageDialog(this, textDisplay);
    }

    /*
     * This method will start when the user clear display in MenuBar and then will
     * clear the ArryList Athlete to empty
     */
    protected void clearAthlete() {
        arrListAthlete.clear();
    }

    /*
     * This method will start when the user search display in MenuBar then the user
     * fill the name of Athlete in input message dialog will search name in ArryList
     * Athlete and will show message dialog
     */
    protected void searchAthlete() {

        nameAthlete = JOptionPane.showInputDialog("Please enter athlete name:");
        textSearch = "";

        for (AthleteV2 arrList : arrListAthlete) {
            if (arrList.getName().equalsIgnoreCase(nameAthlete)) {
                textSearch += arrList + newLine;
                JOptionPane.showMessageDialog(this, textSearch);
                return;
            }
        }
        if (!nameAthlete.isEmpty()) {
            textSearch = "Athlete " + nameAthlete + " is NOT found";
            JOptionPane.showMessageDialog(this, textSearch);
        }
    }
}