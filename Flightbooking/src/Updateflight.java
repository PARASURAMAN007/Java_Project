import java.sql.*;

public class Updateflight {
	public static void updateticket() throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/flightbooking";
		String username = "root";
		String password = "2000";
		String Query = "update ticket set Arrival='Mumbai' where id=102";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main (String [] args) throws Exception {
		updateticket();
	}
}
