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
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("JFrame Pertamaku");
    
            // 1. Username
            // Label
            JLabel username = new JLabel();
            username.setText("Username");
            username.setBounds(100, 100, 100, 30);
            j.add(username);

            //TextField
            JTextField usernameInput = new JTextField();
            usernameInput.setBounds(200, 100, 200, 30);
            j.add(usernameInput);

            // 2. Password
            // Label
            JLabel password = new JLabel();
            password.setText("Password");
            password.setBounds(100, 130, 100, 30);
            j.add(password);

            // TextField
            JTextField passwordInput = new JPasswordField();
            passwordInput.setBounds(200, 130, 200, 30);
            j.add(passwordInput);

            // 3.Button
            JButton loginButton = new JButton();
            loginButton.setText("Login");
            loginButton.setBounds(150, 200, 100, 50);
            j.add(loginButton);

            // Set Layout (Decorate)
            j.setSize(800, 800);
            j.setLayout(null);
            j.setVisible(true);
        }
    }