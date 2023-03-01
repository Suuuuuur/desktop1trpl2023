/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan2;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Pembelian Tiket Pesawat");
        
            // 1. Name
            // Label
            JLabel name = new JLabel();
            name.setText("Nama");
            name.setBounds(100, 100, 100, 30);
            j.add(name);

            //TextField
            JTextField nameInput = new JTextField();
            nameInput.setBounds(200, 100, 200, 30);
            j.add(nameInput);
            
            // 2. Kursi
            // Label
            JLabel kursi = new JLabel();
            kursi.setText("Kursi");
            kursi.setBounds(100, 150, 100, 30);
            j.add(kursi);
            
            // ComboBox
            String[] kursiCB = {"Biasa", "VIP"};
            JComboBox pilKursi = new JComboBox<>(kursiCB);
            pilKursi.setBounds(200, 150, 200, 30);
            j.add(pilKursi);
            
            // 3. Tujuan
            // Label
            JLabel tujuan = new JLabel();
            tujuan.setText("Tujuan");
            tujuan.setBounds(100, 200, 100, 30);
            j.add(tujuan);
            
            // Radio Button
            JRadioButton radio1 = new JRadioButton("Jepang");
            radio1.setBounds(200, 200, 100, 30);
            JRadioButton radio2 = new JRadioButton("Amerika");
            radio2.setBounds(300, 200, 100, 30);
            JRadioButton radio3 = new JRadioButton("Rusia");
            radio3.setBounds(400, 200, 100, 30);
            ButtonGroup grup = new ButtonGroup();
            grup.add(radio1);
            grup.add(radio2);
            grup.add(radio3);
            j.add(radio1);
            j.add(radio2);
            j.add(radio3);
            
            // Button
            JButton pesanButton = new JButton();
            pesanButton.setText("Pesan");
            pesanButton.setBounds(200, 250, 100, 25);
            j.add(pesanButton);
            
            // Set Layout (Decorate)
            j.setSize(800, 800);
            j.setLayout(null);
            j.setVisible(true);
    }
    
}