package stringutils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Class ContinuousStringTest testContinuousString class functionality
 */
class ContinuousStringTest {

    /**
     * test checks if a array is correctly formatted to mirror input from main class
     */
    @Test
    void makeStringFromList() {
        ContinuousString continuousString = new ContinuousString();
        List<String> s = new ArrayList<String>();
        s = Arrays.asList("Continuous", "Space", "Utility");
        String s1 = continuousString.makeStringFromList(s);
        assertEquals("Continuous\nSpace\nUtility\n", s1.toString());
    }
}