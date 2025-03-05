package week5;

import java.awt.*;  
import java.awt.event.*;  

public class EventListener {

    public static void main(String[] args) {  
        // Create a frame
        Frame frame = new Frame("AWT Event Listener Example");  
        
        // Create a button
        Button button = new Button("Click Me");  
        button.setBounds(50, 100, 80, 30);  
        
        // Add action listener to the button
        button.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                System.out.println("Button Clicked!");  
            }  
        });  
        
        // Add button to frame
        frame.add(button);  
        
        // Frame settings
        frame.setSize(400, 200);  
        frame.setLayout(null);  
        frame.setVisible(true);  
        
        // Close window event
        frame.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
                frame.dispose();  
            }  
        });  
    }  
}  
