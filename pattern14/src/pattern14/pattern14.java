package pattern14;

import java.util.Scanner;

public class pattern14 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		for(int i=1;i<=n;i++) {
			int a =n-i+1;
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(a+" ");
				a=a-1;
			}
			System.out.println();
		}
	}
}
