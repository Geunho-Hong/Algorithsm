package BFSDFS;
import java.io.*;

//해당 dfs 요소의 개수인지, dfs 개수인지 파악하자.

public class Baekjun11724 {

    static int V,E,cnt;
    static int graph[][];
    static boolean visit[];

    public static void dfs(int i){
        visit[i] = true;

        for(int j=1; j<=V; j++){
            if(graph[i][j] == 1 && visit[j] == false){
                dfs(j);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command[] = br.readLine().split(" ");
        V = Integer.parseInt(command[0]);
        E = Integer.parseInt(command[1]);

        graph = new int[V+1][V+1];
        visit = new boolean[V+1];

        for(int i=0; i<E; i++){
            String command2[] = br.readLine().split(" ");
            int t1 = Integer.parseInt(command2[0]);
            int t2 = Integer.parseInt(command2[1]);
            graph[t1][t2] = graph[t2][t1] = 1;
        }
        // map과 graph는 엄연히 다르기 떄문에 전체 for문 비교로 하면 안된다

        /** graph[t1][t2] = graph[t2][t1] = 1 이것은 같지만
            map[t1][t2] = map[t2][t1] = 1 은 엄연히다르다**/

        for(int i=1; i<=V; i++){
            if(visit[i] == false){
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
