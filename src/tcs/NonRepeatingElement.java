package tcs;

import java.util.Arrays;

public class NonRepeatingElement{
    public static void main(String[] args){
        int[] arr = {3,3,2,2,2};
//        Arrays.sort(arr);
//        if(arr.length>1 && arr[0]==arr[arr.length-1])
//            System.out.println("0");
        int result=0;
        for(int i=0;i<arr.length;i++)
            result=result^arr[i];
        System.out.println(result);
    }
}
