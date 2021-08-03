package rightDownMirrorStarPattern;

import java.util.Scanner;

public class rightDownMirrorStarPattern {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of rows: ");
		n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
