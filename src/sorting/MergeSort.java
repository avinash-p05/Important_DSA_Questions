package sorting;

// Time - O(n log n), n for merging and log n for splitting and Space - O(n) because has to separate array for each element;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        System.out.println("Original Array - "+Arrays.toString(arr));
        int[] sortedArray = mergeSort(arr);
        System.out.println("Sorted Array - "+Arrays.toString(sortedArray));
    }

    private static int[] mergeSort(int[] arr) {

        if(arr.length==1)
            return arr;

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int[] a, int[]b){
        int i=0,j=0,k=0;
        int m=a.length;
        int n=b.length;
        int[] result = new int[m+n];
        while(i<m && j<n){
            if(a[i]<b[j])
                result[k++]=a[i++];
            else
                result[k++]=b[j++];
        }
        while(i<m)
            result[k++]=a[i++];
        while(j<n)
            result[k++]=b[j++];
        return result;
    }
}
