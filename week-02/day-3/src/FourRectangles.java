import com.sun.java.accessibility.util.EventID;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 1; i < 5; i++) {
            graphics.setColor(new Color((int) (Math.random()*256),(int) (Math.random()*256),(int) (Math.random()*256)));
            int width = (int) (Math.random()* (WIDTH+1));
            int height = (int) (Math.random()* (HEIGHT+1));
            int x = (int) (Math.random()* (WIDTH-width+1));
            int y = (int) (Math.random()* (WIDTH-height+1));
            graphics.drawRect(x,y,width,height);
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