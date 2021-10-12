package com.lti.handson;

import java.sql.*;
import java.util.*;

public class Q1 {

	public static void main(String[] args) throws SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println("Select 1 for Insert , 2 for Update, 3 for Delete, 4 for Select");
		int input = s.nextInt();
		Connection con = null;
		try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","LTI","1234567");
	
		switch (input)
		{
		    case 1:
		    	System.out.println("Enter Book Id");
				int bookid=s.nextInt();
				System.out.println("Enter Book name");
				String ssf=s.nextLine();
				String bname=s.nextLine();
				System.out.println("Enter author name");
				String aname=s.nextLine();
				System.out.println("Enter price ");
				int price=s.nextInt();
				String str="insert into BOOKDETAILS values('"+bookid+"','"+bname+"','"+aname+"','"+price+"')";
				Statement st=con.createStatement();
				int i=st.executeUpdate(str);
				if(i!=0) {
					System.out.println("Inserted successfully");
					String str1="select * from bookdetails";
					Statement st1=con.createStatement();
					ResultSet rs=st1.executeQuery(str1);
					System.out.println("Book_id\tBook_name\tAuthor_name\tPrice");
					while(rs.next()) {
						System.out.print(rs.getInt(1)+"\t");
						System.out.print(rs.getString(2));
				
						System.out.print(rs.getString(3));
						System.out.print(rs.getInt(4));
						System.out.println();
					}
				}
				
		 
		       break;
		    case 2:
		    	System.out.println("Enter Book Id");
				int bkid=s.nextInt();
				System.out.println("Enter Book name");

				String bnmdfsdfse=s.nextLine();//added this because after nextint program skip nextline input
				
				String bnme=s.nextLine();
				String str1="update BOOKDETAILS set book_name=? where book_id=?";
				PreparedStatement pst=con.prepareStatement(str1);
				pst.setString(1, bnme);
				pst.setInt(2, bkid);
				int i1=pst.executeUpdate();
				
				if(i1!=0) {
					System.out.println("Updated successfully");
					String str2="select * from bookdetails";
					Statement st1=con.createStatement();
					ResultSet rs=st1.executeQuery(str2);
					System.out.println("BookId\tBook name");
					while(rs.next()) {
						System.out.print(rs.getInt(1)+"\t");
						System.out.print(rs.getString(2));
						System.out.print(rs.getString(3));
						System.out.print(rs.getString(4));
						System.out.print(rs.getInt(5));
						System.out.println();
					}
						
				}
		    	 break;
		    case 3:
				con.setAutoCommit(false);
				System.out.println("Enter Book Id");
				int bid=s.nextInt();
				
				String str3="delete from bookdetails where book_id=?";
				PreparedStatement ps=con.prepareStatement(str3);
			
				ps.setInt(1, bid);
				ps.executeUpdate();

				System.out.println("Are you sure you want to delete (y/n)");
				String op=s.next();
				if(op.equalsIgnoreCase("y")) 
					{
					con.commit();
					System.out.println("Deleted successfully");
					}
				else {
					con.rollback();
					
						System.out.println("Data restored");
					}
		
					break;
	
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
		}
}
		

	


