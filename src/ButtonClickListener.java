import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonClickListener implements ActionListener{
	  
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();  
	         if( command.equals( "Login" ))  {
	//            statusLabel.setText("Ok Button clicked.");
	         }
	         else if( command.equals( "Cancel" ) )  {
	//            statusLabel.setText("Submit Button clicked."); 
	         }
	         else  {
	//            statusLabel.setText("Cancel Button clicked.");
	         }  	
			
				
	   }
}
