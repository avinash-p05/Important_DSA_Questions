public class Test {
    static int i=24;
    static {
        System.out.println("1. Static block executed.");
    }

    // Constructor
    public Test() {
        System.out.println("3. Constructor executed.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("2. Static method executed." );
    }

    public static void main(String[] args) {
        String s = new String("Avinash");
        String t = new String("Avinash");
        String ss = "Avinash";
        String tt = "Avinash";
        if(ss==tt)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
