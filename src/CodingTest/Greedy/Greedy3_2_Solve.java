package CodingTest.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy3_2_Solve {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            // 공백을 기준을 해서 입력 받기
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int first = arr[n-1];
        int second = arr[n-2];

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first; // 가장 큰 수 더하기
        result += (m - cnt) * second; // 두 번째로 큰 수 더하기

        System.out.println("Result is " + result);

    }
}
