package examprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LearnActionListener extends JFrame implements ActionListener {

    JTextField field1,field2,field3;
    JButton btn1,btn2,btn3;
    JLabel resultLabel;

    public LearnActionListener(String title){
        super(title);
        setSize(400,400);
        setLayout(new FlowLayout());

        field1 = new JTextField(15);
        field2 = new JTextField(15);
        field3 = new JTextField(15);
        btn1= new JButton("field1");
        btn2 = new JButton("field 2");
        btn3 = new JButton("field3");
        resultLabel = new JLabel("Select Any Buttons Above");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        add(new JLabel("Enter Name: "));
//        add(field1);
        add(btn1);
        add(btn2);
        add(btn3);
        add(new Label("Result: "));
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object selector = e.getSource();
        if(selector == btn1){
            resultLabel.setText("Button 1 was Clicked !!");
        } else if (selector == btn2) {
            resultLabel.setText("Button 2 was Clicked !!");
        }else {
            resultLabel.setText("Button 3 was Clicked");
        }
    }

    public static void main(String[] args) {
        new LearnActionListener("Learn ActionListener");
    }
}
