import java.util.Scanner;

class Student {
    private int rollNumber;
    private String name;
    private double marks;

    Student(final int rollno, final String name, final double marks) {
        this.rollNumber = rollno;
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return this.name;
    }

    public double getMarks() {
        return this.marks;
    }
}


public final class Solution {
  private Solution() {
  }

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

