import java.util.Arrays;

//•	Write a program to merge two sorted arrays without using extra space.
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1,5,7,0,0,0};
        int[] b = {2,4,8};
        System.out.println("Arrays before sorting - ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        MergeSort(a,3,b,b.length);
        System.out.println("Arrays after sorting - ");
        System.out.println(Arrays.toString(a));
    }

    private static void MergeSort(int[] aa,int m, int[] b, int n) {
        if(m==0){
            for(int i=0;i<n;i++)
                aa[i]=b[i];
            return ;
        }
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && aa[i]>b[j])
                aa[k--]=b[i--];
            else
                aa[k--]=b[j--];
        }
    }
}
