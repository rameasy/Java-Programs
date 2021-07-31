import java.util.Arrays;

public class TwoGreaterElement {
	public static void main(String args[]) {
		long a[] = { 3, 7, 2, 9, 5 };
		long b[] = findElements(a, a.length);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ,");
		}
	}

	/*
	 * public static long[] findElements(long a[], long n) { long[] finalArray = new
	 * long[a.length - 2]; for (int i = 0; i < n - 1; i++) { boolean swapped =
	 * false; for (int j = 0; j < n - 1; j++) { if (a[j] > a[j + 1]) { long
	 * tempValue = a[j]; a[j] = a[j + 1]; a[j + 1] = tempValue; swapped = true; } }
	 * finalArray[i] = a[i]; if (!swapped) { break; } } finalArray =
	 * Arrays.copyOf(a, a.length -2);
	 * 
	 * return finalArray; }
	 */
	public static long[] findElements(long a[], long n) {
		long[] finalArray = new long[a.length-2];
		Arrays.sort(a);
		finalArray =Arrays.copyOf(a, a.length -2);
		return finalArray;
	}

	/*
	 * public static long[] findElements(long a[], long n) { long[] finalArray = new
	 * long[a.length - 2]; for (int i = 0; i < n - 1; i++) { if (a[i] > a[i + 1]) {
	 * // finalArray[i] = a[j]; long tempValue = a[i]; a[i] = a[i + 1]; a[i + 1] =
	 * tempValue; findElements(a, n - 1); } } for(int i=0;i<finalArray.length;i++) {
	 * finalArray[i] = a[i]; } return finalArray; }
	 */
}
