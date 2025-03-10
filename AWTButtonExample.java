package week5;
import java.awt.*;
import java.awt.event.*;
public class AWTButtonExample {
	public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Button Example");
        
        // Create a button
        Button button1 = new Button("Click Me");
        Button button2 = new Button("Exit");

        // Set the layout manager for the frame
        frame.setLayout(new FlowLayout());

        // Add the buttons to the frame
        frame.add(button1);
        frame.add(button2);

        // Set frame size
        frame.setSize(300, 200);
        
        // Make frame visible
        frame.setVisible(true);

        // Action listener for button1
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Action listener for button2 to exit the program
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exiting...");
                frame.dispose(); // Close the frame
            }
        });

        // Add window listener to close the window when user clicks the close button
        frame.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
      	    frame.dispose();
            }
        });
    }
}

