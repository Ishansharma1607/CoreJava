package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Dept no to Delete");
		int dno = s.nextInt();

		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","1234567");
	String str = "delete from dept1 where dno=?";
	PreparedStatement pst = con.prepareStatement(str);
	pst.setInt(1, dno);
	int i = pst.executeUpdate();
	if(i!=0)
	{
	System.out.println("Deleted Succesfully");
	String str1 = "Select * from dept1";
	Statement st1 = con.createStatement();
	ResultSet rs = st1.executeQuery(str1);
	System.out.println("Deptno\tDeptname\n");

	
	
	//for printing/selecting table
	
	while(rs.next()) {
		
		
		System.out.print(rs.getInt(1)+"\t");
		System.out.print(rs.getString(2)+"\n");
		
	}
	
	}
	

	}

}
