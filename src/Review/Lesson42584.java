package Review;
//https://programmers.co.kr/learn/courses/30/lessons/42584
public class Lesson42584 {

    public static void main(String[] args) {
        int [] prices = {1,2,3,2,3}; // prices arr
        int [] answer = new int[prices.length];
        //하나하나의 값을 추출해서 전체 배열과 비교를 한다?

        for(int i=0; i<prices.length; i++){
            int cnt = 0;
            int tmp = prices[i]; // i = 0 , value = 1

            for(int j=i+1; j<prices.length; j++){
                cnt++;
                if(tmp> prices[j]){
                    break;
                }
                // j 는 i보다 하나 큰값.
                /*if(tmp<= prices[j]) {
                    cnt++; 이러면 배열의 모든걸 검색해야되기때문에 시간 초과가 발생한다
                }*/
            }
            answer[i] = cnt;
        }

        for(int num : answer){
            System.out.print(num + " ");
        }
    }
}
