package tcs;

import java.util.Scanner;

public class MonkeysEating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        int total=0;
        total+=m/k+(m%k);
        total+=p/j+(p%j);

    }
}
