
//
//  create or replace procedure selDept(id IN number,no OUT number,name OUT varchar2)
//	IS
//	begin
//	select dno,dname into no,name from dept1 where dno=id;
//	end;
//  / 



package com.lti.handson;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YES TO FETCH BOOKS WHOSE PRICE ARE GREATER THAN 200");
		String dno = s.nextLine();
		
		
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","1234567");
		String s1 = "{call selBook(?)}";
		CallableStatement cst = con.prepareCall(s1);
		cst.setString(1, dno);
//		cst.registerOutParameter(2, java.sql.Types.INTEGER);
		cst.registerOutParameter(1, java.sql.Types.VARCHAR);
		cst.execute();
		System.out.println(cst.getString(1));
		//System.out.println(cst.getInt(2));
		
	}

}
