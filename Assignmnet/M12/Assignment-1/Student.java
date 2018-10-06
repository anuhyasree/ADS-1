/**
* Class for storing student information.
*/
class Student implements Comparable<Student> {
    /**.
     * { var_description }
     */
    private String name;
    /**.
     * { var_description }
     */
    private String birthday;
    /**.
     * { var_description }
     */
    private int sub1;
    /**.
    * { var_description }
    */
    private int sub2;
    /**.
    * { var_description }
    */
    private int sub3;
    /**.
    * { var_description }
    */
    private int total;
    /**.
     * { var_description }
     */
    protected String reserv;
    /**.
    * { var_description }
    */
    private int year;
    /**.
    * { var_description }
    */
    private int month;
    /**.
    * { var_description }
    */
    private int day;
    /**.
     * Constructs the object.
     *
     * @param      input  The input
     */
    Student(final String input) {
        String[] inp = input.split(",");
        name = inp[0];
        birthday = inp[1];
        year = Integer.parseInt(birthday.substring(6, 9));
        month = Integer.parseInt(birthday.substring(3, 4));
        day = Integer.parseInt(birthday.substring(0, 1));
        sub1 = Integer.parseInt(inp[2]);
        sub2 = Integer.parseInt(inp[3]);
        sub3 = Integer.parseInt(inp[4]);
        total = Integer.parseInt(inp[5]);
        reserv = inp[6];
    }

    /**.
     * { function_description }
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo (final Student that) {
        if (this.total > that.total) {
            return 1;
        }
        if (this.total < that.total) {
            return -1;
        }
        if (this.sub3 > that.sub3) {
            return 1;
        }
        if (this.sub3 < that.sub3) {
            return -1;
        }
        if (this.sub2 > that.sub2) {
            return 1;
        }
        if (this.sub2 < that.sub2) {
            return -1;
        }
        if (this.year > that.year) {
            return 1;
        }
        if (this.year < that.year) {
            return -1;
        }
        if (this.month > that.month) {
            return 1;
        }
        if (this.month < that.month) {
            return -1;
        }
        if (this.day > that.day) {
            return 1;
        }
        if (this.day < that.day) {
            return -1;
        }
        return 0;
    }

    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return name + "," + total + "," + reserv;
    }
}
class MergeSort {

    /**.
     * { function_description }
     *
     * @param      x     { parameter_description }
     * @param      y     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean more(final Comparable x, final Comparable y) {
        return x.compareTo(y) > 0;
    }

    /**.
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      aux   The auxiliary
     * @param      lo    The lower
     * @param      mid   The middle
     * @param      hi    The higher
     */
    public static void merge(final Comparable[] a, final Comparable[] aux,
                             final int lo, final int mid, final int hi) {

        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }

        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (more(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
    /**.
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      aux   The auxiliary
     * @param      lo    The lower
     * @param      hi    The higher
     */
    public static void sort(final Comparable[] a, final Comparable[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid + 1, hi);
        merge(a, aux, lo, mid, hi);
    }
    /**.
     * { function_description }
     *
     * @param      a     { parameter_description }
     */
    public static void sort(final Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];
        sort(a, aux, 0, a.length - 1);
    }

}