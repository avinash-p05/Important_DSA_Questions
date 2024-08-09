package accenture;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max1=arr[0];
        int max2 = max1;
        for(int i : arr){
            max1=Math.max(max1+i,i);
            max2=Math.max(max1,max2);
        }
        System.out.println(max2);
    }
}
