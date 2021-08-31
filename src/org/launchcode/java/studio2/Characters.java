package org.launchcode.java.studio2;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
// import java.util.*;
import java.util.Map;
import java.lang.*;



public class Characters {



    public static void main(String[] args) {

        String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        // Scanner input = new Scanner(System.in);
        // System.out.println("Please input text below:");
        // String str = input.nextLine();

        String var1 = text.toLowerCase();
        char[] charactersInString = var1.toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();


        for (char character : charactersInString) {
            if (characterCount.containsKey(character)) {
               characterCount.put(character, characterCount.get(character)+1);
            } else {
                characterCount.put(character, 1);
            }
           // System.out.println(character);
        }


        for (Map.Entry<Character, Integer> characterKey : characterCount.entrySet()) {
            System.out.println(characterKey.getKey() + ": " + characterKey.getValue() + "");

        }

    }

}
