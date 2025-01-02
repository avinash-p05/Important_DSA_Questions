package tcs;

import java.util.Scanner;

public class Sum_Multiple_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n=Math.abs(n);
        if(is_sum_of_digits_multiple_of_3(n))
            System.out.println("True");
        else
            System.out.println("False");

    }
    private static boolean is_sum_of_digits_multiple_of_3(int num){
        int sum=0,rem;
        while(num!=0){
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return sum % 3 == 0;
    }
}
