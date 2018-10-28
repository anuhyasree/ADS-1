import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        SeparateChainingHashST<String, Integer> hash
        = new SeparateChainingHashST();
        int k = scan.nextInt();
        int l = scan.nextInt();
        scan.nextLine();
        String[] magazine = scan.nextLine().split(" ");
        for (int i = 0; i < magazine.length; i++) {
            if (hash.contains(magazine[i])) {
                hash.put(magazine[i], hash.get(magazine[i]) + 1);
            } else {
                hash.put(magazine[i], 1);
            }
        }
        String[] note = scan.nextLine().split(" ");
        for (int i = 0; i < note.length; i++) {
            if (hash.contains(note[i])) {
                if (hash.get(note[i]) == 0) {
                    System.out.print("No");
                    return;
                } else {
                    hash.put(note[i], hash.get(note[i]) - 1);
                }
            } else {
                System.out.print("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
