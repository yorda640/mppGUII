
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SportsCheckBoxProgram {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sports Selection");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel(new BorderLayout());
            JPanel centerPanel = new JPanel(new GridLayout(4, 1));

            JCheckBox baseballCheckBox = new JCheckBox("Baseball");
            JCheckBox soccerCheckBox = new JCheckBox("Soccer");
            JCheckBox basketballCheckBox = new JCheckBox("Basketball");
            JCheckBox trackRunningCheckBox = new JCheckBox("Track Running");

            centerPanel.add(baseballCheckBox);
            centerPanel.add(soccerCheckBox);
            centerPanel.add(basketballCheckBox);
            centerPanel.add(trackRunningCheckBox);

            JPanel bottomPanel = new JPanel();
            JButton okayButton = new JButton("Okay");
            bottomPanel.add(okayButton);

            mainPanel.add(centerPanel, BorderLayout.CENTER);
            mainPanel.add(bottomPanel, BorderLayout.SOUTH);

            okayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    StringBuilder selectedSports = new StringBuilder("You play: ");
                    if (baseballCheckBox.isSelected()) {
                        selectedSports.append("Baseball ");
                    }
                    if (soccerCheckBox.isSelected()) {
                        selectedSports.append("Soccer ");
                    }
                    if (basketballCheckBox.isSelected()) {
                        selectedSports.append("Basketball ");
                    }
                    if (trackRunningCheckBox.isSelected()) {
                        selectedSports.append("Track Running");
                    }

                    JOptionPane.showMessageDialog(frame, selectedSports.toString());
                }
            });

            frame.getContentPane().add(mainPanel);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
