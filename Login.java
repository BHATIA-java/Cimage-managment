package university_managment_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton login, cancel;
    JTextField tfusername;
    JPasswordField tfpassword;

    Login() {
        // Set up the frame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Username label and text field
        JLabel labelusername = new JLabel("Username:");
        labelusername.setBounds(40, 20, 100, 30);
        add(labelusername);

        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 200, 30);
        add(tfusername);

        // Password label and password field
        JLabel labelpassword = new JLabel("Password:");
        labelpassword.setBounds(40, 70, 100, 30);
        add(labelpassword);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 200, 30);
        add(tfpassword);

        // Login button
        login = new JButton("Log in");
        login.setBounds(50, 140, 120, 30);
        login.addActionListener(this);
        add(login);

        // Cancel button
        cancel = new JButton("Cancel");
        cancel.setBounds(200, 140, 120, 30);
        cancel.addActionListener(this);
        add(cancel);

        // Add image icon
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg")); 
        Image iconImage = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(iconImage);
        JLabel imageLabel = new JLabel(scaledIcon);
        imageLabel.setBounds(370, 20, 150, 150);
        add(imageLabel);

        // Set up frame properties
        setSize(550, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String username = tfusername.getText();
            String password = new String(tfpassword.getPassword());

            // Example validation
            if (username.equals("gaurav") && password.equals("pass")) {
                JOptionPane.showMessageDialog(this, "Login successful");
                new Project();
                setVisible(false); // Hide the login frame when successful login
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials");
            }
        } else if (ae.getSource() == cancel) {
           
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
