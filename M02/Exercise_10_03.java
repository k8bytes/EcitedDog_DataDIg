public class MyInteger {

    // Instance variable to store the int value
    private int value;

    // Constructor that creates a MyInteger object for the specified int value
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter method that returns the int value
    public int getValue() {
        return value;
    }

    // Instance methods
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static methods for int parameter
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static methods for MyInteger parameter
    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    // Equals methods
    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.getValue();
    }

    // Static method to parse char[] to int
    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }

    // Static method to parse String to int
    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    // Main method to test the class
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(29);

        System.out.println("Value: " + myInt.getValue());
        System.out.println("Is Even? " + myInt.isEven());
        System.out.println("Is Odd? " + myInt.isOdd());
        System.out.println("Is Prime? " + myInt.isPrime());

        System.out.println("Static isEven(10): " + MyInteger.isEven(10));
        System.out.println("Static isOdd(10): " + MyInteger.isOdd(10));
        System.out.println("Static isPrime(10): " + MyInteger.isPrime(10));

        System.out.println("Static isEven(MyInteger): " + MyInteger.isEven(myInt));
        System.out.println("Static isOdd(MyInteger): " + MyInteger.isOdd(myInt));
        System.out.println("Static isPrime(MyInteger): " + MyInteger.isPrime(myInt));

        System.out.println("Equals (int): " + myInt.equals(29));
        System.out.println("Equals (MyInteger): " + myInt.equals(new MyInteger(29)));

        char[] charArray = {'1', '2', '3'};
        System.out.println("Parsed char[] to int: " + MyInteger.parseInt(charArray));

        String str = "456";
        System.out.println("Parsed String to int: " + MyInteger.parseInt(str));
    }
}
