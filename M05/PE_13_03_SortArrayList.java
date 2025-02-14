import java.util.ArrayList;

public class SortArrayList {
    
    /**
     * Sorts an ArrayList of Numbers in ascending order
     * using a simple selection sort.
     */
    public static void sort(ArrayList<Number> list) {
        // Go through the list from the first element to the second-to-last
        for (int i = 0; i < list.size() - 1; i++) {
            // Assume the element at i is the minimum
            int minIndex = i;
            
            // Find index of the smallest element from i+1 to the end
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).doubleValue() < list.get(minIndex).doubleValue()) {
                    minIndex = j;
                }
            }
            
            // If a new minimum is found, swap the elements
            if (minIndex != i) {
                Number temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
    
    public static void main(String[] args) {
        // Create an ArrayList of Numbers
        ArrayList<Number> numbers = new ArrayList<>();
        numbers.add(3.14);
        numbers.add(10);
        numbers.add(2.5);
        numbers.add(7);
        numbers.add(1.1);
        
        // Print the original list
        System.out.println("Original list: " + numbers);
        
        // Sort the list
        sort(numbers);
        
        // Print the sorted list
        System.out.println("Sorted list:   " + numbers);
    }
}
