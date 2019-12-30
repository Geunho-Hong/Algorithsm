package Baekjoon;
import java.util.*;
import java.io.*;

public class Baek1260 {

    static int graph[][];
    static boolean visited[];
    static int V,E,num;

    //dfs는 재귀로 구현, 먼저 방문  , stack 활용
    //bfs는 링크드 큐로 구현, 먼저 큐에 넣고 그 이후에 방문


    public static void dfs(int i){
        visited[i]=true;
        System.out.print(i+" ");

        for(int j=1; j<=V; j++){
            if(graph[i][j]==1 && visited[j]==false){
                dfs(j);
            }

        }


    }

    public static void bfs(int i){
        Queue <Integer> q=new LinkedList<Integer>();

        q.offer(i);
        visited[i]=true;

        while(!q.isEmpty()){
            int tmp=q.poll();
            System.out.print(tmp+" ");

            for(int j=1;j<=V;j++){
                if(graph[tmp][j] == 1 && visited[j]==false){
                    q.offer(j);
                    visited[j]=true;
                }
            }
        }

    }

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String [] str=br.readLine().split(" ");

        V=Integer.parseInt(str[0]);
        E=Integer.parseInt(str[1]);
        num=Integer.parseInt(str[2]);

        graph=new int[V+1][V+1];
        visited=new boolean[V+1];


        while(E-- !=0){
            String []str2=br.readLine().split(" ");
            int x=Integer.parseInt(str2[0]);
            int y=Integer.parseInt(str2[1]);

            graph[x][y]=graph[y][x]=1;

        }

        dfs(num);

        for(int i=1;i<=V;i++){
            visited[i]=false;
        }
        System.out.println();

        bfs(num);

    }
}
