import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class FibonacciTree {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        int levels = 13;
        growTree(graphics, WIDTH/2, HEIGHT, 0, levels);
    }

    private static void growTree(Graphics g, int xNode, int yNode, double rad, int levels){
        if (levels == 1) {
            return;
        }
        int length = calculateFib(levels);
        int[] endPoint = getEndpoint(length, xNode, yNode, rad);
        // main branch
        g.setColor(new Color((int) ( Math.random() * 256), (int) ( Math.random() * 256), (int) ( Math.random() * 256)));
        g.drawLine(xNode, yNode, endPoint[0], endPoint[1]);
        // new branches
        growTree(g, endPoint[0], endPoint[1], calculateRad(rad, -60), levels - 1);
        growTree(g, endPoint[0], endPoint[1], calculateRad(rad, 60), levels - 1);
    }

    public static int calculateFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return calculateFib(n - 1) + calculateFib(n - 2);
    }

    private static double calculateRad(double rads, int degrees){
        double newRads = rads + degrees * 0.0174532925;
        if (newRads < 0){
            newRads = 2 * Math.PI + newRads;
        } else if (newRads > 2 * Math.PI){
            newRads = newRads - 2 * Math.PI;
        }
        return newRads;
    }

    private static int[] getEndpoint(int length, int xNode, int yNode, double rad){
        int[] endPoint = new int[2];
        if (rad > 1.5 * Math.PI) {
            endPoint[0] = (int) (xNode - Math.sin(2 * Math.PI - rad) * length);
            endPoint[1] = (int) (yNode - Math.cos(2 * Math.PI - rad) * length);
        } else if  (rad > Math.PI){
            endPoint[0] = (int) (xNode - Math.cos(1.5 * Math.PI - rad) * length);
            endPoint[1] = (int) (yNode + Math.sin(1.5 * Math.PI - rad) * length);
        } else if (rad > Math.PI/2){
            endPoint[0] = (int) (xNode + Math.sin(Math.PI - rad) * length);
            endPoint[1] = (int) (yNode + Math.cos(Math.PI - rad) * length);
        } else {
            endPoint[0] = (int) (xNode + Math.cos(Math.PI/2 - rad) * length);
            endPoint[1] = (int) (yNode - Math.sin(Math.PI/2 - rad) * length);
        }
        return endPoint;
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
