package mouseEvent;

import javax.swing.*;
import java.awt.*;



public class Question2 {
    public static void main(String[] args) {
    	
        JFrame frame = new JFrame("User Information");
        frame.setSize(400, 200);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\hp\\Desktop\\email-vector-icon-2-3668.html");
        
       
        JLabel nameLabel = new JLabel("Name:", icon, JLabel.LEFT);
        JLabel emailLabel = new JLabel("Email:", icon, JLabel.LEFT);
        
        // Create JTextFields
        JTextField nameField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        
        // Add the components to the panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(nameField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(emailLabel, gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(emailField, gbc);
        
        
        
        
        frame.add(panel);
        frame.setVisible(true);
    }
}

