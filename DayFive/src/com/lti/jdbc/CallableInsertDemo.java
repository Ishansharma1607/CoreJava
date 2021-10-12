//	create or replace procedure insDept(id IN number,name IN varchar2)
//	IS
//	begin
//	insert into dept1 values(id,name);
//	end;
//	/



package com.lti.jdbc;


import java.sql.*;
import java.util.Scanner;

public class CallableInsertDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		System.out.println("Insert the Dept No");
		int dno = s.nextInt();
		System.out.println("Insert the Dept Name");
		String dname = s.next();
		
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","1234567");
	
		String s1 = "{call insDept(?,?)}";
		CallableStatement cst = con.prepareCall(s1);
		cst.setInt(1, dno);

		cst.setString(2, dname);

		cst.execute();
		System.out.println("Inserted");
	}

}
