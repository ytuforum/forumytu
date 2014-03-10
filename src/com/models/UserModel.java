package com.models;

import com.objects.User;
import java.sql.*;

public class UserModel extends DatabaseModel{
	public UserModel(){
		super();
	}
	
	public boolean authentication(User user){
		
		Connection connect = DatabaseModel.connect;
		String query = "Select * from tbl_users WHERE email='" + user.email + "' AND password='"+ user.password+"'";
		try{
			Statement statement = connect.createStatement();
			ResultSet result = statement.executeQuery(query);	
			System.out.println(result.next());
			if(result.next()){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			return false;
		}
	}
}
