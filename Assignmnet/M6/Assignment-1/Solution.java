import java.util.Scanner;

/**.
 * Class for add large numbers.
 */
final class AddLargeNumbers {

    /**.
     * Constructs the object.
     */
    private AddLargeNumbers() {

    }

    /**.
     * { function_description }
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList lis = new LinkedList();
        for (int i = 0; i < number.length(); i++) {
            lis.add(number.charAt(i));
        }
        return lis;
    }

    /**.
     * { function_description }
     *
     * @param      list  The list
     *
     * @return     { description_of_the_return_value }
     */
    public static String digitsToNumber(final LinkedList list) {
        String out = "";
        String outFin = "";
        Iterator it = new Iterator(list.getHead());
        while (it.hasNext()) {
            out += it.next();
        }

        for (int i = out.length() - 1; i >= 0; i--) {
            outFin += out.charAt(i);
        }
        return outFin;
    }

    /**.
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { description_of_the_return_value }
     */
    public static LinkedList addLargeNumbers(final LinkedList list1,
            final LinkedList list2) {

        LinkedList lis = new LinkedList();
        return lis;
    }
}

/**.
 * Class for solution.
 */
final class Solution {
    /**.
     * { item_description }
     */
    private Solution() {

    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
        case "numberToDigits":
            LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
            LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
            System.out.println(
                AddLargeNumbers.digitsToNumber(pDigits));
            System.out.println(
                AddLargeNumbers.digitsToNumber(qDigits));
            break;

        case "addLargeNumbers":
            pDigits = AddLargeNumbers.numberToDigits(p);
            qDigits = AddLargeNumbers.numberToDigits(q);
            LinkedList result =
                AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
            System.out.println(
                AddLargeNumbers.digitsToNumber(result));
            break;
        default:
            break;
        }
    }

}
