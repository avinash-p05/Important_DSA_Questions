package tcs;

import java.util.*;

public class MaxOccuringChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = MaxChar(s);
        System.out.println(c);
    }
    private static char MaxChar(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i=1;
        int max=1;
        char c = arr[0];
        char result=arr[0];
        int currCount=1;
        while(i!=arr.length){
            if(arr[i]==c)
                currCount++;
            else{
                if(max<currCount){
                    max=currCount;
                    result=c;
                }
                c=arr[i];
                currCount=1;
            }
            i++;
        }
        return result;
    }
}

