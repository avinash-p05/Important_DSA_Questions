package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,7,8,4,6};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int minIdx = i;
            for(int j=i+1;j<arr.length;j++)
                if(arr[minIdx]>arr[j])
                    minIdx=j;
            if(i!=minIdx){
                int temp=arr[minIdx];
                arr[minIdx]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
