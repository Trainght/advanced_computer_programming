/**
* This program is call AthleteFormV7 extends frome AthleteFormV6 to take image in AthleteFormV7 with use class ReadImage.
*
* Author: Nathachai Charoenchai
* ID: 653040126-5
* sec: 1
* Date: February 16, 2023
*/
package charoenchai.nathachai.lab8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

public class AthleteFormV7 extends AthleteFormV6 {
    /**
     * protected variable have JPanel and ReadImage.
     */
    protected JPanel imagePanel, southUIPanelV2;
    protected ReadImage image;

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

    /**
     * Method createAndShowGUI is call addComponents setFrameFeatures and addMenus.
     * JFrame title is "Athlete Form V7".
     */
    public static void createAndShowGUI() {
        AthleteFormV7 msw = new AthleteFormV7("Athlete Form V7");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    /**
     * Override addComponents and call super addComponents.
     * Create image with class ReadImage and setPreferredSize in Dimension.
     * Create imagePanel and add image.
     * Remove southUIPanel in userIUpanel and southUIPanel to southUIPanelV2 add in
     * new position to NORTH.
     * Add imagePanel to southUIPanelV2 in position CENTER.
     * And then add southUIPanelV2 to userIUpanel in position SOUTH.
     */
    @Override
    protected void addComponents() {
        super.addComponents();
        image = new ReadImage();
        image.setPreferredSize(new Dimension(500, 300));
        imagePanel = new JPanel();
        imagePanel.add(image);
        userIUpanel.remove(southUIPanel);
        southUIPanelV2 = new JPanel(new BorderLayout());
        southUIPanelV2.add(southUIPanel, BorderLayout.NORTH);
        southUIPanelV2.add(imagePanel, BorderLayout.CENTER);

        userIUpanel.add(southUIPanelV2, BorderLayout.SOUTH);
    }

    /**
     * This class is ReadImage extends JPanel to import image
     * Call super paintComponent and try to import image in path name if not found
     * will out "Error".
     * And drawIamge to nominal positionใ
     */
    protected class ReadImage extends JPanel {
        protected BufferedImage imgOylm;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            try {
                imgOylm = ImageIO.read(new File("charoenchai/nathachai/lab8/Athlete.png"));
            } catch (IOException e) {
                System.out.println("Error");
                ;
            }
            g.drawImage(imgOylm, 0, 0, null);
        }
    }
}
