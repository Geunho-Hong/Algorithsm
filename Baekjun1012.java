package BFSDFS;
import java.io.*;

public class Baekjun1012 {

    static int N,M,K; //N은 가로, M은 세로, k는 배추 심어진 위치 개수
    static int[][] map;
    static boolean[][] visit;
    //0,1 0,-1 1,0 -1,0
    static int [] dx = {0,0,1,-1};
    static int [] dy = {1,-1,0,0};

    //0은 배추가 심어지지 않은땅, 1 은 배추가 심어진땅

    public static void dfs(int x,int y){
        visit[x][y] = true;

        for(int i=0; i<4; i++){
            int nX = x + dx[i];
            int nY = y + dy[i];
            if(nX>=0 && nY>=0 && nX<N && nY<M) {
                if(visit[nX][nY] == false && map[nX][nY] == 1){
                    dfs(nX,nY);
                }
            }
        }
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        while(c-- !=0){
            String command[] = br.readLine().split(" ");
            int count = 0;
            N = Integer.parseInt(command[0]);
            M = Integer.parseInt(command[1]);
            K = Integer.parseInt(command[2]);

            map = new int[N][M];
            visit = new boolean[N][M];


            for(int j=0; j<K; j++){
                String str[] = br.readLine().split(" ");
                int t1 = Integer.parseInt(str[0]);
                int t2 = Integer.parseInt(str[1]);
                map[t1][t2] = 1;
            }

            for(int i=0; i<N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 1 && visit[i][j] == false) {
                        dfs(i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }


    }
}
