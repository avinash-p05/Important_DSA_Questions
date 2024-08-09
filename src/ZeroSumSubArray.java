import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] arr = {3,7,-2,4,-2,8,4};
        System.out.println(Arrays.toString(arr));
        if(isZeroSumSubArray(arr))
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static boolean isZeroSumSubArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum==0 || arr[i]==0 || set.contains(sum))
                return true;
            else{
                set.add(sum);
                sum+=arr[i];
            }
        }
        return false;
    }
}
