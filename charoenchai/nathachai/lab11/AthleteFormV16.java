/**
 * This program is call AthleteFormV16 extends frome AthleteFormV15 is will override method write file and 
 * read file in AthleteFormV15 to write file and read file name athlete in type Object Stream .
 * When ther user click JMenuItem save or open will show save dialog and open dialog  3 time .
 * The first time will show about save or open file hobbie.txt and the second will show about save or 
 * open file year and the last will show about save or open file athlete then click save will creat
 * file type object stream and show message dialog path of file or click open will read file to show in bio 
 * text area in text in toString().
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 22, 2023
 */
package charoenchai.nathachai.Lab11;

import java.io.*;
import javax.swing.*;
import charoenchai.nathachai.lab6.AthleteV2;

public class AthleteFormV16 extends AthleteFormV15 {
    protected String stringFileAthlete;
    protected AthleteV2 student;

    protected ObjectOutputStream obOpStrm;

    protected FileInputStream fileInStrm;
    protected ObjectInputStream obInstrm;

    public AthleteFormV16(String title) {
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
        AthleteFormV16 msw = new AthleteFormV16("Athlete Form V16");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();

    }

    /*
     * Override method writeFile() to show save dialog again to creat file and creat
     * object stream for input to file and will show message dialog path of file
     */
    @Override
    protected void writeFile() {
        super.writeFile();
        stringFileAthlete = "athlete";
        fileName = new File(stringFileAthlete);

        fileCh = new JFileChooser();
        fileCh.setSelectedFile(fileName);

        returnValueOfDialog = fileCh.showSaveDialog(this);

        if (returnValueOfDialog == JFileChooser.APPROVE_OPTION) {
            try {
                addAthlete();
                fileOutput = new FileOutputStream(fileCh.getSelectedFile());
                obOpStrm = new ObjectOutputStream(fileOutput);
                obOpStrm.writeObject(athlete);
                JOptionPane.showMessageDialog(this,
                        "Saveing the athlete in the file " + fileCh.getSelectedFile().getAbsolutePath());

                System.out.println("Warring : File athlete save !");

                obOpStrm.close();
                fileOutput.close();

            } catch (Exception e) {
                System.err.println("Error writing file: " + e.getMessage());
            }

        } else if (returnValueOfDialog == JFileChooser.CANCEL_OPTION) {
            System.out.println("Save command cancelled by user.");
        }
    }

    /*
     * Override method readFile() to show open dialog again and when the user click
     * open will get object input stream and set to new object and append to bio
     * text area in toString()
     */
    @Override
    protected void readFile() {
        super.readFile();
        fileCh = new JFileChooser();
        returnValueOfDialog = fileCh.showOpenDialog(this);
        if (returnValueOfDialog == JFileChooser.APPROVE_OPTION) {
            try {
                fileInStrm = new FileInputStream(fileCh.getSelectedFile());
                obInstrm = new ObjectInputStream(fileInStrm);
                student = (AthleteV2) obInstrm.readObject();

                bioArea.append(newLine + student.toString());

                obInstrm.close();

                System.out.println("Warring : File athlete open !");

            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.err.println("Error read object from file: " + e.getMessage());
            }

        } else if (returnValueOfDialog == JFileChooser.CANCEL_OPTION) {
            System.out.println("Open command cancelled by user.");
        }
    }
}
