package simpleprogram;

public class Bank implements Branch {
	public void name() {
		System.out.println("gokul");
	}
	public void account() {
		System.out.println("123");
	}
	public static void main(String [] args) {
	Bank obj=new Bank();
	obj.name();
	obj.account();
	
}}
