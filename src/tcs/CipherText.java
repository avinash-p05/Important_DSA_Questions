package tcs;

import java.util.Scanner;

public class CipherText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int key = sc.nextInt();
        System.out.println(s);
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if (c ==' ')
                sb.append(" ");
            else
                sb.append(Character.toChars(c+1));
        }
        System.out.println(sb.toString());
    }
}
