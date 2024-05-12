//•	Given an array and a value, remove all the occurrences of the given value in the array.

import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr  = {1,2,3,2,2,2,3,4,2};
        int n = 2;
        int count=0;
        for(int i :arr)
            if(i==n)
                count++;
        System.out.println(count);
        int[] a = new int[arr.length-count];
        int i=0;
        int j=0;
        while(count!=0 && i< arr.length){
            if(arr[i]!=n) {
                a[j++]=arr[i];
                count--;
            }
            i++;
        }
        System.out.println(Arrays.toString(a));
    }
}
