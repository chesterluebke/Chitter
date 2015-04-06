/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chitter;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author Jason
 */
public class Register extends MainWindow {
 
   
            
    
    
    private static Component add;
        
    Register () {
            
            registerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent regEv) {
                    firstName = firstNameText.getText();
                    lastName = lastNameText.getText();
                    userName = userNameText.getText();
                    pwd = pwdText.getText();
                    System.out.printf("%s %s %s %s\n", firstName, lastName, 
                            userName, pwd);
                    //postgreSQLJDBC.insert(execute);
                    isGood = true;
                    System.out.println(isGood);
                }
            });
            
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    callingWind.turnOn();
                    jfrm.dispose();
                    
                }
            });
        }
        
            Login callingWind = new Login();
            
            public void setCallingWind(Login caller) {
                callingWind = caller;
            }
        
	    int textLength = 20;
            public boolean isGood = false;
             
            JFrame jfrm = new JFrame("Chitter"); 
            JLabel firstNameLabel = new JLabel("First Name");
            JTextField firstNameText = new JTextField(20);
            JLabel lastNameLabel = new JLabel("Last Name");
	    JTextField lastNameText = new JTextField(20);
            JLabel userNameLabel = new JLabel("User Name");
            JTextField userNameText = new JTextField(20);
            JLabel pwdLabel = new JLabel("Password");
            JPasswordField pwdText = new JPasswordField(20);
            JPanel panel = new JPanel();
	    JButton registerButton = new JButton("Register");
            JButton cancelButton = new JButton("Cancel");
           
            public void turnOff() {
                    jfrm.setVisible(false);
            } 
            public void turnOn() {
                    jfrm.setVisible(true);
            } 
            public void killWind(){
            jfrm.dispose();
            }
            
            public void setReg(Boolean newGood) {
                isGood = newGood;
            }
            
            
           
    
    
    public void showWind() {    
        
            
                // Give the frame an initial size. 
	    jfrm.setSize(300, 300); 
	 
	    // Terminate the program when the user closes the application. 
	    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            jfrm.add(panel);
	    //JPanel
	    
	    panel.setLayout(null);

		
		firstNameLabel.setBounds(10, 10, 80, 25);
		panel.add(firstNameLabel);

		firstNameText.setBounds(100, 10, 160, 25);
		panel.add(firstNameText);

		
		
		lastNameLabel.setBounds(10, 40, 80, 25);
		panel.add(lastNameLabel);

		
		lastNameText.setBounds(100, 40, 160, 25);
		panel.add(lastNameText);
		
		
		userNameLabel.setBounds(10, 80, 240, 25);
		panel.add(userNameLabel);

		
		userNameText.setBounds(100, 80, 160, 25);
		panel.add(userNameText);

		
		pwdLabel.setBounds(10, 120, 320, 25);
		panel.add(pwdLabel);

		
		pwdText.setBounds(100, 120, 160, 25);
		panel.add(pwdText);
		
		registerButton.setBounds(90, 160, 80, 25);
		panel.add(registerButton);
                
                cancelButton.setBounds(180, 160, 80, 25);
		panel.add(cancelButton);
                
         	 // Display the ame. 
                jfrm.setVisible(true);
                
            //registerButton.addActionListener(new ActionListenter());
    }
    
}
