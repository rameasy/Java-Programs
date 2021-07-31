import java.util.ArrayList;

public class OneDTwoDArray {
	public static void main(String args[]) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[] = { 3, 6, 9 };
		ArrayList<Integer> result = array(a, b, 3);
		System.out.print(result);
	}

	public static ArrayList<Integer> array(int a[][], int b[], int n) {
		ArrayList<Integer> result = new ArrayList<>();
		int largestValue = 0;
		for (int i = 0; i < b.length; i++) {
			if (largestValue < b[i]) {
				largestValue = b[i];
			}
		}
		result.add(largestValue);
		int countedValue = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					countedValue += a[i][j];
				}
			}
		}
		result.add(countedValue);
		return result;
	}
}
