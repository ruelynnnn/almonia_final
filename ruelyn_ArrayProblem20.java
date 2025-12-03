
/**
 * Write a description of class ruelyn_ArrayProblem20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ruelyn_ArrayProblem20{
    public static void main (String[] args) {
        int[] arr = {10, 2, 35, 40, 18, 50};
        
        System.out.print("Even numbers greater than 20:");
        for (int x : arr) {
            if (x % 2 == 0 && x > 20) {
                System.out.println(x);
            }
        }
    }
}
