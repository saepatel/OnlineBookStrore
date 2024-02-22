package test;

import java.sql.*;
import java.util.*;
public class ViewBooksCustomerDAO 
{
public BookBean bb = null;
ArrayList<BookBean> al = new ArrayList<BookBean>();
public ArrayList<BookBean> view()
{
	try
	{
		Connection con = DBConnection.getcon();
		PreparedStatement ps = con.prepareStatement
				("select * from bookdetails57");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			bb=new BookBean();
			bb.setBcode(rs.getString(1));
			bb.setBname(rs.getString(2));
			bb.setBauthor(rs.getString(3));
			bb.setBprice(rs.getFloat(4));
			bb.setBqty(rs.getInt(5));
			al.add(bb);
			
		}
		
	}
	catch(Exception e) {e.printStackTrace();}
return	al;
}
}


