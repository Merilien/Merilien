import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TriangleFractal {

    public static void mainDraw(Graphics graphics) {
        int levels = 6;
        int triangleNum = (int) Math.pow(2, (levels));
        int length = triangleNum * (WIDTH / triangleNum);
        drawTriangles(graphics, length, 0, 0, levels);
    }

    public static void drawTriangles(Graphics g, int sideLength, int point1x, int point1y, int levels) {
        if (levels == 0) {
            return;
        }
        double triHeight = Math.sqrt(sideLength * sideLength - (sideLength / 2) * (sideLength / 2));
        // big, outer triangle
        int[] XBig = {point1x, point1x + sideLength, point1x + sideLength / 2};
        int[] YBig = {point1y, point1y, (int) (point1y + triHeight)};
        g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        g.drawPolygon(XBig, YBig, 3);
        // small, inner triangles
        int[] XSmall = {point1x, point1x + sideLength / 2, point1x + sideLength / 4};
        int[] YSmall = {point1y, point1y, (int) (point1y + triHeight / 2)};
        for (int i = 0; i < 3; i++) {
            drawTriangles(g, sideLength / 2, XSmall[i], YSmall[i], levels - 1);
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
