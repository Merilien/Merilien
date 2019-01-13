import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(new Color(60, 200, 50));
        int stepSize = WIDTH / (14 * 2);
        int quarter = stepSize * 14;
        int center = WIDTH / 2;
        graphics.drawLine(center, HEIGHT / 2 - quarter, center, HEIGHT / 2 + quarter);
        for (int i = 1; i <= 14; i++) {
            int step = i * stepSize;
            graphics.drawLine(center, center - step, center + quarter - step, center);
            graphics.drawLine(center, center - step, center - quarter + step, center);
            graphics.drawLine(center, center + step, center - quarter + step, center);
            graphics.drawLine(center, center + step, center + quarter - step, center);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}