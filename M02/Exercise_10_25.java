import java.util.ArrayList;

public class Exercise_10_25 {

    /**
     * Splits a string into an array of substrings split by the matching delimiters,
     * including the delimiters.
     *
     * @param s The string to be split.
     * @param regex The regex pattern for the delimiters.
     * @return An array of strings consisting of the substrings and the delimiters.
     */
    public static String[] split(String s, String regex) {
        ArrayList<String> result = new ArrayList<>();

        // Use StringBuilder to build substrings
        StringBuilder segment = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            String currentStr = Character.toString(currentChar);

            if (currentStr.matches(regex)) {
                // Add the current segment (if it exists) to the result
                if (segment.length() > 0) {
                    result.add(segment.toString());
                    segment.setLength(0); // Reset the segment
                }
                // Add the delimiter to the result
                result.add(currentStr);
            } else {
                // Append the current character to the segment
                segment.append(currentChar);
            }
        }

        // Add the final segment (if it exists) to the result
        if (segment.length() > 0) {
            result.add(segment.toString());
        }

        // Convert the result to an array
        return result.toArray(new String[0]);
    }

    // Main method to test the split method
    public static void main(String[] args) {
        String[] result1 = split("ab#12#453", "#");
        System.out.println("Result 1:");
        for (String s : result1) {
            System.out.println(s);
        }

        String[] result2 = split("a?b?gf#e", "[?#]");
        System.out.println("\nResult 2:");
        for (String s : result2) {
            System.out.println(s);
        }
    }
}
