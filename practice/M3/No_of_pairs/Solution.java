import java.util.Scanner;
import java.util.Arrays;

 public class Solution {
 	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
 		int n = scan.nextInt();
 		int[] arr = new int[n];
 		for (int i = 0; i < n; i++) {
 		 	arr[i] = scan.nextInt();
 		 }
 		 Arrays.sort(arr);
 		 int count = 1;
 		 int sum = 0;
 		 for (int i = 0; i < arr.length-1; i++) {
 		 	if (i == arr.length-2 && arr[i] == arr[i+1]) {
 		 		count++;
 		 		sum += count*(count - 1)/2;
 		 		break;
 		 	}
 		 	if (arr[i] == arr[i+1]) {
 		 		count++;
 		 	}
 		 	if (count >= 1 && arr[i] != arr[i+1]) {
 		 		sum += count*(count - 1)/2;
 		 		count = 1;
 		 	}
 		 }
 		 System.out.println(sum);
 	}
 }