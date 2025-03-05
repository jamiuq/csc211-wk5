package week5;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample extends Frame implements ActionListener {
    Label label;
    Button button;

    ActionListenerExample() {
        // Set layout to FlowLayout
        setLayout(new FlowLayout());

        // Create and add a label
        label = new Label("Press the button");
        add(label);

        // Create and add a button
        button = new Button("Click Me");
        button.addActionListener(this); // Register the ActionListener for the button
        add(button);

        // Configure the frame
        setTitle("ActionListener Example");
        setSize(300, 200);
        setVisible(true);

        // Close window action
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // This method will be invoked when the button is clicked
    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }
}
