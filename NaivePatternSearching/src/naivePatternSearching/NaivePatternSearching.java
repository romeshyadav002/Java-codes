package naivePatternSearching;

import java.util.Scanner;

public class NaivePatternSearching {
	public static void main(String[] args) {
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.print("enter the s1 string: ");
		s1=in.nextLine();
		System.out.print("enter the s2 string: ");
		s2=in.nextLine();
		
		int n=s1.length();
		int m=s2.length();
		
		for(int i=0;i<=n-m;i++) {
			int j;
			for(j=0;j<m;j++) {
				if(s1.charAt(i+j)!=s2.charAt(j)) {
					break;
				}
			if(j==m) {
				System.out.println("pattern found at index"+ i);
				}
			}
		}
		

	}}
	

	

