package stringutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class NumberSwitcherUtil handles Text to Number operations
 * Contains a single method replaceNumbers
 */
public class NumberSwitcherUtil {
    /**
     * @param stringToFormat Represents the text that has to be processed
     * @return is a String in which all digits in text form are converted to numbers
     */
    public String replaceNumbers(String stringToFormat) {

        //variable declaration- i used array because the number of terms is known
        String[] targetStrings = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        String[] replacementStrings = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        List<String> words = new ArrayList<String>();
        List<String> newWords = new ArrayList<String>();
        boolean foundMatch = false;
        String serviceString = "";
        String finalString = "";

        //Separations of string in words and delimiters
        //Opted for this in order to retrieve the same result, including the delimiters
        words.addAll(Arrays.asList(stringToFormat.split
                ("((?<=\\ |\\,|\\.|\t|\n|\\;|\\:|\\!|\\? )|(?=\\ |\\,|\\.|\t|\n|\\;|\\:|\\!|\\?))")));

        // replacement algorithm
        for (int j = 0; j < words.size(); j++) {
            serviceString = words.get(j);
            for (int i = 0; i < targetStrings.length; i++) {
                if (targetStrings[i].equals(serviceString.toLowerCase())) {
                    newWords.add(replacementStrings[i]);
                    foundMatch = true;
                }
            }
            if (!foundMatch) {
                newWords.add(serviceString);
            }
            foundMatch = false;

        }

        //List conversion to string
        for (String s : newWords) {
            finalString += s;
        }
        return finalString;
    }
}
