import java.util.Arrays;
import java.util.Scanner;

class QuickUnion {
    private int[] id;

    public QuickUnion(int N) {
        id = new int [N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    public int[] getID() {
        return id;
    }
}

public class temp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        QuickUnion q = new QuickUnion(n);
        for (int i = 0; i < n; i++) {
            int temp1 = s.nextInt();
            int temp2 = s.nextInt();
            q.union(temp1, temp2);
            System.out.println(Arrays.toString(q.getID()));
        }
    }
}