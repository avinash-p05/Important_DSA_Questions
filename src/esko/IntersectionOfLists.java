package esko;

import java.util.*;

public class IntersectionOfLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] input1 = sc.nextLine().trim().split(" ");
        List<Integer> list1 = new ArrayList<>();
        for (String s : input1) {
            list1.add(Integer.parseInt(s));
        }
        
        String[] input2 = sc.nextLine().trim().split(" ");
        List<Integer> list2 = new ArrayList<>();
        for (String s : input2) {
            list2.add(Integer.parseInt(s));
        }
        
        List<Integer> commonElements = findCommonElementsUsingMap(list1, list2);
        System.out.println(commonElements);
    }

    private static List<Integer> findCommonElementsUsingMap(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        // Build frequency map for list1
        set.addAll(list1);

        // Find common elements in list2
        for (Integer num : list2) {
            if (set.contains(num) && (!result.contains(num))) {
                result.add(num);
            }
        }

        return result;
    }

}
