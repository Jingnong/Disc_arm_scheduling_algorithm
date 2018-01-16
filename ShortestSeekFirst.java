import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Name: Jingnong Wang
 * Student ID: 1281672
 * Name: Xintong Bao
 * Student ID: 1230947
 */

public class ShortestSeekFirst {
    public static void main(String[] args) {
        List<Integer> requests = new ArrayList<>(Arrays.asList(5, 28, 10, 7, 39, 20, 45, 67, 36, 35));
        int startPos = 50; // Start at position 50
        int totalDistance = 0;
        
        /* Shortest Seek First (SSF) */
        System.out.println("Shortest Seek First Algorithm");
        while(requests.size() != 0) {
            int closestPos = 0;
            /* Compare each of the distance, choose the smallest one */
            for(int i = 0; i < requests.size(); i++) {
                closestPos = Math.abs(startPos - requests.get(i)) < Math.abs(startPos - requests.get(closestPos)) ? i : closestPos;
            }
            totalDistance += Math.abs(startPos - requests.get(closestPos)); // Calculate total distance
            startPos = requests.get(closestPos); // Update start position
            System.out.println("Reading track " + startPos);
            requests.remove(closestPos);
        }
        System.out.println("SSF Total distance: " + totalDistance);
    }
}