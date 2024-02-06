import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressFormApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AddressForm addressForm = new AddressForm();
            addressForm.createAndShowGUI();
        });
    }
}

class AddressForm {
    private JTextField nameField;
    private JTextField streetField;
    private JTextField cityField;
    private JTextField zipField;

    public void createAndShowGUI() {
        JFrame frame = new JFrame("Address Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField("Dave Smith", 20);

        JLabel streetLabel = new JLabel("Street:");
        streetField = new JTextField("123 North B", 20);

        JLabel cityLabel = new JLabel("City:");
        cityField = new JTextField("Fairfield", 20);

        JLabel zipLabel = new JLabel("Zip Code:");
        zipField = new JTextField("52556", 10);

        JButton submitButton = new JButton("Submit");

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(streetLabel);
        mainPanel.add(streetField);
        mainPanel.add(cityLabel);
        mainPanel.add(cityField);
        mainPanel.add(zipLabel);
        mainPanel.add(zipField);
        mainPanel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayEnteredData();
            }
        });

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void displayEnteredData() {
        String name = nameField.getText();
        String street = streetField.getText();
        String city = cityField.getText();
        String zip = zipField.getText();

        System.out.println(name);
        System.out.println(street);
        System.out.println(city + ", Iowa " + zip);
    }
}
