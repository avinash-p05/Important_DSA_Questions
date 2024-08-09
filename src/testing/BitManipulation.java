package testing;

public class BitManipulation {

    public static void main(String[] args) {
        int ans = start(100);
        System.out.println("Answer - "+ans);
    }

    public static int start(int num) {
        int count = 0;
        while (num > 0) {
            ++count;
            num = (num - 1) & num;
        }
        return count;
    }
}
