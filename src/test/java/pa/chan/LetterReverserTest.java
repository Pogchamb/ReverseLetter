package pa.chan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LetterReverserTest {

    private final LetterReverser letterReverser = new LetterReverser();

    @Test
    void reverseCommonCase() {
        String reverseText = letterReverser.reverse("J@va the be$t!123");

        assertEquals("t@eb eht av$J!123", reverseText);
    }

    @Test
    void reverseEmptyString() {
        String reverseText = letterReverser.reverse("");

        assertEquals("", reverseText);
    }

    @Test
    void reverseOneLetter() {
        String reverseText = letterReverser.reverse("f");

        assertEquals("f", reverseText);
    }

    @Test
    void reverseTextWithoutLetters () {
        String reverseText = letterReverser.reverse("123 @@!!@");

        assertEquals("123 @@!!@", reverseText);
    }

    @Test
    void reverseStringOnlyWithLetter () {
        String reverseText = letterReverser.reverse("reverser");

        assertEquals("resrever", reverseText);
    }

    @Test
    void reverseWithKeepEdgeAndMiddleSymbolsInOriginalPositions () {
        String reverseText = letterReverser.reverse(" !reverser !");

        assertEquals(" !resrever !", reverseText);
    }

    @Test
    void reverseWithSaveCase () {
        String reverseText = letterReverser.reverse(" !Reverser !");

        assertEquals(" !resreveR !", reverseText);
    }

    @Test
    void reverseWhenInputIsNull () {
        assertThrows(IllegalArgumentException.class, () -> letterReverser.reverse(null));
    }

}
