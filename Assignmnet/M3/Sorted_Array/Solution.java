import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() { }
    /**
     * function_description.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Sort s = new Sort();
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        sc.nextLine();
        int[] firstarr = new int[size1];
        int[] secondarr = new int[size2];
        String[] arr1 = sc.nextLine().split(",");
        String[] arr2 = sc.nextLine().split(",");
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < size1; i++) {
            firstarr[i] = Integer.parseInt(arr1[i]);
        }
        for (int j = 0; j < size2; j++) {
            secondarr[j] = Integer.parseInt(arr2[j]);
        }
        if (size1 == 0) {
            int h;
            for (h = 0; h < size2 - 1; h++) {
                System.out.print(secondarr[h] + ",");
            }
            System.out.print(secondarr[h]);

        } else {
        s.sortarray(firstarr, secondarr, size1, size2);
        }
    }
}
/**
 * Class for sort.
 */
class Sort {
    /**
     * function_description.
     *
     * @param      a1    A 1
     * @param      a2    A 2
     * @param      len1  The length 1
     * @param      len2  The length 2
     */
    public void sortarray(final int[] a1, final int[] a2,
        final int len1, final int len2) {
        int[] res = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        int p;
        while (i < len1 && j < len2) {
            if (a1[i] < a2[j]) {
                res[k++] = a1[i++];
            } else {
                res[k++] = a2[j++];
            }
        }
        while (i < len1) {
            res[k++] = a1[i++];
        }
        while (j < len2) {
            res[k++] = a2[j++];
        }
        while (len1 == 0) {
            for (p = 0; p < len1; p++) {
            System.out.print(a1[p] + ",");
        }
        System.out.print(a1[p]);

        }
        for (p = 0; p < k - 1; p++) {
            System.out.print(res[p] + ",");
        }
        System.out.print(res[p]);
        }
    }
