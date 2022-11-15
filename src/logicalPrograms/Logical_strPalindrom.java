package logicalPrograms;

import java_programs.if_else;

public class Logical_strPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orgString="NITIN";
		String revString ="";
		for(int i=orgString.length()-1;i>=0;i--) {
			revString=revString+orgString.charAt(i);}
			
			if(orgString.equals(revString))
				System.out.println("palendrom");
			else {
				System.out.println("not palendrom");
			}
		

	}

}
