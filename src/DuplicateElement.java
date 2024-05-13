//•	Write a program to check if the array contains a duplicate i.e., any value appears at least twice in the array.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr  = {5,7,1,2,3,4,1};
        Set<Integer> set = new HashSet<Integer>();
        boolean flag=false;
//        for(int i : arr){
//            if(set.contains(i)) {
//                flag = true;
//                break;
//            }
//            else
//                set.add(i);
//        }

        // Alternate method
        Arrays.sort(arr);
        int j;
        for(int i=0;i<arr.length-1;i++){
            j=i+1;
            if(arr[i]==arr[j]){
                flag = true;
//              break;
            }

        }
        if(flag)
            System.out.println("Contains Duplicate");
        else
            System.out.println("Doesn't contain Duplicate");
    }
}
