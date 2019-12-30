package CodeUp;

import java.io.*;
import java.util.StringTokenizer;

public class Code1095 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int arr[]=new int[num+1];

        for(int i=1;i<=num;i++){
            int n=Integer.parseInt(st.nextToken());
            arr[i]=n;
        }
        int min=arr[1];
        for(int j=1;j<=num;j++){
            if(min>arr[j]){
                min=arr[j];
            }
        }
        System.out.println(min);

    }
}
