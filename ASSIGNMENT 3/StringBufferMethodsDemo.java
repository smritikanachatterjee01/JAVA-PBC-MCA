// 10. Write java codes to implement the followings - Methods of Stringbuffer class: append(), capacity(), charAt(), delete(),
//  deleteCharAt().; ensure Capacity(), getChars(), indexOf(), insert(), length(), setCharAt(), setLength(), substring(), toString().
public class StringBufferMethodsDemo {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() - Appends the given string to the buffer
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. capacity() - Returns the current capacity of the buffer
        System.out.println("Capacity: " + sb.capacity());

        // 3. charAt() - Returns the character at the specified index
        System.out.println("Character at index 1: " + sb.charAt(1));

        // 4. delete() - Deletes a sequence of characters from start to end index
        sb.delete(5, 11);
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt() - Deletes the character at the specified index
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt: " + sb);

        // 6. ensureCapacity() - Ensures that the capacity is at least equal to the specified minimum
        sb.ensureCapacity(30);
        System.out.println("Capacity after ensureCapacity(30): " + sb.capacity());

        // 7. getChars() - Copies characters from the buffer into a destination character array
        char[] charArray = new char[4];
        sb.getChars(0, 4, charArray, 0);
        System.out.print("Characters extracted using getChars: ");
        System.out.println(charArray);

        // 8. indexOf() - Returns the index of the first occurrence of the given substring
        System.out.println("Index of 'lo': " + sb.indexOf("lo"));

        // 9. insert() - Inserts a string at the specified index
        sb.insert(4, "p");
        System.out.println("After insert: " + sb);

        // 10. length() - Returns the length of the string
        System.out.println("Length: " + sb.length());

        // 11. setCharAt() - Sets the character at a specified index
        sb.setCharAt(1, 'a');
        System.out.println("After setCharAt: " + sb);

        // 12. setLength() - Sets the length of the string
        sb.setLength(3);
        System.out.println("After setLength(3): " + sb);

        // 13. substring() - Returns a substring of the buffer
        sb.append("lo World");
        System.out.println("Substring from index 2: " + sb.substring(2));

        // 14. toString() - Converts the StringBuffer object to a String
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
