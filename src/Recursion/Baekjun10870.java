package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = fibo(N);
        System.out.println(result);
    }

    public static int fibo(int n) {
        if(n==0){
            return 0;
        }else if (n == 1){
            return 1;
        }
        else if (n>=2) {
            return fibo(n - 2) + fibo(n - 1);
        }
        return 0;
    }
}
