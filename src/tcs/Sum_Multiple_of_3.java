//You are working on a feature for a digital banking app. One of the requirements is to determine if a transaction ID is valid based on its digits. A transaction ID is considered valid if the sum of its digits is a multiple of 3. Write a function that takes the transaction ID as an input (an integer) and returns true if it is valid, or false otherwise.
//
//        Sample Test Cases:
//        •	Input: 123
//        Output: true
//        Explanation: The sum of the digits is 1 + 2 + 3 = 6, which is a multiple of 3.
//
//        •	Input: 124
//        Output: false
//        Explanation: The sum of the digits is 1 + 2 + 4 = 7, which is not a multiple of 3.

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
