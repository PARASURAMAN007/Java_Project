package simpleprogram;

public class Logical_op {
	public static void main (String [] args) {
		int a=50;
		int b=60;
		
		System.out.println(a==b&&a<=b);
		System.out.println(a==b||a<=b);
		System.out.println(!((a==b)&&(a<=b)));
		System.out.println(!((a==b)||(a<=b)));
	}
}
