import java.util.Scanner;
class Fact {
	static long fact(int n)
   {
       long output;
       if(n == 1 || n == 0){
         return 1;
       }
       output = fact(n-1)* n;
       return output;
   }
}
class Solution {
	public static void main(String[] args) {
		Fact f = new Fact();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        f.fact(n);
        System.out.println(f.fact(n));
	}
}
