package CHALLENGE_37_INTERMEDIATE_SIERPINSKI_TRIANGLE;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Sierpinski {
    private JFrame frame;

    public Sierpinski() {
        frame = new JFrame("Sierpinski Triangle");
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(frame.getSize());
        frame.add(new SierpinkskyTriangle(frame.getSize()));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String... argv) {
        new Sierpinski();
    }

    public static class SierpinkskyTriangle extends JPanel {
        public SierpinkskyTriangle(Dimension dimension) {
            setSize(dimension);
            setPreferredSize(dimension);
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
            Dimension d = getSize();
            
            Point a = between(new Point(0, 0), new Point(d.width, 0));
            Point b = new Point(d.width, d.height);
            Point c = new Point(0, d.height);

            drawTriangle(g2, a, b, c);
        }
        
        private void drawTriangle(Graphics2D g, Point a, Point b, Point c) {
            g.drawLine(a.x, a.y, b.x, b.y);
            g.drawLine(b.x, b.y, c.x, c.y);
            g.drawLine(c.x, c.y, a.x, a.y);

            if(a.distance(b.x, b.y) < 2.0) {
                return;
            }

            Point ab = between(a, b);
            Point bc = between(b, c);
            Point ca = between(c, a);

            drawTriangle(g, a, ab, ca);
            drawTriangle(g, ab, b, bc);
            drawTriangle(g, c, ca, bc);
        }
    }

    public static Point between(Point a, Point b) {
        return new Point((a.x + b.x) / 2, (a.y + b.y) / 2);
    }
}