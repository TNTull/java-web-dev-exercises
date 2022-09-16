//Teresa Tull worked on this on 9-11-2022 ch 2.4
package exercisesCh2;
import java.util.Scanner;

public class Alice {
    public static void main (String[] args) {
        String originalSentence = "Alice was beginning to get very tired of " +
                "sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use" +
                " of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to find:");
        String findWord = input.nextLine();
        input.close();
        int wordIndex = originalSentence.indexOf(findWord);
        if(wordIndex == - 1) {
            System.out.println("; your word is not found");
        } else {
            System.out.print("The sentence contains your word: " + originalSentence.contains(findWord));
            System.out.println("\nFound your word at index " + wordIndex);
            System.out.println("It is " + findWord.length() + " letters long.");
            String modifiedSentence = originalSentence.replace(findWord, "");
            System.out.println("Here is the sentence without your word");
            System.out.println(modifiedSentence);
        }
    }
}
