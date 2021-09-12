package backTracking;

public class CoinChangeCoinRespect {
	public static void ccChangeCoinRespect(int[] arr, int idx, int amount, String ans) {
		if (amount==0) {
			System.out.println(ans);
			return;
		}
		if(amount<0 || idx==arr.length) {
			return;
		}
		// y
		ccChangeCoinRespect(arr, idx, amount-arr[idx], ans + arr[idx]);
		// n
		ccChangeCoinRespect(arr, idx + 1, amount, ans);
	}

	public static void main(String[] args) {
		ccChangeCoinRespect(new int[] { 2, 3, 5, 6 }, 0, 10, "");
	}
}
