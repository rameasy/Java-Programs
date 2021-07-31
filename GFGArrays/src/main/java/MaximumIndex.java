import java.util.Scanner;

class MaximumIndex {
	public static void main(String[] args) {

		// Scanner in = new Scanner(System.in);
		// int noOfUsecases = in.nextInt();

		/*
		 * for (int i = 0; i < noOfUsecases; i++) { int arrayLength = in.nextInt();
		 * int[] arr = new int[arrayLength]; if (in.hasNextInt()) {
		 * 
		 * for (int j = 0; j < arrayLength; j++) { arr[j] = in.nextInt(); }
		 * 
		 * }
		 */
		int[] arr = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		maximumIndex(arr, arr.length);
		// }
	}

	public static void maximumIndex(int[] arr, int length) {
		int i = 1, j = length - 2;
		int maxDiff = 0;
		int[] min = new int[length];
		min[0] = arr[0];
		for (; i < length; ++i) {
			min[i] = arr[i] < min[i - 1] ? arr[i] : min[i - 1];
		}
		int[] max = new int[length];
		max[length - 1] = arr[length - 1];
		for (; j >= 0; --j) {
			max[j] = arr[j] > max[j + 1] ? arr[j] : max[j + 1];
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(min[k] + ", ");
		}
		System.out.println();
		for (int l = 0; l < arr.length; l++) {
			System.out.print(max[l] + ", ");
		}
		System.out.println();
		i = 0;
		j = 0;
		while (j < length && i < length) {
			System.out.print(min[i] + ", "+ max[j]+ ":: ");
			if (min[i] <= max[j]) {
				maxDiff = maxDiff > (j - i) ? maxDiff : (j - i);
				j = j + 1;
			} else
				i = i + 1;
		}
		// System.out.println(maxDiff);
	}
}