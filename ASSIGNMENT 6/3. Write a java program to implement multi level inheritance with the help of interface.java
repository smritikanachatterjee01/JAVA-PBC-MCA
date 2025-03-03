// public 3. Write a java program to implement multi level inheritance with the help of interface.
 // Defining interface A
interface A {
    void methodA();
}

// Defining interface B that extends interface A
interface B extends A {
    void methodB();
}

// Defining a class that implements interface B
class C implements B {
    @Override
    public void methodA() {
        System.out.println("This is methodA from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("This is methodB from interface B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}

