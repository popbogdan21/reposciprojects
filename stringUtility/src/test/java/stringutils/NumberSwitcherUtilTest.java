package stringutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class    NumberSwitcherUtilTest test the NumberSwitcherUtil functionality
 */
class NumberSwitcherUtilTest {

    /**
     * Test with Digit as text separated by space character
     * Example given in the instructions
     */
    @Test
    void replaceNumbersSeparateDigitBySpace() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "I have four apples";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("I have 4 apples", result);
    }

    /**
     * Test with Digit as text separated by Dash character
     * Example given in the instructions
     */
    @Test
    void replaceNumbersSeparatedByDash() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "I want twenty-nine dollars";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("I want twenty-nine dollars", result);
    }

    /**
     * Same test but with Digit separated by space
     * Example given in the instructions
     */
    @Test
    void replaceNumbersSeparatedWithoutDahs() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "I want twenty nine dollars";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("I want twenty 9 dollars", result);
    }

    /**
     * Test for caseInsensitive match
     * Example given in the instructions
     */
    @Test
    void replaceNumbersCaseVariable() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "Five six SEVEN eiGHt!!";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("5 6 7 8!!", result);
    }

    /**
     * Test for caseInsensitive match with multiple lines
     * Example given in the instructions
     */
    void replaceNumbersMultipleLines() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "OnE Two There\nFive SiX!!";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("1 2 3\n5 6!!", result);
    }

    /**
     * Test with Digits without spaces
     */
    void replaceNumbersMultipleDigitsWithoutSpaces() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "onetwothreefour";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("onetwothreefour", result);
    }

    /**
     * Test with Digits separated by dashes
     */
    void replaceNumbersMultipleDigitsSeparatedByDash() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "one-two-three-four";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("one-two-three-four", result);
    }

    /**
     * Test with blank string
     */
    void replaceNumbersBlankString() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("", result);
    }

    /**
     * Test with words similar to Digits spelling
     */
    void replaceNumbersStringWithSimilarWordstoDigitsAndMultipleSeparators() {
        NumberSwitcherUtil numberSwitcherUtil = new NumberSwitcherUtil();
        String inputString = "ONEEE TWOO, Three!!!";
        String result = numberSwitcherUtil.replaceNumbers(inputString);
        assertEquals("ONEEE TWOO, 3!!!", result);
    }
}