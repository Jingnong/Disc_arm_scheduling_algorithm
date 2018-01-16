import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 * Name: Jingnong Wang
 * Student ID: 1281672
 * Name: Xintong Bao
 * Student ID: 1230947
 */

public class Elevator {
    public static void main(String[] args) {
        List<Integer> requests = new ArrayList<>(Arrays.asList(5, 28, 10, 7, 39, 20, 45, 67, 36, 35));
        Set<Integer> set = new HashSet<>(requests); // Use HashSet to find and delete an element in O(1)
        int startPos = 50; // Start at position 50
        int totalDistance = 0;
        int posNow = startPos; // The current position
        int posPrev = startPos; // The previous position

        /* Elevator Algorithm */
        System.out.println("Elevator Algorithm");
        /* Firstly move to 0, Then turn around the maximum number in requests */
        while(posNow >= 0) {
            /* If the position is in request, delete it from hashset and record the position and moving distance */
            if(set.contains(posNow)) {
                System.out.println("Reading track " + posNow);
                set.remove(posNow);
                totalDistance += posPrev - posNow;
                posPrev = posNow; // Update previous position
            }
            posNow--; // Update current position
        }

        totalDistance += posPrev - 0; // The distance between the minimum number in request and 0.
        posNow = 0; // Prepare to turn around, moving from 0.
        posPrev = 0;

        while(!set.isEmpty()) {
            if(set.contains(posNow)) {
                System.out.println("Reading track " + posNow);
                set.remove(posNow);
                totalDistance += posNow - posPrev;
                posPrev = posNow; // Update previous position
            }
            posNow++; // Update current position
        }
        System.out.println("Elevator Total distance: " + totalDistance);
    }
}
