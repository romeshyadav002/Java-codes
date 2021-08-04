package repeatingAlphabetPattern;

import java.util.Scanner;

public class RepeatingAlphabetPattern {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		int A=65;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print((char)A+" ");
			}
			A++;
			System.out.println();
		}
	}
}
