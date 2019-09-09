package BFSDFS;

//ArrayList 의 Collection.sort !!

import java.io.*;

public class Baekjun2606 {
    static int [][] graph;
    static int nV,nE,num;
    static boolean [] visit;
    static int count = 0;

    public static void dfs(int num){
        visit[num] = true;

        for(int i=1; i<=nV; i++){
            if(graph[num][i] == 1 && visit[i] == false){
                count++;
                dfs(i);
            }
        }
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        nV = Integer.parseInt(br.readLine());
        nE = Integer.parseInt(br.readLine());

        graph = new int[nV+1][nV+1];
        visit = new boolean[nV+1];

        while(nE-- !=0){
            String str[] = br.readLine().split(" ");
            int t1 = Integer.parseInt(str[0]);
            int t2 = Integer.parseInt(str[1]);

            graph[t1][t2] = graph[t2][t1] = 1;

        }

        dfs(1);
        System.out.println(count);
    }
}
