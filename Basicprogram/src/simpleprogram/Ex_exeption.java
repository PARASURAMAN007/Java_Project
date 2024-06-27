package simpleprogram;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_exeption {
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = obj.nextInt();
		try {
			System.out.println(age);
		}catch (InputMismatchException e) {
			System.out.println("enter numbers only");
		}
	}
}
