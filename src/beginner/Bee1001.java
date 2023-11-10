/*
 * Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print endline after the result otherwise you will get “Presentation Error”.
 *
 * Input
 * The input file will contain 2 integer numbers.
 * 
 * Output
 * Print the letter X (uppercase) with a blank space before and after the equal signal followed by the value of X, according to the following example.
 *
 * Obs.: don't forget the endline after all.
*/

package beginner;

import java.io.IOException;
import java.util.Scanner;

public class Bee1001 {
    public static void main(String[] args) throws IOException {

        //"input" is a variable to capture user data by the "Scanner" class
        Scanner input = new Scanner(System.in);
        int a,b,x;
        
        a = input.nextInt();
        b = input.nextInt();
        x = a + b;
        
        System.out.println("X = " + x); 
    }
}