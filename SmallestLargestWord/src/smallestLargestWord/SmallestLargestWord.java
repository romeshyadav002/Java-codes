package smallestLargestWord;

public class SmallestLargestWord {
	public static void main(String[] args) {
		String s1="Hardships often prepare ordinary people for an extraordinary destiny";
		s1=s1.toLowerCase();
		String s2[]= s1.split(" ");
		int max=s2[0].length();
		int min=s2[0].length();
		
		String maxString = s2[0];
		String minString = s2[0];
		
		for(int i=0;i<s2.length;i++) {
			if(s2[i].length()>max) {
				max=s2[i].length();
				maxString= s2[i];
			}
			if(s2[i].length()<min) {
				min=s2[i].length();
				minString= s2[i];
			}
		}
		System.out.println(maxString);
		System.out.println(minString);
	}
}
