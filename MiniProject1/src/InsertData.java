import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
	//design method for prepare statement
	
			PreparedStatement st=null;
			Connection connection = null;
				
			public void insertProduct(int id, String Name, int Price, String Dis, int Qty ) throws SQLException {
				try {
				ConnectionTest ctest = new ConnectionTest();
				connection= ctest.getConnectionDetails();
				st= connection.prepareStatement("insert into product (idproduct, Name, Price, Dicription, Quantity)values(?,?,?,?,?)");
				st.setInt(1, id);
				st.setString(2, Name);
				st.setInt(3, Price);
				st.setString(4, Dis);
				st.setInt(5, Qty);
				
				st.executeUpdate();
				}
				catch(Exception e) {
					System.out.println(e);
				}
				finally {
					connection.close();
					st.close();
				}
			}
			
			public static void main(String[] args) throws SQLException {
				Scanner sc =new Scanner(System.in);
				for(int a=1; a<=10; a++) {
					System.out.println("ID no");
					int id=sc.nextInt();
					System.out.println("insert product name");
					String Name = sc.next();
					System.out.println("insert price");
					int Price= sc.nextInt();
					System.out.println("insert Discription");
					String Dis = sc.next();
					System.out.println("insert Qty");
					int Qty = sc.nextInt();
					
					InsertData in = new InsertData();
					in.insertProduct(id, Name, Price, Dis, Qty);
					System.out.println("data inserted.............");
				}

				sc.close();
			}


}
