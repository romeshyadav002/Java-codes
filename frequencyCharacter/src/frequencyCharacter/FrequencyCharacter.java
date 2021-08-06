package frequencyCharacter;

import java.util.Scanner;

public class FrequencyCharacter {
	public static void main(String[] args) {
		String s1;
		Scanner in=new Scanner(System.in);
		System.out.print("enter the string: ");
		s1=in.nextLine();
		s1=s1.toLowerCase();
		char arr[]= s1.toCharArray();
	
		int freq[]= new int[s1.length()];
		
		
		for(int i=0;i<s1.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<s1.length();j++) {
				if(arr[i]==arr[j]) {
					freq[i]++;
					arr[j]='0';
				}
			}
		}
		for(int i=0;i<s1.length();i++) {
			if(arr[i]!=' '&&arr[i]!='0')
				System.out.println(i+" index frequency is "+freq[i]);
		}
	}
}
