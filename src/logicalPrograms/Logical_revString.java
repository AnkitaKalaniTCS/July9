package logicalPrograms;

public class Logical_revString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org= "PIYUSH";
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
			rev=rev+org.charAt(i);
		
		System.out.println(rev);

	}

}
