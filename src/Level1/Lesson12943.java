package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12943

public class Lesson12943 {
    public static void main(String[] args) {
        int answer = 0;
        long n = 626331;
        while(n>0){
            if(n == 1 ){
                break;
            }
            if(n%2 == 0){
                n/=2;
                answer++;
            }
            else if(n%2 == 1){
                n = n*3 +1;
                answer++;
            }
        }
        if(answer>=500){
            System.out.println("-1");
        }else{
            System.out.println(answer);
        }

    }
}
