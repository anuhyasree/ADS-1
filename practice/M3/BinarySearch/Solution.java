import  java.util.Scanner;
import java.util.Arrays;

class Solution {

    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
         }
        int keyvalue = scan.nextInt();
        Arrays.sort(arr);
        int result = ob.binarySearch(arr,keyvalue);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found" +keyvalue);
    }
}
class BinarySearch{
    int binarySearch(int arr[], int keyvalue) {
        int r = arr.length -1;
        int l = 0;
        for(int i = 0; i < arr.length; i++) {
            int mid = (l + r)/2;
            if(keyvalue == arr[mid]) {
                return mid;
            }
            if(arr[mid] < keyvalue) {
                l = mid + 1;
            }
            if(arr[mid] > keyvalue) {
                r = mid - 1;
            }
        }
        return -1;
    }
}


