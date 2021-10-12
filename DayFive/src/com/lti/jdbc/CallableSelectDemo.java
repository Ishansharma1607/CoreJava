
//
//  create or replace procedure selDept(id IN number,no OUT number,name OUT varchar2)
//	IS
//	begin
//	select dno,dname into no,name from dept1 where dno=id;
//	end;
//  / 



package com.lti.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableSelectDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter Dept No");
		int dno = s.nextInt();
		
		
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","1234567");
		String s1 = "{call selDept(?,?,?)}";
		CallableStatement cst = con.prepareCall(s1);
		cst.setInt(1, dno);
		cst.registerOutParameter(2, java.sql.Types.INTEGER);
		cst.registerOutParameter(3, java.sql.Types.VARCHAR);
		cst.execute();
		System.out.println(cst.getString(3));
		System.out.println(cst.getInt(2));
		
	}

}
