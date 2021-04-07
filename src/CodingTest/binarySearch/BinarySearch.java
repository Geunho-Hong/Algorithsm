package CodingTest;

import java.util.Scanner;

public class BinarySearch {

    // Loop
    public static int loopBinarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end)/2;
            if(arr[mid] == target) {
                // 찾아 내면 중간 idx 값 반환
                return mid;
            } else if(arr[mid] > target) {
                // target이 더 작으면 왼쪽만 뒤질것이다.
                end = mid-1;
            } else if(arr[mid] < target) {
                // target이 더 크면 오른쪽만 뒤질 것이다
                start = mid + 1;
            }
        }
        return -1;
    }

    // Recursive
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        // 찾은 경우 중간점 인덱스 반환
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            // 중간점의 값이 더 크다면, 왼쪽만 뒤진다.
            return binarySearch(arr, target, start, mid - 1);
            // 중간점의 값이 더 작다면, 오른쪽만 뒤진다.
        } else return binarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("is not exist");
        } else {
            System.out.println(result + 1);
        }

    }
}
