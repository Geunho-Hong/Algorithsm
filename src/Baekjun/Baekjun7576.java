package BFSDFS;

import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class Baekjun7576 {

    static int N,M;
    static int map[][];
    //0,1 0,-1 1,0 -1,0
    static int dx [] = {0,0,1,-1};
    static int dy [] = {1,-1,0,0};

    static class Tomato{
        int x;
        int y;
        int day;

        public Tomato(int x,int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static void bfs(){
        Queue<Tomato> q = new LinkedList<>();
        int day = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 1){
                    q.offer(new Tomato(i,j,0));
                }
                //익은 토마토를 정점에 넣어준다!
                //정점에 넣은다음 꺼내서 비교하는게 bfs
            }
        }

        while(!q.isEmpty()){
            Tomato mato = q.poll();
            day = mato.day;

            for(int i=0; i<4; i++){
                int nX = mato.x + dx[i];
                int nY = mato.y + dy[i];

                if(nX>=0 && nY>=0 &&nX<N &&nY<M){
                    if(map[nX][nY] == 0 ){
                        map[nX][nY] = 1;
                        q.offer(new Tomato(nX,nY,day+1));
                    }
                }
            }
        }

        if(MatoCheck()){
            System.out.println(day);
        }
        else{
            System.out.println("-1");
        }
    }



    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command[] = br.readLine().split(" ");

        M = Integer.parseInt(command[0]);
        N = Integer.parseInt(command[1]);

        map = new int[N][M];

        for(int i=0; i<N; i++){
            String arr[] = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        bfs();

    }

    static boolean MatoCheck(){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
