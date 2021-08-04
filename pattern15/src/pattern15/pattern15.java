package pattern15;

import java.util.Scanner;

public class pattern15 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
