package interfaces;

interface Vehicle {
    void speedUp(int increment);

    // Default method with implementation
    default void applyBrakes() {
        System.out.println("Brakes applied.");
    }

    // Static method with implementation
    static void showInfo() {
        System.out.println("Vehicle interface in Java 8");
    }
}

class Car implements Vehicle {
    public void speedUp(int increment) {
        System.out.println("Speed increased by " + increment + " km/h");
    }
}


