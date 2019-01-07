import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Hexaception {

    public static void mainDraw(Graphics graphics){
        int levels = 4;
        int hexNum = (int)(Math.pow(2,4));
//        int width = WIDTH
        int smallestHight = WIDTH / hexNum;
//        int height =
//        int start = (int)(Math.pow(step*3,4));
//        drawCross(graphics, step, start);
    }

    public static void drawCross(Graphics g, int squareSize, int x){
        if (squareSize * 3 > WIDTH){
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.drawRect(x + i * squareSize, j * squareSize, squareSize, squareSize);
                if ((i + j) % 2 != 0) {
//                    drawCross(g, squareSize, x + i * squareSize, j * squareSize);
                }
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
