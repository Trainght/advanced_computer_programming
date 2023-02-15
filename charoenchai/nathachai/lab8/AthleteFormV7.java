package charoenchai.nathachai.lab8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

public class AthleteFormV7 extends AthleteFormV6 {


    public AthleteFormV7(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    public static void createAndShowGUI() { // Method createAndShowGUI is call addComponents setFrameFeatures and addMenus
        AthleteFormV7 msw = new AthleteFormV7("Athlete Form V7"); // JFrame title is "Athlete Form V3"
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        
        ReadImage image = new ReadImage();
        image.setPreferredSize(new Dimension(500, 300));

        JPanel imagePanel = new JPanel();
        imagePanel.add(image);

        userIUpanel.remove(southUIPanel);
        JPanel southUIPanelV2 = new JPanel(new BorderLayout());
        southUIPanelV2.add(southUIPanel,BorderLayout.NORTH);
        southUIPanelV2.add(imagePanel, BorderLayout.CENTER);


        userIUpanel.add(southUIPanelV2,BorderLayout.SOUTH);


    }

    protected class ReadImage extends JPanel {
        BufferedImage imgOylm;
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            try {
                imgOylm = ImageIO.read(new File("charoenchai/nathachai/lab8/Athlete.png"));
            } catch (IOException e) {
                System.out.println("Error");;
            }
            g.drawImage(imgOylm,0,0,null);
        }
    }
}
