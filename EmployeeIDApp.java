package week5;

	import java.awt.*;
	import java.awt.event.*;

	public class EmployeeIDApp {
	    public static void main(String[] args) {
	        Frame frame = new Frame("Employee ID Entry");
	        
	        Label label = new Label("Enter Employee ID:");
	        label.setBounds(50, 50, 150, 30);
	        
	        TextField textField = new TextField();
	        textField.setBounds(200, 50, 80, 30);
	        
	        Button button = new Button("Submit");
	        button.setBounds(150, 100, 80, 30);
	        
	        Label outputLabel = new Label();
	        outputLabel.setBounds(50, 150, 300, 30);
	        
	        button.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String empId = textField.getText();
	                outputLabel.setText("Employee ID: " + empId);
	            }
	        });
	        
	        frame.add(label);
	        frame.add(textField);
	        frame.add(button);
	        frame.add(outputLabel);
	        
	        frame.setSize(400, 250);
	        frame.setLayout(null);
	        frame.setVisible(true);
	        
	        frame.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                frame.dispose();
	            }
	        });
	    }

}//end
