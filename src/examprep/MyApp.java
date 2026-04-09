package examprep;

import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame {
    JTextField nameField,ageField,passField;
    JButton btn1,btn2,btn3;

    public MyApp(String title){
        super(title);
        setSize(500,400);
        setLayout(new FlowLayout());

        nameField = new JTextField(20);
        ageField = new JTextField(20);
        passField = new JTextField(20);

        btn1 = new JButton("Click Here");
        btn1.setFont(new Font("Comic Sans", Font.BOLD,12));

        btn2 = new JButton("Disabled");
        btn2.setEnabled(false);



        add(new JLabel("Enter Name: "));
        add(nameField);
        add(btn1);
        add(new JLabel("Enter Age: "));
        add(ageField);
        add(btn2);
        add(Box.createHorizontalStrut(400));
        add(new JLabel("Enter Password: "));
        add(passField);
        add(Box.createHorizontalStrut(400));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyApp("My Application");
    }
}
