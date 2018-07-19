package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBhelp {
	
	static Connection conn;
	static Statement stat;
	
	public static void connectdb() throws Exception{
		
		String user = "root";
		String pass = "1123581321";
        conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/nabil", user, pass);
	}
	
	public static void query1() throws Exception{
		
		Scanner ss = new Scanner(System.in);
		System.out.println("name of location:");
		String locationname = ss.nextLine();
		PreparedStatement prep1 = conn.prepareStatement("select number_of_registered_clients, number_of_unregistered_occupants, "
				+ "number_of_free_spots from locations where location_name = ?");
		prep1.setString(1, locationname);
		ResultSet rs1 = prep1.executeQuery();
		
		while (rs1.next()) {
			int numofclients, numofunregoccupants, numoffreespots;
			numofclients = rs1.getInt("number_of_registered_clients");
			numofunregoccupants = rs1.getInt("number_of_unregistered_occupants");
			numoffreespots = rs1.getInt("number_of_free_spots");
			
			PreparedStatement prep2 = conn.prepareStatement("update locations set individual_location_search_cost = ?,"
					+ "probability = ? where location_name = ?");
			
			prep2.setInt(1, numofclients + numofunregoccupants);
			prep2.setDouble(2, (double)numoffreespots/(numofclients+numofunregoccupants));
			prep2.setString(3, locationname);
			
			ResultSet rs2 = prep2.executeQuery();
			rs2.close();
        }
        rs1.close();
        
        PreparedStatement prep3 = conn.prepareStatement("select * from locations where location_name = ?");
		prep3.setString(1, locationname);
		ResultSet rs3 = prep3.executeQuery();
		
		while(rs3.next()) {
			System.out.println("Location: "+rs3.getString("location_name"));
			System.out.println("Number of Registered Clients: "+rs3.getInt("number_of_registered_clients"));
			System.out.println("Number of Unregistered Occupants: "+rs3.getInt("number_of_unregistered_occupants"));
			System.out.println("Number of Free spots: "+rs3.getInt("number_of_free_spots"));
			System.out.println("Probability of a Free spot: "+rs3.getDouble("probability"));
			
		}
		rs3.close();
	}
	
	public static void connclose() throws Exception{
		conn.close();
	}

}
