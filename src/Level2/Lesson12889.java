package Level2;
//https://programmers.co.kr/learn/courses/30/lessons/12899
// 어렵게 생각하지말고 규칙을 확인해서 풀어보자
// 배열, 리스트에 넣어서 풀어야 한다는 생각에서 벗어나자

public class Lesson12889 {

    public static void main(String[] args) {
        String answer = "";
        int n = 9;
        int rest;

        while(n>0){
            rest = n%3;
            n/=3;

            if(rest == 0){
                rest = 4;
                n-=1;
            }

            answer = rest + answer;
        }
        System.out.println(answer);

    }


}
