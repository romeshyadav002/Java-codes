package leftTrianglepattern;

import java.util.Scanner;

public class leftTrianglepattern {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of rows: ");
		n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n - i); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}
