package week5;
import java.awt.*;    
import java.awt.event.*;    
public class LabelExample extends Frame implements ActionListener{
	TextField tf;   
    Label l;   
    Button b;   
    LabelExample() {    
        tf = new TextField();    
        tf.setBounds(50, 50, 150, 20);  
        l = new Label();    
        l.setBounds(50, 100, 250, 20);    
  
        b = new Button("Find IP"); 
        b.setBounds(50,150,60,30);   
        b.addActionListener(this);   
  
        add(b);  
        add(tf);  
        add(l);   
       
  
        setSize(400,400);    
        setLayout(null);    
        setVisible(true);    
    }  //end of the constructor
    
 // defining actionPerformed method to generate an event  
    public void actionPerformed(ActionEvent e) {    
        try {    
        String host = tf.getText();    
        String ip = java.net.InetAddress.getByName(host).getHostAddress();    
        l.setText("IP of "+host+" is: "+ip);    
        }   
        catch (Exception ex) {  
            System.out.println(ex);  
        }    
    }    
  
    // main method  
    public static void main(String[] args) {    
        new LabelExample();    
    }    
}    

