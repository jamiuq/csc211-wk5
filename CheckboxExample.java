package week5;

import java.awt.*;
import java.awt.event.*;

public class CheckboxExample {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT Checkbox Example");

        // Create checkboxes
        Checkbox checkbox1 = new Checkbox("Java");
        checkbox1.setBounds(50, 50, 100, 30);

        Checkbox checkbox2 = new Checkbox("Python");
        checkbox2.setBounds(50, 80, 100, 30);

        Checkbox checkbox3 = new Checkbox("C++");
        checkbox3.setBounds(50, 110, 100, 30);

        // Create a label to display selected checkboxes
        Label label = new Label();
        label.setBounds(50, 180, 250, 30);

        // Create a button
        Button button = new Button("Show Selection");
        button.setBounds(50, 150, 100, 30);

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = "Selected: ";
                if (checkbox1.getState()) selected += "Java ";
                if (checkbox2.getState()) selected += "Python ";
                if (checkbox3.getState()) selected += "C++ ";
                label.setText(selected);
            }
        });

        // Add components to the frame
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);
        frame.add(button);
        frame.add(label);

        // Set frame properties
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Close window on clicking close button
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
