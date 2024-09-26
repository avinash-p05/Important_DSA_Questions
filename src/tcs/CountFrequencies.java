package tcs;
import java.util.*;

public class CountFrequencies {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3};
        int n = 4;
        int p = 4;
        Arrays.sort(arr);
        int j=1;
        int i=0;
        int count=0;
        while(i<n){
            if(arr[i]!=j){
                System.out.print(count+" ");
                j++;
                count=0;
                continue;
            }
            else{
                count++;
                i++;
            }
        }
        System.out.print(count+" ");
        for(int k=j;k<p;k++)
            System.out.print("0 ");
    }
}
