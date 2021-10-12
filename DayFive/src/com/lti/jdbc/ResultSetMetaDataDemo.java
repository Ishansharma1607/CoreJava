package com.lti.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","1234567");
	String str1 = "Select * from dept1";
	Statement st1 = con.createStatement();
	ResultSet rs = st1.executeQuery(str1);
	while(rs.next()){
	System.out.print(rs.getInt(1)+"\t");
	System.out.print(rs.getString(2)+"\n");
	}
	ResultSetMetaData rsmd = rs.getMetaData();
	int i = rsmd.getColumnCount();
	System.out.println("Number Of Columns ="+i);
	//System.out.print("Display size "+rsmd.getColumnDisplaySize(2)+"\t\t");
	//System.out.print("Coulmn name "+rsmd.getColumnName(1)+"\t\t");
	for(int j=1;j<=rsmd.getColumnCount();j++) {
	System.out.print("Datatype "+rsmd.getColumnTypeName(j)+"    ");
	System.out.print("Column Name "+rsmd.getColumnName(j)+"    ");
	System.out.print("Display size "+rsmd.getColumnDisplaySize(j));
	System.out.println();
	
	}
	}

}
