package pattern16;

import java.util.Scanner;

public class pattern16 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
