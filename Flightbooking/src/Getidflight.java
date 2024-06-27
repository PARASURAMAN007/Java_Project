import java.sql.*;
public class Getidflight {
	public static void getidticket() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/flightbooking";
		String username = "root";
		String password = "2000";
		String Query = "select Departure, Arrival from ticket WHERE id= 102";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery (Query);
		if (rs.next()) {
			String departure = rs.getString("Departure");
			String arrival = rs.getString("Arrival");
			System.out.println(departure);
			System.out.println(arrival);
		}else {
			System.out.println("No records found in this id");
		}
		rs.close();
		smt.close();
		con.close();
	}
	public static void main (String [] args)throws Exception{
		getidticket();
	}
}
