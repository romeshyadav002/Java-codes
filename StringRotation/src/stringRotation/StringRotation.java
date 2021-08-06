package stringRotation;

public class StringRotation {
	public static void main(String[] args) {
		String s1="abcde";
		String s2= "deabc";
		
		if(s1.length()!=s2.length()) {
			System.out.print("not equal");
		}
		/*else {
			int i=0;
			while(i<s1.length()) {
				if(s1.charAt(i)!=s2.charAt((s2.length())-i)) {
					System.out.println("not rotated");
					break;
				}
				else {
					i++;
				}
			if(i==s1.length()) {
				System.out.println("rotated");
			}
			}
		}
		*/
		else {
			s1=s1+s1;
			System.out.println(s1);
			if(s1.indexOf(s2)!=-1) {
				System.out.println("rotated");
			}
			else {
				System.out.println("not rotated");
			}
		}
	}
}
