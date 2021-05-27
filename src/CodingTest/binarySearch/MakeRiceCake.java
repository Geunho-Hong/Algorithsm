package CodingTest.binarySearch;

import java.util.*;

public class MakeRiceCake {

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] heights = new int[N];

        ArrayList<Integer> arrLst = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int height = sc.nextInt();
            arrLst.add(height);
            heights[i] = height;
        }

        Collections.sort(arrLst, Collections.reverseOrder());


        int idx = 0;

        for (int i = 1; i < arrLst.size(); i++) {
            int value = arrLst.get(i);
            int sum = 0;
            for (int j = 0; j < arrLst.size(); j++) {
                int num = arrLst.get(j);
                if (value >= num) {
                    continue;
                } else {
                    int result = num - value;
                    sum += result;
                }
                if (M <= sum) {
                    break;
                }
                idx++;
            }
        }

        System.out.println("Answer is : " + arrLst.get(idx));

    }
}
