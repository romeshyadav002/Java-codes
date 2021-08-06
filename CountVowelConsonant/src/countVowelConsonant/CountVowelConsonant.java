package countVowelConsonant;

import java.util.Scanner;

public class CountVowelConsonant {
	public static void main(String[] args) {
		String str;
		Scanner in= new Scanner(System.in);
		System.out.print("enter the statement: ");
		str= in.nextLine();
		
		int v=0,c=0;
		str=str.toLowerCase();
		
		for(int i=0;i<=str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				v++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				c++;
			}
		}
		System.out.println(v + "  "+ c);
	}
}
