//8. Implementation of parameterized constructor.
public class ParameterizedConstructor {
    int value;

    ParameterizedConstructor(int val) {
        this.value = val;
        System.out.println("Parameterized constructor called with value: " + val);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10);
    }
}