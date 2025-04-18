import javax.swing.*;
import java.awt.*;

public class flower extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        this.setBackground(Color.WHITE);

        // Draw stem
        g.setColor(new Color(34, 139, 34)); // Green color for stem
        g.fillRect(195, 100, 10, 100); // Stem rectangle

        // Draw leaves
        g.setColor(new Color(34, 139, 34)); // Green color for leaves
        g.fillOval(180, 100, 30, 20); // Left leaf
        g.fillOval(210, 100, 30, 20); // Right leaf
        g.fillOval(190, 75, 30, 20); // Top leaf

        // Draw petals
        drawPetal(g, 190, 50, 60, 40); // Top petal
        drawPetal(g, 180, 65, 50, 40); // Upper-left petal
        drawPetal(g, 200, 65, 50, 40); // Upper-right petal
        drawPetal(g, 180, 85, 50, 40); // Left petal
        drawPetal(g, 200, 85, 50, 40); // Right petal
        drawPetal(g, 190, 100, 60, 40); // Center petal

        // Draw flower center
        g.setColor(new Color(255, 215, 0)); // Yellow color for center
        g.fillOval(190, 75, 20, 20); // Center circle
    }

    private void drawPetal(Graphics g, int x, int y, int width, int height) {
        g.setColor(new Color(255, 182, 193)); // Pink color for petals
        g.fillOval(x, y, width, height);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rose");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().add(new flower());
        frame.setVisible(true);
    }
}
