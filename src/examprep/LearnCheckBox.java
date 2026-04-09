package examprep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearnCheckBox extends JFrame implements ActionListener {

    JCheckBox box1,box2,box3;
    JLabel label,outputLabel;
    JButton submitBtn, clearBtn;

    public LearnCheckBox(String title){
        super(title);
        box1 = new JCheckBox("Java");
        box2 = new JCheckBox("Python");
        box3 = new JCheckBox("SQL");
        label = new JLabel("Select One or More Boxes");
        outputLabel = new JLabel("");
        submitBtn = new JButton("submit");
        clearBtn = new JButton("clear");

        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setSize(400,400);
        setLayout(new FlowLayout());

        add(label);
        add(box1);add(box2);add(box3);
        add(submitBtn);add(clearBtn);
        add(outputLabel);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submitBtn){
            StringBuilder builder = new StringBuilder("Skills: ");
            if(box1.isSelected()){
                builder.append("Java");
                builder.append(", ");
            }
            if (box2.isSelected()) {
                builder.append("Python");
                builder.append(", ");
            }
            if (box3.isSelected()) {
                builder.append("SQL");
            }

            outputLabel.setText(builder.toString());
        }

        if(e.getSource() == clearBtn){
            outputLabel.setText("");
            box1.setSelected(false);
            box2.setSelected(false);
            box3.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new LearnCheckBox("Check Box Tutorial");
    }
}
