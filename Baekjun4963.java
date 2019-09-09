package BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//DFS의 파고든 개수를 구하는지,
//아니면 해당 배열 내에서 DFS의 개수를 구하는지 파악하자.

public class Baekjun4963 {

    static int map[][];
    static boolean visit[][];
    static int dx[] = {0,0,1,-1,1,1,-1,-1};
    static int dy[] = {1,-1,0,0,1,-1,1,-1};
    static int cnt,num1,num2;

    public static void dfs(int x,int y){
        visit[x][y] = true;

        for(int i=0; i<8; i++){
            int nX = x + dx[i];
            int nY = y + dy[i];

            if(nX>=0 && nX<num2 && nY>=0 && nY<num1){
                if(map[nX][nY] == 1 && visit[nX][nY] == false){
                    dfs(nX,nY);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            cnt = 0;
           String str[] = br.readLine().split(" ");
           num1 = Integer.parseInt(str[0]);
           num2 = Integer.parseInt(str[1]);
           if(num1 == 0 && num2 == 0){
                break;
           }

           map = new int[num2][num1];
           visit = new boolean[num2][num1];

           for(int i=0; i<num2; i++){
               String arr[] = br.readLine().split(" ");
               for(int j=0; j<arr.length; j++){
                   map[i][j] = Integer.parseInt(arr[j]);
               }
           }

           for(int i=0; i<num2; i++){
               for(int j=0; j<num1; j++){
                   if(map[i][j] == 1 && visit[i][j] == false) {
                       dfs(i,j);
                       cnt++;
                   }
               }
           }
           System.out.println(cnt);

        }
    }
}
