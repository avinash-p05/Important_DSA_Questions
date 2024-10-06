package tcs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 2, 1, 1};
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the first non-repeating element
        for (int num : arr) {
            if (map.get(num) == 1) {
                result = num;
            }
        }
        System.out.println(result);
    }
}

