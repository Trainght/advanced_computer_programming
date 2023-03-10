/**
 * This program is call AthleteFormV9 extends frome AthleteFormV8 and implements ItemListener
 * Use detect the change for TextField when press "Enter" and RadioBox CheckBox ComboBox when click change in the program then wil show showMessageDialog.
 * And when the user click or press "Ctrl + {N,O,S,X}" or press {N,O,S,X} for MenuItem but you must see the Munu File first then will show the message dialog.
 * 
 * Author: Nathachai Charoenchai
 * ID: 653040126-5
 * sec: 1
 * Date: March 10, 2023
 */
package charoenchai.nathachai.lab9;

import java.awt.event.*;
import javax.swing.*;

public class AthleteFormV9 extends AthleteFormV8 implements ItemListener {

    protected JMenuItem[] menuItemArr;
    protected String[] textOfTextField;
    protected String textofTextFeild;
    protected Object itemSTCgetSource;
    protected Integer itemSTCgetStateChange;

    public AthleteFormV9(String title) {
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
        AthleteFormV9 msw = new AthleteFormV9("Athlete Form V9");
        msw.addComponents();
        msw.initValues();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
/*
 * Creat Array of String[] for use in actionPerformed(ActionEvent event).
 */
    @Override
    protected void addComponents() {
        super.addComponents();
        textOfTextField = new String[] { "Name", "Weight", "Height", "Date of birth" };
    }
/*
 * Creat Array of JMenuItem[] { newItem, openItem, saveItem, exitItem } for use about Menus.
 * To setAccelerator KeyEvent to {N,O,S,X} and InputEvent.CTRL_DOWN_MASK for MenuItem.
 * And setMnemonic to {N,O,S,X} for MenuItem but you must see the Munu File first.
 */
    @Override
    protected void addMenus() {
        super.addMenus();

        menuItemArr = new JMenuItem[] { newItem, openItem, saveItem, exitItem };

        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));

        newItem.setMnemonic('N');
        openItem.setMnemonic('O');
        saveItem.setMnemonic('S');
        exitItem.setMnemonic('Q');
    }
/*
 * This method will add the comboBox menuItem and textField to ActionListener for handle.
 * Add the radioButton and checkBox to ItemListener for handle. 
 */
    @Override
    protected void addListeners() {
        super.addListeners();

        nationComboBox.addActionListener(this);

        for (JTextField textAddAction : textFieldArr) {
            textAddAction.addActionListener(this);
        }
        for (JMenuItem menuItemAddAction : menuItemArr) {
            menuItemAddAction.addActionListener(this);
        }

        for (JRadioButton radioButtonAddItem : gendeRadioArr) {
            radioButtonAddItem.addItemListener(this);
        }
        for (JCheckBox checkBoxAddItem : checkBoxArr) {
            checkBoxAddItem.addItemListener(this);
        }
    }
/*
 * This method will handle textField comboBox and menuItem when the user press "Enter" in textField or click any in comboBox.
 * And click or use shortcut or use Mnemonic keys in menuItem then will show the message dialog.
 */
    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);

        for (int i = 0; i < textFieldArr.length; i++) {
            if (ATEGetSource == textFieldArr[i]) {
                textofTextFeild = textOfTextField[i] + " is changed to " + textFieldArr[i].getText();
                JOptionPane.showMessageDialog(this, textofTextFeild);
            }
        }

        if (ATEGetSource == nationComboBox) {
            JOptionPane.showMessageDialog(this, "Nationality is changed to " + nationComboBox.getSelectedItem());
        }

        for (int i = 0; i < menuItemArr.length; i++) {
            if (ATEGetSource == menuItemArr[i]) {
                JOptionPane.showMessageDialog(this, "You click menu " + menuItemArr[i].getActionCommand());
            }
            if(ATEGetSource == exitItem){System.exit(0);}
        }
    }
/*
 * The method will handle radioButton and checkbox detect when the user click some checkBox or some radioButton if that value is change will show the message dialog.
 * 
 */
    @Override
    public void itemStateChanged(ItemEvent e) {

        itemSTCgetSource = e.getSource();
        itemSTCgetStateChange = e.getStateChange();

        if (itemSTCgetStateChange == ItemEvent.SELECTED) {
            for (JRadioButton genderCheckChange : gendeRadioArr) {
                if (e.getSource() == genderCheckChange) {
                    JOptionPane.showMessageDialog(this, genderCheckChange.getActionCommand() + " is selected");
                }
            }
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                for (int i = 0; i < checkBoxArr.length; i++) {
                    if (itemSTCgetSource == checkBoxArr[i]) {
                        for (int j = 0; j < checkBoxArr.length; j++) {
                            if (e.getSource() == checkBoxArr[j]) {
                                if (e.getStateChange() == ItemEvent.SELECTED) {
                                    textofCheckBox = checkBoxArr[j].getText() + " is also your hobby";
                                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                                    textofCheckBox = checkBoxArr[j].getText() + " is no longer your hobby";
                                }
                            }
                        }
                        JOptionPane.showMessageDialog(AthleteFormV9.this, textofCheckBox);
                    }
                }
            }
        });
    }
}
