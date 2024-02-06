import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringUtilityApp extends JFrame {

    private JTextArea inputTextArea, outputTextArea;

    public StringUtilityApp() {
        setTitle("String Utility");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputTextArea = new JTextArea(5, 20);
        outputTextArea = new JTextArea(5, 20);
        outputTextArea.setEditable(false);

        JButton countButton = new JButton("Count Letters");
        JButton reverseButton = new JButton("Reverse Letters");
        JButton removeDuplicatesButton = new JButton("Remove Duplicates");

        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countLetters();
            }
        });

        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reverseLetters();
            }
        });

        removeDuplicatesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeDuplicates();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Input:"));
        panel.add(new JScrollPane(inputTextArea));
        panel.add(countButton);
        panel.add(reverseButton);
        panel.add(removeDuplicatesButton);
        panel.add(new JLabel("Output:"));
        panel.add(new JScrollPane(outputTextArea));

        add(panel);
        setVisible(true);
    }

    private void countLetters() {
        String input = inputTextArea.getText();
        int count = input.replaceAll("[^a-zA-Z]", "").length();
        outputTextArea.setText("Count of letters: " + count);
    }

    private void reverseLetters() {
        String input = inputTextArea.getText();
        StringBuilder reversed = new StringBuilder(input.replaceAll("[^a-zA-Z]", ""));
        outputTextArea.setText("Reversed letters: " + reversed.reverse().toString());
    }

    private void removeDuplicates() {
        String input = inputTextArea.getText();
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        outputTextArea.setText("Removed Duplicates: " + result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StringUtilityApp();
            }
        });
    }
}

