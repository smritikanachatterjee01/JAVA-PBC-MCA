// 10. Create a “circle” class & a “point” class. The coordinates of the circle are given and used within the “circle” class as object of the “point” class. Display the area of circle
class Point {
    int x, y;
    Point(int x, int y) {
    this.x = x;
    this.y = y;
    }
    }
    class Circle {
    Point center;
    int radius;
    Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
    }
    double area() {
    return Math.PI * radius * radius;
    }
    }
    public class CirclePointExample {
    public static void main(String[] args) {
    Point point = new Point(0, 0);
    Circle circle = new Circle(point, 5);
    System.out.println("Area of circle: " + circle.area()); }
    }