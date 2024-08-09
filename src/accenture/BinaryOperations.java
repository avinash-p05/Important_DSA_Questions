package accenture;

import java.util.Scanner;

public class BinaryOperations {
    public static void main(String[] args) {

        String str = "1C0C1C1A0B1";
        System.out.println(str);
        int ans = calculate(str);
        System.out.println(ans);
    }

    private static int calculate(String str) {
        int a = Integer.parseInt(Character.toString(str.charAt(0)));
        int b;
        char op;
        int i=1;
        int j=2;
        while(i<str.length() && j<str.length()){
            b = Integer.parseInt(Character.toString(str.charAt(j)));
            op = str.charAt(i);
            if(op=='A')
                a = a & b;
            else if(op=='B')
                a = a | b;
            else
                a = a ^ b;
            i=j+1;
            j=i+1;
        }
        return a;

    }
}
