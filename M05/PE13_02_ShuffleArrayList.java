import java.util.ArrayList;

public class ShuffleArrayList {
    
    /** 
     * Shuffle the elements in an ArrayList of Numbers 
     * by randomly swapping each element with another element.
     */
    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            // Generate a random index in the range [0, list.size() - 1]
            int randomIndex = (int)(Math.random() * list.size());
            
            // Swap the elements at indices i and randomIndex
            Number temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of Number
        ArrayList<Number> myList = new ArrayList<>();
        myList.add(1);         // integer
        myList.add(3.14);      // double
        myList.add(7);         // integer
        myList.add(10.5);      // double
        myList.add(42);        // integer

        // Print original list
        System.out.println("Original list: " + myList);

        // Shuffle the list
        shuffle(myList);

        // Print shuffled list
        System.out.println("Shuffled list: " + myList);
    }
}
