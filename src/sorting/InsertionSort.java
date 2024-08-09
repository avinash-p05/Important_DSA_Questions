package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        System.out.println(Arrays.toString(arr));
        int swap = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("No of swaps - "+swap);
    }

    private static int insertionSort(int[] arr) {
        int swap=0;
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>-1 && temp<arr[j]){
                arr[j+1]=arr[j];
                arr[j]=temp;
                j--;
                swap++;
            }
        }
        return swap;

    }
}
