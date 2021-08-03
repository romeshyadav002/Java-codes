package Pattern2;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of rows: ");
		n = in.nextInt();
		
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k=k+1;
				}
			System.out.println();
			}
		
		}
}
