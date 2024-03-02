import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

	// Database Connection data
	public static final String DBname = "ambi";
	public static final String DBconnection = "jdbc:mysql://localhost:3306/"+DBname;
	public static final String DB_password = "156783310";
	
	// Columns of Table
	public static final String Table_name = "users";
	
	public static final String Column_name = "name";
	public static final String Column_id = "id";
	public static final String Column_number = "number";
	
	private Connection conn;
	
	public boolean open() {
		try {
			conn = DriverManager.getConnection(DBconnection,"root",DB_password);
			System.out.println("DB is open");
			return true;
		}
		catch(SQLException e){
			System.out.println("Coud not connect DB" + e.getMessage());
			return false;			
		}
	}
	
	public void close() {
		try {
			if(conn != null) {
				conn.close();
				System.out.println("DB is close");
			}
			
		}
		catch(SQLException e) {
			System.out.println("Could not close DB "+e.getMessage());
		}
		
	}
	
	
	


}
