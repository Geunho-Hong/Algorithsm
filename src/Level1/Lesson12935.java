package Level1;

//https://programmers.co.kr/learn/courses/30/lessons/12935
//삽입은 밀어주고, 삭제는 당겨준다
//새로운 배열에 넣어주기 때문에 삽입,삭제의 개념을 이용할 필요 X

import java.util.ArrayList;
import java.util.List;

public class Lesson12935 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int[] arr = {4, 3, 2, 1};

        int min = arr[0];

        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }

        if(arr.length == 1){
            answer = new int[]{-1};
        }

        for(int i=0; i<arr.length; i++){
            if(min!= arr[i]){
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];

        for(int j=0; j<answer.length; j++){
            answer[j] = list.get(j);
        }



    }
}
