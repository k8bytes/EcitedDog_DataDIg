import java.util.Arrays;
import java.util.Comparator;

public class TestBubbleSort {

    // 1) Bubble sort using Comparable
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                // Compare adjacent elements using compareTo
                if (list[j].compareTo(list[j + 1]) > 0) {
                    // Swap
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    // 2) Bubble sort using Comparator
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                // Compare adjacent elements using the given comparator
                if (comparator.compare(list[j], list[j + 1]) > 0) {
                    // Swap
                    E temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example 1: Using Comparable
        Integer[] numbers = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original Integer array: " + Arrays.toString(numbers));
        bubbleSort(numbers);  // Uses Comparable
        System.out.println("Sorted Integer array (Comparable): " + Arrays.toString(numbers));
        System.out.println();

        // Example 2: Using Comparator (sort Strings by length)
        String[] words = { "banana", "apple", "zebra", "dog", "cat" };
        System.out.println("Original String array: " + Arrays.toString(words));
        bubbleSort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Compare by string length
                return s1.length() - s2.length();
            }
        });
        System.out.println("Sorted String array (Comparator by length): " + Arrays.toString(words));
    }
}