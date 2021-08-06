package reverseStringWordByWord;

import java.util.Scanner;

public class ReverseStringWordByWord {
	public static void main(String[] args) {
		String s1;
		Scanner in=new Scanner(System.in);
		System.out.print("enter the string: ");
		s1=in.nextLine();
	
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			if(s1.charAt(i)==' ') {
				s2=s2+ s1.substring(i+1,s1.length());
				
			}
		}
		System.out.println(s2);
	}
}
