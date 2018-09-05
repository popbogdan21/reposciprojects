package stringutils;

import java.lang.String;

/**
 * Class WhiteSpaceUtil handles white space operations
 * Contains a single method
 */
public class WhiteSpaceUtil {

    /**
     * @param stringToClear the input string that has to be cleared of white spaces
     * @return a String without space, tab or new line characters
     */
    public String removeWhiteSpaces(String stringToClear) {
        String s1 = "";
        s1 = stringToClear.replace("\n", "");
        s1 = s1.replace(" ", "");
        s1 = s1.replace("\t", "");
        return (s1);
    }
}