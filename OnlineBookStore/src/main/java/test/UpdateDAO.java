package test;

import java.sql.*;
public class UpdateDAO 
{
public int k=0;
public int update(BookBean bb)
{
try 
{
Connection con = DBConnection.getcon();
PreparedStatement ps = con.prepareStatement
("Update bookdetails57 set price = ?,qty=? where code = ?");
ps.setFloat(1, bb.getBprice());
ps.setInt(2, bb.getBqty());
ps.setString(3, bb.getBcode());
k=ps.executeUpdate();
}
catch(Exception e)
{e.printStackTrace();}
return k; 
}
}

