// 9.Write java codes to implement the followings - Basic string handling concepts- Concept of mutable and immutable string, Methods of String class-charAt(), compareTo(), equals(), equalsIgnoreCase(), indexOf(), length(),
//  substring().; toCharArray(), toLowerCase(), toString(), toUpperCase(), trim(), valueOf() methods 
public class StringHandling {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("charAt: " + str.charAt(1));
        System.out.println("compareTo: " + str.compareTo("Hello"));
        System.out.println("equals: " + str.equals("hello world"));
        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase("hello world"));
        System.out.println("indexOf: " + str.indexOf('o'));
        System.out.println("length: " + str.length());
        System.out.println("substring: " + str.substring(6));
        System.out.println("toCharArray: " + str.toCharArray());
        System.out.println("toLowerCase: " + str.toLowerCase());
        System.out.println("toString: " + str.toString());
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("trim: " + str.trim());
        System.out.println("valueOf: " + String.valueOf(123));
    }
}