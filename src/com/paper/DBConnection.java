package com.paper;

import java.sql.*;

public class DBConnection {

	private static DBConnection instance;
	private  static Connection conn;
	private static final String  DB_URL="C:/Users/Home/Documents/Grammar Topics.accdb";
	//may hv a uname n pwd
	
	private DBConnection()
	{
		
	}
//i can combine getConeciton n getInstance, but then i wont be able to add params to geConnection
	public static DBConnection getInstance()
	{
		if(instance==null)
		{
			instance=new DBConnection();
		}

		return instance;
	}

	public  Connection getConnection() throws SQLException
	{		
		if(conn==null)
		{
		conn=DriverManager.getConnection("jdbc:ucanaccess://"+DB_URL);
		}
		System.out.println("connection created");
		return conn;

	}
	
	public void closeConnection() throws SQLException
	{
		if(conn.isClosed())
			System.out.println("connection was closed already");
		else
		{
			conn.close();
			System.out.println("we closed the connection");
		}
	}

	public void executeQuery(String query)
	{
		try
		(
				Statement stmnt=getConnection().createStatement();
				ResultSet rs=stmnt.executeQuery(query);

				)
		{
			while(rs.next())
			{
				System.out.println(rs.getString("Sentence"));

			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Bad query");
		}

	}

	

}
