package test;

import java.sql.*;
public class AdminDAO 
{
public AdminBean ab = null;
public AdminBean insert(String uname,String pword) 
{
try 
{
Connection con = DBConnection.getcon();
PreparedStatement ps = con.prepareStatement
("select * from admin57 where uname = ? and pword = ?");
ps.setString(1, uname);
ps.setString(2, pword);
ResultSet rs = ps.executeQuery();
if(rs.next())
{
ab = new AdminBean();
ab.setUname(rs.getString(1));
ab.setPword(rs.getString(2));
ab.setFname(rs.getString(3));
ab.setLname(rs.getString(4));
ab.setAddr(rs.getString(5));
ab.setMid(rs.getString(6));
ab.setPhno(rs.getLong(7));
}
}
catch(Exception e) {e.printStackTrace();}
return ab; 
}
}

