package BFSDFS;
import java.io.*;

public class Baekjun10451 {

    static int c,N,cnt;
    static int[] arr;
    static int[][] graph;
    static boolean visit[];

    public static void dfs(int i){
        visit[i] = true;
        for(int j=1; j<=N; j++){
            if(graph[i][j] == 1 && visit[j] == false){
                dfs(j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        c = Integer.parseInt(br.readLine());

        while(c-- !=0){
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            graph = new int[N+1][N+1];
            visit = new boolean[N+1];

            String str[] = br.readLine().split(" ");

            for(int i=0; i<arr.length; i++){
                arr[i] = Integer.parseInt(str[i]);
            }

            for(int i=1; i<=N; i++){
                int num = arr[i-1];
                graph[i][num] = 1;
            }

            for(int i=1;i<=N; i++){
                if(visit[i] == false){
                    dfs(i);
                    cnt++;
                }
            } // graph는 전체 map으로 배열을 돌리는 것이 아니라 이렇게 계산한다.

            System.out.println(cnt);
            cnt = 0;
        }
    }
}
