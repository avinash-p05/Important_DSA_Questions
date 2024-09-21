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

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);


        System.out.println(Arrays.toString(nums));
    }
    private static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
