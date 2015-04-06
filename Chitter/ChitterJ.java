/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chitter;
import java.awt.Component;
import java.util.Observable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author Jason
 */
public class ChitterJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Login logWind = new Login();
        String logArr[] = new String[2];
        logArr = logWind.showLogin();
        */
       /*
        Observable logOb; 
        System.out.println("Lets go");
        Login logWindow = new Login();
        logOb.addObserver(logWindow);
        */
        MainWindow theMain = new MainWindow();
       
        
        
     
        Login logWind = new Login();
        logWind.showWind();
    }
    
}
