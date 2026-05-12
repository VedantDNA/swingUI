package finalexamprep;

import examprep.LearnRadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnRadioButtons extends JFrame implements ActionListener {

    JLabel title, outputLabel;
    JRadioButton btn1,btn2,btn3,btn4;

    public LearnRadioButtons(){
        setTitle("Radio Button Tutorial");
        setSize(400,400);
        setLayout(new FlowLayout());

        title = new JLabel("Radio Buttons: ");
        outputLabel = new JLabel("Selected: ");
        btn1 = new JRadioButton("Java");
        btn2 = new JRadioButton("Python");
        btn3 = new JRadioButton("Docker");
        btn4 = new JRadioButton("PostgreSQL");

        ButtonGroup group = new ButtonGroup();
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);
        group.add(btn4);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        add(title);
        add(btn1);add(btn2);add(btn3);add(btn4);
        add(outputLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(btn1.isSelected()){
            outputLabel.setText("Selected: " + btn1.getText());
        }else if(btn2.isSelected()){
            outputLabel.setText("Selected: " + btn2.getText());
        }else if(btn3.isSelected()){
            outputLabel.setText("Selected: " + btn3.getText());
        } else if (btn4.isSelected()) {
            outputLabel.setText("Selected: " + btn4.getText());
        }
    }

    public static void main(String[] args) {
        new LearnRadioButtons();
    }
}
