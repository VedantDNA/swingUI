package finalexamprep;

import javax.sql.rowset.JdbcRowSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectStreamException;

public class LearnCheckBox extends JFrame implements ActionListener {

    JCheckBox box1, box2, box3;
    JLabel label, outputLabel;
    JButton submitBtn, clearBtn;

    public LearnCheckBox(){
        setTitle("Check Box Learner App");
        setSize(250,250);
        setLayout(new FlowLayout());

        label = new JLabel("Select the Checkboxes:");
        outputLabel = new JLabel("Submit Selection");
        box1 = new JCheckBox("Java");
        box2 = new JCheckBox("Python");
        box3 = new JCheckBox("SQL");
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");

        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        add(label);
        add(box1);add(box2);add(box3);
        add(submitBtn);add(clearBtn);
        add(outputLabel);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        StringBuilder builder = new StringBuilder("Skills: ");
        if(source == submitBtn){
            if(box1.isSelected()){
                builder.append("Java");
                outputLabel.setText(builder.toString());
                box1.setSelected(false);
            }
            if(box2.isSelected()){
                builder.append(", Python");
                outputLabel.setText(builder.toString());
                box2.setSelected(false);
            }
            if(box3.isSelected()){
                builder.append(", SQL");
                outputLabel.setText(builder.toString());
                box3.setSelected(false);
            }
        }

        if(source == clearBtn){
            box1.setSelected(false);
            box2.setSelected(false);
            box3.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new LearnCheckBox();
    }
}
