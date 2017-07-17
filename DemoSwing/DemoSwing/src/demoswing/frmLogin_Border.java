/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoswing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Nguyen Thai Son
 */
public class frmLogin_Border extends JFrame{
    JLabel lblUserName;
    JLabel lblPass;
    JTextField txtUserName;
    JPasswordField txtPass;
    JButton btnLogin;
    JButton btnCancel;

    public frmLogin_Border() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblUserName= new JLabel("User Name");
        lblPass= new JLabel("PassWord");
        txtUserName = new JTextField(10);
        txtPass = new JPasswordField(10);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
        
        //this.setLayout(new BorderLayout());
        this.getContentPane().add(lblUserName,BorderLayout.SOUTH);
        this.getContentPane().add(lblPass,BorderLayout.NORTH);
        this.getContentPane().add(txtUserName,BorderLayout.WEST);
        this.getContentPane().add(txtPass,BorderLayout.EAST);
        this.getContentPane().add(btnLogin);
        this.getContentPane().add(btnCancel);
        
        
    }
    public static void main(String[] args) {
        new frmLogin_Border();
    }
    
}
