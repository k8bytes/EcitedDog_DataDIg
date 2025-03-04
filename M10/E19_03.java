import java.util.ArrayList;

public class E19_03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println(newList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        // using stream + filter approach (referenced from professor's provided code)
        list.stream()
            .filter(e -> (!result.contains(e)))
            .forEachOrdered(e -> result.add(e));

        return result;
    }
}
