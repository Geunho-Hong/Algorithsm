package Level2;

import java.util.Arrays;
import java.util.Comparator;

//문자열 내림차순하는 문제
// https://m.blog.naver.com/PostView.nhn?blogId=yongyos&logNo=221580402785&categoryNo=39&proxyReferer=https%3A%2F%2Fwww.google.com%2F

public class Lesson42746 {

    public static void main(String[] args) {
        String answer = "";
        int[] numbers = {3,30,34,5,9};
        int len = numbers.length;

        // 1. int형 배열을 String으로 바꾸기
        // 2. 나올수 있는 경우의 수 String ArrayList에 저장하기(x) -> String 객체 자체로 비교가능
        // 3. 값 비교하기

        String[] str = new String[len];
        for(int i=0; i<len; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        for(String s1 : str){
            System.out.print(s1+" ");
        }
        System.out.println();

        //배열 정렬, 정렬 규칙으로는 2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               int s1s2 = Integer.parseInt(s1+s2);
               int s2s1 = Integer.parseInt(s2+s1);
               if(s1s2>s2s1){
                   return -1;
               }else if(s1s2==s2s1){
                   return 0;
               }else{
                   return 1;
               }
               // return s2s1 -s1s2;
            }
        });

        if(str[0].equals("0")){
            //return 0;
            answer += "0";
        }
        for(int i=0; i<str.length; i++){
            answer+= str[i];
            System.out.println(str[i]);
        }
        System.out.println(answer);
    }
}
