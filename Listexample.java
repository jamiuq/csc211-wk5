package week5;

import java.awt.*;
import java.awt.event.*;

public class Listexample {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT List Example");

        // Create a List component
        List list = new List(5, true); // 5 visible rows, multiple selection enabled
        list.setBounds(50, 50, 150, 100);
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
        list.add("Ruby");

        // Create a label to display the selected items
        Label label = new Label("Selected: ");
        label.setBounds(50, 200, 250, 30);

        // Create a button
        Button button = new Button("Show Selection");
        button.setBounds(50, 160, 120, 30);

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = "Selected: ";
                String[] selectedItems = list.getSelectedItems();
                for (String item : selectedItems) {
                    selected += item + " ";
                }
                label.setText(selected);
            }
        });

        // Add components to the frame
        frame.add(list);
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
