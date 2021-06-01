package CodingTest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringArrange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String result = "";
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        char[] lineArr = line.toCharArray();

        Arrays.sort(lineArr);

        for(char c1 : lineArr) {
            if(c1 >= '0' && c1 < 'A') {
                sum += c1 - '0';
            } else{
                sb.append(c1);
            }
        }
        System.out.println("sum : " + sum);
        System.out.println(sb.toString() + sum);
    }
}
