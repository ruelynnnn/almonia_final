

/**
 * Write a description of class ruelyn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;

public class ruelyn_ArrayProblem2 {
    public static void main(String[] args){
        int[] arr = {3, 7, 1, 7, 4, 7, 5, 7, 2, 6};
        int count = 0;
        
        for (int x : arr) {
            if (x == 7) {
                count++;
            }
        }
        
        System.out.println("The number 7 appears " + count + " times.");
    }
}