package week5;

import java.awt.*;  
import java.awt.event.*;  

// Class that extends Frame and implements ActionListener
public class DisplayName extends Frame implements ActionListener {  
    Label labelPrompt, labelResult;  
    TextField textField;  
    Button button;  

    // Constructor
    DisplayName() {  
        // Create Label for prompt
        labelPrompt = new Label("Enter your name:");  
        labelPrompt.setBounds(50, 50, 120, 30);  

        // Create TextField for input
        textField = new TextField();  
        textField.setBounds(180, 50, 150, 30);  

        // Create Button
        button = new Button("Submit");  
        button.setBounds(120, 100, 80, 30);  
        
        // Register action listener
        button.addActionListener(this);  

        // Create Label to display result
        labelResult = new Label("hidden");  
        labelResult.setBounds(50, 150, 300, 30);  

        // Add components to frame
        add(labelPrompt);
        add(textField);  
        add(button);  
        add(labelResult);  

        // Frame settings
        setSize(400, 250);  
        setLayout(null);  
        setVisible(true);  

        // Close window event
        addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
    }  

   // Action event handler
    public void actionPerformed(ActionEvent e) {  
        String name = textField.getText();  
         labelResult.setText("Hello, " + name + "!");  
    } 

    // Main method
    public static void main(String[] args) {  
        new DisplayName();  
    }  
}  
