import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for Solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() { }

	public static Student[] Filleds (final Student[] sts,
	                                     final int v,
	                                     final int u,
	                                     final int bc, final int sc,
	                                     final int st) {

		Student[] std = new Student[v];
		for (int i = 0; i < u; i++) std[i] = sts[i];
		int filled = u;
		int totSz = sts.length;

		for (int i = filled; bc > 0 && i < totSz; i++) {
			if (filled < u + bc && sts[i].reserv.equals("BC")
			        && filled <= v) {
				std[filled] = sts[i];
				filled += 1;
			}
		}

		// System.out.println(filled);

		for (int i = filled; st > 0 && i < totSz; i++) {
			if (filled < u + bc + st && sts[i].reserv.equals("ST")
			        && filled <= v) {
				std[filled] = sts[i];
				filled += 1;

			}
		}
		// System.out.println(filled);

		for (int i = filled; sc > 0 && i < totSz; i++) {
			if (filled < u + bc + st + sc && sts[i].reserv.equals("SC")
			        && filled <= v) {
				std[filled] = sts[i];
				filled += 1;
			}
		}

		return std;
	}
	/**
	 * Main function - reads in inputs and prints the output to console.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);

		int studentsQual = Integer.parseInt(scan.nextLine());
		int vanc = Integer.parseInt(scan.nextLine());
		int uVac = Integer.parseInt(scan.nextLine());
		int bcc = Integer.parseInt(scan.nextLine());
		int scc = Integer.parseInt(scan.nextLine());
		int stt = Integer.parseInt(scan.nextLine());

		int N = studentsQual;
		int size = 0;
		Student[] students = new Student[N];

		for (int i = 0; i < N; i++) {
			Student tempStu = new Student(scan.nextLine());
			// System.out.println(tempStu);
			students[size++] = tempStu;
		}
		scan.close();

		MergeSort.sort(students);
		for (int i = 0; i < N; i++) System.out.println(students[i]);

		System.out.println();

		Student[] filled = Filleds(students,
		                                    vanc, uVac,
		                                    bcc, scc, stt);
		for (int i = 0; i < vanc; i++) System.out.println(filled[i]);
	}
}