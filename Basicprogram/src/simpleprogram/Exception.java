package simpleprogram;
import java.util.ArrayList;
import java.util.Scanner;

public class Exception {
	public static void main(String [] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("red");
		obj.add("blue");
		System.out.println(obj.get(5));
		Scanner obj1 = new Scanner (System.in);
		System.out.println("Enter your age ");
		int age = obj1.nextInt();
		System.out.println(age);
		String a = null;
		System.out.println(a.length());
		
	}
}
