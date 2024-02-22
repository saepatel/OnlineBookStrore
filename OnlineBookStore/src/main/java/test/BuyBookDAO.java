package test;

import java.sql.*;
public class BuyBookDAO 
{
public int k =0;
public int buy(BookBean bb)
{
try {
Connection con = DBConnection.getcon();
PreparedStatement ps = con.prepareStatement
("update bookdetails57 set qty = ? where code = ?");
ps.setInt(1, bb.getBqty());
ps.setString(2, bb.getBcode());
k=ps.executeUpdate();
}
catch(Exception e) {e.printStackTrace();}
return k; 
}
}

