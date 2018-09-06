package stringutils;

import java.util.List;

/**
 * Class ContinuousString handles List to String operations
 * Contains single method makeStringFromList()
 */
public class ContinuousString {

    /**
     * @param textInput The input is represented by the List<String> that has to merged into a single String
     * @return a String that holds the merged input list;
     */
    public String makeStringFromList(List<String> textInput) {
        String singleString;
        singleString = "";
        for (String s : textInput) {
            singleString += s + "\n";
        }
        return singleString;

    }
}
