package Level2;
// https://programmers.co.kr/learn/courses/30/lessons/12981
import java.util.LinkedList;
import java.util.Queue;
// HashSet은 중복된 값이 들어갈수 없다
// 초기화 하지않으면 0,0은 자동으로 들어가다
// 분리하기 어려우면 종료조건을 꼭 한 if문에 넣을 필요는 없고, 분리해서 넣고 리팩토링

//

public class Lesson12981 {
    public static void main(String[] args) {
        int[] answer = {0, 0};
        int personNum = 0;
        int n = 3;
        int turn = 1;
        String words[] = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < words.length; i++) {
            personNum++;

            // 첫번째는 비교값이 없으니까 하지 않음
            // 단어의 마지막 값과, 첫번째 값 여부 확인
            if (i > 0) {
                if (list.get(i - 1).charAt(list.get(i - 1).length() - 1) != words[i].charAt(0)) {
                    answer[0] = personNum;
                    answer[1] = turn;
                    break;
                }
            }
            if (list.contains(words[i])) {
                answer[0] = personNum;
                answer[1] = turn;
                break;
            }
            list.add(words[i]);

            if (personNum == n) {
                turn++;
                personNum = 0;
            }
            // 초기화 하지않으면 자동으로 0,0
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}

      /*  int n = 3;
        int answer[] = new int[2];
        int personNum = 1;
        int turn = 1;

        String words[] = {"tank","kick","know","wheel"
        ,"land","dream","mother","robot","tank"};
        Queue<String> q = new LinkedList<>();
        q.add(words[0]);
        Queue<String> wordq = new LinkedList<>();

        for(int i=1; i<words.length; i++){
            String currentWord = q.poll(); // tank
            System.out.println(currentWord);
            String lastWord = currentWord.substring(currentWord.length()-1,currentWord.length()); //k
            System.out.println(lastWord);
            String nextWord = words[i];
            String firstWord = nextWord.substring(0,1);
            System.out.println(firstWord);
            q.add(words[i]);
            wordq.add(words[i]);

            if(!lastWord.equals(firstWord) || wordq.contains(currentWord)){
                answer[0] = personNum;
                answer[1] = turn;
                break;
            }
            if(personNum == n){
                turn ++;
                personNum = 1;
            }
            personNum++;
        }
        System.out.println(answer[0]);
        System.out.println(answer[1]);*/

