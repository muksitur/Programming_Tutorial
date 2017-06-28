import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class DatabaseDriver {
	
	//todo: test your methods from the DatabaseHelper-class here and print the results
	//note: comment out the whole main-Method of Example.java. Otherwise Eclipse will not compile
	//as there are two main methods
	
	
	public static void main(String[] args) throws Exception{
		
		DatabaseHelper dbh = new DatabaseHelper();
		
		dbh.connectdb();
		dbh.createtable();
		dbh.insertusers();
		dbh.insertfriends();
		dbh.insertmessages();
		dbh.query1();
		dbh.query2();
		dbh.query3();
		dbh.connclose();
	}

}
