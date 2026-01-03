// SMRITIKANA CHATTERJEE_MCA_46_A_JAVA OOP LAB 8

// 1. Simple Applet Example
import java.applet.Applet;
import java.awt.Graphics;
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, this is a simple applet!", 20, 20);
    }
}

// 2. Parameter Passing in Applet
import java.applet.*;
import java.awt.*;
public class ParameterApplet extends Applet {
    String message;
    public void init() {
        message = getParameter("message");
        if (message == null) message = "No parameter found!";
    }
    public void paint(Graphics g) {
        g.drawString(message, 20, 20);
    }
}

// 3. JButton, JTextField, JPanel, JMenu Example
import javax.swing.*;
import java.awt.*;
public class SwingComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setSize(400, 300); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Click Me");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        menu.add(new JMenuItem("Open"));
        menuBar.add(menu); frame.setJMenuBar(menuBar);
        panel.add(textField); panel.add(button); frame.add(panel);
        frame.setVisible(true);
    }
}

// 4. Thread by Extending Thread Class
class MyThread extends Thread {
    public void run() { System.out.println("Thread is running..."); }
}
public class ThreadExample {
    public static void main(String[] args) {
        new MyThread().start();
    }
}

// 5. Thread by Implementing Runnable Interface
class MyRunnable implements Runnable {
    public void run() { System.out.println("Runnable thread is running..."); }
}
public class RunnableExample {
    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
    }
}

// 6. yield() Method Example
class YieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
        }
    }
}
public class YieldExample {
    public static void main(String[] args) {
        new YieldThread().start();
        new YieldThread().start();
    }
}

// 7. sleep(n) Method Example
class SleepThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class SleepExample {
    public static void main(String[] args) {
        new SleepThread().start();
    }
}

// 8. suspend() and resume() Methods (Simulated)
class SuspendResumeThread extends Thread {
    boolean suspended = false;
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspended) wait();
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    synchronized void suspendThread() { suspended = true; }
    synchronized void resumeThread() { suspended = false; notify(); }
}
public class SuspendResumeExample {
    public static void main(String[] args) {
        SuspendResumeThread t1 = new SuspendResumeThread(); t1.start();
        try {
            Thread.sleep(3000); t1.suspendThread();
            Thread.sleep(3000); t1.resumeThread();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// 9. Check if Thread is Alive
class AliveThread extends Thread {
    public void run() {
        try { Thread.sleep(1000); } catch (InterruptedException e) { System.out.println(e); }
    }
}
public class ThreadAliveExample {
    public static void main(String[] args) {
        AliveThread t1 = new AliveThread();
        System.out.println("Before start: " + t1.isAlive());
        t1.start();
        System.out.println("After start: " + t1.isAlive());
    }
}
