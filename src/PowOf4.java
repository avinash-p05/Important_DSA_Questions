
import java.util.Scanner;

public class PowOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        System.out.println(str);
        double p = Math.log10(n)/Math.log10(4);
        if(p - (int)p == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
        Integer.parseInt(str);
    }
}
