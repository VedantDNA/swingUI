package finalexamprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo_C extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu file,edit;
    JMenuItem newItem,openItem,copyItem,pasteItem;
    JLabel label;

    public MenuDemo_C(){
        setTitle("JMenu Example App");
        setSize(250,250);
        setLayout(new FlowLayout());
        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        newItem = new JMenuItem("New Item");
        openItem = new JMenuItem("Open Item");
        copyItem = new JMenuItem("Copy Item");
        pasteItem = new JMenuItem("Paste Item");
        label = new JLabel("Output: Result Will Be Displayed Here !!!");

        file.add(newItem);
        file.add(openItem);
        edit.add(copyItem);
        edit.add(pasteItem);

        menuBar.add(file);
        menuBar.add(edit);

        setJMenuBar(menuBar);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        add(label);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == newItem){
            label.setText("Click: You Clicked New Item");
        }else if(source == openItem){
            label.setText("Click: You Clicked Open Item");
        }else if(source == copyItem){
            label.setText("Click: You Clicked Copy Item");
        } else if (source == pasteItem) {
            label.setText("Click: You Clicked Paste Item");
        }
    }

    public static void main(String[] args) {
        new MenuDemo_C();
    }
}