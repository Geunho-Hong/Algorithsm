package SamsungSW;
import java.io.*;

public class B_2468 {
    static int map[][];
    static boolean visit[][];
    static int n;
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};

    public static void dfs(int x,int y,int h){
        visit[x][y] = true;
        for(int i=0; i<4; i++){
            int nX = x + dx[i];
            int nY = y + dy[i];

            if(nX>=0 && nY>=0 && nX<n && nY<n){
                if(map[nX][nY]>h && visit[nX][nY]==false){
                    dfs(nX,nY,h);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        int max = 0;
        int min = 0;

        for(int i=0; i<n; i++){
            String str[] = br.readLine().split(" ");
            for(int j=0; j<str.length; j++){
                map[i][j] = Integer.parseInt(str[j]);
                if(max<map[i][j]){
                    max = map[i][j]; // 최댓값을 구한다
                }
                else if(min>map[i][j]){
                    min = map[i][j];
                }
            }
        }

        int maxValue = 0;
        for(int c=min; c<=max; c++){
            visit = new boolean[n][n];
            int cnt = 0;

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(map[i][j]>c && visit[i][j] == false ){
                        cnt++;
                        dfs(i,j,c);
                    }
                }
            }
            if(maxValue<cnt){
                maxValue = cnt;
            }
        }
        System.out.println(maxValue);


    }
}
