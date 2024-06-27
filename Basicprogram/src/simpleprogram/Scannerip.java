package simpleprogram;
import java.util.Scanner;

public class Scannerip {

	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Details");
		String name = obj.nextLine();
		System.out.println("User name is "+name);
		int age = obj.nextInt();
		System.out.println("User age is "+age);
		float hight = obj.nextFloat();
		System.out.println("User hight is "+hight);
		 
	}
}
