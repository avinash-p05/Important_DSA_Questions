//•	Given an array, rotate the array to the right by k steps, where k is non-negative.
//o Input: nums = [1,2,3,4,5,6,7], k = 3 o Output: [5,6,7,1,2,3,4]

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        int k = 3;
        k= k%nums.length;
        System.out.println(k);
        int[] temp = Arrays.copyOfRange(nums,nums.length-k,nums.length);
        for(int i= nums.length-1;i>=k;i--)
            nums[i]=nums[i-k];
        for(int i=0;i<k;i++)
            nums[i]=temp[i];
        System.out.println(Arrays.toString(nums));
    }
}
