import java.util.Scanner;

public class MaxConsecutiveSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // call the O(n) version
        System.out.println("Maximum consecutive substring is " + maxConsecutiveSortedSubstring(str));

        // Optional: uncomment to test the O(n²) version
        // System.out.println("Maximum consecutive substring is " + maxConsecutiveSortedSubstringBruteForce(str));
    }

    /**
     * efficient O(n) approach using two pointers to find the longest increasing         substring.
     /**
     //
     
    public static String maxConsecutiveSortedSubstring(String s) {
        int maxLength = 1;
        int currentLength = 1;
        int lastIndexOfMax = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= s.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    lastIndexOfMax = i;
                }
                currentLength = 1;
            }
        }

        // Handle case where longest is at the end
        if (currentLength > maxLength) {
            maxLength = currentLength;
            lastIndexOfMax = s.length();
        }

        return s.substring(lastIndexOfMax - maxLength, lastIndexOfMax);
    }

    /**
     * Brute-force O(n²) version
     * Fills an array tracking max increasing length starting at each index
     */
    /*
    public static String maxConsecutiveSortedSubstringBruteForce(String s) {
        int[] maxLengthAtIndex = new int[s.length()];
        int current = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= s.charAt(i - 1)) {
                current = i;
            } else {
                for (int j = i - 1; j >= current; j--) {
                    maxLengthAtIndex[j]++;
                }
            }
        }

        int maxLen = maxLengthAtIndex[0];
        int index = 0;

        for (int i = 0; i < maxLengthAtIndex.length; i++) {
            if (maxLengthAtIndex[i] > maxLen) {
                maxLen = maxLengthAtIndex[i];
                index = i;
            }
        }

        return s.substring(index, index + maxLen + 1);
    }
    */
}
