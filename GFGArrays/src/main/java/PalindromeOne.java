import java.util.Vector;

public class PalindromeOne {

	public static void main(String[] args) {
		printBinaryPalindrome(4, 8);

	}

	static void printBinaryPalindrome(int n, int k) {
		int[] arr = new int[n];
		int[] ans = new int[n];

		Vector<Integer>[] connectchars = new Vector[k];
		for (int i = 0; i < k; i++)
			connectchars[i] = new Vector<Integer>();
		for (int i = 0; i < n; i++)
			arr[i] = i % k;
		for (int i = 0; i < n / 2; i++) {
			connectchars[arr[i]].add(arr[n - i - 1]);
			connectchars[arr[n - i - 1]].add(arr[i]);
		}
		dfs(0, ans, connectchars);

		for (int i = 0; i < n; i++)
			System.out.print(ans[arr[i]]);
	}

	// function to apply DFS
	static void dfs(int parent, int ans[], Vector<Integer> connectchars[]) {
		// set the parent marked
		ans[parent] = 1;

		// if the node has not been visited set it and
		// its children marked
		for (int i = 0; i < connectchars[parent].size(); i++) {
			System.out.println(ans[connectchars[parent].get(i)]);
			if (ans[connectchars[parent].get(i)] != 1)
				dfs(connectchars[parent].get(i), ans, connectchars);
		}
	}
}
