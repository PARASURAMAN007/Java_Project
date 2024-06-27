package simpleprogram;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String [] args) {
		ArrayList<Integer> car = new ArrayList<Integer>();
		car.add(1000);
		car.add(2000);
		car.add(3000);
		car.add(4000);
		car.add(5000);
		System.out.println(car);
		car.set(4, 54000);
		System.out.println(car);
		car.remove(2);
		System.out.println(car);
		System.out.println(car.get(1));
		
	}
}
