package testdb;

public class Dbdriver {
	
	public static void main(String[] args) throws Exception{
			
			Dbhelper dbh = new Dbhelper();
			
			dbh.connectdb();
			//dbh.createtable();
			//dbh.insertusers();
			//dbh.insertfriends();
			//dbh.insertmessages();
			dbh.query1();
			dbh.query2();
			dbh.query3();
			dbh.connclose();
		}
	

}
