package test;

import java.sql.*;
import static test.DBInfo.*;
public class DBConnection 
{
public static Connection con = null;
private DBConnection () {}
static 
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection(url,uname,pword);
	
}
catch(Exception e) {e.printStackTrace();}
}
public static Connection getcon()
{
	return con;
}
}

