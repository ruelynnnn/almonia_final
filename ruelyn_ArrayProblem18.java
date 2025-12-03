
/**
 * Write a description of class ruelyn_ArrayProblem18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ruelyn_ArrayProblem18 {
    public static void main (String[] args) {
        int[] arr = {1, 3, 5, 3, 7};
        boolean duplicate = false;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                }
            }
        }
        
        System.out.println("Contains duplicate?" + duplicate);
    }
}
