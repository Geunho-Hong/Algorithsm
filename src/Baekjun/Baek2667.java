package BFSDFS;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//https://ballpython.tistory.com/7
//https://www.acmicpc.net/problem/2667


public class Baek2667 {

    static int [][] map;
    static boolean [][] visit;
    static int count, N;
    // 0,1 0,-1 1,0 -1,0
    static int [] dx = {0,0,1,-1};
    static int [] dy = {1,-1,0,0};

    public static int dfs(int x,int y){
        visit[x][y] = true;

        for(int i=0; i<4; i++){
            int nX = x + dx[i];
            int nY = y + dy[i];
            if(nX>=0 && nY>=0 && nX<N && nY<N){
                if(visit[nX][nY] == false && map[nX][nY]==1){
                    dfs(nX,nY);
                    visit[nX][nY] = true;
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList a1 = new ArrayList();

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];

        for(int i=0; i<N; i++){
            String arr[] = br.readLine().split("");
            for(int j=0; j<arr.length; j++){
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1 && visit[i][j] == false ){
                    count = 1;
                    dfs(i,j);
                    a1.add(count);
                }
            }
        }

        Collections.sort(a1);
        System.out.println(a1.size());
        for(int i=0; i<a1.size(); i++){
            System.out.println(a1.get(i));
        }
    }
}
