package CountCharacter;

public class countCharacter {
	public static void main(String[] args) {
		String s1="grass is greener on the other side";
		int freq[]=new int[s1.length()];
		
		int min,max;
		char minChar=s1.charAt(0), maxChar=s1.charAt(0);
		
		//int arr[]=new int[s1.length()];
		char arr[]=s1.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<s1.length();j++) {
				if(arr[i]==arr[j] &&arr[i]!=' '&&arr[i]!='0') {
					freq[i]++;
					arr[j]='0';
			}}
		}
		/*for(int i=0;i<s1.length();i++) {
			System.out.println("frequency of characters in a string of index:"+i+" is "+ count[i]);
		}*/
		min=max=freq[0];
		for(int i=0;i<arr.length;i++) {
			if(min>freq[i]&&arr[i]!='0') {
				min=freq[i];
				minChar=arr[i];
			}
			if(max<freq[i]) {
				max=freq[i];
				maxChar=arr[i];
			}
		}
		
		System.out.println("minimum "+ min+ " char is "+minChar);
		System.out.println("minimum "+ max+ " char is "+maxChar);
	}
}
