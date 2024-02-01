package com.BookStore;

import java.sql.*;

public class DeleteBookDetailsDAO {
	public int k=0;
	
	public int delete(BookBean bb)
	{
		try {
			Connection con=DBConnection.getCon();
			
			PreparedStatement ps=con.prepareStatement("delete from BookDetails57 where code=?");
			//System.out.println(ps);
			ps.setString(1,bb.getCode());
			//System.out.println(bb.getCode());
			
		 k=ps.executeUpdate();
			//System.out.println(k);
			
			//con.commit();
			//return k>0;
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}
	
}
