package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectSql {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		Connection con = DriverManager.getConnection("jdbc:sqlite://home//pradeepkumar//Downloads//sqlite-tools-linux-x86-3420000//MyDB.db");
		//		Statement stm = con.createStatement();
		//		stm.executeUpdate("CREATE TABLE Temp03(StuID1 Integer Not Null, StuName1 Text Not NUll)");
		//		ResultSet rs = stm.executeQuery("select * from Temp01");
		//		ResultSet rs = stm.executeQuery(query);
		String query = "INSERT INTO Temp01(StuID,StuName) values(?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);


		//		String sql;
		int n;
		//		int ins;
		do {
			System.out.println("To Insert Type 1 and not insert type 0: ");
			n = sc.nextInt();
			System.out.println("Enter Student ID: ");
			int stu1 = sc.nextInt();
			System.out.println("Enter Student Name: ");
			String stu2 = sc.next();
			////			sql = ;
			////			stm.executeUpdate();

			ps.setInt(1, stu1);
			ps.setString(2, stu2);

			int row = ps.executeUpdate();
			System.out.println("Rows : "+row);
		} while(n == 1);

		//		while(rs.next() ) {
		//			
		//		}
		//		stm.executeUpdate("INSERT INTO Temp01 values(104,'Kabeer')");
		//		rs.close();
		//		stm.close();
		ps.close();
		con.close();
	}
}
