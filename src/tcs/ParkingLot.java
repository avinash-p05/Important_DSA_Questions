package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int n = r*c;
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        int i=0,j=0;
        int max=0,result=0;
        int count=0;
        while(i<n){
            if(arr[i]==1){
                count++;
            }
            if((i+1)/c > j){
                j=(i+1)/c;
                if(count>max){
                  max=count;
                  count=0;
                  result=j;
                }
            }
            i++;
        }
        System.out.println(result);
    }
}
