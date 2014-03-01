package com.models;

import java.sql.*;

public class DatabaseModel {
	
	public static Connection connect = null;
	
	protected static void connect(){
		String url = "jdbc:///localhost:3306/forumytu";
		String username = "root";
		String password = "";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url,username,password);			
		}catch(Exception e)
		{
			//
		}
		
	}
}
