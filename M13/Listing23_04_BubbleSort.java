public class BubbleSort {
    /** Bubble sort method */
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            // Assume no swap is needed
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true; // A swap happened; another pass is needed
                }
            }
        }
    }

    /** A test method */
    public static void main(String[] args) {
        int[] list = {2, 3, 6, 5, 1, -2, 14, 12};
        bubbleSort(list);
        for (int j : list) {
            System.out.print(j + " ");
        }
    }
}
