package BFSDFS;
// https://www.acmicpc.net/problem/9466
// 어려워서 풀지못했다 나중에 한번 풀어보자

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun9466 {

    static int C,N;
    static int graph[][];
    static boolean visit[];

    public static void dfs(int i){
        visit[i] = true;

        for(int j=1; j<=N; j++){
            if(graph[i][j]==1 && visit[j]== false){
                if(graph[i][j] == graph[j][i]){
                    dfs(j);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        C = Integer.parseInt(br.readLine());

        while(C-- !=0) {
            N = Integer.parseInt(br.readLine());

            graph = new int[N + 1][N + 1];
            String str[] = br.readLine().split(" ");

            for (int i = 1; i <= N; i++) {
                int num = Integer.parseInt(str[i - 1]);
                graph[i][num] = 1;
            }


        }

    }
}
