import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Crosses {

    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, WIDTH, WIDTH);
        graphics.setColor(Color.BLACK);
        int levels = 5;
        int numOfSquares = (int) Math.pow(3, (levels));
        int width = numOfSquares * (WIDTH / numOfSquares);

        drawCross(graphics, width / 3, 0, 0, levels);
    }

    public static void drawCross(Graphics g, int squareSize, int x, int y, int levels) {
        if (levels == 0) {
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g.drawRect(x + i * squareSize, y + j * squareSize, squareSize, squareSize);
                if ((i + j) % 2 != 0) {
                    drawCross(g, squareSize / 3, x + i * squareSize, y + j * squareSize, levels - 1);
                }
            }
        }
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
