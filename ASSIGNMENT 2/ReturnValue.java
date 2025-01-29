//9. Implementation of returning the value from the caller method.
public class ReturnValue {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ReturnValue obj = new ReturnValue();
        int result = obj.add(5, 10);
        System.out.println("Sum: " + result);
    }
}