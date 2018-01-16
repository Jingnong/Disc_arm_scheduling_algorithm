import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Name: Jingnong Wang
 * Student ID: 1281672
 * Name: Xintong Bao
 * Student ID: 1230947
 */

public class FirstComeFirstServe {
    public static void main(String[] args) {
        List<Integer> requests = new ArrayList<>(Arrays.asList(5, 28, 10, 7, 39, 20, 45, 67, 36, 35));
        int startPos = 50; // Start at position 50
        int totalDistance = 0;

        /* First Come-First Serve (FCFS) */
        System.out.println("First Come-First Serve Algorithm");
        /* The reading order is the same as the input order */
        for (int i = 0; i < requests.size(); i++) {
            System.out.println("Reading track " + requests.get(i));
            totalDistance += Math.abs(startPos - requests.get(i)); // Calculate total distance
            startPos = requests.get(i); // Update start position
        }
        System.out.println("FCFS Total distance: " + totalDistance);
    }
}
