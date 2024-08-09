package testing;

public class TrailingZeros {
    public static void main(String[] args) {
        int n=5;
        System.out.println("The number is "+n+"! and the trailing zeros are - "+countZeros(n));
    }

    private static int countZeros(int n) {
        int count=0;
        for(int i=5;n/i>=1;i*=5){
            count=count+n/i;
        }
        return count;
    }
}
