package pattern20;

import java.util.Scanner;

public class pattern20 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
		}
			for(int k=1;k<i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
