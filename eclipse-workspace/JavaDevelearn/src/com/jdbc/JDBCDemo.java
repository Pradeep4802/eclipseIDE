package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
	public void loadDriver(int Id,String Name,String Password,String Email,String Country) {
		try {

			String path = "jdbc:sqlite://home//pradeepkumar//Downloads//sqlite-tools-linux-x86-3420000//univ.db";
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(path);
			String sql = "Insert into user values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, Id);
			ps.setString(2, Name);
			ps.setString(3, Password);
			ps.setString(4, Email);
			ps.setString(5, Country);
			ps.execute();
			System.out.println("Success");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updateUser(String Name,String Password,String Email,String Country) {
		try {

			String path = "jdbc:sqlite://home//pradeepkumar//Downloads//sqlite-tools-linux-x86-3420000//univ.db";
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(path);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id To Update : ");
			int id = sc.nextInt();
			String sql = "Update user set Name=?,Password=?,Email=?,Country=? where Id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, Name);
			ps.setString(2, Password);
			ps.setString(3, Email);
			ps.setString(4, Country);
			ps.setInt(5, id);
			ps.execute();
			System.out.println("Updated Success");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser() {
		try {

			String path = "jdbc:sqlite://home//pradeepkumar//Downloads//sqlite-tools-linux-x86-3420000//univ.db";
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(path);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id To Delete : ");
			int id = sc.nextInt();
			String sql = "delete from user where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.execute();
			System.out.println("Deleted Success");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectUser() {
		try {
			ResultSet resultSet = null;
			String path = "jdbc:sqlite://home//pradeepkumar//Downloads//sqlite-tools-linux-x86-3420000//univ.db";
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection(path);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id To view details : ");
			int id = sc.nextInt();
			String sql = "select Name,Password from user where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			resultSet = ps.executeQuery();
			while(resultSet.next()) {
//				System.out.println("Id : "+resultSet.getInt("Id"));
				System.out.println("Name : "+resultSet.getString("Name"));
				System.out.println("Password : "+resultSet.getString("Password"));
//				System.out.println("Email : "+resultSet.getString("Email"));
//				System.out.println("Country : "+resultSet.getString("Country"));
			}
//			System.out.println(ps);
//			System.out.println("Updated Success");
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JDBCDemo jd = new JDBCDemo();
		//		jd.loadDriver(3,"Vaibhav","vai123","vaibhav@gmail.com","England");
		//		jd.loadDriver(4,"Suraj","sj123","suraj@gmail.com","Pakistan");
		//		jd.loadDriver(5,"Piyush","py123","piyush@gmail.com","Kenya");
		//		jd.loadDriver(6,"Kabeer","kb123","kabeer@gmail.com","India");

//		jd.updateUser("Akhilesh", "akii123", "Akki@gmail.com", "USA");
		
//		jd.deleteUser();
		
		jd.selectUser();
	}
}
