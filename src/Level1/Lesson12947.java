package Level1;
//https://programmers.co.kr/learn/courses/30/lessons/12947

public class Lesson12947 {
    public static void main(String[] args) {
        boolean answer = true;
        int num = 11;
        int x = num;
        int sum =0;
        while(num>0){
            sum += num%10;
            num/=10;
        }
        System.out.println(x%sum);

        if(x%sum == 0){
            System.out.println("하샤드 수 입니다");
        }else{
            System.out.println("하샤드 수가 아닙니다");
        }
    }
}
