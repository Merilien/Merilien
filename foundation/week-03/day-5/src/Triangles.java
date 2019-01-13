import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.drawRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);
        drawTriangle(graphics, 159);
    }

    public static void drawTriangle(Graphics g, int layers) {
        int baseline = HEIGHT - 1;
        int sideLength = (WIDTH / layers) / 2 * 2;
        System.out.println(sideLength);
        int objLength = sideLength * layers;
        int triHeight = (int) (Math.sqrt(sideLength * sideLength - (sideLength / 2) * (sideLength / 2)));
        System.out.println(triHeight);
        for (int i = 0; i <= layers; i++) {
            int currentY = baseline - i * triHeight;
            int currentX = i * sideLength / 2;
            // horizontal
            g.drawLine(currentX, currentY, objLength - currentX, currentY);
            // diagonals
            g.drawLine(currentX, currentY, currentX * 2, baseline);
            g.drawLine(objLength - currentX, currentY, objLength - currentX * 2, baseline);
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