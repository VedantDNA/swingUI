package examprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {

    JTextField nameField,emailField,ageField;
    JButton submitBtn, clearBtn;
    JLabel outputLabel;

    public RegistrationForm(String title){
        super(title);
        setSize(400,400);
        setLayout(new FlowLayout());

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        ageField = new JTextField(20);
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        outputLabel = new JLabel("Enter Above Details");

        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Age:"));
        add(ageField);
        add(submitBtn);
        add(clearBtn);
        add(new JLabel("Status:"));
        add(outputLabel);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object selector = e.getSource();
        if(selector == submitBtn){
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String ageStr = ageField.getText().trim();

            if(name.isEmpty() || email.isEmpty() || ageStr.isEmpty()){
                outputLabel.setText("Please fill above fields");
                return;
            }

            try {
                int age = Integer.parseInt(ageStr);
                outputLabel.setText("Registered " + name + " | Age: " + age);
            }catch (NumberFormatException ex){
                outputLabel.setText("Age must be a number");
            }
        } else if (selector == clearBtn) {
            nameField.setText("");
            ageField.setText("");
            emailField.setText("");
            emailField.setEnabled(false);
            outputLabel.setText("Enter Above Details");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm("Registration Form");
    }
}
