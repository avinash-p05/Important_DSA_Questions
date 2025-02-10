package interfaces;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class Functional {
    public static void main(String[] args) {
        // Using lambda expression
        Calculator sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(5, 10));
    }
}

