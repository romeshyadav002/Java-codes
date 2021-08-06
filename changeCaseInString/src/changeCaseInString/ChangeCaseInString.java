package changeCaseInString;

import java.util.Scanner;

public class ChangeCaseInString {
	public static void main(String[] args) {
		String s1;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the string: ");
		s1=in.nextLine();
		
		StringBuffer s2= new StringBuffer(s1);
		
		for(int i=0;i<s1.length();i++) {
			if(Character.isLowerCase(s1.charAt(i))) {
				s2.setCharAt(i, Character.toUpperCase(s1.charAt(i)));
			}
			else if(Character.isUpperCase(s1.charAt(i))) {
				s2.setCharAt(i,Character.toLowerCase(s1.charAt(i)));
			}
		}
		System.out.println();
	}
}
