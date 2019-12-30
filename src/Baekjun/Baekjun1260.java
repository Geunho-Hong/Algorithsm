package BFSDFS;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Baekjun1260 {

    static int nV,nE,num;
    static int graph[][];
    static boolean visit[];

    public static void dfs(int i){
        visit[i] = true;
        System.out.print(i+" ");

        for(int j=1; j<=nV; j++){
            if(graph[i][j]==1 && visit[j]==false){
                dfs(j); /* 내가 찾은 경로가 다른 경로가 있으면
                다음 곳으로 이동, 없으면 다시 리커 */
            }
        }
    }

    public static void bfs(int i){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visit[i] = true;
        // 방문한 위치르 알아야 하니까, 체크하기 위해 visit

        while(!q.isEmpty()){
            int tmp = q.poll();
            //처음으로 방문한 위치는 뺴준다
            System.out.print(tmp+" ");
            for(int j=1; j<=nV; j++){
                if(graph[tmp][j]==1 && visit[j] ==false){
                    q.offer(j);
                    visit[j] = true; //true라면 방문을 한것!
                }
            }
        }
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command[] = br.readLine().split(" ");
        nV = Integer.parseInt(command[0]);
        nE = Integer.parseInt(command[1]);
        num = Integer.parseInt(command[2]);

        graph = new int[nV+1][nV+1];
        visit = new boolean[nV+1];

        for(int i=0; i<nE; i++){
            String command2[] = br.readLine().split(" ");
            int t1 = Integer.parseInt(command2[0]);
            int t2 = Integer.parseInt(command2[1]);

            graph[t1][t2] = graph[t2][t1] = 1;
        }

        dfs(num);
        System.out.println();

        for(int i=1;i<=nV;i++){
            visit[i] = false;
        }
        bfs(num);
    }
}
