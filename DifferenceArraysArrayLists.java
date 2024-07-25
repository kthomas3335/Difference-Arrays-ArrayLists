import java.util.ArrayList; // This line imports the ArrayList class

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // Example of an Array
        int[] numbersArray = new int[5]; // fixed size
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = i * 2; // simple direct access
        }

        // Example of an ArrayList
        ArrayList<Integer> numbersList = new ArrayList<>(); // size grows dynamically
        for (int i = 0; i < 5; i++) {
            numbersList.add(i * 2); // adding elements
        }

        // Removing an element from ArrayList
        numbersList.remove(2); // flexible size

        // Printing both structures
        System.out.println("Array: ");
        for (int number : numbersArray) {
            System.out.println(number);
        }

        System.out.println("ArrayList: ");
        for (int number : numbersList) {
            System.out.println(number);
        }
    }
}
