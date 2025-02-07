import java.util.*;
import java.net.*;

public class exercise12_33_WebCrawlerSearch {
    /********************************************
    * this program searches for a specific word starting from the user and crawls web pages stopping when word is found and displaying the URL. 
    *
    * example input: 
    * enter a URL to search: http://www.example.com
    * enter a word to search: java
    /********************************************/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a URL to start search: ");
        String startURL = input.nextLine();

        System.out.print("Enter a word to search: ");
        String searchWord = input.nextLine();

        crawler(startURL, searchWord); // Start web crawling with word search
    }

    public static void crawler(String startingURL, String word) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);

        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100) {
            String urlString = listOfPendingURLs.remove(0);

            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawling: " + urlString);

                if (contains(urlString, word)) {
                    System.out.println("The word '" + word + "' was found at: " + urlString);
                    System.out.println("Search terminated.");
                    break;
                }

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }

        if (listOfPendingURLs.isEmpty()) {
            System.out.println("Word not found within 100 pages.");
        }
    }

    public static boolean contains(String urlString, String word) {
        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                if (line.toLowerCase().contains(word.toLowerCase())) {
                    return true;
                }
            }
            input.close();
        } catch (Exception ex) {
            System.out.println("Error accessing URL: " + ex.getMessage());
        }
        return false;
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());

            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);

                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
            input.close();
        } catch (Exception ex) {
            System.out.println("Error retrieving URLs: " + ex.getMessage());
        }

        return list;
    }
}