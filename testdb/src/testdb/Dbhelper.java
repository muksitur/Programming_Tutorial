package testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dbhelper {
	
	static Connection conn;
	static Statement stat;
	
	public static void connectdb() throws Exception{
		
		String user = "root";
		String pass = "1123581321";
        conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/nabil", user, pass);
	}
	
	/*public static void createtable() throws Exception{
		stat = conn.createStatement();
        stat.executeUpdate("drop table if exists people;");
        
        stat.executeUpdate("create table Users (nickname, email, password);");
        stat.executeUpdate("create table Friends (user, friend);");
        stat.executeUpdate("create table Messages (msg, time, user, friend)");
	}*/
	
	public static void insertusers() throws Exception{
		PreparedStatement prep = conn.prepareStatement(
	            "insert into Users values (?, ?, ?);");

	        prep.setString(1, "Gandhi");
	        prep.setString(2, "gandhi@gmail.com");
	        prep.setString(3, "gandhigandhi");
	        prep.addBatch();
	        prep.setString(1, "Turing");
	        prep.setString(2, "turing@gmail.com");
	        prep.setString(3, "turingturing");
	        prep.addBatch();
	        prep.setString(1, "Wittgenstein");
	        prep.setString(2, "wittgenstein@gmail.com");
	        prep.setString(3, "brobro");
	        prep.addBatch();
	        
	        conn.setAutoCommit(false);
	        prep.executeBatch();
	        conn.setAutoCommit(true);
	        
	}
	
	public static void insertfriends() throws Exception{
		PreparedStatement prep = conn.prepareStatement(
	            "insert into Friends values (?, ?);");

	        prep.setString(1, "Gandhi");
	        prep.setString(2, "Nehru");
	        prep.addBatch();
	        prep.setString(1, "Turing");
	        prep.setString(2, "Einstein");
	        prep.addBatch();
	        prep.setString(1, "Wittgenstein");
	        prep.setString(2, "Applebee");
	        prep.addBatch();
	        
	        conn.setAutoCommit(false);
	        prep.executeBatch();
	        conn.setAutoCommit(true);
	        
	}
	
	public static void insertmessages() throws Exception{
		PreparedStatement prep = conn.prepareStatement("insert into Messages values (?, ?, ?, ?);");

	        prep.setString(1, "sup bro");
	        prep.setLong(2, 11);
	        prep.setString(3, "Gandhi");
	        prep.setString(4, "Nehru");
	        prep.addBatch();
	        prep.setString(1, "go to hell, bro");
	        prep.setLong(2, 5);
	        prep.setString(3, "Gandhi");
	        prep.setString(4, "Nehru");
	        prep.addBatch();
	        prep.setString(1, "hug it out bro");
	        prep.setString(2, "51");
	        prep.setString(3, "Gandhi");
	        prep.setString(4, "Nehru");
	        prep.addBatch();
	        prep.setString(1, "ooh yaaa");
	        prep.setLong(2, 4);
	        prep.setString(3, "Gandhi");
	        prep.setString(4, "Nehru");
	        prep.addBatch();
	        prep.setString(1, "oooooh yaaaaaaaaa");
	        prep.setLong(2, 48);
	        prep.setString(3, "Gandhi");
	        prep.setString(4, "Nehru");
	        prep.addBatch();
	        prep.setString(1, "aaawwwwwesome");
	        prep.setLong(2, 8);
	        prep.setString(3, "Gandhi");
	        prep.setString(4, "Nehru");
	        prep.addBatch();
	        
	        conn.setAutoCommit(false);
	        prep.executeBatch();
	        conn.setAutoCommit(true);
	}
	
	public static void query1() throws Exception{
		PreparedStatement prep = conn.prepareStatement("select nickname from users");
		ResultSet rs = prep.executeQuery();
		
        while (rs.next()) {
            System.out.println("name = " + rs.getString("nickname"));
        }
        rs.close();
	}
	
	public static void query2() throws Exception{
		PreparedStatement prep = conn.prepareStatement("select msg, user from messages where user = ? order by time ASC LIMIT 10");
		prep.setString(1, "Gandhi");
		ResultSet rs = prep.executeQuery();
		
		while (rs.next()) {
            System.out.println("message from "+rs.getString("user")+ " = "+ rs.getString("msg"));
        }
        rs.close();
	}
	
	public static void query3() throws Exception{
		PreparedStatement prep = conn.prepareStatement("select msg, friend from messages where friend = ? order by time ASC LIMIT 6");
		prep.setString(1, "Nehru");
		ResultSet rs = prep.executeQuery();
		
		while (rs.next()) {
			 System.out.println("message for "+rs.getString("friend")+ " = "+ rs.getString("msg"));
            //System.out.println("message for = " + rs.getString("msg"));
        }
        rs.close();
	}
	
	public static void connclose() throws Exception{
		conn.close();
	}

}
