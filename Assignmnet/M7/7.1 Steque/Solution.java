import java.util.*;

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Linkedlist l = new Linkedlist();
        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split(" ");
            switch (line[0]) {
            case "push":
                l.push(Integer.parseInt(line[1]));
                System.out.println(l);
                break;
            case "enqueue":
                l.enqueue(Integer.parseInt(line[1]));
                System.out.println(l);
                break;
            case "pop":
                if (l.pop() != 0) {
                    System.out.println(l);
                }
                break;
            case "size":
                System.out.println(l.getSize());
                break;
            default:
                break;

            }
        }
	}
}