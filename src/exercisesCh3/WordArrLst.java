//Teresa Tull created on this on 9-15-2022 ch 3.7 Exercises

package exercisesCh3;

import java.util.ArrayList;
import java.util.Scanner;


public class WordArrLst {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("state");
        wordList.add("print");
        wordList.add("method");
        wordList.add("sentence");
        wordList.add("start");

       fiveLetters(wordList);

    }
    //exercise 3.7.2 number 3
    public static void fiveLetters(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5, 6, or 8 for the length of a word: ");
        int numWordLength = input.nextInt();

        for (String wordTemp : words) {
            if (wordTemp.length() == numWordLength) {
                System.out.println(wordTemp);
            }
        }
    }

    //exercise 3.7.2 number 2
 /*   public static void fiveLetters(ArrayList<String> words) {
        for (String wordTemp : words) {
            if (wordTemp.length() == 5) {
                System.out.println(wordTemp);
            }
        }
    }
*/
}
