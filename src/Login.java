import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Scanner;
import javax.swing.*;

public class Login {

	private static Component add;



	/**
	 * @param args
	 * @param firstNameText 
	 */
	public static void main(String[] args) {
/*		PostgreSQLJDBC postgreSQLJDBC = new PostgreSQLJDBC();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = in.nextLine();
		System.out.println("Please enter your last name:; ");
		String lastName = in.nextLine();
		System.out.println("Please enter your desired username: ");
		String userName = in.nextLine();
		System.out.println("Please enter your password: ");
		String pwd = in.nextLine();
		
		String execute = "insert into users (first_name, last_name, username, password) VALUES ('"+ firstName + "','"+ lastName +"','"+ userName +"','"+ pwd+"')";
		postgreSQLJDBC.insert(execute);
*/		
		 // Create a new JFrame container. 
	    JFrame jfrm = new JFrame("Chitter"); 
	 
	    // Give the frame an initial size. 
	    jfrm.setSize(300, 300); 
	 
	    // Terminate the program when the user closes the application. 
	    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	 
	    //JPanel
	    JPanel panel = new JPanel();
	    jfrm.add(panel);
	    
	    panel.setLayout(null);

		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(10, 10, 80, 25);
		panel.add(firstNameLabel);

		JTextField firstNameText = new JTextField(20);
		firstNameText.setBounds(100, 10, 160, 25);
		panel.add(firstNameText);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(10, 40, 80, 25);
		panel.add(lastNameLabel);

		JTextField lastNameText = new JTextField(20);
		lastNameText.setBounds(100, 40, 160, 25);
		panel.add(lastNameText);
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(10, 80, 240, 25);
		panel.add(userNameLabel);

		JTextField userNameText = new JTextField(20);
		userNameText.setBounds(100, 80, 160, 25);
		panel.add(userNameText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 120, 320, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 120, 160, 25);
		panel.add(passwordText);
/*
		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		loginButton.addActionListener(new ButtonClickListener());
		
*/		
		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 160, 80, 25);
		panel.add(registerButton);

		 // Display the frame. 
	    jfrm.setVisible(true);	
	
	}
/*	
	public void loginPopup(){
		
		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		
		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 80, 80, 25);
		panel.add(registerButton);

		 // Display the frame. 
	    jfrm.setVisible(true);	
	
	}
	
	public void registerPopup(){
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(10, 10, 80, 25);
		panel.add(firstNameLabel);

		JTextField firstNameText = new JTextField(20);
		firstNameText.setBounds(100, 10, 160, 25);
		panel.add(firstNameText);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(10, 40, 80, 25);
		panel.add(lastNameLabel);

		JTextField lastNameText = new JTextField(20);
		lastNameText.setBounds(100, 40, 160, 25);
		panel.add(lastNameText);
		
		JLabel userNameLabel = new JLabel("User Name");
		userNameLabel.setBounds(10, 80, 240, 25);
		panel.add(userNameLabel);

		JTextField userNameText = new JTextField(20);
		userNameText.setBounds(100, 80, 160, 25);
		panel.add(userNameText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 120, 320, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 120, 160, 25);
		panel.add(passwordText);

		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 160, 80, 25);
		panel.add(registerButton);

		 // Display the frame. 
	    jfrm.setVisible(true);	
	
	}
*/	
	
		 
		   
		 
		   
		   

	
/*	public Login(){
		
		
		
		
	}
*/	
private PostgreSQLJDBC postgreSQLJDBC;
//private JTextField firsNameText;	
	


}