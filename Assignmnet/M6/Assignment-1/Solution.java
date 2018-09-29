import java.util.Scanner;

class AddLargeNumbers {

	public static LinkedList numberToDigits(String number) {
		LinkedList lis = new LinkedList();
		for (int i = 0; i < number.length(); i++) {
			lis.add(number.charAt(i));
		}
		return lis;
	}

	public static String digitsToNumber(LinkedList list) {
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

	public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {

		LinkedList lis = new LinkedList();
		return lis;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = sc.nextLine();
		String q = sc.nextLine();
		switch (input) {
		case "numberToDigits":
			LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
			LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
			System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
			System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
			break;

		case "addLargeNumbers":
			pDigits = AddLargeNumbers.numberToDigits(p);
			qDigits = AddLargeNumbers.numberToDigits(q);
			LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
			System.out.println(AddLargeNumbers.digitsToNumber(result));
			break;
		}
	}

}
