/* BFS로 푸는 문제 , 한점에서만 탐색이 일어나는 것이 아니라
동시에 여러곳에서 BFS가 일어난다. 상자안에 토마토가 여러개
있을수 있다, 각 지점부터 BFS를 진행
 배열을 탐색하면서 토마토가 들어있으면 큐에 넣기 */

/* 정수 1은 익은토마토 , 정수 0은 익지 않은 토마토, -1은 토마토가
들어 있지 않는 칸을 의미한다. */

/*일반적으로 BFS 문제에서는 visited 2차원 배열을 사용하여
중복 방문을 방지하지만 이 문제에서는 1 이 그 역할을 하고 있습니다*/

//https://www.acmicpc.net/problem/7576

package BFSDFS;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;


public class Baek7576 {

    static int N,M;
    static int map[][];
    static int [] dx = {0,0,1,-1};
    static int [] dy = {1,-1,0,0};
    static int max;


    public static void bfs(){
        Queue <Integer> qx = new LinkedList<>();
        Queue <Integer> qy = new LinkedList<>();

        for(int i=0;i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 1){
                    qx.offer(i);
                    qy.offer(j);
                }
            }
        }   //익은 토마토가 있는 모든 위치를 큐에 담는다

        while(!qx.isEmpty() && !qy.isEmpty()){
            //익은 토마토의 상하좌우는 다음에 익기에 큐에 담는다
            int cX = qx.poll();
            int cY = qy.poll();

            for(int i=0; i<4; i++){
                int nX = cX + dx[i];
                int nY = cY + dy[i];

                if(nX>=0 && nY>=0 && nX<N && nY<M){
                    if(map[nX][nY] == 0 ){
                        map[nX][nY] = 1; //방문을 의미한다.
                        map[nX][nY] = map[cX][cY] + 1;
                        max = Math.max(max,map[cX][cY]);
                        //왜 max?로 ? 좌표가 어딘지 모르니까 최댓값으로 출력해줘야한다!
                        qx.offer(nX);
                        qy.offer(nY);

                    }
                }
            }
        }
        if(checkTomato()){
            System.out.println(max);
        }
        else{
            System.out.println("-1");
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command[] = br.readLine().split(" ");

        M = Integer.parseInt(command[0]);
        N = Integer.parseInt(command[1]);

        map = new int[N][M];

        for(int i=0; i<N; i++){
            String arr[] = br.readLine().split(" ");
            for(int j=0; j<arr.length; j++){
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }
        bfs();
    }


    static boolean checkTomato(){
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 0 )
                    return false; //0이 남아있다면, 익지 않은 토마토
            }
        }
        return true;
    }


}
