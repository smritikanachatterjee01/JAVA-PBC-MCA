// 1. Add Months to ArrayList
import java.util.*;
public class MonthsArrayList {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 12 months:");
        for (int i = 0; i < 12; i++) months.add(scanner.nextLine());
        System.out.println("Months of the Year: " + months);
        scanner.close();
    }
}

// 2. ArrayList with Iterator
import java.util.*;
public class StringArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            list.add(input);
        }
        printAll(list);
        scanner.close();
    }
    public static void printAll(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

// 3. Retrieve Element at Index
import java.util.*;
public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            list.add(input);
        }
        System.out.println("Enter index to retrieve:");
        int index = scanner.nextInt();
        if (index >= 0 && index < list.size())
            System.out.println("Element at index " + index + ": " + list.get(index));
        else
            System.out.println("Index out of bounds");
        scanner.close();
    }
}

// 4. Copy ArrayList
import java.util.*;
public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            originalList.add(input);
        }
        ArrayList<String> copiedList = new ArrayList<>(originalList);
        System.out.println("Original List: " + originalList);
        System.out.println("Copied List: " + copiedList);
        scanner.close();
    }
}

// 5. Add Months to LinkedList (Same as 1 but using LinkedList)
import java.util.*;
public class MonthsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> months = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 12 months:");
        for (int i = 0; i < 12; i++) months.add(scanner.nextLine());
        System.out.println("Months of the Year: " + months);
        scanner.close();
    }
}

// 6. Iterate from Specified Index in LinkedList
import java.util.*;
public class IterateFromIndex {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            list.add(input);
        }
        System.out.println("Enter start index:");
        int index = scanner.nextInt();
        if (index >= 0 && index < list.size()) {
            ListIterator<String> iterator = list.listIterator(index);
            while (iterator.hasNext()) System.out.println(iterator.next());
        } else {
            System.out.println("Invalid index");
        }
        scanner.close();
    }
}

// 7. Insert Elements at First and Last in LinkedList
import java.util.*;
public class InsertInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            list.add(input);
        }
        System.out.println("Enter first element:");
        list.addFirst(scanner.nextLine());
        System.out.println("Enter last element:");
        list.addLast(scanner.nextLine());
        System.out.println("Updated LinkedList: " + list);
        scanner.close();
    }
}

// 8. Remove First and Last Elements in LinkedList
import java.util.*;
public class RemoveFirstLast {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            list.add(input);
        }
        if (!list.isEmpty()) {
            list.removeFirst();
            if (!list.isEmpty()) list.removeLast();
        }
        System.out.println("Updated LinkedList: " + list);
        scanner.close();
    }
}

// 9. Append and Iterate HashSet
import java.util.*;
public class AppendHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            set.add(input);
        }
        System.out.println("Enter element to append:");
        set.add(scanner.nextLine());
        for (String element : set) System.out.println(element);
        scanner.close();
    }
}

// 10. Clone HashSet
import java.util.*;
public class CloneHashSet {
    public static void main(String[] args) {
        HashSet<String> originalSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            originalSet.add(input);
        }
        HashSet<String> clonedSet = new HashSet<>(originalSet);
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);
        scanner.close();
    }
}

// 11. Convert HashSet to Array
import java.util.*;
public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements (type 'stop' to end):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) break;
            set.add(input);
        }
        String[] array = set.toArray(new String[0]);
        System.out.print("Array: ");
        for (String item : array) System.out.print(item + " ");
        scanner.close();
    }
}
