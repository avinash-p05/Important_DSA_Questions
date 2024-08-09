package accenture;

public class PseudoCode {
    public static void main(String[] args) {
        int n=4;
        System.out.println(n);
        int count = countCards(n);
        System.out.println(count);
    }

    private static int countCards(int i) {
//        if(i<=1)
//            return 3;
//        return i*3 + countCards(i-1);

        if(i==1)
            return 2;
        int sum = (i*(1+i))/2;
        return 3*sum-i;

    }
}
