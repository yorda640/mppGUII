import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SportsComboBoxProgram {
    private static JComboBox<String> sportsComboBox;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Favorite Sport Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create sports JComboBox
        String[] sports = {"Baseball", "Soccer", "Basketball", "Track Running"};
        sportsComboBox = new JComboBox<>(sports);

        JPanel centerPanel = new JPanel();
        centerPanel.add(sportsComboBox);

        // Create Okay button
        JButton okayButton = new JButton("Okay");
        okayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayFavoriteSport();
            }
        });

        // Add components to the main panel
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(okayButton, BorderLayout.SOUTH);

        // Add the main panel to the frame
        frame.getContentPane().add(mainPanel);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }

    private static void displayFavoriteSport() {
        String selectedSport = (String) sportsComboBox.getSelectedItem();
        if (selectedSport != null) {
            System.out.println("Your favorite sport is: " + selectedSport);
        } else {
            System.out.println("Please select a sport.");
        }
    }
}

