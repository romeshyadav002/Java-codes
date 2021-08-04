package pattern4;

import java.util.Scanner;

public class pattern4 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=n-i;k>=1;k--) {
				System.out.print(k);
			}
			for(int k=2;k<=n-i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
