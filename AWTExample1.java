package week5;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;  
public class AWTExample1 extends Frame{
	 // initializing using constructor  
	   AWTExample1() {  
	        // creating a button   
	        Button b = new Button("Click Me!!");  
	        Button b1 = new Button("exit!!"); 
	        // setting button position on screen  
	        b.setBounds(100,250,220,60);  
	        // adding button into frame    
	      add(b);
	      add(b1);

	      addActionListener(new actionListener(
	      {
			
	      })
		
	      // frame size 300 width and 300 height    
	      setSize(400,400);  
	  
	      // setting the title of Frame  
	      setTitle("This is our basic AWT example");   
	          
	      // no layout manager   
	      setLayout(null);   
	  
	      // now frame will be visible, by default it is not visible    
	      setVisible(true);  
	      //Add a window closing event
	      addWindowListener(new WindowAdapter() {  
	            public void windowClosing(WindowEvent e) {  
	      	    System.exit(0);
	          }
	      });
	}    
	  
	// main method  
	public static void main(String args[]) {   
	  
	// creating instance of Frame class   
	AWTExample1 f = new AWTExample1();    
	}  

}
