import java.sql.*;
public class Insertflight {

	public static void insertticket() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/flightbooking";
		String username = "root";
		String password = "2000";
		String Query = "insert into ticket values(?,?,?,?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1, 101);
		pst.setString(2, "Chennai");
		pst.setString(3, "Bangalore");
		pst.setString(4, "10/06/2024");
		pst.setString(5, "10/06/2024");
		pst.setString(6, "10:30:00");
		pst.setString(7, "11:15:00");
		pst.setString(8, "AirAsia");
		pst.setInt(1, 102);
		pst.setString(2, "Delhi");
		pst.setString(3, "Dubai");
		pst.setString(4, "11/06/2024");
		pst.setString(5, "12/06/2024");
		pst.setString(6, "10:00:00");
		pst.setString(7, "11:20:00");
		pst.setString(8, "Kingfisher");
		pst.executeUpdate();
		con.close();
	}
	public static void main (String [] args) throws Exception{
		insertticket();
	}
}
