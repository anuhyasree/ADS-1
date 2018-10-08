import java.util.Scanner;
/**
 * this is a solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    }
    /**
     * { main function}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        Sorting sort = new Sorting();
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(",");
            Ranking cricket = new Ranking(input[0],
                Integer.parseInt(input[1]), Integer.parseInt(input[2]),
                Integer.parseInt(input[2 + 1]));
            sort.add(cricket);
        }
        sort.selectionSort();
        System.out.println(sort.toString());
    }
}

