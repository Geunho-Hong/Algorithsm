package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greedy3_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] command = br.readLine().split(" ");

        int N = Integer.parseInt(command[0]);
        int M = Integer.parseInt(command[1]);

        int[][] map = new int[N][M];
        int [] answer = new int[N];

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            int [] tempArr = new int[str.length];
            for(int j=0; j< str.length; j++){
                map[i][j] = Integer.parseInt(str[j]);
                tempArr[j] = map[i][j];
            }
            Arrays.sort(tempArr);
            answer[i] = tempArr[0];
        }

        for(int num : answer){
            System.out.print(num + " ");
        }

        System.out.println("Answer is " + answer[N-1]);
    }
}
