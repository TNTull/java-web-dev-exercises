//Teresa Tull worked on this on 9-15-2022 ch 3 studio

package org.launchcode.java.studioCh3;

import java.util.Map;
import java.util.HashMap;

public class CountingChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        String testStr = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. So if you move " +
                "all the terms over to one side, you can put the quadratics into a form that " +
                "can be factored allowing that side of the equation to equal zero. Once " +
                "you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = testStr.toCharArray();
        // to lower case the string and run the code see next line
        // char[] charactersInString = testStr.toLowerCase().toCharArray();

        for (char character : charactersInString) {
            //is the key contained in the hashmap
                // if the key is there
            if (charCount.containsKey(character)) {
                char key = character;
                int value = charCount.get(key) + 1;
                charCount.put(character, value);
                //or charCount.put(character, charCount.get(character) + 1;
            }
            //if the key wasn't there
            else {
                charCount.put(character, 1);
            }
        }
        for(Map.Entry<Character, Integer> chCount : charCount.entrySet()) {
            System.out.println(chCount.getKey() + ": " + chCount.getValue() );
        }
    }

}
