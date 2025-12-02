
/**
 * Write a description of class ruelyn_ArrayProblem6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ruelyn_ArrayProblem6{
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 4, 5, 7,};
        int sum = 0, count = 0;
        
        for (int x : arr){
            if (x % 2 != 0) {
                sum += x;
                count++;
            }
        }
        
        if (count > 0 ) {
            System.out.println("Average of odd numbers: " + (sum/ count));
        } else {
            System.out.println("No odd numbers found.");
        }
    
    }
}
