import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList of Integer
        ArrayList<Integer> number = new ArrayList<Integer>();

        // Adding elements
        number.add(20);
        number.add(30);
        number.add(0, 10); // Add 10 at index 0
        number.add(40);
        number.add(1, 11); // Add 11 at index 1

        // Print ArrayList directly
        System.out.println("ArrayList: " + number);

        // Print using for-each loop
        System.out.print("For-each loop: ");
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print using iterator
        System.out.print("Iterator: ");
        Iterator<Integer> itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Remove element at index 1
        number.remove(1);
        System.out.println("After removing element at index 1: " + number);

        // Uncomment the following line to remove all elements
        // number.removeAll(number);
    }
}
