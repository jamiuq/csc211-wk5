package week5;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class FindIPNewLine extends Frame implements ActionListener {
    Label label;
    TextField textField;
    Button findButton, exitButton;
    TextArea resultArea;

    FindIPNewLine() {
        // Create the frame with no layout manager (null layout)
        setLayout(null);

        // Add label for website entry
        label = new Label("Enter Website:");
        //Some features of SETBOUNDS() Methods
        //setBounds(x-axis, y-axis, width, height);
        label.setBounds(20, 50, 100, 30);
        add(label);

        // Add text field for website input
        textField = new TextField(30);
        textField.setBounds(130, 50, 200, 20);
        add(textField);

        // Add find button to resolve IP address
        findButton = new Button("Find IP");
        findButton.setBounds(130, 100, 80, 30);
        findButton.addActionListener(this);
        add(findButton);

        // Add result area to display IP (TextArea for multiple lines) Text component 
        /*that allows the user to enter or display text.
        "" → An empty string ("") is set as the initial text of the TextArea.
		3 → The number of visible rows in the TextArea is set to 3.
		30 → The number of visible columns in the TextArea is set to 30.
		TextArea.SCROLLBARS_NONE → Disables scrollbars
         */
        resultArea = new TextArea("", 3, 30, TextArea.SCROLLBARS_NONE);
        resultArea.setEditable(false); // Make it read-only
        resultArea.setBounds(130, 150, 200, 30);
        add(resultArea);

        // Add exit button to close the program
        exitButton = new Button("Exit");
        exitButton.setBounds(230, 100, 80, 30);
        exitButton.addActionListener(this);
        add(exitButton);

        // Configure the frame
        setTitle("Find IP Address");
        setSize(400, 300);
        setVisible(true);

        // Close the frame when window is closed
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    /*handles actions triggered by user interactions */
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == findButton) { /*If the event source (ae.getSource()) is findButton*/
            try {
                String website = textField.getText();   /*google.com*/
                InetAddress inet = InetAddress.getByName(website);
                /*InetAddress.getByName(website) to get the IP address of the entered website.*/
                resultArea.append("IP Address: " + inet.getHostAddress() + "\n");
            } catch (UnknownHostException e) {
                resultArea.append("Invalid website address\n");
            }
        } else if (ae.getSource() == exitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new FindIPNewLine();
    }
}