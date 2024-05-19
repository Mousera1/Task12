package collections;

import java.util.ArrayList;
import java.util.List;

public class Listtoarray {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        
        // Add some elements to the List
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");

        // Print the List
        System.out.println("List: " + stringList);

        // Convert the List to an Array
        String[] stringArray = stringList.toArray(new String[0]);

        // Print the Array
        System.out.println("Array: ");
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}