package CodingTest.binarySearch;

import java.util.Scanner;


// 파라매트릭 서치

public class MakeRiceCake2 {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            arr[i] = value;
        }

        int start = 0;
        int end = (int)1e9;
        int result = 0;

        while(start <= end) {
            int mid = (start + end ) / 2;
            int total = 0;

            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > mid) {
                    total += arr[i] - mid;
                }
            }
            if(total < M) {
                // total이 큰 경우 시작점 증가
                end = mid - 1;
            } else {
                // 떡의 양이 충분할 경우
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println("Result is : " + result);

    }
}
