package interfaces;

public class Example2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speedUp(50);
        myCar.applyBrakes(); // Calling default method
        Vehicle.showInfo(); // Calling static method
    }
}
