package test;
import java.sql.*;
public class DeleteDAO 
{
public int k=0;
public int delete(String bcode)
{
try {
Connection con = DBConnection.getcon();
PreparedStatement ps = con.prepareStatement
("delete from bookdetails57 where code = ?");
ps.setString(1, bcode);
k = ps.executeUpdate();
}
catch(Exception e) {e.printStackTrace();}
return k; 
}
}

