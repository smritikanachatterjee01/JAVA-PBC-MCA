// 9. Write a java program to stop method overriding.
class Animal {
    final void sound() {
    System.out.println("Animal makes a sound");
    }
    }
    class Dog extends Animal { }
    public class StopMethodOverriding {
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.sound(); // Output: Animal makes a sound
    
    }
    }