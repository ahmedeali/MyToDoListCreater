package mytestproject.testdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	private static final String JDBC_URL = "jdbc:derby:mytestproject;create=true";
	Connection conn;

	public static void main(String[] args) {
		Main mm = new Main();
		mm.DBConnection();
		
	}
	
	public void DBConnection() {
		try {
			this.conn = DriverManager.getConnection(JDBC_URL); 
			if(this.conn != null)
				System.out.println("connected");

					
			
		}catch(SQLException e) {
			System.out.println("failed");
			
		}
	}
	

}
