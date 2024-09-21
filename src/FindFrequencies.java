//•	Write a program to find the count the frequencies of elements of a given integer array.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindFrequencies {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 5, 5, 34, 3, 5, 6, 4, 2, 34, 56, 7, 4, 2, 4, 5, 7, 7, 7, 5, 4, 4, 5, 6, 7};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.compute(i, (k, temp) -> temp + 1);
            } else
                map.put(i, 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e);
        }

    }
}
