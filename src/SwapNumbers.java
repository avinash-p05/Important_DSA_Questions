//•	Write a program to swap two values of two variables without using third variable.
public class SwapNumbers {
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println(a+" "+b);
        System.out.println("Using math operators - ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
        a=5;
        b=10;
        System.out.println("Using bit manipulation - ");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
    }
}
