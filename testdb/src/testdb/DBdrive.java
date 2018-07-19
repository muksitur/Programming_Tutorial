package testdb;

public class DBdrive {
	
	public static void main(String[] args) throws Exception{
		
		DBhelp dbh = new DBhelp();
		
		dbh.connectdb();
		dbh.query1();
		//dbh.query2();
		//dbh.query3();
		dbh.connclose();
	}

}
