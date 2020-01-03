package Level2;
//https://programmers.co.kr/learn/courses/30/lessons/42586

import java.util.ArrayList;
import java.util.LinkedList;

public class Lesson42586 {
    public static void main(String[] args) {
        int[] progresses = {93,30,55}; //작업 진도
        int[] speeds = {1,30,5}; // 작업 속도
        int[] answer = {};

        int len = progresses.length;
        int[] workday = new int[len]; //작업 일

        //작업일 구하기
        for(int i=0; i<len; i++){
            workday[i] = (100-progresses[i]) % speeds[i] == 0  ?
                    (100-progresses[i])/speeds[i] : (100-progresses[i])/speeds[i]+1;

        }

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        while(i<len){
            int tmp = workday[i];
            int cnt = 0;
            while(i<len && tmp>=workday[i]){
                i++;
                cnt ++;
            } // workday[i] 값 보다 큰 값만
            list.add(cnt);
            cnt = 0;
        }

        answer = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }

        for(int num:answer){
            System.out.print(num +" ");
        }


    }

}
