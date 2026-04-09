package examprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnComboBox extends JFrame implements ActionListener {

    JComboBox<String> cityBox;
    JLabel outputLabel;

    public LearnComboBox(String title){
        String[] cities = {"Pune","Mumbai","Bangalore","Chennai"};
        outputLabel = new JLabel("");

        setSize(400,400);
        setLayout(new FlowLayout());

        cityBox = new JComboBox<>(cities);
        cityBox.setSelectedIndex(0);

        cityBox.addActionListener(this);

        cityBox.addItem("Himachal");
        cityBox.removeItem("Himachal");

        add(cityBox);
        add(outputLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selected = (String) cityBox.getSelectedItem();
        outputLabel.setText("Cities: " + selected);
    }

    public static void main(String[] args) {
        new LearnComboBox("Combo Box Tutorial");
    }
}
