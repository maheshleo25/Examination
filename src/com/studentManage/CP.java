package com.studentManage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public  static Connection createC() {
		
		//load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/studentexam";
			String userName="root";
			String password="Chotu@25";
			con=DriverManager.getConnection(url,userName,password);
			
		}catch(Exception e){
			e.printStackTrace();
		
		}
		
		return con;
			
		
	}

}
