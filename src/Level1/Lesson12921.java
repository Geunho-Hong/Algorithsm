package Level1;

public class Lesson12921 {

    public static void main(String[] args) {
        int answer = 0;
        int n = 10;
        int cnt = 0;
        // i가 의미하는 것은 n
        //시간초과 나는 코드
         /*for(int j=2; j<=n; j++){
            cnt = 0;
            for(int i=1; i<=j; i++){
                if(j%i==0){
                    cnt++;
                }
            }
            if(cnt == 2){
                answer ++;
            }
        }
        System.out.println(answer);*/
         //에라토스테네스의 체 이용

        int[] number = new int [n+1];

        //2부터 n까지의 수를 배열에 넣는다
        for(int i=2; i<=n; i++){
                number[i] = i;
        }

        // 2부터 시작해서 그의 배수들을 0으로 만든다
        // 0이면 넘어가고, 아니면 그의 배수들을 다시 0으로 만든다
        for(int i=2; i<=n; i++) {
            if(number[i] == 0 ) continue;
            for(int j=2*i; j<=n; j+=i){
                number[j] = 0;
            }
        }

        // 배열에서 0이 아닌 것들의 개수를 세준다
        for(int i=0; i<number.length; i++){
            if(number[i] !=0){
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
