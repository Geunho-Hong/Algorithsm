package Level2;
// https://programmers.co.kr/learn/courses/30/lessons/42587

//객체를 사용하는 방식도 있으니 ,, 잘생각해보기 어려운 문제임
import java.util.Collections;
import java.util.PriorityQueue;

public class Lesson42587 {

    public static void main(String[] args) {
        int [] priorities = {2,1,3,2};
        int location = 2;
        int answer = 0;
        PriorityQueue queue = new PriorityQueue<>(Collections.reverseOrder());

        //우선 순위 방식으로 수를 넣어준다.
        for(int num: priorities){
            queue.add(num);
        }

        // 값이 같고 location과 i 값이 같으면 answer을 return하기
        // 값이 같고 location과 i 값이 다르면 queue를 poll하고 answer 값 증가하기
        while(!queue.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i] == (int)queue.peek()){
                    if(i == location){
                        //return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
