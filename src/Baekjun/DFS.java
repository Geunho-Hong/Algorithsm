package BasicAlgo;
import java.util.*;
//DFS는 Stack으로 구현한다
//Stack은 LIFO구조 //Last in first Out//
//DFS 인접행렬로 구현//

public class DFS {

    static int nE;
    static int nV;
    static int[][] graph;
    static boolean[] visited;

    public static void dfs(int i){
        visited[i]=true;
        System.out.print(i+" ");


        for(int j = 1;j <= nV; j++){
            if(graph[i][j]==1 && visited[j]==false){
                //연결은 되었는데 j를 방문하지 않았으면 j를 방문한다
                dfs(j);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        nV=sc.nextInt();
        nE=sc.nextInt();
        graph=new int[nV+1][nV+1]; //변수 초기화
        visited=new boolean[nV+1];

        for(int i = 0;i < nE; i++){
            int t1=sc.nextInt();
            int t2=sc.nextInt();

            graph[t1][t2]=graph[t2][t1]=1;

        }
        dfs(1);


    }

}
