package static_methods;

public class Static_method_same_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main method");
		
		m1();
		m2();
		m3();
		 System.out.println("main method Ended");
		 }

	public static void m1() {
	   
		System.out.println("I am running from regular method m1");
	}
	public static void m2() {
		   
		System.out.println("I am running from regular method m2");
	}
	
	public static void m3() {
		   
		System.out.println("I am running from regular method m3");
	}
}
