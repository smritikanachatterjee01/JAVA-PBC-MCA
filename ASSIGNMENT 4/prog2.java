class Student {
    String name;
    int age;
    String course;

    // Default Constructor
    public Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    // Constructor with one parameter
    public Student(String name) {
        this.name = name;
        age = 18; // Default age
        course = "Not Assigned";
    }

    // Constructor with two parameters
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        course = "Not Assigned";
    }

    // Constructor with three parameters
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 20);
        Student s4 = new Student("Charlie", 22, "Computer Science");

        // Display student details
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
