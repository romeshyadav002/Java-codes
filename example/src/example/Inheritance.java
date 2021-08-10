package example;



public class Inheritance  {
	static void kmpsearch(String s1, String s2) {
		int M=s2.length();
		int N=s1.length();
		
		int lps[]=new int[M];
		
		computeLpsarray(s2,M,lps);
		int i=0;
		int j=0;
		while(i<N) {
			if(s1.charAt(i)==s2.charAt(j)) {
				i++;
				j++;
			}
			if(j==M) {
				System.out.println("found at index: "+ i);
			}
			else if (i<N && s2.charAt(j)!=s1.charAt(i)) {
				if(j!=0) {
					j=lps[j-1];
				}
				else {
					i++;
				}
				
			}
		}
		
	}
	static void computeLpsarray(String s2, int M, int lps[]) {
		int len=0;
		int i=1;
		lps[0]=0;
		
		while(i<M) {
			if(s2.charAt(i)==s2.charAt(len)) {
				len++;
				lps[i]=len;
				i++;
			}
			else {
				if(len!=0) {
					len=lps[len-1];
					
				}
				else {
					lps[i]=len;
					i++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String s1="this is ishaan romesh is";
		String s2="is";
		System.out.println("program start");
		
		
		
		kmpsearch(s2,s1);
		
		
	}
}
