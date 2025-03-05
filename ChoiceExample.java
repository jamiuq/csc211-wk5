package week5;


import java.awt.*;
import java.awt.event.*;

public class ChoiceExample {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT Choice Example");

        // Create a Choice dropdown
        Choice choice = new Choice();
        choice.setBounds(50, 50, 150, 30);
        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        choice.add("JavaScript");

        // Create a label to display the selected choice
        Label label = new Label("Selected: ");
        label.setBounds(50, 120, 200, 30);

        // Create a button
        Button button = new Button("Show Selection");
        button.setBounds(50, 90, 120, 30);

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Selected: " + choice.getSelectedItem());
            }
        });

        // Add components to the frame
        frame.add(choice);
        frame.add(button);
        frame.add(label);

        // Set frame properties
        frame.setSize(300, 200);
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
