/**
 * This program is call AthleteFormV15 extends frome AthleteFormV14 is will override method write file and 
 * read file in AthleteFormV14 to write file and read file name year in type Data Stream .
 * When ther user click JMenuItem save or open will show save dialog and open dialog  2 time .
 * The first time will show about save or open file hobbie.txt and the second will show about save or open file year then click save will creat
 * file and show message dialog path of file or click open will read file and check year experiences to show in bio text area in different text .
 * Check the value int of year if the value is 0 or 1 and have one more there will show in bio text area in different text. 
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 22, 2023
 */
package charoenchai.nathachai.Lab11;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AthleteFormV15 extends AthleteFormV14 {
    protected String stringFileYear;

    protected FileOutputStream fileOutput;
    protected DataOutputStream dataOutput;
    protected Map<String, Double> yearMap;
    protected FileInputStream fileInput;
    protected DataInputStream dataInput;
    protected Integer yearExp;

    public AthleteFormV15(String title) {
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
        AthleteFormV15 msw = new AthleteFormV15("Athlete Form V15");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    /*
     * Override method writeFile() and call super for write new file name year in
     * type Data Stream and use HashMap to writeUTF in name and writeDouble in the
     * value of year and show message dialog path of file write
     */
    @Override
    protected void writeFile() {
        super.writeFile();
        stringFileYear = "year";
        fileName = new File(stringFileYear);
        fileCh = new JFileChooser(); // creat new JFileChooser to show save dialog again
        fileCh.setSelectedFile(fileName);

        returnValueOfDialog = fileCh.showSaveDialog(this);

        if (returnValueOfDialog == JFileChooser.APPROVE_OPTION) {

            try {
                fileOutput = new FileOutputStream(fileCh.getSelectedFile());
                dataOutput = new DataOutputStream(fileOutput);
                yearMap = new HashMap<String, Double>();

                yearMap.put(textName.getText(), (double) yearSlider.getValue());
                for (String name : yearMap.keySet()) {
                    dataOutput.writeUTF(name);
                    dataOutput.writeDouble(yearMap.get(name));
                }
                dataOutput.close();
                fileOutput.close();
                JOptionPane.showMessageDialog(this,
                        "Saveing experiences year in file " + fileCh.getSelectedFile().getAbsolutePath());

                System.out.println("Warring : File year save !");
            } catch (IOException e) {
                System.err.println("Error writing file: " + e.getMessage());
            }
        } else if (returnValueOfDialog == JFileChooser.CANCEL_OPTION) {
            System.out.println("Save command cancelled by user.");
        }
    }

    /*
     * Override method readFile() and call super for read file type Data Stream and
     * check the value of year experiences if the value equals 0 or 1 and more than
     * 1 will show in text field in different text
     */
    @Override
    protected void readFile() {
        super.readFile();
        fileCh = new JFileChooser(); // creat new JFileChooser to show open dialog again
        returnValueOfDialog = fileCh.showOpenDialog(this);

        if (returnValueOfDialog == JFileChooser.APPROVE_OPTION) {
            fileInput = null;
            dataInput = null;
            try {
                fileInput = new FileInputStream(fileCh.getSelectedFile());
                dataInput = new DataInputStream(fileInput);

                nameFromFile = dataInput.readUTF();
                yearExp = (int) dataInput.readDouble();
                if (yearExp <= 1) {
                    bioArea.append(newLine + nameFromFile + " has " + yearExp + " year of experiences");
                } else {
                    bioArea.append(newLine + nameFromFile + " has " + yearExp + " years of experiences");
                }

                System.out.println("Warring : File year open !");

            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else if (returnValueOfDialog == JFileChooser.CANCEL_OPTION) {
            System.out.println("Open command cancelled by user.");
        }
    }
}
