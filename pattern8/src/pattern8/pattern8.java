package pattern8;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the no. of rows: ");
		n = in.nextInt();

		int a;
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				a = 0;
				for(int j=1;j<=n;j++) {
					System.out.print(a);
					a=(a==0)?1:0;
				}
			}
			else {
				a=1;
				for(int j=1;j<=n;j++) {
					System.out.print(a);
					a=(a==0)?1:0;
				}
				
			}
			System.out.println();

		}
	}
}
//taken hint: have to try without ternary operator.