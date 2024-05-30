//•	Write a program to convert a decimal number to its binary equivalent using function.
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while(n!=0){
            sb.append(n%2);
            System.out.println("sb - "+sb);
            n=n/2;
            System.out.println("n - "+n);
        }
        System.out.println(sb.reverse());
    }
}
