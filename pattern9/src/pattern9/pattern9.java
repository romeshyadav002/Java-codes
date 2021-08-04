package pattern9;

import java.util.Scanner;

public class pattern9 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		/*
		for(int i=1;i<=n;i++) {
			int a=1;
			for(int j=1;j<=i;j++) {
				System.out.print(a);
				a=(a==1)?0:1;
			}
			System.out.println();
		}
		*/
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
				
			}
			System.out.println();
		}
	}
}
