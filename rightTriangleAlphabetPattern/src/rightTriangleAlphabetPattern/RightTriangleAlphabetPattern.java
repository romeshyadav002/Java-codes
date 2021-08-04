package rightTriangleAlphabetPattern;

import java.util.Scanner;

public class RightTriangleAlphabetPattern {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		
		
		for(int i=1;i<=n;i++) {
			int A=65;
			for(int j=1;j<=i;j++) {
				System.out.print((char)(A)+" ");
				A=A+1;
			}
			System.out.println();
		}
	}
}
