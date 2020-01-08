//https://programmers.co.kr/learn/courses/30/lessons/42889
//https://iamheesoo.github.io/blog/algo-prog42889
package Level2;

import java.util.Arrays;
import java.util.Comparator;

class Stage{
    int stage;
    double loseRatio;

    public Stage(int stage, double loseRatio){
        this.stage = stage;
        this.loseRatio = loseRatio;
    }
}

public class Lesson42889 {

    public static void main(String[] args) {

        int N = 5; //스테이지의 수
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] answer = new int[5];
        int player = stages.length;

        int[] nonStage = new int[N+2]; //1번 인덱스 부터 사용, 마지막 스테이지 까지 클리어시 N+1 리턴

        for(int i=0; i<stages.length; i++){
            nonStage[stages[i]]++; //stages[i]의 값은 0이 존재하지않음
            //따라서 for 0번부터 시작해도 괜찮음

        } // 스테이지의 번호를 인덱스로 저장

        //실패율을 저장하는 배열
        double loseRatio[] = new double[N+2];

        for(int i=1; i<nonStage.length; i++){
            if(player == 0){
                loseRatio[i] = 0;
            }else{
                loseRatio[i] = (double)nonStage[i]/player;
            }
            player -= nonStage[i];
        }

        Stage stage[] = new Stage[N];
        for(int i=0; i<stage.length; i++){
            stage[i] = new Stage(i+1,loseRatio[i+1]);
        } // Stage 배열안에 stage와 loseRatio를 넣는다

        Arrays.sort(stage, new Comparator<Stage>() {
            @Override
            public int compare(Stage s1, Stage s2) {
                if (s1.loseRatio == s2.loseRatio) {
                    return 0;
                } else if (s1.loseRatio > s2.loseRatio) {
                    return -1;
                    //s1의 loseRatio가 더 크면 앞으로 이동한다
                } else {
                    return 1;
                }
            }
        });

        for(int i=0; i<stage.length; i++){
            System.out.print(stage[i].stage);
            System.out.println(2);
        }

        for(int i=0; i<answer.length; i++){
            answer[i] = stage[i].stage;
        }


    }
}