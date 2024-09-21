package tcs;

import java.util.Arrays;

public class chocolateFactory {
    public static void main(String[] args) {
        int[] arr = {4,5,0,1,9,0,5,0};
        int i=0;
        int j= arr.length-1;
        System.out.println(Arrays.toString(arr));
        while(i!=j){
            if(arr[j]==0){
                j--;
                continue;
            }
            if(arr[i]==0){
                arr[i]=arr[j];
                arr[j]=0;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
