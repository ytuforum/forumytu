package com.models;

import java.sql.*;

public class DatabaseModel {
	
	public DatabaseModel(){
		makeConnection();
	}
	public static Connection connect = null;
	
	public static void makeConnection(){
		String url = "jdbc:mysql://localhost:3306/forumytu";
		String username = "root";
		String password = "";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection(url,username,password);			
		}catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		
	}
}
