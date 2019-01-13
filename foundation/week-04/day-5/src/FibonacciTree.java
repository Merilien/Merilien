import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FibonacciTree {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        int levels = 13;
        growTree(graphics, WIDTH / 2, HEIGHT, 0, levels);
    }

    private static void growTree(Graphics g, int xNode, int yNode, double rad, int levels) {
        if (levels == 1) {
            return;
        }
        int length = calculateFib(levels);
        int[] endPoint = Tree.getEndpoint(length, xNode, yNode, rad);
        // main branch
        g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        g.drawLine(xNode, yNode, endPoint[0], endPoint[1]);
        // new branches
        growTree(g, endPoint[0], endPoint[1], Tree.calculateRad(rad, -60), levels - 1);
        growTree(g, endPoint[0], endPoint[1], Tree.calculateRad(rad, 60), levels - 1);
    }

    private static int calculateFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return calculateFib(n - 1) + calculateFib(n - 2);
    }

    // Don't touch the code below
    static int WIDTH = 700;
    static int HEIGHT = 700;

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
