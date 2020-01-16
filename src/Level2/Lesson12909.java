package Level2;
//https://programmers.co.kr/learn/courses/30/lessons/12909


public class Lesson12909 {

    public static void main(String[] args) {
        String s = ")()(";
        int cnt = 0;
        boolean answer = true;

        // '(' 로 시작하는 char일 경우 cnt값 ++;
        // ')' 가 처음 시작이 아닐경우 cnt값 --;
        // ')'로 시작할경우 answer -> false;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                cnt ++;
            }else if(s.charAt(i) == ')'){
                if(cnt<=0){
                    break;
                    //return answer;
                }else{
                    cnt--;
                }
            }
        }

        if(cnt ==0){
            answer = true;
        }else{
            answer = false;
        }


        System.out.println(answer);

    }
}
