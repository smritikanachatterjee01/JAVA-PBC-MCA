// 16. Write a java program to access the methods from package.

// Save this file as TestPackage.java
import mypackage.HelloWorld;

public class TestPackage {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.sayHello();
    }
}
