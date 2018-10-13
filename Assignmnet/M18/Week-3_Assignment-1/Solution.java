import java.util.Scanner;

class Stock implements Comparable<Stock> {
	private String name;
	private double share;
	Stock(final String name, final double share) {
		this.name = name;
		this.share = share;
	}

	public String getComp() {
		return name;
	}

	public double getShare() {
		return share;
	}

	public String toString() {
		return name + " " + share;
	}

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
