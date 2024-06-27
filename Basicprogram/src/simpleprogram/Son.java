package simpleprogram;

public class Son extends Father {

	public void education() {
		System.out.println("Post graduate");
	}
	public static void main (String [] args) {
		Son obj = new Son();
		obj.occupation();
		obj.vhicle();
		obj.education();
		obj.name();
		
	}
}
