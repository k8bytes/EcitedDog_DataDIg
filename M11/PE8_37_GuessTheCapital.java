import java.util.Scanner;

public class GuessTheCapital {
    public static void main(String[] args) {
    
        String[][] statesAndCapitals = {
            {"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"}, {"California", "Sacramento"}, {"Colorado", "Denver"},
            {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
            {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"}, {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"}, {"Minnesota", "Saint Paul"}, {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"}, {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"}, {"New York", "Albany"}, {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"}, {"Pennsylvania", "Harrisburg"}, {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"}, {"Tennessee", "Nashville"},
            {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"}, {"Washington", "Olympia"}, {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}
        };

        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        
        for (String[] stateCapital : statesAndCapitals) {
            System.out.print("What is the capital of " + stateCapital[0] + "? ");
            String answer = scanner.nextLine().trim();

            
            if (answer.equalsIgnoreCase(stateCapital[1])) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + stateCapital[1]);
            }
        }

        
        System.out.println("The correct count is " + correctCount);
        scanner.close();
    }
}
