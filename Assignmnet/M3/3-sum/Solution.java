import java.util.Scanner;
import java.util.Arrays;

/**.
 * Class for solution.
 */
class Solution {
	/**.
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	/**.
	 * Constructs the object.
	 */
	Solution() {
		/**.
		 * { item_description }
		 */
	}
	/**.
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/**.
		 * { var_description }
		 */
		Scanner s = new Scanner(System.in);
		threeSum t = new threeSum();
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		t.findTrip(arr);
	}
}
/**.
 * Class for three sum.
 */
class threeSum {
	/**.
	 * { var_description }
	 */
	int count;
	threeSum() {
		count = 0;
	}
	void findTrip(int[]arr) {
		int len = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < len - 1; i++) {
			int j = i + 1;
			int r = len - 1;
			int x = arr[i];
			while (j < r) {
				int sum = x + arr[j] + arr[r];
				if (sum == 0) {
					count++;
					j++;
					r--;
				} else if (sum < 0) {
					j++;

				} else {
					r--;
				}
			}

		}
		System.out.println(count);
	}
}
