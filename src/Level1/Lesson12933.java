package Level1;
// https://programmers.co.kr/learn/courses/30/lessons/12933
import java.util.Arrays;
import java.util.Collections;

public class Lesson12933 {
    public static void main(String[] args) {
        long n = 118372;
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(n);
        char ch[] = str.toCharArray();
        Arrays.sort(ch);

        for(int i=ch.length-1; i>=0; i--){
            sb.append(ch[i]);
        }
        long answer = Long.parseLong(sb.toString());
        System.out.println(answer);


    }
}
