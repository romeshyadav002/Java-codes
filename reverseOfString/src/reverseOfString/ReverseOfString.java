package reverseOfString;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		String s1;
		Scanner in=new Scanner(System.in);
		System.out.print("enter the string: ");
		s1=in.nextLine();
		
		String reverse="";
		for(int i=s1.length()-1;i>=0;i--) {
			reverse = reverse + s1.charAt(i);
		}
		System.out.println(reverse);
	}
}
