package pattern3;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		/*int n;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the no. of rows: ");
		n = in.nextInt();
	
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<2*i-1;k++) {
				if(k==1||k==2*i-1) {
					System.out.print(1);
				}
			}
		}*/
		int n = 8;    //n is the number of rows you want to print  
		for (int i = 0; i < n; i++)   
		{  
		int number = 1;  
		System.out.printf("%" + (n - i) * 2 + "s", "");  }
	}
}
