package com.database;

import java.sql.*;

public class databaseconn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connect to DB");
		try {
			
				Class.forName("com.mysql.cj.jdbc.Driver");	
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store","root","Halifax@07");
				Statement stmt=con.createStatement();
				ResultSet rs= stmt.executeQuery("select customer_id, first_name from customers;");
				while (rs.next())
				{
					System.out.println(rs.getInt(1)+"/t"+rs.getString(2)+"");
				}
				con.close();
		}
		catch(Exception e) {
			System.out.println("Got an exception");
			System.out.println(e);
		}
		


	}

}
