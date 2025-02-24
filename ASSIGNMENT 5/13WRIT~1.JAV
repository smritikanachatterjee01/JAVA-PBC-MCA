// 13. Write a program to define a class Item containing code and price. Accept this data for five objects using array of objects. Display code, price in tabular form and also, display total price of all items
import java.util.Scanner;
class Item {
int code;
double price;
Item(int code, double price) {
this.code = code;
this.price = price;
}
}
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Item[] items = new Item[5]; // Array to store 5 items
for (int i = 0; i < 5; i++) {
System.out.print("Enter code for item " + (i + 1) + ": ");
int code = scanner.nextInt();
System.out.print("Enter price for item " + (i + 1) + ": ");
double price = scanner.nextDouble();
items[i] = new Item(code, price); // Create Item object and store it in array
}
double totalPrice = 0;
System.out.println("\nItem Details:");
System.out.println("Code\tPrice");
for (int i = 0; i < 5; i++) {
System.out.println(items[i].code +
"\t" + items[i].price);
totalPrice += items[i].price;
// Calculate total price
}
System.out.println("\nTotal
Price of All Items: " + totalPrice);
}
}