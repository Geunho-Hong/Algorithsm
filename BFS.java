package BasicAlgo;

import java.util.*;

//Queue  poll은 값을 반환 , offer은 값을 입력


public class BFS {

    static int[][] graph;
    static boolean[] visited;
    static int V,E;

    public static void bfs(int i){
       Queue<Integer> q=new LinkedList<Integer>();

       q.offer(i);
       visited[i]=true;

       while(!q.isEmpty()){
           int tmp=q.poll();
           System.out.print(tmp+" ");

           for(int j = 1;j <= V; j++){
               if(graph[tmp][j] == 1&& visited[j] == false){
                   q.offer(j);
                   visited[j]=true;
               }
           }
       }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        V=sc.nextInt();
        E=sc.nextInt();
        graph=new int[V+1][V+1]; //변수 초기화
        visited=new boolean[V+1];

        while(E-- !=0){
            int t1=sc.nextInt();
            int t2=sc.nextInt();

            graph[t1][t2]=graph[t2][t1]=1;

        }
        bfs(3);


    }



}
