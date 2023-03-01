/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class Register {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame j = new JFrame("JFrame Pertamaku");
        
            // 1. Name
            // Label
            JLabel name = new JLabel();
            name.setText("Name");
            name.setBounds(100, 100, 100, 30);
            j.add(name);

            //TextField
            JTextField nameInput = new JTextField();
            nameInput.setBounds(200, 100, 200, 30);
            j.add(nameInput);
            
            // 2. Username
            // Label
            JLabel username = new JLabel();
            username.setText("Username");
            username.setBounds(100, 150, 100, 30);
            j.add(username);

            //TextField
            JTextField usernameInput = new JTextField();
            usernameInput.setBounds(200, 150, 200, 30);
            j.add(usernameInput);

            // 3. Password
            // Label
            JLabel password = new JLabel();
            password.setText("Password");
            password.setBounds(100, 200, 100, 30);
            j.add(password);

            // TextField
            JPasswordField passwordInput = new JPasswordField();
            passwordInput.setBounds(200, 200, 200, 30);
            j.add(passwordInput);
            
            // 4. Email
            // Label
            JLabel email = new JLabel();
            email.setText("Email");
            email.setBounds(100, 250, 100, 30);
            j.add(email);

            // TextField
            JTextField emailInput = new JTextField();
            emailInput.setBounds(200, 250, 200, 30);
            j.add(emailInput);


            // Button
            JButton registerButton = new JButton();
            registerButton.setText("Register");
            registerButton.setBounds(200, 300, 100, 25);
            j.add(registerButton);

            // Set Layout (Decorate)
            j.setSize(800, 800);
            j.setLayout(null);
            j.setVisible(true);
    }
    
}
