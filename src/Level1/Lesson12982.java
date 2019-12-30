package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12982
import java.util.Arrays;
public class Lesson12982 {

    //최대한 많은 부서를 지원해 주어야 한다
    //문제를 잘못 이해함, budget이 0이 될 필요가없다
    public static void main(String[] args) {
       int answer = 0;
       int budget = 9;
       int [] d = {1,3,2,5,4};
       Arrays.sort(d);

       for(int i=0; i<d.length; i++){
           if(budget == 0 || budget<d[i]){
               break;
           }
           budget-=d[i];
           answer++;
       }
        System.out.println(answer);

    }
}
