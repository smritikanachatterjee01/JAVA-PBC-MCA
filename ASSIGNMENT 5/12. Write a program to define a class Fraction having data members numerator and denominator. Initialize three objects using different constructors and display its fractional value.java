// 12. Write a program to define a class Fraction having data members numerator and denominator. Initialize three objects using different constructors and display its fractional value.
class Fraction {
    int numerator, denominator;
    Fraction() {
    numerator = 1;
    denominator = 1;
    }
    Fraction(int num, int denom) {
    numerator = num;
    denominator = denom;
    }
    Fraction(Fraction f) {
    numerator = f.numerator;
    denominator = f.denominator;
    }
    void display() {
    System.out.println("Fraction: " + numerator + "/" + denominator);
    }
    }
    public class Main {
    public static void main(String[] args) {
    Fraction f1 = new Fraction(); // Default constructor
    Fraction f2 = new Fraction(3, 4); // Parameterized constructor
    Fraction f3 = new Fraction(f2); // Copy constructor
    f1.display(); // Output: Fraction: 1/1
    f2.display(); // Output: Fraction: 3/4
    f3.display(); // Output: Fraction: 3/4
    }
    }