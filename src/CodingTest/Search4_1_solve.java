package CodingTest;

import java.util.Scanner;

public class Search4_1_solve {
    public static void main(String[] args) {

        // 맵을 탐색할때는 dx, dy를 통해 탐색하자
        // 다음 좌표는 nX, nY 를 통해 가져오자
        // if-else로 분기 처리하는 것이 아닌 배열을 통해 처리하면 굿굿

        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String str = sc.nextLine();
        String [] command = str.split(" ");


        int dx[] = {0,0,-1,1};
        int dy[] = {-1,1,0,0};
        int x = 1;
        int y = 1;

        String [] map = {"L","R","U","D"};

        for(int i=0; i < command.length; i++){
            String s = command[i];
            int nX = 0;
            int nY = 0;
            for(int j = 0; j < map.length; j++){
                // if-else로 분기처리 하지않고 이런식으로 구현 가능하다
                if(s.equals(map[j])){
                    nX = x + dx[j];
                    nY = y + dy[j];
                }
            }
            // 공간을 벗어나는 경우 무시
            if (nX < 1 || nY < 1 || nX > N || nY > N) continue;

            // 이동 수행
            x = nX;
            y = nY;

        }
        System.out.println(x + " " + y);

    }
}
