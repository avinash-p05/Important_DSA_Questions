package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        System.out.println(Arrays.toString(arr));
        int swap = selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("No of swaps - "+swap);
    }

    private static int selectionSort(int[] arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[minIdx] > arr[j])
                    minIdx = j;
            if (i != minIdx) {
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
                swap++;
            }
        }
        return swap;
    }
}
