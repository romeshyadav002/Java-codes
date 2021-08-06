package replaceSpaces;

import java.util.Scanner;

public class ReplaceSpaces {
	public static void main(String[] args) {
		String s1;
		Scanner in=new Scanner(System.in);
		System.out.print("enter the string: ");
		s1=in.nextLine();
	
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				s1=s1.replace(' ', '-');
			}
		}
		System.out.println(s1);
	}
}
