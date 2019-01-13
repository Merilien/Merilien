import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class CircleFractal {

    public static void mainDraw(Graphics graphics) {
        int levels = 5;
        int circleNum = (int) Math.pow(2, (levels));
        double diameter = circleNum * (WIDTH / circleNum);
        drawCircles(graphics, diameter, WIDTH / 2, (HEIGHT - (int) diameter) / 2, levels);
    }

    public static void drawCircles(Graphics g, double diameter, int topx, int topy, int levels) {
        if (levels == 0) {
            return;
        }
        g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        g.drawArc((int) (topx - diameter / 2), topy, (int) diameter, (int) diameter, 0, 360);

        double innerTri = diameter * Math.sin(60 * 0.0174532925);
        double triHeight = Math.sqrt(innerTri * innerTri - (innerTri / 2) * (innerTri / 2));

        int[] XSmall = {topx, (int) (topx - innerTri / 4), (int) (topx + innerTri / 4)};
        int[] YSmall = {topy, (int) (topy + triHeight / 2), (int) (topy + triHeight / 2)};
        for (int i = 0; i < 3; i++) {
            drawCircles(g, diameter / 2, XSmall[i], YSmall[i], levels - 1);
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
