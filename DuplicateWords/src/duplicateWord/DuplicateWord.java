package duplicateWord;

public class DuplicateWord {
	public static void main(String[] args) {
		String s1="Big black bug bit a big black dog on his big black nose";
		int count;
		s1=s1.toLowerCase();
		
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			count =1;
			for(int j=i+1;j<s2.length;j++) {
				if(s2[i].equals(s2[j])) {
					count++;
					s2[j]="0";
				}
			}
			if(count>1 && s2[i]!="0") {
				System.out.println(s2[i]);
			}
		}
	}
}
