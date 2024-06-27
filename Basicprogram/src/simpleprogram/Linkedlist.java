package simpleprogram;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String [] args) {
		LinkedList<Integer> car = new LinkedList<Integer>();
		car.add(1000);
		car.add(2000);
		car.add(3000);
		car.add(4000);
		car.add(5000);
		System.out.println(car);
		car.addFirst(100);
		car.addLast(100000);
		System.out.println(car);
		car.removeFirst();
		car.removeLast();
		System.out.println(car);
		System.out.println(car.get(4));
		
	}
}
