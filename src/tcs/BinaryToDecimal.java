package tcs;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result=0;
        int a=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1')
                result = result + (int)Math.pow(2,a);
            a++;
        }
        System.out.println(result);
    }
}
