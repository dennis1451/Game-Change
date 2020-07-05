package UserAuthorization;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import java.util.regex.Matcher; 
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import UserInterface.register;

public class register_limit  extends JFrame
{  

	public static boolean passwordCheck(String Password, String Password1)
	{
		if(Password.equals(Password1))
		{
			return true;
			
		}
		
		return false;
		
	}
	
	public static boolean mailValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 

	
}


