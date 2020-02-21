package Review;

import java.util.LinkedList;
import java.util.Queue;

class Truck{
    int weight;
    int move;

    public Truck(int weight){
        this.weight = weight;
        this.move = 1;
    }
    public void moving(){
        move++;
    }
}

public class Lesson42583 {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int answer = 0;
        int [] truck_weight = {7,4,5,6};
        int curWeight = 0; // 현재 다리의 무게

        Queue<Integer> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();

        for(int t: truck_weight){
            waitQ.add(t);
        }

        while(!waitQ.isEmpty() || !moveQ.isEmpty()){
            answer++;
            // 1. 움직이는 트럭이 비어있을 경우
            if(moveQ.isEmpty()){
                int tweight = waitQ.poll();
                curWeight+=tweight;
                Truck t = new Truck(tweight);
                moveQ.add(t);
                continue;
            }
            // 2. 트럭 이동
            for(Truck t : moveQ){
                t.moving();
            }
            // 3. 도착한 트럭 꺼내기
            if(moveQ.peek().move>bridge_length){
                curWeight -= moveQ.peek().weight;
                moveQ.poll();
            }
            // 4. 다리의 무게가 감당 가능하면 추가적으로 트럭 넣어주기
            if(!waitQ.isEmpty() && curWeight+waitQ.peek() <= weight){
                int tweight = waitQ.poll();
                curWeight+=tweight;
                Truck t = new Truck(tweight);
                moveQ.add(t);
            }
        }
        System.out.println(answer);

    }
}
