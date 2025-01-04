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
        
        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println(commonElements);
    }

    private static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
       
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        
        set1.retainAll(set2);
        
        return new ArrayList<>(set1);
    }
}
