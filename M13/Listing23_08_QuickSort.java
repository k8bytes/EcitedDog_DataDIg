public class QuickSort {
    /** Sort the array using quick sort */
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    /** Helper method that recursively sorts sub-parts of the array */
    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /** Partition the array list[first..last] */
    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // Choose the first element as the pivot
        int low = first + 1;     // Index for forward search
        int high = last;         // Index for backward search

        while (high > low) {
            // Search forward from left
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            // Search backward from right
            while (low <= high && list[high] > pivot) {
                high--;
            }
            // Swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        // Swap pivot with list[high] if needed
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    /** A test method */
    public static void main(String[] args) {
        int[] list = {2, 6, 3, 14, 5, -2, 12};
        quickSort(list);
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
