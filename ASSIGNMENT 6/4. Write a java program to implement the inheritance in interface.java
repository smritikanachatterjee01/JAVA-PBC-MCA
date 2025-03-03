// 4. Write a java program to implement the inheritance in interface.

// Defining a parent interface
interface Vehicle {
    void start();
    void stop();
}

// Extending the parent interface to create a child interface
interface ElectricVehicle extends Vehicle {
    void chargeBattery();
}

// Implementing the child interface in a class
class Tesla implements ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Tesla starts silently");
    }

    @Override
    public void stop() {
        System.out.println("Tesla stops with regenerative braking");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Tesla is charging its battery");
    }
}

public class Main {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.start();
        myTesla.stop();
        myTesla.chargeBattery();
    }
}
