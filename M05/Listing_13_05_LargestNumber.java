import java.util.ArrayList;
import java.math.BigInteger;
import java.math.BigDecimal;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3432323234344343101"));
        list.add(new BigDecimal("2.0909090989091343433344343"));

        System.out.println("The largest number is " +
            getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0)
            return null;

        Number number = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (((Comparable)number).compareTo(list.get(i)) < 0) {
                number = list.get(i);
            }
        }

        return number;
    }
}
