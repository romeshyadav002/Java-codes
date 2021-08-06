package stringAllSubset;

import java.util.Scanner;

public class StringAllSubset {
	public static void main(String[] args) {
		String s1;
		Scanner in=new Scanner(System.in);
		System.out.print("enter the string: ");
		s1=in.nextLine();
	
		int len=s1.length();
		int temp=0;
		
		String arr[]= new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				arr[temp]=s1.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
