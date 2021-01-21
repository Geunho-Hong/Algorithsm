package CodingTest.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameDevelopTest {

    private static int[][] map;
    private static boolean[][] visited;

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};

    static int cnt = 0;
    static int direction = 0;

    public static void turnLeft(){
        direction += 1;
        if(direction == 4){
            direction = 0;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] command1 = br.readLine().split(" ");
        String[] command2 = br.readLine().split(" ");

        int N = Integer.parseInt(command1[0]);
        int M = Integer.parseInt(command1[1]);

        int x = Integer.parseInt(command2[0]);
        int y = Integer.parseInt(command2[1]);
        direction = Integer.parseInt(command2[2]);

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String [] str = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        int turnCnt = 0;

        while(true){

            turnLeft();  // 왼쪽 방향으로 회전후 한 칸 전진
            int nX = x + dx[direction];  // 다음 x 좌표
            int nY = y + dy[direction]; // 다음 y 좌표

            System.out.println("nX = " + nX);
            System.out.println("nY = " + nY);

            if(!visited[nX][nY] && map[nX][nY] == 0){
                cnt ++;
                x = nX;
                y = nY;
                visited[nX][nY] = true;
                turnCnt = 0;    // 회전 수 초기화
                continue;
            }
            else turnCnt++; // 회전 수 증가

            if(turnCnt == 4 ){
                // 모두 이미 가본 칸이거나 바다로 되어 있는 경우라면,
                nX = x - dx[direction];
                nY = y - dy[direction];
                if(map[nX][nY] == 0){
                    x = nX;
                    y = nY;
                }else{
                    break;
                }
                turnCnt = 0;
            }
        }

        System.out.println("Result is : " + cnt);
    }

}
