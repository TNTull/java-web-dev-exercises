//Teresa Tull worked on this on 9-11-2022 ch 2.4
package exercisesCh2;
import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        Double rectLength = input.nextDouble ();
        System.out.println("Enter width of rectangle:");
        Double rectWidth = input.nextDouble ();
        Double recArea = rectLength * rectWidth;
        System.out.println("The area of the rectangle is " + recArea);
        input.close();
    }
}
