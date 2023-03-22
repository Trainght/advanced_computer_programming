/**
 * This program is call AthleteFormV14 extends frome AthleteFormV13 is will handle 
 * JMenuItem Save to save file name hobbies.txt in side file will have name of JTextFeild 
 * and hobbies of JCheckBox and will handle JMenuItem open for read file to show in Bio text area.
 * And check the value of hobbie from user choose if have one or many and no hobbie will show in bio 
 * text area in different text. 
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 22, 2023
 */
package charoenchai.nathachai.Lab11;

import charoenchai.nathachai.lab10.AthleteFormV13;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;

public class AthleteFormV14 extends AthleteFormV13 {
    protected String stringFileHobbie, joinStringHb, nameFromFile, hobbiesFromFile, lineInTxtFile;
    protected BufferedReader bufferedReader;
    protected JFileChooser fileCh;
    protected int returnValueOfDialog;
    protected File fileName;
    protected FileWriter fileWriter;
    protected String[] hobbiesFromFileArr;
    protected ArrayList<String> arrListString;

    public AthleteFormV14(String title) {
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
        AthleteFormV14 msw = new AthleteFormV14("Athlete Form V14");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    /*
     * Set handle JMenuItem save and open then will call the method weiteFile() or
     * readFile() and call super method
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        ATEGetSource = event.getSource();
        if (ATEGetSource == saveItem) {
            writeFile();
        } else if (ATEGetSource == openItem) {
            readFile();
        } else {
            super.actionPerformed(event);
        }
    }

    /*
     * This method will write file name hobbies.txt and check name in athlete form
     * Set selected file in name hobbies.txt
     * When the user click save button will start write file and show message dialog
     * of path file to save
     */
    protected void writeFile() {
        if (textName.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "No any text in Name!");
            return;
        }

        stringFileHobbie = "hobbies.txt";
        fileName = new File(stringFileHobbie);

        fileCh = new JFileChooser();
        fileCh.setDialogTitle("Save As: ");
        fileCh.setSelectedFile(fileName);
        returnValueOfDialog = fileCh.showSaveDialog(this);

        if (returnValueOfDialog == JFileChooser.APPROVE_OPTION) {

            try {

                fileWriter = new FileWriter(fileCh.getSelectedFile());

                textofCheckBox = "";
                for (JCheckBox checkBoxSelected : checkBoxArr) {
                    if (checkBoxSelected.isSelected()) {
                        textofCheckBox += checkBoxSelected.getText() + ",";
                    }
                }

                fileWriter.write(textName.getText() + "\n" + textofCheckBox);
                JOptionPane.showMessageDialog(this,
                        "Saveing hobbies in file " + fileCh.getSelectedFile().getAbsolutePath());
                fileWriter.close();
                System.out.println("Warring : File hobbie save !");
            } catch (IOException e) {
                System.err.println("Error writing file: " + e.getMessage());
            }
        } else if (returnValueOfDialog == JFileChooser.CANCEL_OPTION) {
            System.out.println("Save command cancelled by user.");
        }

    }

    /*
     * This Medthod will read file from user selected in type .txt
     * When user click open button this method will use bufferedReader to readLine
     * name and hobbies to show in bio text area
     * Check the value of hobbies if the value is null or empty and have one or
     * there are many will show in bio text area
     */
    protected void readFile() {
        fileCh = new JFileChooser();
        returnValueOfDialog = fileCh.showOpenDialog(this);

        if (returnValueOfDialog == JFileChooser.APPROVE_OPTION) {
            try {
                arrListString = new ArrayList<String>();
                bufferedReader = new BufferedReader(new FileReader(fileCh.getSelectedFile()));
                while ((lineInTxtFile = bufferedReader.readLine()) != null) { // use while loop for read all line in
                                                                              // text file
                    arrListString.add(lineInTxtFile);
                }
                nameFromFile = arrListString.get(0);
                

                if (arrListString.size() <= 1 ) {
                    bioArea.append(nameFromFile + " does not have any hobbie.");
                } else {
                    hobbiesFromFile = arrListString.get(1);
                    hobbiesFromFileArr = hobbiesFromFile.split(",");
                    if (hobbiesFromFileArr.length == 1) {
                        bioArea.append(nameFromFile + " has a hobbie as " + hobbiesFromFileArr[0]);
                    } else {
                        joinStringHb = String.join(", ", hobbiesFromFileArr);
                        bioArea.append(nameFromFile + " has hobbies as " + joinStringHb);
                    }
                }
                bufferedReader.close();
                System.out.println("Warring : File hobbie open !");

            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }
        } else if (returnValueOfDialog == JFileChooser.CANCEL_OPTION) {
            System.out.println("Open command cancelled by user.");
        }

    }
}