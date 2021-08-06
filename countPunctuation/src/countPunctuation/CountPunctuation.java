package countPunctuation;

import java.util.Scanner;

public class CountPunctuation {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= in.nextLine();
		
		System.out.println("entered string is : "+ str);
	
		int count = 0;    
		
		for (int i = 0; i < str.length(); i++)   
		{    
		 
		if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
		str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   
		{    
		count++;    
		}    
		}    
		System.out.println("The number of punctuations exists in the string is: " +count);
	}
}
