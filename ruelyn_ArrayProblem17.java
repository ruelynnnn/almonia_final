
/**
 * Write a description of class ruelyn_ArrayProblem17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ruelyn_ArrayProblem17{
    public static void main (String[] args) {
        int[] arr = {10, 20, 5, 15, 30};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x != first) {
                second = x;
            }
        }
        
        System.out.println("Second highest number: " + second);
    }
}
