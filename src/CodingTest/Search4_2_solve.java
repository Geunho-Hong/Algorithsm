package CodingTest;

import java.util.Scanner;

public class Search4_2_solve {

    // 완전 탐색도 결국에는 구현 문제이다 ( Greedy, 완탐 -> 모두 구현 문제라고 보면 된다 )
    // 완전 탐색은 시간 복잡도가 높은 편이기 때문에 전체 데이터의 개수가 100만개 이하일때 사용하자


    // 특정한 시각 안에 '3'이 포함되어 있는지의 여부 ( String 형으로 치환하지 않고 문제 푸는 방법)
    /*public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;

        for(int i=0; i< N+1; i++){
            for(int j=1; j<=60; j++){
                for(int k=1; k<=60; k++){

                    String hour = String.valueOf(i);
                    String min = String.valueOf(j);
                    String second = String.valueOf(k);

                    if(hour.contains("3") || min.contains("3") || second.contains("3")){
                        answer++;
                    }
                }
            }
        }

        System.out.println("Answer is : " + answer);


    }
}
