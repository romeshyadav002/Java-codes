package pattern17;

import java.util.Scanner;

public class pattern17 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-1-i;j++) {
				System.out.print(" ");
			}
			for(int k=n-i;k<=n;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
