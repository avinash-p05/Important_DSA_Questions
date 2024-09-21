package daimler;

public class sumOfN {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    private static int f(int n){
        if(n<=0)
            return 0;
        else
            return n+f(n-1);
    }
}
