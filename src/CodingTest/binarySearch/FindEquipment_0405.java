package CodingTest.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FindEquipment_0405 {

    public static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end) / 2;
        if(arr[mid] == target) {
            return mid;
        } else if(arr[mid] < target) {
            return binarySearch(arr,target,mid+1, end);
        } else {
            return binarySearch(arr,target,start,mid-1);
        }
    }

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.stream(arr).sorted();

        int M = sc.nextInt();
        int[] targetArr = new int[M];

        for (int i = 0; i < targetArr.length; i++) {
            targetArr[i] = sc.nextInt();
        }

        for (int i = 0; i < targetArr.length; i++) {
            int result = binarySearch(arr,targetArr[i],0,arr.length-1);
            if(result != -1){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
