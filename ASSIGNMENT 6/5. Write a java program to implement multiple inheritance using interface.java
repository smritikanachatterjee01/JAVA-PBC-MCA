// 5. Write a java program to implement multiple inheritance using interface.
interface Vehicle {
    void start();
}
interface Machine {
    void stop();
}
// Implementing both interfaces in a class
class Car implements Vehicle, Machine {
    @Override
    public void start() {
        System.out.println("Car starts");
    }
    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}
