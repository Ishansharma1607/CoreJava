package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Dept no");
		int dno = s.nextInt();
		System.out.println("Enter the Dept name");
		String dname = s.next();
		
		Connection con = null;
		try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","1234567");
	String str = "insert into dept1 values('"+dno+"','"+dname+"')";
			Statement st = con.createStatement();

			int i = st.executeUpdate(str);

			if(i!=0) {
				
				System.out.println("Inserted Successfully");
				String str1 = "Select * from dept1";
			//	String str1 = "update dept1 set dname='Ishan' where dno=222";
				//String str1 = "update dept1 set dno=40 where dname='Ishan'";
				Statement st1 = con.createStatement();
				ResultSet rs = st1.executeQuery(str1);
				System.out.println("Deptno\tDeptname");

				while(rs.next()) {
					
					
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2));
					System.out.println("");
				}
			}
		}
				catch (Exception e) {
					// TODO: handle exception
				}
				finally {
					con.close();
				}
			
			
	
	
	
	}

}
