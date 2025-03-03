// 12. Implementation of final keyword before a method.

class Parent {
    final void display() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
  
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
