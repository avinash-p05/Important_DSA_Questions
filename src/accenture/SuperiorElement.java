package accenture;

import java.util.Arrays;

public class SuperiorElement {
    public static void main(String[] args) {
        int[] arr = {7,9,5,2,8,7};
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int count=1;
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }
        System.out.println(count);

    }
}
