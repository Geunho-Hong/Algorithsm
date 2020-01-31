package Level2;
//https://programmers.co.kr/learn/courses/30/lessons/49993
// String객체의 indexOf를 활용해서 구현하는것이 보다 유용하다!
// 3중 for문을 지양하고 indexOf를 통해서 쓰자
// "hELLO World".indexOf("World") -> 6

public class Lesson49993 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF","AECB","BDA"};
        int answer =0;
        for(int i=0; i<skill_trees.length; i++){
            int index = 0; // skill 에 접근하기 위한 index
            boolean check = true;
            String str[] = skill_trees[i].split("");

            for(int j=0; j<str.length; j++){
                if(index == skill.indexOf(str[j])){
                    index++;
                }else if(index < skill.indexOf(str[j])){
                    check = false;
                    break;
                }
            }
            if(check){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
