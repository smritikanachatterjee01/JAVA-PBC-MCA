import java.util.Scanner;

abstract class ThreeDObject {
    // Abstract methods to be overridden by subclasses
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}

// Box class extending ThreeDObject
class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

// Cube class extending ThreeDObject
class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * (side * side);
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

// Cylinder class extending ThreeDObject
class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Cone class extending ThreeDObject
class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

public class prog10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test Box
        System.out.println("Enter the dimensions for a Box:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Test Cube
        System.out.println("\nEnter the dimensions for a Cube:");
        System.out.print("Side: ");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Test Cylinder
        System.out.println("\nEnter the dimensions for a Cylinder:");
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Height: ");
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Test Cone
        System.out.println("\nEnter the dimensions for a Cone:");
        System.out.print("Radius: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Height: ");
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}

