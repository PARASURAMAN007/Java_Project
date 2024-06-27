package simpleprogram;

public class First {

	public void staffName() {
		System.out.println("Ajee");
	}
	public void staffAge() {
		System.out.println(25);
	}
	
	public static void main (String [] args) {
		First obj = new First();
		obj.staffName();
		obj.staffAge();
	}
}
