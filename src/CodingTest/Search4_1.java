package CodingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Search4_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sc.nextLine();
        String command = sc.nextLine();
        String str[] = command.split(" ");

        Map<String,Integer> map = new HashMap<>();
        map.put("x",1);
        map.put("y",1);

        for(int i=0; i<str.length; i++){

            String s = str[i];

            if(s.equals("R") && map.get("x") <= N){
                map.put("x",map.get("x")+1);
            }else if(s.equals("U") && map.get("y") > 1){
                map.put("y",map.get("y")-1);
            }else if(s.equals("D") && map.get("y") <= N){
                map.put("y",map.get("y")+1);
            }else if(s.equals("L") && map.get("x") > 1){
                map.put("x",map.get("x")-1);
            }
        }

        System.out.println("Result is : " + map.get("y")  + "," + map.get("x"));

    }
}
