import java.util.ArrayList;
import java.util.Scanner;

public class E19_09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < 10; i++) {
            numbers.add(input.nextInt());
        }

        sort(numbers);
        System.out.println("The sorted numbers are " + numbers);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        // simplified selection sort (referenced from professor's provided code)
        E currentMin;
        int currentMinIndex;

        for(int i = 0; i < list.size() - 1; i++) {
            currentMin = list.get(i);
            currentMinIndex = i;

            for(int j = i + 1; j < list.size(); j++) {
                if(currentMin.compareTo(list.get(j)) > 0) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            // if similar element found, swap
            if(currentMinIndex != i) {
                E temp = list.get(i);
                list.set(i, currentMin);
                list.set(currentMinIndex, temp);
            }
        }
    }
}
