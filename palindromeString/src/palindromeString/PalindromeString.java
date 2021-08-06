package palindromeString;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		String s1;
		Scanner in=new Scanner(System.in);
		System.out.print("enter the string: ");
		s1=in.nextLine();
		
		boolean flag =true;
		s1=s1.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			 if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)) {
					System.out.println("not palindrome");
					flag=false;
					break;
				}

			}
		
		if(flag) {
			System.out.println("palindrome");
		}
			
		
	}
	
}
