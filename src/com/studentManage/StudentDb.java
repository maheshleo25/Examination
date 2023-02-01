package com.studentManage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDb {
	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		try {
			Connection connection=CP.createC();
			String q="insert into Student(name,marks,phone_no)values (?,?,?)";
			PreparedStatement statement=connection.prepareStatement(q);
			statement.setString(1,st.getStudentName());
			statement.setInt(2,st.getMarks());
			statement.setInt(3,st.getPhoneNo());
			
			statement.executeUpdate();
			f=true;
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		return f;
		
	}
 
	public static boolean deleteStudentDb(int rollno) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Connection connection=CP.createC();
			String q="delete from Student where rollno=?";
			PreparedStatement statement=connection.prepareStatement(q);
			
			statement.setInt(1,rollno);
			
			
			
			statement.executeUpdate();
			f=true;
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		return f;
		
	}

	public static void ShowAllDetails() {
		boolean f=false;
		
		try {
			Connection connection=CP.createC();
			String q="Select * from Student;";
			Statement stmt= connection.createStatement();
			ResultSet set =stmt.executeQuery(q);
			
			while(set.next()) {
				int roll=set.getInt(1);
				String name=set.getString(2);
				int marks=set.getInt(3);
				int phoneno=set.getInt(4);
				
				
				System.out.println("Rollno: "+roll);
				System.out.println("Student Name:"+name);
				System.out.println("Total Marks:"+marks);
				System.out.println("Phone_No:"+phoneno);
				System.out.println("********************");
			}
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		
	
		// TODO Auto-generated method stub
		
	}

	public static boolean updateStudentDt(int marks,int rollno) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
			Scanner sc=new Scanner(System.in);
			Connection connection = CP.createC();
			String q="update Student set marks=? where rollno=?";
			PreparedStatement statement=connection.prepareStatement(q);
			
			statement.setInt(1,marks);
			statement.setInt(2,rollno);
			
			
			statement.executeUpdate();
			f=true;
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		return f;
		
	
		
	}

}
