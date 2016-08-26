package dao;
import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
public class ConnectionHelper {
//	private static Connection connect;
	final static String driver = "oracle.jdbc.driver.OracleDriver";
	final static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	final static String userid = "SSD";
	final static String passwd = "SSD"; 

	private static 	BasicDataSource bds =null;
	static{
		bds = new org.apache.commons.dbcp2.BasicDataSource();
		bds.setDriverClassName(driver);
		bds.setUrl(url);		 
		bds.setUsername(userid);
		bds.setPassword(passwd);
		bds.setInitialSize(3); 
	}
	
	
	public static Connection getConnection() throws Exception  {
/*		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/G");
		Connection conn = ds.getConnection();*/
		return bds.getConnection();
	}
}
