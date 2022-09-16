//Teresa Tull worked on this on 9-11-2022 ch 2.4
package exercisesCh2;
import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        input.close();
    }
}
