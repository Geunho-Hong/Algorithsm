package CodingTest.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 큰 수의 법칙
public class Greedy3_2 {

    // private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        // N, M, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // N개의 수를 공백을 기준으로 구분하여 입력 받기
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        Arrays.sort(arr);

        // 이런식으로 쓰는거 좋은거같음 구지 Colleciton 안써도 되는듯!!!
        int first = arr[n-1]; // 가장 큰 수
        int second = arr[n-2]; // 그다음 큰 수

        while(true){
            // Greedy 반복 -> 가장 큰수가 많이 더해지고, 이후에 작은 수를 한번만 더 해 준다...
            for(int i=0; i<k; i++){
                if(m == 0){
                    // 조건문 안에서도 break 절 필요
                    break;
                }
                answer += first;
                m-=1;
            }
            if(m == 0){
                break;
            }
            answer += second;
            m-=1;
        }

        System.out.println("Result is " + answer);

    }
}
