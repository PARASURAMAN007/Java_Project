package simpleprogram;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class Datetime {

	public static void main (String [] args) {
		LocalTime obj = LocalTime.now();
		System.out.println("Current time is "+obj);
		LocalDate obj1 = LocalDate.now();
		System.out.println("Current Date is "+obj1);
		LocalDateTime obj2 = LocalDateTime.now();
		System.out.println("Current Date and time is "+obj2);
		
	}
}
