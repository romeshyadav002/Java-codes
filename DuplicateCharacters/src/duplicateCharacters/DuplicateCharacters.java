package duplicateCharacters;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String s1="Great responsiblity";
		
		char arr[]= s1.toCharArray();
		int freq[]=new int[s1.length()];
		
		for(int i=0;i<arr.length;i++) {
			freq[i]=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					freq[i]++;
					arr[j]='0';
				}
			}
		}
		for(int i=0;i<s1.length();i++) {
			if(freq[i]>1&&arr[i]!='0') {
				System.out.println(arr[i]);
			}
		}
		
	}
}
