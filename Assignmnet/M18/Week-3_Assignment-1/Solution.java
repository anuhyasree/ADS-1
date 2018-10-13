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


		MinPQ<Stock> mi1 = new MinPQ<Stock>();
		MaxPQ<Stock> ma1 = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			ma1.insert(temp);
			mi1.insert(temp);
		}
		ma1.display();
		mi1.display();

		MinPQ<Stock> min2 = new MinPQ<Stock>();
		MaxPQ<Stock> max2 = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			max2.insert(temp);
			min2.insert(temp);
		}
		max2.display();
		min2.display();

		MinPQ<Stock> min3 = new MinPQ<Stock>();
		MaxPQ<Stock> max3 = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			max3.insert(temp);
			min3.insert(temp);
		}
		max3.display();
		min3.display();

		MinPQ<Stock> min4 = new MinPQ<Stock>();
		MaxPQ<Stock> max4 = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			max4.insert(temp);
			min4.insert(temp);
		}
		max4.display();
		min4.display();


		MinPQ<Stock> min5 = new MinPQ<Stock>();
		MaxPQ<Stock> max5 = new MaxPQ<Stock>();

		for (int i = 0; i < n; i++) {
			String[] inputs = scan.nextLine().split(",");
			Stock temp = new Stock(inputs[0],
			                       Double.parseDouble(inputs[1]));
			max5.insert(temp);
			min5.insert(temp);
		}
		max5.display();
		min5.display();




	}
}
