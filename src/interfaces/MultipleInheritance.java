package interfaces;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Printer implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }

    public void show() {
        System.out.println("Showing...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.print();
        obj.show();
    }
}

