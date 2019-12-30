package BFSDFS;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;


public class GGBaekjun2178 {

    static int map[][];
    static boolean visit[][];
    static int [] dx = {0,0,1,-1};
    static int [] dy = {1,-1,0,0};
    static int N,M;

    public static void BFS(int x,int y){
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();

        qx.offer(x);
        qy.offer(y);
        visit[x][y] = true;

        while(!qx.isEmpty() && !qy.isEmpty()){
            int num1 = qx.poll();
            int num2 = qy.poll();

            for(int i=0; i<4; i++){
                int nX = num1+dx[i];
                int nY = num2+dy[i]; //왜 4번? 상하좌우로 돌린다

                if(nX>=0 && nY>=0 && nX<N && nY<M && visit[nX][nY] == false && map[nX][nY] ==1){
                    qx.offer(nX);
                    qy.offer(nY);
                    visit[nX][nY] = true;
                    map[nX][nY] =  map[num1][num2] + 1;
                }
            }
        }


    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command[] = br.readLine().split(" ");

        N = Integer.parseInt(command[0]);
        M = Integer.parseInt(command[1]);

        map = new int[N][M];
        visit = new boolean[N][M];

        for(int i=0; i<N; i++){
            String arr[] = br.readLine().split("");
            for(int j=0; j<arr.length; j++){
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        BFS(0,0);
        System.out.println(map[N-1][M-1]);


    }
}
