package downTrianglePattern;

import java.util.Scanner;

public class downTrianglePattern {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of rows: ");
		n = in.nextInt(); 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*(n-i)-1);k++) {
				if(k==1||i==1||k==(2*(n-i)-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println("");
		}
	}
}
