package examprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnRadioButton extends JFrame implements ActionListener {
    JLabel title, outputLabel;
    JRadioButton btn1,btn2,btn3;

    public LearnRadioButton(String test){
        super(test);
        title = new JLabel("Radio Buttons");
        btn1 = new JRadioButton("Java");
        btn2 = new JRadioButton("Python");
        btn3= new JRadioButton("SQL");
        outputLabel = new JLabel("Click Buttons");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        btn1.setSelected(true);

        ButtonGroup group = new ButtonGroup();
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);


        setSize(400,400);
        setLayout(new FlowLayout());

        add(title);
        add(btn1);add(btn2);add(btn3);
        add(new JLabel("Result"));
        add(outputLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(btn1.isSelected()) outputLabel.setText("Button Java Selected");
        else if(btn2.isSelected()) outputLabel.setText("Button Python Selected");
        else if(btn3.isSelected()) outputLabel.setText("Button SQL Selected");
        else outputLabel.setText("Select A Button");
    }

    public static void main(String[] args) {
        new LearnRadioButton("Radio Button Tutorial");
    }
}
