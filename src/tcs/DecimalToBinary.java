package tcs;

import java.util.*;

public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while(n!=0){
            sb.append(n%2);
            n=n/2;
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
