package charoenchai.nathachai.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV6 extends AthleteFormV5 {

    protected OlympicSymbol circleOlypicSymbol;
    protected JPanel circlePanel;
    protected Graphics2D circle;

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

    public static void createAndShowGUI() { // Method createAndShowGUI is call addComponents setFrameFeatures and addMenus
        AthleteFormV6 msw = new AthleteFormV6("Athlete Form V6"); // JFrame title is "Athlete Form V3"
        msw.addComponents();
        msw.addMenus();
        msw.setFrameFeatures();
    }

    @Override
    protected void addComponents() {
        super.addComponents();

        circlePanel = new JPanel();

        circleOlypicSymbol = new OlympicSymbol();
        circleOlypicSymbol.setPreferredSize(new Dimension(200, 100));

        circlePanel.add(circleOlypicSymbol);

        NorthUIPanel.remove(TandLpanel);
        NorthUIPanel.add(TandLpanel, BorderLayout.CENTER);
        NorthUIPanel.add(circleOlypicSymbol, BorderLayout.NORTH);
    }

    protected class OlympicSymbol extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            circle = (Graphics2D) g;

            circle.setStroke(new BasicStroke(5));
            circle.setColor(Color.BLUE);
            circle.drawOval(20, 10, 50, 50);

            circle.setColor(Color.RED);
            circle.drawOval(70, 10, 50, 50);

            circle.setColor(Color.YELLOW);
            circle.drawOval(120, 10, 50, 50);

            circle.setColor(Color.GREEN);
            circle.drawOval(45, 35, 50, 50);

            circle.setColor(Color.BLACK);
            circle.drawOval(95, 35, 50, 50);
        }
    }
}
