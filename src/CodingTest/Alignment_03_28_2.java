package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Alignment_03_28_2 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command[] = br.readLine().split(" ");

        int N = Integer.parseInt(command[0]);
        int K = Integer.parseInt(command[1]);

        Integer arr1[] = new Integer[N];
        Integer arr2[] = new Integer[N];

        String[] arr1Val = br.readLine().split(" ");
        for (int i = 0; i < arr1Val.length; i++) {
            arr1[i] = Integer.parseInt(arr1Val[i]);
        }

        String[] arr2Val = br.readLine().split(" ");
        for (int i = 0; i < arr2Val.length; i++) {
            arr2[i] = Integer.parseInt(arr2Val[i]);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2, Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < K; i++) {
            if(arr1[i] < arr2[i]) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            } else {
                break;
            }
        }

        for(int num : arr1){
            result += num;
        }
        System.out.println("Result : " + result);

    }


}
