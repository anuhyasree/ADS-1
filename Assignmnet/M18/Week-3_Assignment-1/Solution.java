import java.util.Scanner;

/**.
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
	/**.
	 * { var_description }
	 */
	private String name;
	/**.
	 * { var_description }
	 */
	private double share;
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

/**
 * Class for solution.
 */
public final class Solution {
	/**
	 * Main method - Takes Inputs, prints out Outputs.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		MinPQ<Stock> min = new MinPQ<Stock>();
		MaxPQ<Stock> max = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			max.insert(temp);
			min.insert(temp);
		}
		max.display();
		min.display();

	}
}
