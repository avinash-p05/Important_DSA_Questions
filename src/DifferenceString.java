import java.util.Scanner;

public class DifferenceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String t= sc.nextLine();
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++)
            sum1+=s.charAt(i);
        for(int i=0;i<t.length();i++)
            sum2+=t.charAt(i);
        int j = (sum1>sum2)?sum1-sum2:sum2-sum1;
        System.out.println((char)j);
    }
}
