package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class UpAndDown03_28 {

    public static void main(String[] args) throws IOException {

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[count];

        for (int i = 0; i < count; i++) {
            Integer num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
    }
}
