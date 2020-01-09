//https://programmers.co.kr/learn/courses/30/lessons/42840
package Level1;

import java.util.ArrayList;

public class Lesson42840 {

    public static void main(String[] args) {
        int[] answer = {1,2,3,4,5};
        //1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열
        int[] result = {}; // 가장 많은 문제를 맞춘 사람을 배열에 담는다
        int cnt[] = new int[3];

        //반복을 위해서 mod 연산자를 이용한다
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};

        for(int i=0; i<answer.length; i++){
            if(answer[i] == student1[i%5]){
                cnt[0]++; //1번학생의 cnt
            }
            if(answer[i] == student2[i%8]){
                cnt[1]++; //2번학생의 cnt
            }
            if(answer[i] == student3[i%10]){
                cnt[2]++; //3번학생의 cnt
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        //가장 높은 점수를 구한다
        int max = cnt[0];
        for(int i=0; i<cnt.length; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
            }
        }
        //가장 높은 점수를 받은 학생들을 list에 담는다
        for(int i=0; i<cnt.length; i++){
            if(max == cnt[i]){
                //학생의 수는 1부터 시작하기때문에 i+1;
                list.add(i+1);
            }
        }

        result = new int[list.size()];
        for(int i=0; i<result.length; i++){
            result[i] = list.get(i);
        }

        for(int num: result){
            System.out.print(num +" ");
        }


    }
}
