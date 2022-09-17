//Teresa Tull created on this on 9-16-2022 ch 3.7 Exercises

package exercisesCh3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceArrList {
    public static void main(String[] args) {
        String grEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        System.out.println("The string grEggs is: ");
        System.out.println(grEggs);

        //splits string into sentences but erases the period
        String[] stList = grEggs.split("\\.");

        //prints the array and I have it print the period
        System.out.println("The array stList is: ");
        for(int i=0;i<=stList.length-1;i++){
        System.out.println(stList[i] +".");
        }

        List<String> sentenceList = new ArrayList<>(Arrays.asList(stList));


        System.out.println("The ArrayList sentenceList is: ");

        //this prints the ArrayList sentences but without the period
        System.out.println("without periods");
        sentenceList.forEach(System.out::println);

        //another way to print the arrayList but with the period
        System.out.println("with periods");
        for(String s: sentenceList){
            System.out.println(s + ".");
        }
    }
}
