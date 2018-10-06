import java.util.Arrays;
import java.util.*;

	/**
 * Class for storing student information.
 */
class Student implements Comparable<Student> {
	String name;
	String birthday;
	int sub1;
	int sub2;
	int sub3;
	int total;
	String reserv;
	int year;
	int month;
	int day;
	Student(final String input) {
		String[] inp = input.split(",");
		name = inp[0];
		birthday = inp[1];
		year = Integer.parseInt(birthday.substring(6,9));
		month = Integer.parseInt(birthday.substring(3,4));
		day = Integer.parseInt(birthday.substring(0,1));
		sub1 = Integer.parseInt(inp[2]);
		sub2 = Integer.parseInt(inp[3]);
		sub3 = Integer.parseInt(inp[4]);
		total = Integer.parseInt(inp[5]);
		reserv = inp[6];
	}

	public int compareTo (Student that) {
		if (this.total > that.total) return 1;
		if (this.total < that.total) return -1;
		if (this.sub3 > that.sub3) return 1;
		if (this.sub3 < that.sub3) return -1;
		if (this.sub2 > that.sub2) return 1;
		if (this.sub2 < that.sub2) return -1;
		if (this.year > that.year) return 1;
		if (this.year < that.year) return -1;
		if (this.month > that.month) return 1;
		if (this.month < that.month) return -1;
		if (this.day > that.day) return 1;
		if (this.day < that.day) return -1;
		return 0;
	}

	public String toString() {
		return name + "," + total + "," + reserv;
	}
}
class MergeSort {

	public static boolean more(Comparable x, Comparable y) {
		return x.compareTo(y) > 0;
	}

	public static void merge(Comparable[] a, Comparable[] aux,
	                         int lo, int mid, int hi) {

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
	public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if (hi <= lo) return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}

}