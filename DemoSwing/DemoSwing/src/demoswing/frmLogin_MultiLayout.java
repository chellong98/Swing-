/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoswing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Nguyen Thai Son
 */
public class frmLogin_MultiLayout extends JFrame{
    JLabel lblUserName;
    JLabel lblPass;
    JTextField txtUserName;
    JPasswordField txtPass;
    JButton btnLogin;
    JButton btnCancel;
    
    JPanel pnTop;
    JPanel pnLeft;
    JPanel pnRight;
    JPanel pnBottom;

    public frmLogin_MultiLayout() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblUserName= new JLabel("User Name");
        lblPass= new JLabel("PassWord");
        txtUserName = new JTextField(10);
        txtPass = new JPasswordField(10);
        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");
        
        pnBottom = new JPanel();
        pnBottom.setBackground(Color.red);
        pnRight = new JPanel();
        pnRight.setBackground(Color.BLUE);
        pnLeft = new JPanel();
        pnLeft.setBackground(Color.yellow);
        pnTop = new JPanel();
        pnTop.setBackground(Color.PINK);
        //pnTop.a
        
        //this.setLayout(new BorderLayout());
        this.getContentPane().add(pnTop,BorderLayout.SOUTH);
        this.getContentPane().add(pnBottom,BorderLayout.NORTH);
        this.getContentPane().add(pnLeft,BorderLayout.WEST);
        this.getContentPane().add(pnRight,BorderLayout.EAST);
        this.getContentPane().add(btnLogin);
        this.getContentPane().add(btnCancel);
        
        
    }
    public static void main(String[] args) {
        new frmLogin_MultiLayout();
    }
    
}
