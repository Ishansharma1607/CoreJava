package com.lti.jdbc;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CollabFunctionDemo {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","1234567");
		String s = "{call sum(?,?)}";
		CallableStatement cst = con.prepareCall(s);
		cst.setInt(2,10);
		cst.setInt(3,20);
		cst.registerOutParameter(1, java.sql.Types.INTEGER);
		
		
		
		}catch(ClassNotFoundException ce) {
		ce.printStackTrace();
		}
		catch(SQLException se) {
		se.printStackTrace();
		}
		finally {
		try {
		con.close();
	}

}
	}
