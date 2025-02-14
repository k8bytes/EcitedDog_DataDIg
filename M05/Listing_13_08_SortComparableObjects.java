public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Atlanta", "Boston", "Savannah", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city : cities)
            System.out.print(city + " ");
        System.out.println();

        java.math.BigInteger[] numbers = {
            new java.math.BigInteger("2323231092923992"),
            new java.math.BigInteger("432232323239292"),
            new java.math.BigInteger("54623239292")
        };
        java.util.Arrays.sort(numbers);
        for (java.math.BigInteger number : numbers)
            System.out.print(number + " ");
    }
}
