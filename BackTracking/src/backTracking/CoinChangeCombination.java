package backTracking;

public class CoinChangeCombination {
	static int count = 0;

	public static void main(String[] args) {
		coinChangeC(new int[] {2,3,5,6}, 0, 10, "",0);
	}

	public static void coinChangeC(int[] arr, int ca, int ta, String ans, int lastidx) {
		if (ca == ta) {
			count++;
			System.out.println(count + " " + ans);
			return;
		}
		
		for (int i = lastidx; i < arr.length; i++) {
			if (ca < ta) {
				coinChangeC(arr, ca + arr[i], ta, ans + arr[i],i);
			}
		}
	}
}
