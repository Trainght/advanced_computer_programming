package charoenchai.nathachai.lab10;

import charoenchai.nathachai.lab9.*;
import charoenchai.nathachai.lab5.Athlete.Gender;
import charoenchai.nathachai.lab6.AthleteV2;
import java.awt.event.*;
import javax.swing.*;

public class AthleteFormV11 extends AthleteFormV10{
    protected         Gender genderEnum ;
    protected JMenu data,sort;
    protected JMenuItem Bname,Bheight,BheightAndWeight,addJItem,display,clear,search;

    public AthleteFormV11(java.lang.String title) {
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
        
    }
    // protected JMenu data,add,display,clear,search,sort;
    // protected JMenuItem Bname,Bheight,BheightAndWeight;
    @Override
    protected void addMenus() {
        super.addMenus();
        data = new JMenu("Data");

        addJItem= new JMenuItem("Add");
        display= new JMenuItem("Display");
        clear= new JMenuItem("Clear");
        search= new JMenuItem("Search");

        sort= new JMenu("Sort");
        
        Bname = new JMenuItem("By Name");
        Bheight= new JMenuItem("By Height");
        BheightAndWeight= new JMenuItem("By Height and Weight");

        sort.add(Bname);
        sort.add(Bheight);
        sort.add(BheightAndWeight);

        data.add(addJItem);
        data.add(display);
        data.add(clear );
        data.add(search);
        data.add(sort);

        menuBar.add(data);

    }

    @Override
    protected void addListeners() {
        super.addListeners();
        addJItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);

        double weight = Double.parseDouble(textWeight.getText());
        double height = Double.parseDouble(textWeight.getText());


        if (male.isSelected()) {
            genderEnum = Gender.MALE;
        }
        if(female.isSelected()){
            genderEnum = Gender.FEMALE;
        }


        String nationality = (java.lang.String) nationComboBox.getSelectedItem();
        String birthdate = textDate.getText();

        // textFieldArr = new JTextField[] { textName, textWeight, textHeight, textDate };
        AthleteV2 asdasd = new AthleteV2(textName.getText(),weight , height, genderEnum, nationality, birthdate);



        if(event.getSource() == addJItem){
            JOptionPane.showMessageDialog(this,asdasd);
        }
    }




    
}
