import java.util.Comparator;

public class MaxPQ<Key> {
    private Key[] pq;
    private int n;
    private Comparator<Key> comparator;
      //this method has constant time complexity
    //Time complexity is 1.
    public MaxPQ(final int initCapacity) {
        pq = (Key[]) new Object[initCapacity + 1];
        n = 0;
    }
      //this method has constant time complexity
    //Time complexity is 1.
    public MaxPQ() {
        this(1);
    }
      //this method has constant time complexity
    //Time complexity is 1.
    public boolean isEmpty() {
        return n == 0;
    }
      //this method has constant time complexity
    //Time complexity is 1.
    public int size() {
        return n;
    }
      //this method has constant time complexity
    //Time complexity is 1.
    public Key max() {
        return pq[1];
    }
    //this method has time complexity of n.
    //Time complexity is O(n).
    private void resize(final int capacity) {
        Key[] temp = (Key[]) new Object[capacity];
        for (int i = 1; i <= n; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }
    //this method has time complexity of n.
    //Time complexity is O(logn).
    public void insert(final Key x) {
        if (n == pq.length - 1) {
            resize(2 * pq.length);
        }
        pq[++n] = x;
        swim(n);
    }
    //this method has time complexity of n.
    //Time complexity is O(logn).
    public Key delMax() {
        final int four = 4;
        Key max = pq[1];
        exch(1, n--);
        sink(1);
        pq[n + 1] = null;
        if ((n > 0) && (n == (pq.length - 1) / four)) {
            resize(pq.length / 2);
        }
        return max;
    }
    //this method has time complexity of n.
    //Time complexity is O(logn).
    private void swim(final int k1) {
        int k = k1;
        while (k > 1 && less(k / 2, k)) {
            exch(k, k / 2);
            k = k / 2;
        }
    }
    //this method has time complexity of n.
    //Time complexity is O(logn).
    private void sink(final int k1) {
        int k = k1;
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            exch(k, j);
            k = j;
        }
    }
    //this method has time complexity of n.
    //Time complexity is O(n).
    private boolean less(final int i, final int j) {
        if (comparator == null) {
            return ((Comparable<Key>) pq[i]).compareTo(pq[j]) < 0;
        } else {
            return comparator.compare(pq[i], pq[j]) < 0;
        }
    }
    //this method has time complexity of n.
    //Time complexity is O(n).
    private void exch(final int i, final int j) {
        Key swap = pq[i];
        pq[i] = pq[j];
        pq[j] = swap;
    }
    //this method has time complexity of n.
    //Time complexity is O(n).
    public void display() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(delMax());
        }
        System.out.print("\n");
    }
}

