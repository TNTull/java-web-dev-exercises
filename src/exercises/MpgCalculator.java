//Teresa Tull worked on this on 9-11-2022 ch 2.4
package exercises;
import java.util.Scanner;

public class MpgCalculator {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven:");
        Double miles = input.nextDouble ();
        System.out.println("Enter number of gallons used:");
        Double gallons = input.nextDouble ();
        Double mpg = miles / gallons;
        System.out.println("The miles per gallon is " + mpg);
        input.close();
    }

}
