package org.launchcode.java.studio.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> count = new HashMap<>();
        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charArray = phrase.toLowerCase(Locale.ROOT).toCharArray();
        for(char x : charArray){
            if(count.containsKey(x)){
                count.put(x, count.get(x) + 1);
            } else{
                count.put(x, 1);
            }
        }
        for(Map.Entry<Character, Integer> x : count.entrySet()){
            System.out.println(x.getKey() + ": "+ x.getValue());
        }
    }
}
