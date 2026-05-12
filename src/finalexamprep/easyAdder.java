package finalexamprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class easyAdder extends JFrame implements ActionListener {

    JTextField num1,num2;
    JButton addBtn;
    JLabel resultLabel;

    public easyAdder(){
        setTitle("Easy Adder");
        setSize(250,450);
        setLayout(new FlowLayout());

        num1 = new JTextField(20);
        num2 = new JTextField(20);
        addBtn = new JButton("Add");
        resultLabel = new JLabel("Enter Numbers Above");

        addBtn.addActionListener(this);

        add(num1);add(num2);add(addBtn);add(resultLabel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object selector = e.getSource();
        try {
            if(selector == addBtn){
                int num1Val = Integer.parseInt(num1.getText().trim());
                int num2Val = Integer.parseInt(num2.getText().trim());
                int sum = num1Val + num2Val;
                resultLabel.setText("Sum: " + sum);
            }
        }catch (NumberFormatException ex){
            resultLabel.setText("Enter Numbers Only");
            System.err.println("Numbers are Invalid");
        }
    }

    public static void main(String[] args) {
        easyAdder app = new easyAdder();
    }
}
