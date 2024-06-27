package simpleprogram;

public class Excephand {
	public static void main (String [] args) {
		System.out.println("welcome");
		try {
			System.out.println(15/0);
		}catch(ArithmeticException e) {
			System.out.println("dont devide anything by zero");
		}
		System.out.println("bye");
	}
}
