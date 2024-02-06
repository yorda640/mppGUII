import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample {
    private static JLabel label;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Mouse Events Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        label = new JLabel("No mouse event yet.");

        // Add both mouse and mouse motion listeners to the label
        MyMouseListener myMouseListener = new MyMouseListener();
        label.addMouseListener(myMouseListener);
        label.addMouseMotionListener(myMouseListener);

        panel.add(label);

        frame.getContentPane().add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Custom MouseListener and MouseMotionListener implementation
    private static class MyMouseListener implements MouseListener, MouseMotionListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            label.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
            System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
        }

        @Override
        public void mousePressed(MouseEvent e) {
            label.setText("Mouse Pressed at: " + e.getX() + ", " + e.getY());
            System.out.println("Mouse Pressed at: " + e.getX() + ", " + e.getY());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            label.setText("Mouse Released at: " + e.getX() + ", " + e.getY());
            System.out.println("Mouse Released at: " + e.getX() + ", " + e.getY());
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            label.setText("Mouse Entered at: " + e.getX() + ", " + e.getY());
            System.out.println("Mouse Entered at: " + e.getX() + ", " + e.getY());
        }

        @Override
        public void mouseExited(MouseEvent e) {
            label.setText("Mouse Exited at: " + e.getX() + ", " + e.getY());
            System.out.println("Mouse Exited at: " + e.getX() + ", " + e.getY());
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("Mouse Moved at: " + e.getX() + ", " + e.getY());
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("Mouse Dragged at: " + e.getX() + ", " + e.getY());
        }
    }
}
