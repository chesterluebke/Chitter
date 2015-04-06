/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chitter;

/**
 *  Create and operate a Login GUI 
 * @author Jason
 * 
 */

import java.awt.Component;
import java.util.Observable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;

public class Login extends MainWindow {

        
	Login () {
            logButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    userName = userNameText.getText();
                    pwd = pwdText.getText();
                    isGood = queryUser(userName);
                    
                    System.out.println(logArr);
                }
            });
            regButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Register regWindow = new Register();
                    regWindow.showWind();
                    System.out.println(regWindow.isGood);
                    regWindow.setCallingWind(thisWind);
                    turnOff();
                }
                
            });
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) { 
                    logFrame.dispose();
                }
                 
            });
            
        }
        Login thisWind = this;
        
        private static Component add;
        
	    int textLength = 20;
            String logArr[] = new String[2];
            String regArr[] = new String[4];
            String progName = "Chitter";
            String userName = "";
            String pwd = "";
            Boolean isGood = false;
            
            JLabel userNameLabel = new JLabel("User Name");
            JTextField userNameText = new JTextField(20);
            JLabel passwordLabel = new JLabel("Password");
            JPasswordField pwdText = new JPasswordField(20);
            JFrame logFrame = new JFrame(progName);
            JPanel logPanel = new JPanel();            
            JButton logButton = new JButton("Login");
            JButton regButton = new JButton("Register");
            JButton cancelButton = new JButton("Cancel");
            
            // Need sql query method here
            
             Boolean queryUser (String userName) {
                
                //NEED QUERY CODE HERE 
                //QUERYCODE SHOULD JUST RETURN TRUE OR FALSE
                return isGood;
            }
            
            
            public void turnOff() {
                    logFrame.setVisible(false);
            } 
            public void turnOn() {
                    logFrame.setVisible(true);
            } 
            
            
        
                
                
        public void killWind(){
            logFrame.dispose();
        }
        public String[] getVal() {
            return logArr;
        }
                
        public void showWind() {
                logFrame.setSize (300, 300);
                logFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                logFrame.add(logPanel);
                logPanel.setLayout(null);
		
		userNameLabel.setBounds(10, 80, 240, 25);
		logPanel.add(userNameLabel);

		
		userNameText.setBounds(100, 80, 160, 25);
		logPanel.add(userNameText);

		
		passwordLabel.setBounds(10, 120, 320, 25);
		logPanel.add(passwordLabel);

		
		pwdText.setBounds(100, 120, 160, 25);
		logPanel.add(pwdText);
		
		regButton.setBounds(180, 160, 80, 25);
		logPanel.add(regButton);
                
                cancelButton.setBounds(90, 160, 80, 25);
                logPanel.add(cancelButton);
                
                logButton.setBounds(0, 160, 80, 25);
		logPanel.add(logButton);
                
         	 // Display the ame. 
                logFrame.setVisible(true);
                
                
                
                
        }
}
	
		 
		   
		 
		   
		   

	
