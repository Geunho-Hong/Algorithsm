package Level2;
//https://programmers.co.kr/learn/courses/30/lessons/42577

import java.util.HashSet;
import java.util.Iterator;

// 접두어인 경우가 있다 - > false, 아니다 -> true
public class Lesson42577 {

    public static void main(String[] args) {
        String[] phone_book = {"119","9764223","11954421"};
        boolean answer = true;

        for(int i=0; i<phone_book.length; i++){
            for(int j=i+1; j<phone_book.length; j++){
                if(i==j) { // phone_book의 Value가 같은경우 검사할 필요 없음
                    continue;
                }
                // 문자열이 시작하는 위치가 접두사 이면,
                //indexOf는 문자열의 위치를 찾아준다 -> 0 이면 접두사이다
                if(phone_book[j].indexOf(phone_book[i]) == 0){
                    answer = false;
                }
            }
        }

        /* 틀린 Answer
        String headArr[] = phone_book[0].split("");
        int len = headArr.length;

        for(int i=1; i<phone_book.length; i++) {
            String strArr[] = phone_book[i].split("");
            for (int j = 0; j < len; j++) {
                if(headArr[j].equals(strArr[j])){
                    answer = false;
                }bga
            }
        }*/

        System.out.println(answer);

    }
}
