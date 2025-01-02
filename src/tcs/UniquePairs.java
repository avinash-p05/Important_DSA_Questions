package tcs;

import java.util.*;

public class UniquePairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim();
        int k = sc.nextInt();
        int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(findPairs(arr, k));
    }
    private static int findPairs(int[] arr, int k) {
        int pairs = 0;
        if(k<0 || arr.length==0)
            return 0;

        Set<Integer> set = new HashSet<>();
        Set<Integer> repeatedElements = new HashSet<>();

        for(int num:arr){
            if(set.contains(num))
                repeatedElements.add(num);
            set.add(num);
        }

        if(k==0)
            return repeatedElements.size();

        for(int num : set){
            if(set.contains(num+k))
                pairs++;
        }

        return pairs;
    }
}
