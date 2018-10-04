import java.util.Scanner;
class SameStar {
	public String Same(String str) {
		if (str.length() == 1) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + Same(str.substring(1));
		}
		return str.charAt(0) + Same(str.substring(1));
		}
	}

class Solution {
	private Solution() {

	} public static void main(String[] args) {
		SameStar p = new SameStar();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		p.Same(str);
		System.out.println(p.Same(str));

	}
}