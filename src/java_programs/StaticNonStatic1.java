package java_programs;

public class StaticNonStatic1 {
	static int i=10;
           int j=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Static: "+i);
		StaticNonStatic1 static1=new StaticNonStatic1();
		System.out.println("nonstaic :"+static1.j);

	}

}
