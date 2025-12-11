package Other;
import javax.swing.*;
import java.awt.*;

public class FibonacciVisualizer extends JPanel {

    private int n = 6;

    public FibonacciVisualizer() {
        setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFibTree(g, n, 400, 50, 150);
    }

    private int drawFibTree(Graphics g, int n, int x, int y, int offset) {
        g.setColor(Color.BLACK);
        g.drawOval(x - 15, y - 15, 30, 30);
        g.drawString(String.valueOf(n), x - 5, y + 5);

        if (n <= 1) return n;

        // Left branch
        int leftX = x - offset;
        int leftY = y + 70;
        g.drawLine(x, y, leftX, leftY);
        drawFibTree(g, n - 1, leftX, leftY, offset / 2);

        // Right branch
        int rightX = x + offset;
        int rightY = y + 70;
        g.drawLine(x, y, rightX, rightY);
        drawFibTree(g, n - 2, rightX, rightY, offset / 2);

        return n;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fibonacci Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FibonacciVisualizer());
        frame.pack();
        frame.setVisible(true);
    }
}