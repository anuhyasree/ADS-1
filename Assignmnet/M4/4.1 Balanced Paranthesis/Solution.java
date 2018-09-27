import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Default constructor for the object.
     */
    private Solution() {

    }
    /**
     * Main function to handle inputs and deliver output.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int i = 0;
        boolean flag = true;
        String[] line;
        LinkedList<String> ll = new LinkedList<String>();
        while (i < num) {
            line = scan.nextLine().split("");
            if (ll.closed(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            i++;
        }
    }
}
