package finalexamprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnJComboBox extends JFrame implements ActionListener {

    JComboBox<String> comboBox;
    JLabel outputLabel;

    public LearnJComboBox(){
        setTitle("Learn JComboBox App");
        setSize(250,250);
        setLayout(new FlowLayout());

        String[] arr = {"Java","Python","PostgreSQL","Docker"};
        comboBox = new JComboBox<>(arr);
        comboBox.setSelectedIndex(0);
        outputLabel = new JLabel("Selected Technology: Java");

        comboBox.addActionListener(this);

        comboBox.addItem("JavaScript");

        add(comboBox);add(outputLabel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = comboBox.getSelectedItem().toString();
        outputLabel.setText("Selected Technology: " + selected);
    }

    public static void main(String[] args) {
        new   LearnJComboBox();
    }
}
