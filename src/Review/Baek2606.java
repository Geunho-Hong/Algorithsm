import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2606 {

    static boolean visit[]; // 방문
    static int graph[][]; // 2차원 배열
    static int V,E,cnt;

    public static void dfs(int i){
        visit[i] = true;
        System.out.print(i + " ");

        //연결되어 있지만 방문하지 않으면
        for(int j=1; j<=V; j++){
            if(graph[i][j] == 1 && visit[j] == false){
                dfs(j);
                cnt++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());

        for(int i=1; i<=E; i++){
            String str[] = br.readLine().split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            graph[num1][num2] = graph[num2][num1] = 1;
        }
        dfs(1);
        System.out.println(cnt);
    }
}
