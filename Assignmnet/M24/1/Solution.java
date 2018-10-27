import java.util.Scanner;
/**.
 * Class for student.
 */
class Student {
    private int rollNumber;
    private String name;
    private double marks;

    /**.
     * Constructs the object.
     *
     * @param      rollno  The rollno
     * @param      name    The name
     * @param      marks   The marks
     */
    Student(final int rollno, final String name, final double marks) {
        this.rollNumber = rollno;
        this.name = name;
        this.marks = marks;
    }

    /**.
     * Gets the name.
     *
     * @return     The name.
     */
    public String getName() {
        return this.name;
    }

    /**.
     * Gets the marks.
     *
     * @return     The marks.
     */
    public double getMarks() {
        return this.marks;
    }
}


/**.
 * { item_description }
 */
public final class Solution {

  /**.
   * Constructs the object.
   */
  private Solution() {
    /**.
     * { item_description }
     */
  }

  /**.
   * { function_description }
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {

    //final int three = 3;
    Scanner scan = new Scanner(System.in);

    int n = Integer.parseInt(scan.nextLine());

    LinearProbingHashST<Integer, Student> section =
      new LinearProbingHashST<>(3 * n);

    for (int i = 0; i < n; i++) {
      String[] str = scan.nextLine().split(",");
      Student stu = new Student(Integer.parseInt(str[0]),
                                 str[1],
                                 Double.parseDouble(str[2]));
      section.put(Integer.parseInt(str[0]), stu);
    }

    int q = Integer.parseInt(scan.nextLine());

    for (int j = 0; j < q ; j++) {
      String[] tokens = scan.nextLine().split(" ");
      switch (tokens[2]) {
      case "1":
        try {
          System.out.println(section.get(
                               Integer.parseInt(tokens[1])).getName());
        } catch (Exception e) {
          System.out.println("Student doesn't exists...");
        }
        break;
      case "2":
        try {
          System.out.println(section.get(
                               Integer.parseInt(tokens[1])).getMarks());
        } catch (Exception e) {
          System.out.println("Student doesn't exists...");
        }
        break;
      default:
        break;
      }
    }

  }
}

