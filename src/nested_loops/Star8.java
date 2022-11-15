package nested_loops;

import java_programs.if_else;

public class Star8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int space=4,star=1;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<=4) {
				space--;
				star=star+2;
				}
			else {
				space++;
				star=star-2;
			}
		}

	}

}
