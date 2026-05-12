package finalexamprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnMenu extends JFrame implements ActionListener {

    JTextField num1,num2;
    JButton submitBtn,clearBtn;
    JLabel label,outputLabel;
    JMenuItem addMenu,subMenu,multMenu,divMenu;

    public LearnMenu(String title){
        super(title);
        setSize(250,250);
        setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        addMenu = new JMenuItem("ADD");
        subMenu = new JMenuItem("SUB");
        multMenu = new JMenuItem("MULT");
        divMenu = new JMenuItem("Div");


        label = new JLabel("Addition Calculator");
        num1 = new JTextField(20);
        num2 = new JTextField(20);
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        outputLabel = new JLabel("Enter Numbers");

        menuBar.add(addMenu);
        menuBar.add(subMenu);
        menuBar.add(multMenu);
        menuBar.add(divMenu);

        setJMenuBar(menuBar);

        addMenu.addActionListener(this);
        subMenu.addActionListener(this);
        multMenu.addActionListener(this);
        divMenu.addActionListener(this);

        add(label);
        add(num1);add(num2);
        add(submitBtn);add(clearBtn);
        add(outputLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == addMenu){
            int num1Val = Integer.parseInt(num1.getText().trim());
            int num2Val = Integer.parseInt(num2.getText().trim());
            int sum = num1Val + num2Val;
            outputLabel.setText("Sum: " + sum);
        }
    }

    public static void main(String[] args) {
        new LearnMenu("Menu Leaner");
    }
}
