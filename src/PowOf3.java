import java.util.Scanner;

public class PowOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double p = Math.log10(n)/Math.log10(3);
        if(p - (int)p == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
