package BasicAlgo;
import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

//HashSet 데이터를 중복 저장할 수 없고 순서를 보장하지 않는다.

public class Baek2776 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        int test=Integer.parseInt(br.readLine());

        for(int i=1;i<=test;i++){
            Set<Integer> set=new HashSet<Integer>();

            int num=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            for(int j = 0; j < num; j++){
                set.add(Integer.parseInt(st.nextToken()));
            }

            int num2=Integer.parseInt(br.readLine());
            st=new StringTokenizer(br.readLine());
            for(int k = 0; k < num2; k++){

                if(set.contains(Integer.parseInt(st.nextToken()))){ sb.append("1\n"); }
                else sb.append("0\n");

            }


        }
        System.out.println(sb.toString());


    }

}
