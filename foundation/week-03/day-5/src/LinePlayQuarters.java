import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics){
        drawQuarters(graphics, 16);
    }

    public static void drawQuarters(Graphics g, int quarters){
        int dim = (int) (Math.sqrt(quarters));
        int picLength = WIDTH / dim;
        for (int i = 0; i < dim; i++){
            for (int j = 0; j < dim; j++) {
                play(g, picLength, picLength*i , picLength*j);
            }
        }
    }

    public static void play(Graphics g, int picLength, int x, int y){
        int stepSize = picLength / 14;
        int length = 14*stepSize;
        Color color1 = new Color(150,20,220);
        Color color2 = new Color(60,200,50);
        for (int i = 1; i < 14; i++) {
            int step = i * stepSize;
            g.setColor(color2);
            g.drawLine(x, y + length - step, x + length - step, y+length);
            g.setColor(color1);
            g.drawLine(x+length, y+step, x + step, y);
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