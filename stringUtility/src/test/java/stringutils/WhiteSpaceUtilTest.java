package stringutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class WhiteSpaceUtilTest tests the WhiteSpaceUtil
 */
class WhiteSpaceUtilTest {

    /**
     * Test with space separator
     */
    @Test
    void removeWhiteSpacesWithSpace() {
        WhiteSpaceUtil whiteSpaceUtil = new WhiteSpaceUtil();
        String s = "White Space Util";
        String result = whiteSpaceUtil.removeWhiteSpaces(s);
        assertEquals("WhiteSpaceUtil", result);
    }

    /**
     * Test with Tab separator
     */
    void removeWhiteSpacesWithTab() {
        WhiteSpaceUtil whiteSpaceUtil = new WhiteSpaceUtil();
        String s = "White\tSpace\tUtil";
        String result = whiteSpaceUtil.removeWhiteSpaces(s);
        assertEquals("WhiteSpaceUtil", result);
    }

    /**
     * Test with Enter separator
     */
    void removeWhiteSpacesWithEnter() {
        WhiteSpaceUtil whiteSpaceUtil = new WhiteSpaceUtil();
        String s = "White\nSpace\nUtil";
        String result = whiteSpaceUtil.removeWhiteSpaces(s);
        assertEquals("WhiteSpaceUtil", result);
    }

    /**
     * Test with combined separators (Space, Enter Tab)
     */
    void removeWhiteSpacesWithCombinedSeparators() {
        WhiteSpaceUtil whiteSpaceUtil = new WhiteSpaceUtil();
        String s = " White\nSpace\tUtil ";
        String result = whiteSpaceUtil.removeWhiteSpaces(s);
        assertEquals("WhiteSpaceUtil", result);
    }

    /**
     * Test with combined separators (Space, Enter Tab), in variable positions- example beginning
     */
    void removeWhiteSpacesWithCombinedSeparators1() {
        WhiteSpaceUtil whiteSpaceUtil = new WhiteSpaceUtil();
        String s = " \n  White \n\t Space\tUtil ";
        String result = whiteSpaceUtil.removeWhiteSpaces(s);
        assertEquals("WhiteSpaceUtil", result);
    }

    /**
     * Test with empty string
     */
    void removeWhiteEmptyString() {
        WhiteSpaceUtil whiteSpaceUtil = new WhiteSpaceUtil();
        String s = "";
        String result = whiteSpaceUtil.removeWhiteSpaces(s);
        assertEquals("", result);
    }
}