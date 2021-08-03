package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n= in.nextInt();
		
		int reverse=0;
		while(n!=0) {
			reverse=reverse*10 + n%10;
			n=n/10;
			
		}
		System.out.println(reverse);
	}
}
