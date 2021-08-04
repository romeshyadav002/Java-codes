package pattern10;

import java.util.Scanner;

public class pattern10 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=10;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			int a=n-i;
			for(int j=1;j<=i+1;j++) {
				System.out.print(a+" ");
				a=a+1;
			}
			System.out.println();
		}
	}
}
