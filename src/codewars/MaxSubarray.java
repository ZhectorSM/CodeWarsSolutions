package codewars;

public class MaxSubarray {

	public static void main(String[] args) {
//		System.out.println(sequence(new int[] {}));// 0
		System.out.println(sequenceBest(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));// 6
	}

	public static int sequence(int[] arr) {
		int maxSum = 0;
		int currentSum = 0;
		if (arr.length == 0)
			return maxSum;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i; j++) {
				currentSum = 0;
				for (int h = j; h < arr.length - i; h++) {
					currentSum += arr[h];
				}

				if (currentSum > maxSum)
					maxSum = currentSum;

			}

		}

		return maxSum;
	}

	public static int sequenceBest(int[] arr) {
		int max_ending_here = 0, max_so_far = 0;
		for (int v : arr) {

			max_ending_here = Math.max(0, max_ending_here + v);
			max_so_far = Math.max(max_so_far, max_ending_here);
			System.out.println("element: " + v + " ending: " + max_ending_here + " sofar:" + max_so_far);
		}
		return max_so_far;
	}

}
