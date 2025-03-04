public class E19_04 {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        // using approach: equals() to check for key
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] list = {1, 5, -3, 5, -1};

        // looking for 2 (not in array)
        System.out.println(linearSearch(list, 2));

        // looking for 5 (this appears in index 1 first)
        System.out.println(linearSearch(list, 5));
    }
}
