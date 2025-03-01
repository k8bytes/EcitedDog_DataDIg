import java.util.Scanner;

public class TowerOfHanoi {

    // static variable: count number of moves
    private static int moveCount = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prmopt: user enter number of disks
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        // display: solution and calculate number of moves
        System.out.println("The moves are:");
        moveDisks(n, 'A', 'B', 'C');

        // display: total number of moves
        System.out.println("Total moves: " + moveCount);

        input.close(); 
    }

    // method to find solution to move n disks from fromTower to toTower with auxTower 
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) { // stopping condition (base case)
            moveCount++; // increment move count
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
        } else {
            // move n-1 disks from source to auxiliary tower
            moveDisks(n - 1, fromTower, auxTower, toTower);
            // move nth disk from source to destination tower
            moveCount++; // increment move count
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            // move n-1 disks from auxiliary to destination tower
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
    }
}
