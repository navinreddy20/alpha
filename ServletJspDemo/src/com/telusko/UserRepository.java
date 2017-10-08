package com.telusko;

// JDBC API
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

// Connection Pool -> DataSource

public class UserRepository // UserDAO (Data Access Object)
{			
	String url = "jdbc:mysql://localhost:3306/alpha";
	String user = "root";
	String password = "0";
	Connection con = null;
	
	public UserRepository()
	{
		
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:/comp/env/myDb");
			con = ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public User getUser(int uid)
	{
		User u = new User();
		
		String sql = "select * from user where uid=" + uid;
		try
		{
			
			
			Statement st = con.createStatement();
			// Say
			ResultSet rs = st.executeQuery(sql);			// beforeFirst, first, position, last, afterLast
			if(rs.next())
			{
				u.setUid(uid);
				u.setUname(rs.getString("uname"));
				u.setAge(rs.getInt("age"));
			}
			
		
			
		}
		catch(Exception e){System.out.println(e);}

		return u; 
	}
// Statement, PreparedStatement
	// May I speak to _______ my name is  ___________ 
	// DDL -> Data Definition Lang ,  (Create, drop, alter) table
	// DML -> Data Manipulation Lang, (insert, update, delete)			(executeUpdate)
	// DQL -> Data Query Lang , Select	(executeQuery)
	public void save(User u) 
	{
		String sql = "insert into user values (?,?,?)";
		
		
		try
		{
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, u.getUid());
			st.setString(2, u.getUname());
			st.setInt(3, u.getAge());
			st.executeUpdate();
			
		}
		catch(Exception e){System.out.println(e);}
		
	}

}


// JDBC -> Jar
// Maven -> Build Tool -> jar dependency , build, test, deploy , run

// archetype -> Project Type 
// artifact	-> Project Name
// group id -> com.telusko
// package -> com.telusko.myapp1


