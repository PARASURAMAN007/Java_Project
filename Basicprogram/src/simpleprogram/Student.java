package simpleprogram;

public class Student {
	
	public void studentDetail(int id) {
		System.out.println(id);
	}
	public void studentDetail(String name) {
		System.out.println(name);
	}
	public void studentDetail(float age) {
		System.out.println(age);
	}
	public static void main(String [] args) {
		Student obj = new Student();
		obj.studentDetail(1);
		obj.studentDetail("gopal");
		obj.studentDetail(21);
	}
}

