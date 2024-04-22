import java.util.Scanner;
//•	Write a program to check whether the given number is power of 2 or not.
public class PowOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = n > 0 && ((n & (n - 1)) == 0);
        System.out.println("Is pow of 2 ? - "+flag);
    }
}
