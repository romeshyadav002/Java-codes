package swapStrings;

import java.util.Scanner;

public class SwapStrings {
	public static void main(String[] args) {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the string1: ");
		s1= in.nextLine();
		System.out.println("enter the string2: ");
		s2= in.nextLine();
		
		int a=s1.length();
		int b=s2.length();
		s1=s1+s2;
		s2=s1.substring(0,a);
		s1=s1.substring(a,s1.length());
		
		System.out.println(s1+"  "+ s2);

	}
}
