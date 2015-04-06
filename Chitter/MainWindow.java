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
public class MainWindow {
    
    MainWindow(){}
    //inherated variables
    String logArr[] = new String[2];
    String regArr[] = new String[4];
    String progName = "Chitter";
    String firstName = "";
    String lastName = "";
    String userName = "";
    String pwd = "";

    //inhereted methods
    //Database stuff
    //PostgreSQLJDBC  postgreSQLJDBC = new PostgreSQLJDBC();
    
    String execute = "insert into users (first_name, last_name, username, "
            + "pwd) VALUES ('"+ firstName + "','"+ lastName +"','"
            + userName +"','"+ pwd+"')";
    
    public void nothing(){
        System.out.println("nothing");
    }
    
    
    
    
    
    
    
}
