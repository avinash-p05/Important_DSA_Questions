//•	Given an array, rotate the array to the right by k steps, where k is non-negative.
//o Input: nums = [1,2,3,4,5,6,7], k = 3 o Output: [5,6,7,1,2,3,4]

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        k= k%nums.length;
        System.out.println(k);
        int i=0;
        int j=nums.length-k;
        while(j< nums.length){
            nums[i]=nums[i]+nums[j];
            nums[j]=nums[i]-nums[j];
            nums[i]=nums[i]-nums[j];
            i++;
            j++;
        }
        System.out.println(nums);
    }
}
