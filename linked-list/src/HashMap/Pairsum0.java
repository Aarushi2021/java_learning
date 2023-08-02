package HashMap;

import java.util.*;

public class Pairsum0 {
    public static void pairSumToZero(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = -num;
            if (map.containsKey(complement) && map.get(complement) > 0) {
                System.out.println(Math.min(num, complement) + " " + Math.max(num, complement));
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        pairSumToZero(arr);
    }
}
