// 17. Write a java program to access the methods from package & subpackage both.

// Save this file as TestPackageAndSubpackage.java
import mypackage.HelloWorld;
import mypackage.subpackage.Greeting;

public class TestPackageAndSubpackage {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.sayHello();

        Greeting greeting = new Greeting();
        greeting.sayGreeting();
    }
}
