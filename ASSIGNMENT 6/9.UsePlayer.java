// 9. Create an interface called Player. The interface has an abstract method called play() that displays a
// message describing the meaning of “play” to the class. Create classes called Child, Musician, and
// Actor that all implement Player. Create an application that demonstrates the use of the classes(UsePlayer.java

// Define the Player interface
interface Player {
    void play(); // Abstract method to be implemented by classes
}

// Implementing the Player interface in the Child class
class Child implements Player {
    @Override
    public void play() {
        System.out.println("A child plays by running around, playing games, and having fun.");
    }
}

// Implementing the Player interface in the Musician class
class Musician implements Player {
    @Override
    public void play() {
        System.out.println("A musician plays an instrument to create beautiful music.");
    }
}

// Implementing the Player interface in the Actor class
class Actor implements Player {
    @Override
    public void play() {
        System.out.println("An actor plays a role in a movie, TV show, or theater performance.");
    }
}

// Main class to demonstrate the use of Player interface
public class UsePlayer {
    public static void main(String[] args) {
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();
        
        // Call play() on each object
        child.play();
        musician.play();
        actor.play();
    }
}
