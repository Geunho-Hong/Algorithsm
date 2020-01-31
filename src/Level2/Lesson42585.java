package Level2;
//https://programmers.co.kr/learn/courses/30/lessons/42585

// 문제는 이해했는데 어떤방식으로 구현해야 할지 잘 모르겠다
// 그림이 나오면 규칙을 파악하는데 집중하자
// "(" 이 나오면 쇠막대기 생성 . ")" 이 나오면 쇠막대기 닫힘 +1 함
import java.util.LinkedList;
import java.util.Queue;

public class Lesson42585 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String arrangement = "()(((()())(())()))(())";
        int answer = 0;

        // 레이저의 모양을 () -> 0 으로 바꾼다
        String str = arrangement.replace("()","0");


        Queue<Character> queue = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                // "(" 이 나오면 쇠 막대기를 생성해서 queue 에 add
                queue.add(ch);
            }else if (ch == '0'){
                // "0"이 나오면 queue에 있는 쇠막대기를 더해줌
                answer += queue.size();
            }else{
                // ")" 이 나오면 마지막이니까 +1 하고 poll해서 쇠막대기의 개수줄여줌
                answer +=1;
                queue.poll();
            }
        }
        System.out.println(answer);
    }
}
