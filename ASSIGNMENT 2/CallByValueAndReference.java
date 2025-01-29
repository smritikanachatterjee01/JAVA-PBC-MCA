//10. Implementation of call by value and call by reference.
public class CallByValueAndReference {
    // Call by value (primitive data type)
    void callByValue(int num) {
        num = 100;
        System.out.println("Inside callByValue method: " + num);
    }

    // Call by reference (object)
    void callByReference(int[] arr) {
        arr[0] = 100;
        System.out.println("Inside callByReference method: " + arr[0]);
    }

    public static void main(String[] args) {
        CallByValueAndReference obj = new CallByValueAndReference();

        // Call by value example
        int num = 50;
        obj.callByValue(num);
        System.out.println("After callByValue method: " + num);

        // Call by reference example
        int[] arr = {50};
        obj.callByReference(arr);
        System.out.println("After callByReference method: " + arr[0]);
    }
}