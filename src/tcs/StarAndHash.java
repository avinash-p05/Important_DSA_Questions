package tcs;

import java.util.Scanner;

public class StarAndHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a =0;
        for(char c : s.toCharArray())
            if(c=='*')
                a++;
        System.out.println(a-(s.length()-a));
    }
}
