package tcs;

import java.util.*;

public class MaxInWindow{
        public static void main(String[] args){
    int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
    int k=3;
    int[] result = new int[arr.length-k+1];
		for(int i=0;i<result.length;i++){
        int max=arr[i];
        for(int j=i+1;j<i+k;j++){
            if(arr[j]>max)
                max=arr[j];
        }
        result[i]=max;
    }
		System.out.println(Arrays.toString(result));
    }
}
