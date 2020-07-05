package UserAuthorization;

import java.awt.List;

public class User 
{
	private String mail;
	private String name;
	private String password;
	private String birthYear;
	private String city;
	//private ArrayList<Product> list;
	
	User(String mail,String name, String password, String birthYear, String city)
	{
		this.mail= mail;
		this.name = name;
		this.password = password;
		this.birthYear = birthYear;
		this.city = city;
	}
	
	public String  getPassword() 
	{
		return this.password;
	}
	
	public String getMail()
	{
		return this.mail;
	}
	
	
	
	

}
