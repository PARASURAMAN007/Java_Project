import java.sql.*;
public class Deleteflight {
	public static void deleteticket() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/flightbooking";
		String username = "root";
		String password = "2000";
		String Query ="delete from ticket where id = 102";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
	}
	public static void main (String [] args) throws Exception{
		deleteticket();
	}

}
