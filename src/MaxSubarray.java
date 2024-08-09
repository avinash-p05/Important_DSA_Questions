//•	Given an integer array, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//Note: testing.A subarray is a contiguous part of an array.
//o Input: nums = [-2,1,-3,4,-1,2,1,-5,4] o Output: 6    subarray: [4,-1,2,1]
public class MaxSubarray {
    public static void main(String[] args) {
        //Kadane's Algorithm
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max1=nums[0];
        int max2=max1;
        for(int i=1;i< nums.length;i++){
            max1=Math.max(nums[i]+max1,nums[i]);
            max2=Math.max(max1,max2);
        }
        System.out.println(max2);

    }
}
