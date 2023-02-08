/**
 * This program is call AthleteFormV3 will show like program AthleteFormV2 and show menubar .
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: February 9, 2023
 */
package charoenchai.nathachai.lab7;

import javax.swing.*; // Import all Javax.swing

public class AthleteFormV3 extends AthleteFormV2 { // This class AthleteFormV3 extends from AthleteFormV2
    protected JMenuBar menuBar; // protected JMenuBar
    protected JMenu FileMenu, ConfigMenu, colorMenu, sizeMenu; // protected JMenu
    protected ImageIcon newIcon, openIcon, saveIcon; // protected ImageIcon
    protected JMenuItem newItem, openItem, saveItem, exitItem, redItem, greenItem, blueItem, sixteenItem, twentyItem,
            twentyfourItem; // protected JMenuItem

    public AthleteFormV3(String title) {
        super(title); // sent string to JFrame
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() { // Method createAndShowGUI is call addComponents setFrameFeatures and addMenus
        AthleteFormV3 msw = new AthleteFormV3("Athlete Form V3"); // JFrame title is "Athlete Form V3"
        msw.addComponents();
        msw.setFrameFeatures();
        msw.addMenus();
    }

    protected void addMenus() {
        /* set ImageIcon is use getClass().getClassLoader().getResource() */
        newIcon = new ImageIcon(
                getClass().getClassLoader().getResource("charoenchai/nathachai/images/New-icon.png"));
        openIcon = new ImageIcon(
                getClass().getClassLoader().getResource("charoenchai/nathachai/images/Open-icon.png"));
        saveIcon = new ImageIcon(
                getClass().getClassLoader().getResource("charoenchai/nathachai/images/Save-icon.png"));
        /* Set JMenuItem new open save and exit */
        newItem = new JMenuItem("New", newIcon);
        openItem = new JMenuItem("Open", openIcon);
        saveItem = new JMenuItem("Save", saveIcon);
        exitItem = new JMenuItem("Exit");
        /* Set JMenuItem to JMenu */
        FileMenu = new JMenu("File");
        FileMenu.add(newItem);
        FileMenu.add(openItem);
        FileMenu.add(saveItem);
        FileMenu.add(exitItem);
        /* Creat JMenuItem and Set JMenuItem into JMenu*/
        redItem = new JMenuItem("Red");
        greenItem = new JMenuItem("Green");
        blueItem = new JMenuItem("Blue");

        colorMenu = new JMenu("Color");
        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);
        /* Creat JMenuItem and them into JMenu */
        sixteenItem = new JMenuItem("16");
        twentyItem = new JMenuItem("20");
        twentyfourItem = new JMenuItem("26");

        sizeMenu = new JMenu("Size");
        sizeMenu.add(sixteenItem);
        sizeMenu.add(twentyItem);
        sizeMenu.add(twentyfourItem);
        /* Creat JMenu and add two JMenu colorMenu,sizeMenu */
        ConfigMenu = new JMenu("Config");
        ConfigMenu.add(colorMenu);
        ConfigMenu.add(sizeMenu);
        /* Creat JMenuBar and add two JMenu FileMenu,ConfigMenu */
        menuBar = new JMenuBar();
        menuBar.add(FileMenu);
        menuBar.add(ConfigMenu);
        /* JFrame set menubar */
        this.setJMenuBar(menuBar);
    }
}
