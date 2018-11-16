import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Tree {

    public static void mainDraw(Graphics graphics){
        int levels = 7;
        int length = 50;
        double lengthDecrement = 0.9;
        graphics.drawLine(WIDTH/2, HEIGHT - length, WIDTH/2, HEIGHT - length*2);
        branch(graphics, (int)(length*lengthDecrement), lengthDecrement, WIDTH/2, HEIGHT - length*2, 0, levels);

    }

    private static void branch(Graphics g, int length, double decrement, int xNode, int yNode, int degrees, int levels){
        if (levels == 0) {
            return;
        }
    }

    private static int[] getDirection(int degrees){
        int[] directions = new int[2];
        if (degrees == 0 || degrees == 180){
            directions[0] = 0;
        } else if (degrees < 90 || degrees > 270){
            directions[0] = 1;
        } else {
            directions[0] = -1;
        }
        if (degrees == 90 || degrees == 270){
            directions[1] = 0;
        } else if (degrees < 180){
            directions[1] = 1;
        } else {
            directions[1] = -1;
        }
        return directions;
    }

    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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
