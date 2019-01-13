import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SuperHexagon {

    public static void mainDraw(Graphics graphics) {
        drawHexagons(graphics, 4);
    }

    public static void drawHexagons(Graphics g, int num) {
        int hexSide = WIDTH / 9;
        int hexHeight = (int) (Math.sqrt(hexSide * hexSide - (hexSide / 2) * (hexSide / 2)) * 2);
        int hexPoint = (int) (Math.sqrt(hexSide * hexSide - (hexHeight / 2) * (hexHeight / 2)) * 2);
        int objHeight = hexHeight * (num + 3);
        int center = HEIGHT - (num + 3) * hexHeight;
        for (int i = 0; i < num; i++) {
            int step = i * (hexPoint + hexHeight / 2);
            for (int j = 0; j < num + i; j++) {
                //             int x = center -
            }
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