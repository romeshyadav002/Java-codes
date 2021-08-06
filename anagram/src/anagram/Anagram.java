package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		String s1,s2;
		Scanner in= new Scanner(System.in);
		System.out.print("Ehter the s1: ");
		s1= in.nextLine();
		
		System.out.print("Enter the s2: ");
		s2= in.nextLine();
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.print("invalid");
		}
		else {
			char[] s11= s1.toCharArray();
			char[] s21= s2.toCharArray();
			
			Arrays.sort(s11);
			Arrays.sort(s21);
			
			
			if(Arrays.equals(s11,s21)==true) {
				System.out.println("anagram");
					}
			else {
				System.out.println("not anagram");
				}
			}
		
		
	}
}
