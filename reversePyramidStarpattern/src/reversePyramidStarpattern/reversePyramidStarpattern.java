package reversePyramidStarpattern;

import java.util.Scanner;

public class reversePyramidStarpattern {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of rows: ");
		n = in.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
