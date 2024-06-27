import java.sql.*;
public class Getflight {
	public static void getticket() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/flightbooking";
		String username = "root";
		String password = "2000";
		String Query = "select * from ticket";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery (Query);
		while (rs.next()) {
			System.out.println("Flight id is "+rs.getInt(1));
			System.out.println("Flight departure from "+rs.getString(2));
			System.out.println("Flight arrival to "+rs.getString(3));
			System.out.println("Flight start date is "+rs.getString(4));
			System.out.println("Flight end date is "+rs.getString(5));
			System.out.println("Flight arrival time is "+rs.getString(6));
			System.out.println("Flight departure time is "+rs.getString(7));
			System.out.println("Flight name is "+rs.getString(8));	
		}
		con.close();
	}
	public static void main (String [] args)throws Exception{
		getticket();
	}
}
