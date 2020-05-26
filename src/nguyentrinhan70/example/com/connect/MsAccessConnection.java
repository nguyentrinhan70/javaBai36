package nguyentrinhan70.example.com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class MsAccessConnection {
	
	public static Connection getConnecton(){
		return getConnecton("csdl/qlCongVan.accdb");
	}

	public static Connection getConnecton(String dataBase){
		try{
			
			String sqlConn ="jdbc:ucanaccess://"+dataBase;
			return DriverManager.getConnection(sqlConn);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
	}
}
