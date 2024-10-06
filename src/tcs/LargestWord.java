package tcs;

import java.util.*;

public class LargestWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        String[] arr = s.split(" ");
        int max = arr[0].length();
        StringBuilder sb = new StringBuilder(arr[0]);
        for(int i=1;i<arr.length;i++ ){
            if(arr[i].length()>max){
                 sb.setLength(0);
                 sb.append(arr[i]);
                 max=arr[i].length();
            }
        }
        System.out.println(sb.toString());
    }
}
