
/**
 * Write a description of class ruelyn_ArrayProblem9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ruelyn_ArrayProblem9{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, input;
        
        do {
            System.out.print("Enter a number (0 to stop): ");
            input = sc.nextInt();
            sum += input;
        } while (input != 0);
        
        System.out.print("Total sum: " + sum);
        sc.close();
        }
    }
