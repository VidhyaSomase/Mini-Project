import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {
		Connection connection = null;
			
			public Connection getConnectionDetails() {
				try {
					
					
					Class.forName("com.mysql.jdbc.Driver");
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");
							
				}
				catch(Exception e) {
					System.out.println(e);
				}
			
				return connection;
				
			}


}
