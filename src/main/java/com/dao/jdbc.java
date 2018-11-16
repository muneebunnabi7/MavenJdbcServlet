package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.model.AdditionMembers;

public class jdbc  {
	int i;
	Connection con;
	PreparedStatement ps;

	public Connection myConnection()
	{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:Infva07161:1521:xe", "system", "Newuser123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public int saveData(AdditionMembers add)
	{
		con = myConnection();
		try {
				ps = con.prepareStatement("insert into Numbers values(?,?)");
				ps.setInt(1, add.getNo1());
				ps.setInt(2, add.getNo2());
				i = ps.executeUpdate();
			}

		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		return i;
		
	}
	

}
