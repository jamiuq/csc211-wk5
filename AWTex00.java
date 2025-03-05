package week5;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTex00 {


public static void main(String[] args) {
    // Create a frame
    Frame frame = new Frame("AWT Frame Example");
    
    // Set frame size
    frame.setSize(400, 300);
    
    // Set layout to null
    frame.setLayout(null);
    
    // Add a window closing event
    frame.addWindowListener(new WindowAdapter() {  
        public void windowClosing(WindowEvent e) {  
  	    System.exit(0);
        }
    });
    
    // Make the frame visible
    frame.setVisible(true);
}
}