package finalexamprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myApp extends JFrame implements ActionListener {
    private JTextField field1,field2,field3;
    private JButton btn1,btn2,btn3;
    private JLabel resultLabel;

    public myApp(){
        setTitle("Final Exam App");
        setSize(400,400);
        setLayout(new FlowLayout());

        field1 = new JTextField(20);
        field2 = new JTextField(20);
        field3 = new JTextField(20);

        btn1= new JButton("field1");
        btn3 = new JButton("field3");
        btn2 = new JButton("field 2");

        resultLabel = new JLabel("Select Any Buttons Above");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        add(field1);add(btn1);
        add(field2); add(btn2);
        add(field3);add(btn3);
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object selector = e.getSource();
        if(selector == btn1){
            resultLabel.setText(field1.getText());
        } else if (selector == btn2) {
            resultLabel.setText((field2.getText().trim()));
        } else if (selector == btn3) {
            resultLabel.setText(field3.getText().trim());
        }else {
            resultLabel.setText("Select A Button");
        }
    }

    public static void main(String[] args) {
        myApp app = new myApp();
    }
}
