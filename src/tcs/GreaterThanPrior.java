package tcs;


public class GreaterThanPrior {
    public static void main(String[] args) {
        int[] arr = {7,4,8,2,9};
        int count=1;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
