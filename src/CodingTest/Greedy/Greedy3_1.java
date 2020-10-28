package CodingTest.Greedy;

public class Greedy3_1 {
    public static void main(String[] args) {
        // 거스름돈 문제
        int [] coinArr = {500,100,50,10};
        int cnt = 0;
        int price = 1260;

        for(int i=0; i< coinArr.length; i++){
            int coin = coinArr[i];
            cnt += price/coin;
            price %= coin;
        }
        System.out.println("최적 Coin 개수 : " + cnt);

    }
}
