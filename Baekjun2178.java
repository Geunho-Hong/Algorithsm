package BFSDFS;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

/* BFS 는 Queue로 구현한다. 최단 경로로 접근한다.
 인접한 정점을 방문한다, 먼저 넣고 방문한다
 넣고 꺼내고, 조건을 만족하면 다시 넣어준다! */

public class Baekjun2178 {

    static int [][] map;
    static boolean [][] visit;
    static int N,M;
    static int [] dx = {0,0,1,-1};  //상 하 좌 우로 이동하는 x
    static int [] dy = {1,-1,0,0};  //상 하 좌 우로 이동하는 y


    public static void BFS(int x, int y){
        Queue<Dot> q = new LinkedList<>();
        q.offer(new Dot(x,y));

        while(!q.isEmpty()){
            Dot dot = q.poll();
            for(int i=0; i<4; i++){
                int nX = dot.x + dx[i]; //미로의 상하좌우로 움직임
                int nY = dot.y + dy[i];

                if(nX>=0 && nY>=0 && nX<N &&nY<M && map[nX][nY] == 1 && visit[nX][nY] == false){
                    q.offer(new Dot(nX,nY)); //다음 노드의 좌표를 넣기
                    visit[nX][nY] = true;
                    map[nX][nY] = map[dot.x][dot.y] + 1 ; //다음 노드 좌표  +1;
                }
            }
        }

    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command [] = br.readLine().split(" ");
        N = Integer.parseInt(command[0]);
        M = Integer.parseInt(command[1]);

        map = new int[N][M];
        visit = new boolean[N][M];

        for(int i=0; i<N; i++){
            String str[] = br.readLine().split("");
            for(int j=0; j<str.length; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }  //map 안에 수를 넣어준다.
        }

        BFS(0,0);
        visit[0][0] = true;
        System.out.println(map[N-1][M-1]);
    }

    static class Dot{
        int x;
        int y;
        Dot(int x,int y){
            this.x = x;
            this.y = y;
        }
    }
}
