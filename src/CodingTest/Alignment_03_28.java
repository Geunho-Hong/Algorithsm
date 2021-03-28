package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Alignment_03_28 {

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String nameAndScore[] = br.readLine().split(" ");
            map.put(nameAndScore[0], Integer.parseInt(nameAndScore[1]));
        }

        /**
         * Map 의 Value 값을 기준으로 정렬하기
         */
        List<Map.Entry<String, Integer>> map_list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(map_list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry : map_list) {
            System.out.print(entry.getKey() + " ");
        }

    }
}
