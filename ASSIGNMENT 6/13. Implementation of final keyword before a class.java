// 13. Implementation of final keyword before a class.

final class FinalClass {
    void display() {
        System.out.println("This is a method in a final class.");
    }
}
public class FinalClassExample {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display();
    }
}
