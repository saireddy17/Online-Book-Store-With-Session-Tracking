package com.BookStore;

import java.sql.*;

public class AdminRegisterDAO {
	public int k=0;
	public int register(AdminBean ab)
	{
		try {
			
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("insert into Admin57 values(?,?,?,?,?,?,?)");
			ps.setString(1,ab.getuName());
			ps.setString(2,ab.getpWord());
			ps.setString(3,ab.getfName());
			ps.setString(4,ab.getlName());
			ps.setString(5,ab.getAddr());
			ps.setString(6,ab.getmId());
			ps.setLong(7, ab.getPhNo());
			k=ps.executeUpdate();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}

}
