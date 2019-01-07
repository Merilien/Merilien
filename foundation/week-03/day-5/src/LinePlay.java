import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlay {

    public static void mainDraw(Graphics graphics){
        play(graphics, 14);
    }

    public static void play(Graphics g, int lines){
        int stepSize = WIDTH / lines;
        int length = lines * stepSize;
        int padding = 3;
        Color color1 = new Color(150,20,220);
        Color color2 = new Color(60,200,50);
        for (int i = 1; i < lines; i++) {
            int step = i * stepSize;
            g.setColor(color2);
            g.drawLine(padding, HEIGHT - padding - step, length - step, HEIGHT - padding);
            g.setColor(color1);
            g.drawLine(length, padding + step, padding + step, padding);
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