package Studio2;

import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String sample = "What is even happening here";
        sample = sample.toLowerCase(Locale.ROOT);
        char[] charactersInString = sample.toCharArray();
        HashMap<Character , Integer> letterList = new HashMap<>();

        for(int i = 0; i < sampleSplit.length; i++){
            if(!letterList.containsKey(charactersInString[i])){
                letterList.put(charactersInString[i], 1);
            }


        }


    }
}
