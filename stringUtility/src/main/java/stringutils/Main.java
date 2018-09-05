package stringutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class contains main() method
 * Handles user input
 * Initialises the string utility objects and
 */
public class Main {
    public static void main(String[] args) {
        String input = "";
        System.out.println("Introduceti textul pentru procesare cu un rand liber la final:");
        Scanner scan = new Scanner(System.in);
        List<String> lines = new ArrayList<String>();
        String result = "";
        String lineNew;

        //input with multiple lines--- ends when the last line is empty, can be configured for other stop conventions
        while (scan.hasNextLine()) {
            lineNew = scan.nextLine();
            if (lineNew.isEmpty()) {
                break;
            }
            lines.add(lineNew);
        }

        // transforms the input into a single string
        ContinuousString continuousString = new ContinuousString();
        String inputString = continuousString.makeStringFromList(lines);

        //initialisation of a WhiteSpaceUtil object
        WhiteSpaceUtil whiteSpeceStringUtil = new WhiteSpaceUtil();

        //White space operations
        result = whiteSpeceStringUtil.removeWhiteSpaces(inputString);
        System.out.println("Sirul fara spatii libere:\n" + result);

        //initialisation of a NumberSwitcherUtil object

        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        //Text to numebers operations
        result = numberSwitcherUtil.replaceNumbers(inputString);
        System.out.println("Sirul cu cifre in forma numerica:\n" + result);

    }
}


