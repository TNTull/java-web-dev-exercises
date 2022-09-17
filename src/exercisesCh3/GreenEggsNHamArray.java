//Teresa Tull created on this on 9-13-2022 ch 3.7 Exercises

package exercisesCh3;

public class GreenEggsNHamArray {

    public static void main(String[] args) {

        String greenEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] eggWords = greenEggs.split(" ");

        for (int i = 0; i < eggWords.length; i++) {
            System.out.println(eggWords[i]);
        }

        String[] eggSentences = greenEggs.split("\\.");

        for (int i = 0; i < eggSentences.length; i++) {
            System.out.println(eggSentences[i]);
        }

    }

}

