import java.util.Scanner;
/**.
Solution the class for inputs
*/
final class Solution {
/**.
@Solution() the constructor
*/
    private Solution() {

    }
/**.
@param args the arguments
*/
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        Percolate obj = new Percolate(input);
        while (sc.hasNextLine()) {
            String[] inputs = sc.nextLine().split(" ");
            obj.open(Integer.parseInt(
                inputs[0]) - 1, Integer.parseInt(inputs[1]) - 1);
        }
        System.out.println(obj.ispercolate());
    }
}
/**.
Percolate the class
*/
class Percolate {
    /**.
    @grid[][] the boolean array
    */
    private boolean[][] grid;
    /**.
    obj the WeightedQuickUnionUF class object
    */
    private WeightedQuickUnionUF obj;
    /**.
    size the size of the array
    */
    private final int size;
/**.
    Percolate() the constructor
*/
/**.
    @param size1 the size passed from main
*/
    Percolate(final int size1) {
        this.size = size1;
        grid = new boolean[size][size];
        obj = new WeightedQuickUnionUF(size * size + 2);
    }
/**.
@open() the function to open the sites
@param row the row in the 2d matrix
@param column the coloumn in the 2d matrix
*/
    public void open(final int row, final int column) {
        if (grid[row][column]) {
            return;
        }
        grid[row][column] = true;
        if (row == 0) {
            obj.union(convert(row, column), size * size);
        }
        if (row == size - 1) {
            obj.union(convert(row, column), size * size + 1);
        }
        if (row < size - 1 && grid[row + 1][column]) { //bottom element
            obj.union(convert(row, column), convert(row + 1, column));
        }
        if (row > 0 && grid[row - 1][column]) { //top element
            obj.union(convert(row, column), convert(row - 1, column));
        }
        if (column > 0 && grid[row][column - 1]) { //left element
            obj.union(convert(row, column), convert(row, column - 1));
        }
        if (column < size - 1 && grid[row][column + 1]) { //right element
            obj.union(convert(row, column), convert(row, column + 1));
        }
    }
/**.
@ispercolate() the function for validating the percolation
@return returns the connections.
*/
    public boolean ispercolate() {
        return obj.connected(size * size, size * size + 1);
    }
/**.
@convert() the function to convert the 2d array to 1d array
@param i the row index
@param j the column index
@return returns the size conversion factor
*/
    public int convert(final int i, final int j) {
        return i * size + j;
    }
}

// You can implement the above API to solve the problem
// create n-by-n grid, with all sites blocked
// is site (row, col) open?
// is site (row, col) full?
// number of open sites
// does the system percolate?

