import java.util.Arrays;
import java.util.Comparator;

public class TestQuickSort {

    // 1) quick sort using Comparable
    public static <E extends Comparable<E>> void quickSort(E[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static <E extends Comparable<E>> void quickSort(E[] list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private static <E extends Comparable<E>> int partition(E[] list, int low, int high) {
        E pivot = list[low]; // choose pivot: (here, first element in the segment)
        int left = low + 1;
        int right = high;

        while (true) {
            // move left pointer until you find an element >= pivot
            while (left <= right && list[left].compareTo(pivot) <= 0) {
                left++;
            }
            // move right pointer until you find an element < pivot
            while (left <= right && list[right].compareTo(pivot) > 0) {
                right--;
            }
            if (left > right) {
                break; // pointers crossed
            }
            E temp = list[left];
            list[left] = list[right];
            list[right] = temp;
        }
        E temp = list[low];
        list[low] = list[right];
        list[right] = temp;
        return right; // pivot index
    }

    // 2) quick sort using Comparator
    public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
        quickSort(list, 0, list.length - 1, comparator);
    }

    private static <E> void quickSort(E[] list, int low, int high, Comparator<? super E> comparator) {
        if (low < high) {
            int pivotIndex = partition(list, low, high, comparator);
            quickSort(list, low, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, high, comparator);
        }
    }

    private static <E> int partition(E[] list, int low, int high, Comparator<? super E> comparator) {
        E pivot = list[low];
        int left = low + 1;
        int right = high;

        while (true) {
            while (left <= right && comparator.compare(list[left], pivot) <= 0) {
                left++;
            }
            while (left <= right && comparator.compare(list[right], pivot) > 0) {
                right--;
            }
            if (left > right) {
                break;
            }
            E temp = list[left];
            list[left] = list[right];
            list[right] = temp;
        }
        E temp = list[low];
        list[low] = list[right];
        list[right] = temp;
        return right;
    }

    public static void main(String[] args) {
        // test 1: Using Comparable
        Integer[] numbers = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original Integer array: " + Arrays.toString(numbers));
        quickSort(numbers); 
        System.out.println("Sorted Integer array (Comparable): " + Arrays.toString(numbers));
        System.out.println();

        // test 2: using Comparator (sort Strings by length)
        String[] words = { "banana", "apple", "zebra", "dog", "cat" };
        System.out.println("Original String array: " + Arrays.toString(words));
        quickSort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        System.out.println("Sorted String array (Comparator by length): " + Arrays.toString(words));
    }
}
