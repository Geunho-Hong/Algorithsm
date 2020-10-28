package CodingTest;

import java.util.Scanner;

public class Greedy3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int cnt = 0;

        // 1. N에서 1을 뺀다
        // 2. N을 K로 나눈다

        while(true) {
            while(N%K !=0){
                N -=1;
                cnt++;
            }
            N /= K;
            cnt++;
            if(N<K){
                break;
            }
        }

        while(N>1){
            N-=1;
            cnt++;
        }

        System.out.println("Count : " + cnt);
    }
}
