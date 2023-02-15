/**
* This program is call AthleteFormV6 extends frome AthleteFormV5 to create OlympicSymbol and use class OlympicSymbol extends from JPanel.
* And override addComponents to add circle of OlympicSymbol.
* And override paintComponent to create 5 circle and set color of circle.
*
* Author: Nathachai Charoenchai
* ID: 653040126-5
* sec: 1
* Date: February 16, 2023
*/
package charoenchai.nathachai.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV6 extends AthleteFormV5 {
    /**
     * protected variable have OlympicSymbol, JPanel and Graphics2D.
     */
    protected OlympicSymbol circleOlypicSymbol;
    protected JPanel circlePanel;
    protected Graphics2D circleGraphics2D;

    public AthleteFormV6(String title) {
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
     * JFrame title is "Athlete Form V6".
     */
    public static void createAndShowGUI() {
        AthleteFormV6 msw = new AthleteFormV6("Athlete Form V6");
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }
    /**
     * This method will use class OlympicSymbol to create circle and setPreferredSize to 200*100.
     * And remove TandLpanel of NorthUIPanel and add new postion to center.
     * Add circleOlypicSymbol to north of NorthUIPanel.
     */
    @Override
    protected void addComponents() {
        super.addComponents();
        circleOlypicSymbol = new OlympicSymbol();
        circleOlypicSymbol.setPreferredSize(new Dimension(200, 100));
        NorthUIPanel.remove(TandLpanel);
        NorthUIPanel.add(TandLpanel, BorderLayout.CENTER);
        NorthUIPanel.add(circleOlypicSymbol, BorderLayout.NORTH);
    }
    /**
     * This class is name OlympicSymbol extends from JPanel.
     * Override paintComponent to create 5 circle and set stroke to 5
     */
    protected class OlympicSymbol extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            circleGraphics2D = (Graphics2D) g;
            /* Set stroke in BasicStroke */
            circleGraphics2D.setStroke(new BasicStroke(5));
            /* Set color and drawOval to position and size of circle 1 */
            circleGraphics2D.setColor(Color.BLUE);
            circleGraphics2D.drawOval(20, 10, 50, 50);
            /* Set color and drawOval to position and size of circle 2 */
            circleGraphics2D.setColor(Color.RED);
            circleGraphics2D.drawOval(70, 10, 50, 50);
            /* Set color and drawOval to position and size of circle 3 */
            circleGraphics2D.setColor(Color.YELLOW);
            circleGraphics2D.drawOval(120, 10, 50, 50);
            /* Set color and drawOval to position and size of circle 4 */
            circleGraphics2D.setColor(Color.GREEN);
            circleGraphics2D.drawOval(45, 35, 50, 50);
            /* Set color and drawOval to position and size of circle 5 */
            circleGraphics2D.setColor(Color.BLACK);
            circleGraphics2D.drawOval(95, 35, 50, 50);
        }
    }
}
