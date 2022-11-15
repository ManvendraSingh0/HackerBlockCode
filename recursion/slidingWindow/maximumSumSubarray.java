package slidingWindow;

public class maximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, -5, 4, 6 };
		//System.out.println(maxsum(arr));
        System.out.println(kadensAlgo(arr));
    }
    public static int maxsum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				ans = Math.max(ans, sum);
			}

		}
		return ans;
	}
    public static int kadensAlgo(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}
}
