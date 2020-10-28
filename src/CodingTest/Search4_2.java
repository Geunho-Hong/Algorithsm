package CodingTest;

import java.util.Scanner;

public class Search4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();    // 시간

        int hour = 0; // 시
        int min = 0; // 분
        int second = 0; // 초

        int answer = 0;

        while(true){

            if(hour == N + 1){
                break;  // loop 빠져나가는 조건
            }
            second++;   // 초가 계속해서 올라간다

            if(second == 60){
                min ++;
                second = 0;
            }
            if(min == 60){
                hour ++;
                min = 0;
            }

            String secStr = String.valueOf(second);
            String minStr = String.valueOf(min);
            String hourStr = String.valueOf(hour);

            if(secStr.contains("3")){
                answer ++;
            }else if(minStr.contains("3")){
                answer ++;
            }else if(hourStr.contains("3")){
                answer ++;
            }
        }
        System.out.println("Hour: " + hour);
        System.out.println("Min: " + min);
        System.out.println("Second: " + second);
        System.out.println("answer : " + answer);

    }
}
