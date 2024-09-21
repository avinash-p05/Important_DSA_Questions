import java.util.*;

//•	Given two integer arrays, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays.
//o Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] o Output: [4,9] or [9,4]
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        int n = (num1.length>=num2.length)?num2.length:num1.length;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i< num1.length;i++)
            set.add(num1[i]);
        for(int i=0;i<num2.length;i++)
            if(set.contains(num2[i]) && (!list.contains(num2[i])))
                list.add(num2[i]);
        System.out.println(list);
    }
}
