package slidingWindow;

public class maximumsizeKsubarrSum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 5, 6, 30, 1, 8, 9, 11, 5, 7 };
		int k = 3;
		System.out.println(MaximumSumofwindowsizek(arr, k));
    }
    public static int MaximumSumofwindowsizek(int[] arr, int k) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		int ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];

			sum -= arr[i - k];
			ans = Math.max(ans, sum);

		}
		return ans;

	}
}
