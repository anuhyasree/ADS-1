/**.
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
    /**.
     * { var_description }
     */
 String name;
    /**.
     * { var_description }
     */
double share;
    /**.
     * Constructs the object.
     *
     * @param      name   The name
     * @param      share  The share
     */
    Stock(final String name, final double share) {
        this.name = name;
        this.share = share;
    }

    /**.
     * Gets the component.
     *
     * @return     The component.
     */
    public String getComp() {
        return name;
    }

    /**.
     * Gets the share.
     *
     * @return     The share.
     */
    public double getShare() {
        return share;
    }

    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return name + " " + share;
    }

    /**.
     * { function_description }
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Stock that) {
        if (this.share > that.getShare()) {
            return 1;
        }
        if (this.share < that.getShare()) {
            return -1;
        }
        if (this.name.compareTo(that.getComp()) > 0) {
            return 1;
        }
        if (this.name.compareTo(that.getComp()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}