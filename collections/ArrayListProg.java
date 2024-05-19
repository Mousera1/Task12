package collections;

import java.util.ArrayList;

public class ArrayListProg {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> stringList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");

        // Print the ArrayList before removing elements
        System.out.println("ArrayList before removal: " + stringList);

        // Remove all elements from the ArrayList
        stringList.removeAll(stringList);

        // Print the ArrayList after removing elements
        System.out.println("ArrayList after removal: " + stringList);
    }
}