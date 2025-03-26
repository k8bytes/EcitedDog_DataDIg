import java.util.*;
import java.net.*;

public class WebCrawler {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        crawl(url);
    }

    public static void crawl(String startingURL) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(startingURL);

        while (!queue.isEmpty() && visited.size() < 100) {
            String currentURL = queue.poll();
            if (!visited.contains(currentURL)) {
                visited.add(currentURL);
                System.out.println("Crawl " + currentURL);

                for (String s : getSubURLs(currentURL)) {
                    if (!visited.contains(s)) {
                        queue.add(s);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;

            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http", current);

                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http", endIndex); // keep crawling
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return list;
    }
}
