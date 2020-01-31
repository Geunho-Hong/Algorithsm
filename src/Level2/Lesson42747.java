package Level2;
// https://programmers.co.kr/learn/courses/30/lessons/42747
// 정렬 한번 , Search 한번이면 끝난다.
// 어렵게 생각하지 말고, 가볍게 생각한뒤 풀자
// H -INDEX 가 무엇인지 이해하는데 꽤 시간이 걸렸다

import java.util.ArrayList;
import java.util.Collections;

public class Lesson42747 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int num: citations){
            list.add(num);
        }
        Collections.sort(list,Collections.reverseOrder());

        //인덱스의 값이 , 리스트의 값을 넘어가는 경우
        for(int i=0; i<list.size(); i++){
            int num = list.get(i);
            if(num<=i){
                answer = i;
                break;
            }
        }
        System.out.println(answer);

       /* int answer = 0;

        Arrays.sort(citations); // 오름차순 정렬

        for(int i = citations.length - 1; i >= 0; i--) {
            if(citations.length - i >= citations[i]) break;
            answer++;
        }

        return answer;*/
    }
}
